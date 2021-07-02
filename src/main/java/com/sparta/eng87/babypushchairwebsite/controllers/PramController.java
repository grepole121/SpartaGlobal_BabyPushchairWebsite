package com.sparta.eng87.babypushchairwebsite.controllers;

import com.sparta.eng87.babypushchairwebsite.entities.PramEntity;
import com.sparta.eng87.babypushchairwebsite.services.PramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.Arrays;

@Controller
public class PramController {

    private PramService pramService;

    @Autowired
    public PramController(PramService pramService) {
        this.pramService = pramService;
    }

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/about")
    public String getAbout() {
        return "about";
    }

    @GetMapping("/contact")
    public String getContact() {
        return "contact";
    }

    @GetMapping("/questionnaire")
    public String getQuestionnaire() {
        return "questionnaire";
    }


    @GetMapping("/add-pram")
    public String showAddPage(PramEntity pramEntity, Model model){
        model.addAttribute("pram", pramEntity);
        return "addPram";
    }

    @PostMapping("/add")
    public String addPram(@RequestParam(name = "productName") String productName,
                          @RequestParam(name = "brandName") String brandName,
                          @RequestParam(name = "image") String image,
                          @RequestParam(name = "description") String description,
                          @RequestParam(name = "childCapacity") Integer childCapacity,
                          @RequestParam(name = "weight") BigDecimal weight,
                          @RequestParam(name = "length") BigDecimal length,
                          @RequestParam(name = "width") BigDecimal width,
                          @RequestParam(name = "height") BigDecimal height,
                          @RequestParam(name = "ageFromMonths") Integer ageFromMonths,
                          @RequestParam(name = "ageToMonths") Integer ageToMonths,
                          @RequestParam(name = "expertScore") BigDecimal expertScore,
                          @RequestParam(name = "raincoverFlag") Boolean raincoverFlag,
                          @RequestParam(name = "changebagFlag") Boolean changebagFlag,
                          @RequestParam(name = "parasolFlag") Boolean parasolFlag,
                          @RequestParam(name = "mosquitonetFlag") Boolean mosquitonetFlag,
                          @RequestParam(name = "carAdapterFlag") Boolean carAdapterFlag,
                          @RequestParam(name = "easeOfSetup") Boolean easeOfSetup,
                          @RequestParam(name = "reversibleSeatFlag") Boolean reversibleSeatFlag,
                          @RequestParam(name = "sturdyFlag") Boolean sturdyFlag,
                          @RequestParam(name = "compactFlag") Boolean compactFlag,
                          @RequestParam(name = "comfortFlag") Boolean comfortFlag,
                          @RequestParam(name = "multiTerrainFlag") Boolean multiterrainFlag,
                          @RequestParam(name = "adjustableHandleFlag") Boolean adjustableHandleFlag,
                          @RequestParam(name = "largePramBasketFlag") Boolean largePramBasketFlag,
                          @RequestParam(name = "cheapestPrice") BigDecimal cheapestPrice,
                          @RequestParam(name = "discontinuedFlag") Boolean discontinuedFlag){
        //I think we need to change the values inside the form to 0 and 1 instead of yes or no. I think it will be fine
        //I'm going to run it, fingers crossed, ok
        //I dont think its going to work cos the pram entity needs booleans for the flags, try it but it should be a quick fix anyway
        PramEntity pramEntity = new PramEntity();
        pramEntity.setProductName(productName);
        pramEntity.setBrandName(brandName);
        pramEntity.setImage(image);
        pramEntity.setProductDescription(description);
        pramEntity.setChildCapacity(childCapacity);
        pramEntity.setWeight(weight);
        pramEntity.setLength(length);
        pramEntity.setWidth(width);
        pramEntity.setHeight(height);
        pramEntity.setAgeFromMonths(ageFromMonths);
        pramEntity.setAgeToMonths(ageToMonths);
        pramEntity.setExpertScore(expertScore);
        pramEntity.setRaincoverFlag(raincoverFlag);
        pramEntity.setChangebagFlag(changebagFlag);
        pramEntity.setParasolFlag(parasolFlag);
        pramEntity.setMosquitonetFlag(mosquitonetFlag);
        pramEntity.setCarAdapterFlag(carAdapterFlag);
        pramEntity.setEaseOfSetup(easeOfSetup);
        pramEntity.setReversableSeatFlag(reversibleSeatFlag);
        pramEntity.setSturdyFlag(sturdyFlag);
        pramEntity.setCompactFlag(compactFlag);
        pramEntity.setComfortFlag(comfortFlag);
        pramEntity.setMultiTerrainFlag(multiterrainFlag);
        pramEntity.setAdjustableHandleFlag(adjustableHandleFlag);
        pramEntity.setLargePramBasketFlag(largePramBasketFlag);
        pramEntity.setCheapestPrice(cheapestPrice);
        pramEntity.setDiscontinuedFlag(discontinuedFlag);
        pramService.savePram(pramEntity);
        return "redirect:/";
    }


    @GetMapping("/product/{id}")
    public String getProduct(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("pram", pramService.findPramById(id));
        return "product";
    }

    @PostMapping("/results")
    public String getPrams(@RequestParam(name = "location", required = false) String location,
                           @RequestParam(name = "storage", required = false) String storage,
                           @RequestParam(name = "travel", required = false) String travel,
                           @RequestParam(name = "budget", required = false) String budget,
                           @RequestParam(name = "infants", required = false) String infants,
                           @RequestParam(name = "accessories[]", required = false) String[] accessories,
                           @RequestParam(name = "focalPoints[]", required = false) String[] focalPoints,
                           @RequestParam(name = "intTravel", required = false) String intTravel,
                           @RequestParam(name = "activity", required = false) String activity,
                           Model model) {

        System.out.println(location + storage + Arrays.toString(accessories));

        if(location == null){
            location = "Not Provided";
        }

        if(storage == null){
            storage = "Not Provided";
        }

        if(travel == null){
            travel = "Not Provided";
        }

        if(budget == null){
            budget = "Not Provided";
        }

        if(infants == null){
            infants = "Not Provided";
        }

        if(intTravel == null){
            intTravel = "Not Provided";
        }

        if(activity == null){
            activity = "Not Provided";
        }

        if(accessories == null){
            accessories = new String[]{"Not Provided"};
        }

        if(focalPoints == null){
            focalPoints = new String[]{"Not Provided"};
        }

        model.addAttribute("prams", pramService.findPramsThatMeetCriteria(location, storage, travel, budget, infants, accessories, focalPoints, intTravel, activity));
        return "results";
    }



}

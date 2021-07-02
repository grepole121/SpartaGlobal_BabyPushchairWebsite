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
    public String addBook(){
        PramEntity pramEntity = new PramEntity();
//        pramEntity.setTheParameters();
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

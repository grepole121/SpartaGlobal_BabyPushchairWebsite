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
    public String getPrams(@RequestParam(name = "location") String location,
                           @RequestParam(name = "storage") String storage,
                           @RequestParam(name = "travel") String travel,
                           @RequestParam(name = "budget") String budget,
                           @RequestParam(name = "infants") String infants,
                           @RequestParam(name = "accessories[]") String[] accessories,
                           @RequestParam(name = "focalPoints[]") String[] focalPoints,
                           @RequestParam(name = "intTravel") String intTravel,
                           @RequestParam(name = "activity") String activity,
                           Model model) {

        System.out.println(location + storage + Arrays.toString(accessories));
        model.addAttribute("prams", pramService.findPramsThatMeetCriteria(location, storage, travel, budget, infants, accessories, focalPoints, intTravel, activity));
        return "results";
    }



}

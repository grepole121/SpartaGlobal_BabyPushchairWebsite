package com.sparta.eng87.babypushchairwebsite.controllers;

import com.sparta.eng87.babypushchairwebsite.repositories.PramRepository;
import com.sparta.eng87.babypushchairwebsite.service.PramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PramController {

    private PramService pramService;

    @Autowired
    public PramController(PramService pramService) {
        this.pramService = pramService;
    }

    @GetMapping("/")
    public String index (Model model) {
        model.addAttribute("prams", pramService.getAllPrams());
        return "index";
    }
}

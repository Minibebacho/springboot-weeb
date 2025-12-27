package com.jordy.curso.springtboot.webapp.springboot_weeb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    
    @GetMapping("/details")
    public String details(Model model ){
        model.addAttribute("title", "Hola mundo");
        model.addAttribute("name", "Jordy");
        model.addAttribute("lastname", "Felipe");

        return "details";
    }

    @GetMapping ("/sandy")
    public String sandy(Model model){
        model.addAttribute("title", "perro");
        model.addAttribute("nombre", "Sandy");
        model.addAttribute("raza", "chihuahua");
        return "sandy";
    }
    
    }



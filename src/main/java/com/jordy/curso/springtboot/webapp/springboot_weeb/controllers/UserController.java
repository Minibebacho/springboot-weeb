package com.jordy.curso.springtboot.webapp.springboot_weeb.controllers;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.jordy.curso.springtboot.webapp.springboot_weeb.models.User;

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

        User user = new User("sandy", "perro");
        model.addAttribute("title", "Mascota");
        model.addAttribute("user", user);
        user.setEmail("jordy990@gmail.com");
        return "sandy";
    }
    
    @GetMapping("/list")
    public String list (ModelMap model){
        //List<User> users = Arrays.asList
        //(new User("pepa","sandy", "sandy@gmail.com"),
        //new User("Lalo", "Perez", "sandy@gmail.com"),
        //new User ("andres","molitalia", "sandy@gmail.com"));
            
       // model.addAttribute("users", users);
        model.addAttribute("title", "listado usuarios");
        return "list";
    }

    @ModelAttribute("users")
    public List<User> usersModel(){
      return Arrays.asList(
            new User("pepa","sandy", "sandy@gmail.com"),
            new User("Lalo", "Perez", "sandy@gmail.com"),
            new User ("andres","molitalia", "sandy@gmail.com"));
    }
    }



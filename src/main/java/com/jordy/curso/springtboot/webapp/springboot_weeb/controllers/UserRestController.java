package com.jordy.curso.springtboot.webapp.springboot_weeb.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jordy.curso.springtboot.webapp.springboot_weeb.models.User;
import com.jordy.curso.springtboot.webapp.springboot_weeb.models.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details-dto")
    public UserDto details(){

        UserDto userDto= new UserDto();
        User user = new User("sandy", "perro");
        userDto.setUser(user);
        userDto.setTittle("Springboot");
        
        return userDto;
    }

    @GetMapping("/list")
    public List <User> list(){
        User user= new User("sandy", "maria");
        User user2= new User("jordy", "espinoza");
        User user3= new User("felipe", "camacho");
    
        List <User> users =Arrays.asList(user, user2, user3);
        return users;
    }


    @GetMapping("/details-map")
    public Map<String, Object> detailsMap(){
        User user = new User("sandy", "perro");
        Map<String, Object> body = new HashMap<>();

        body.put("title", "springbootAPI");
        body.put("user", user);
        return body;
    }
}

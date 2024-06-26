package com.raul.curso.springboot.webapp.springboot_web.controllers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.raul.curso.springboot.webapp.springboot_web.models.User;
import com.raul.curso.springboot.webapp.springboot_web.models.dto.UserDto;


@RestController
@RequestMapping("/api")
public class UserRestController {
 
    @GetMapping("/details")  
    
    public  UserDto details(){ 
        UserDto userDto = new UserDto();
        User user = new User("Raúl", "Sánchez");
        userDto.setUser(user);
        userDto.setTitle("Hola mundo Spring Boot");

       
        return userDto;
    }

    @GetMapping("/list")
    public List<User> list(){
        User user = new User("Raúl", "Sánchez");
        User user2 = new User("Pepe", "Domingo");
        User user3 = new User("Juan", "Travolta");

        List<User> users = Arrays.asList(user, user2, user3);
       // List<User> users = new ArrayList<>();
        //users.add(user);
       // users.add(user2);
        //users.add(user3);

        return users;
    }
    
    @GetMapping("/details-map")  
    
    public  Map<String, Object> detailsMap(){
        User user = new User("Raúl", "Sánchez");
        Map<String, Object> body = new HashMap<>();
        
       body.put("title", "Hola mundo Spring Boot");
       body.put("user", user);
     
       
        return body;
    }
}

package com.raul.curso.springboot.webapp.springboot_web.controllers;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.raul.curso.springboot.webapp.springboot_web.models.User;


@RestController
@RequestMapping("/api")
public class UserRestController {
 
    @GetMapping("/details")  
    
    public  Map<String, Object> details(){
        User user = new User("Raúl", "Sánchez");
        Map<String, Object> body = new HashMap<>();
        
        body.put("title", "Hola mundo Spring Boot");
        body.put("user", user);
     
       
        return body;
    }
}

package com.raul.curso.springboot.webapp.springboot_web.controllers;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {
 
    @GetMapping("/details")  
    public String details(Map<String, Object> model){
        model.put("title", "Hola mundo Spring Boot");
        model.put("name", "Raúl");
        model.put("lastname", "Sánchez");
        return "details";
    }
}

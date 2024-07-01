package com.raul.curso.springboot.webapp.springboot_web.controllers;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.raul.curso.springboot.webapp.springboot_web.models.User;


@Controller
public class UserController {
 
    @GetMapping("/details")  
    public String details(Model model){
        User user = new User("Raúl", "Sánchez");
        user.setEmail("raulsg@correo.es");
        model.addAttribute("title", "Hola mundo Spring Boot");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        List<User> users = new ArrayList<>();
        model.addAttribute("users", users);
        model.addAttribute("title", "Listado de usuarios");
        return "list";
    }
    
}

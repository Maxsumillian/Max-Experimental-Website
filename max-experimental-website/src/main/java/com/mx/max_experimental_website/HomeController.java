package com.mx.max_experimental_website;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        System.out.println("HomeController called!");
        return "index"; // must match templates/index.html
    }
}
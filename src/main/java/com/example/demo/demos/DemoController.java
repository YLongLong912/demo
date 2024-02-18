package com.example.demo.demos;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @GetMapping("/show")
    public String showPage(Model model){
        model.addAttribute("msg","ok");
        return "demo";
    }
}

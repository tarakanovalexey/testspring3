package com.petproject.testspring3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping(value = "/")
    public String main(Model model) {
        model.addAttribute("activeLink", "Главная");
        return "main"; //название шаблона для октрытия
    }

    @GetMapping(value = "/calendar")
    public String calendar(Model model) {
        model.addAttribute("activeLink", "Календарь");
        return "calendar"; //название шаблона для октрытия
    }

    @GetMapping(value = "/prices")
    public String prices(Model model) {
        model.addAttribute("activeLink", "Цены");
        return "prices"; //название шаблона для октрытия
    }

    @GetMapping(value = "/about")
    public String about(Model model) {
        model.addAttribute("activeLink", "О нас");
        return "about"; //название шаблона для октрытия
    }
}

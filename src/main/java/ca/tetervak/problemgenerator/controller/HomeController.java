package ca.tetervak.problemgenerator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Locale;

@Controller
public class HomeController {

    @GetMapping({"/", "/index"})
    public String index() {
        return "home/home-index";
    }

    @GetMapping("/about")
    public String about(Locale locale) {
        return "home/home-about";
    }
}

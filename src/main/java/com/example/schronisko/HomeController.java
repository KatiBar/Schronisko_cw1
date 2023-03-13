package com.example.schronisko;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@Controller
public class HomeController {
    private final AnimalRepository animalRepository;


    public HomeController(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @GetMapping("/")
    String home(Model model) {
        Collection<Animal> animals = animalRepository.findAll();
        model.addAttribute("animals", animals);
        return "index";
    }
}

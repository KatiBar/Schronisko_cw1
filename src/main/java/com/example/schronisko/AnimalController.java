package com.example.schronisko;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AnimalController {
    private final AnimalRepository animalRepository;

    public AnimalController(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @GetMapping("/zwierzak")
    String getAnimal(@RequestParam("imie") String id, Model model) {
        Animal animal = animalRepository.findAnimalById(id);
        model.addAttribute("animal", animal);
        return "zwierzak";
    }
}

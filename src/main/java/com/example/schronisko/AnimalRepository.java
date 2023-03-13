package com.example.schronisko;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class AnimalRepository {
    private final Map<String, Animal> animals = new HashMap<>();

    AnimalRepository() {
        Animal azor = new Animal("Azor", "Ta urocza czarnulka podbije serce każdego!\n" +
                "Jest nastawiona bardzo przyjaźnie do ludzi i do większości psów. Uwielbia ganiać za patykami po wybiegu a jednocześnie ładnie chodzi na smyczy.\n" +
                "Lara potrzebuje jeszcze trochę nauki, ale nie jest psem wymagającym dużego doświadczenia od przyszłego właściciela. \n" +
                "Jest jak diament, który trzeba tylko trochę oszlifować.\n" +
                "Spragniona pieszczot i kontaktu z człowiekiem szuka nowego domu.\n" +
                "Zamiast grać w grę z Larą Croft adoptuj Larę ze schroniska, nie pożałujesz!\n" +
                "\n");
        Animal rudy = new Animal("Rudy", "Dość szybko dotarło do Jahiry gdzie się znalazła i jak bardzo jej źle. \n" +
                "3-letnia koteczka od samego początku czuła się spięta i przerażona w schroniskowej klatce. \n" +
                "Choć przyjmowała głaskanie to jej ogromne oczy zdradzały jak bardzo czuje się niepewnie w nowy miejscu. \n" +
                "Jahira to duża kicia, o delikatnym usposobieniu. \n" +
                "Ta delikatność szybko dała o sobie znać i zaprowadziła koteczkę do szpitala z gorączką. \n" +
                "Stan psychiczny Jahiry mocno wpływa na jej zdrowie. Od stresu i napięcia już tylko krok do niejedzenia i kociego kataru. \n" +
                "Bardzo prosimy o dom dla Jahiry, dopóki koteczka jeszcze się trzyma, nie wiemy jak długo to potrwa. :(\n");

        animals.put(azor.getId(), azor);
        animals.put(rudy.getId(), rudy);
    }

    Animal findAnimalById(String  id) {
        return animals.get(id);
    }

    Collection<Animal> findAll() {
        return animals.values();
    }
}

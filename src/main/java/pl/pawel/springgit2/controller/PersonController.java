package pl.pawel.springgit2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pawel.springgit2.domain.Person;

@RestController
public class PersonController {
    @GetMapping("/person")
    public Person getPerson(){
        return new Person("mariusz", "p");
    }
}

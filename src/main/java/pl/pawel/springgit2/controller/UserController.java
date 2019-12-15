package pl.pawel.springgit2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/sweet-home")
    public String home(){
        return "home";
    }
}

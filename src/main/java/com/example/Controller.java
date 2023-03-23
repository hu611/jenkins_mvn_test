package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    //lol
    @GetMapping("/")
    public String welcome() {
        return "welcome";
    }

    @GetMapping("/r1/r1")
    public String r1r2() {
        return "welcome r1 r2";
    }
}

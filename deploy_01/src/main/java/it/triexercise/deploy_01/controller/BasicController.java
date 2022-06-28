package it.triexercise.deploy_01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping
    public String getDevName() {
        return "Tristan";
    }
}

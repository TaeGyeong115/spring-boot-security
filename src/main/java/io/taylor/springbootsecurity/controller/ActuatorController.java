package io.taylor.springbootsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActuatorController {

    @GetMapping("/actuator")
    public String hello() {
        return "hello";
    }
}
package io.taylor.springbootsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/hello")
    public String hello() throws InterruptedException {
        Thread.sleep(5000L);
        return "hello";
    }

    @GetMapping("/world")
    public String my() throws InterruptedException {
        Thread.sleep(3000L);
        return "world";
    }
}
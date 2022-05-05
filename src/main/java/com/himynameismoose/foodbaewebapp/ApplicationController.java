package com.himynameismoose.foodbaewebapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @RequestMapping
    public String hello() {
        return "hello";
    }
}

package com.himynameismoose.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This is the Application controller
 * @RestController annotation handles requests
 *
 * @author mershellerivera
 * @version 1.0
 */
@RestController
public class ApplicationController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/goodbye")
    public String goodbye() {
        return "goodbye";
    }
}

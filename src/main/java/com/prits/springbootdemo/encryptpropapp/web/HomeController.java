package com.prits.springbootdemo.encryptpropapp.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${my.prop}")
    private String myProp;

    @GetMapping("/")
    public String home() {
        return myProp;
    }
}

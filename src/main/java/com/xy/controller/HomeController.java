package com.xy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Alex on 2016/10/25.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "hello world";
    }
}

package com.example.swagger.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/default")
public class DefaultController {

    @GetMapping(value = "")
    @ApiOperation(value =  "Message", notes = "Print a welcome message")
    public String getMessage(){
        return "Welcome to your first application";
    }
}

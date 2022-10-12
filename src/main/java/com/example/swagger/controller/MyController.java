package com.example.swagger.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/get")
public class MyController {

    @GetMapping(value="")
    @ApiOperation(value = "My name", notes = "Print my name in the console")
    public String getName(){
        return "Domenico Celani";
    }
}

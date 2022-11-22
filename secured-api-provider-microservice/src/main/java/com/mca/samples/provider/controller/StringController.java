package com.mca.samples.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/string")
public class StringController {


    @GetMapping("/lowercase/{value}")
    public String lowercase(@PathVariable String value) {
        return value.toLowerCase();
    }
}

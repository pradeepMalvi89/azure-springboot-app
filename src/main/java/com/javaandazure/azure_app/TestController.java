package com.javaandazure.azure_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("/test")
    public String test() {
        return "Hello JavaInUse";
    }

    @GetMapping("/")
    public String home() {
        return "Hello azue-java home";
    }
}
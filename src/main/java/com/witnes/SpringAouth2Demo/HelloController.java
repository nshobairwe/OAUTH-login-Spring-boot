package com.witnes.SpringAouth2Demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String greeting(){
        return "Hellow wold";
    }
}

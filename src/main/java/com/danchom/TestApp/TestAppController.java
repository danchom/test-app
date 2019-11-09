package com.danchom.TestApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAppController {

    @GetMapping("/hi")
    public String greeting(){
        return "Hi there!";
    }
}

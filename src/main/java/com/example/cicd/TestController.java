package com.example.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/test")
    public String test() {
        return "test is OK2222222";
    }

    @GetMapping("/api/test/jiwon")
    public String test2() {
        return "test is JIWON2222222";
    }

    @GetMapping("/api/test/jiwon/jiwon")
    public String test3() {
        return "test is 33333";
    }
}

package com.example.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/test")
    public String test() {
        return "test is OOKK";
    }

    @GetMapping("/api/test/jiwon")
    public String test2() {
        return "test is JIWONJIWON2222";
    }
}

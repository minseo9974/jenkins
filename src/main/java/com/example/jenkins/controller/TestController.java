package com.example.jenkins.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * class: TestController.
 *
 * @author minseo
 * @version 2/13/24
 */
@RestController
public class TestController {

    @GetMapping("/")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("test");
    }

    @GetMapping("/test")
    public String test2() {
        return "test2";
    }
    @GetMapping("/test2")
    public String test3() {
        return "test3";
    }
}

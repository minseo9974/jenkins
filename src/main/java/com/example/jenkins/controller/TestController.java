package com.example.jenkins.controller;

import lombok.Getter;
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
        return ResponseEntity.ok("ok");
    }
}

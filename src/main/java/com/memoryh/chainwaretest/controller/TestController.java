package com.memoryh.chainwaretest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/health/check")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("ok");
    }

}
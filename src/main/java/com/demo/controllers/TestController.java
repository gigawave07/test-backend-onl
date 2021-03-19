package com.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@CrossOrigin
public class TestController {

    @RequestMapping("/")
    public static ResponseEntity<?> test() {
        return ResponseEntity.ok(Collections.singleton("test"));
    }
}

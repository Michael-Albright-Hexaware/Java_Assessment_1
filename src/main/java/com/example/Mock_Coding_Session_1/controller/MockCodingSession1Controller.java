package com.example.Mock_Coding_Session_1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MockCodingSession1Controller {

    @GetMapping("/api/testExceptionHandling/")
    public Map<String, String> exceptionHandling1(@RequestParam Long code) {
        Map<String, String> response = new HashMap<>();
        if(code == 401) {
            response.put("errorMessage", "You are not authorized");
            return response;
        }
        if(code == 404) {
            response.put("errorMessage", "resource not found");
            return response;
        }
        response.put("errorResponse", "Invalid Entry");
        return response;
    }
}

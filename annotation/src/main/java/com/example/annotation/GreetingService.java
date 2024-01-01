package com.example.annotation;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String getGreeting() {
        return "Hello from the GreetingService!";
    }
}
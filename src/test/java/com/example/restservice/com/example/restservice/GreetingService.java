package com.example.restservice;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor

public class GreetingService {
	public String greet(String greeting, String name) {
        return String.format("%s %s", greeting, name);
    }
}

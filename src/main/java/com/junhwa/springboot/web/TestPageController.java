package com.junhwa.springboot.web;

import com.junhwa.springboot.web.dto.TestResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestPageController {
    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/test/dto")
    public TestResponseDto testDto(@RequestParam("name") String name,
                                   @RequestParam("amount") int amount) {
        return new TestResponseDto(name, amount);
    }
}
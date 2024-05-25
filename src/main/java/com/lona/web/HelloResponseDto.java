package com.lona.web;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Getter // ①
@RequiredArgsConstructor  // ②
public class HelloResponseDto {
    private final String name;
    private final int amount;

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(
            @RequestParam("name") String name, // ①
            @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }

}

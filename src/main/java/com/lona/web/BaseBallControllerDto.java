package com.lona.web;

import com.lona.baseBall.BaseBall;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Getter // ①
@RequiredArgsConstructor  // ②
public class BaseBallControllerDto {
    private final String given;
    private final String input;

    @GetMapping("/BaseBall/Dto")
    public String scoreResult(
            @RequestParam("given") String given, // ①
            @RequestParam("input") String input) {
        return new BaseBall().getScore(given, input);
    }

}

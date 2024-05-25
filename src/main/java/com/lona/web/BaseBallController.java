package com.lona.web;

import com.lona.baseBall.BaseBall;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseBallController {

    @GetMapping("/BaseBall")
    public String game(
            @RequestParam("given") String given, // ①
            @RequestParam("input") String input) {
        return new BaseBall().getScore(given, input);
    }

}

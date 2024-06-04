package com.lona.web.dto;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class HelloResponseDtoTest {
    @Test
    public void loombook_function_test() {
//given
        String name = "test";
        int amount = 1000;
//when
        HelloResponseDto dto = new HelloResponseDto(name, amount);
//then
        assertThat(dto.getName()).isEqualTo(name); // ①, ②
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}

package com.lona.web.dto;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseBallControllerDtoTest {

    @Test
    public void scoreResultTest_1S2B() {
        String given = "123";
        String input = "321";
        BaseBallControllerDto dto = new BaseBallControllerDto(given, input);
        assertThat(dto.getGiven()).isEqualTo(given); // ①, ②
        assertThat(dto.getInput()).isEqualTo(input);
        assertThat(dto.scoreResult(given, input)).isEqualTo("1S2B");
    }

    @Test
    public void scoreResultTest_1B() {
        String given = "123";
        String input = "415";
        BaseBallControllerDto dto = new BaseBallControllerDto(given, input);

        assertThat(dto.getGiven()).isEqualTo(given); // ①, ②
        assertThat(dto.getInput()).isEqualTo(input);
        assertThat(dto.scoreResult(given, input)).isEqualTo("1B");
    }

    @Test
    public void scoreResultTest_3S() {
        String given = "123";
        String input = "123";
        BaseBallControllerDto dto = new BaseBallControllerDto(given, input);

        assertThat(dto.getGiven()).isEqualTo(given); // ①, ②
        assertThat(dto.getInput()).isEqualTo(input);
        assertThat(dto.scoreResult(given, input)).isEqualTo("3S");
    }

    @Test
    public void scoreResultTest_null() {
        String given = "123";
        String input = "456";
        BaseBallControllerDto dto = new BaseBallControllerDto(given, input);

        assertThat(dto.getGiven()).isEqualTo(given); // ①, ②
        assertThat(dto.getInput()).isEqualTo(input);
        assertThat(dto.scoreResult(given, input)).isNull();
    }

}
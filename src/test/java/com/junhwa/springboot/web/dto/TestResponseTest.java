package com.junhwa.springboot.web.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestResponseTest {
    @Test
    public void testLombokFunction() {
        //given
        String name = "test";
        int amount = 1000;

        //when
        TestResponseDto dto = new TestResponseDto(name, amount);

        //then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}

package com.lona.web;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class BaseBallControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void scoreResultTest_1S2B() throws Exception {
        String given = "123";
        String input = "321";
        mvc.perform(get("/BaseBall")
                        .param("given", given) //  ①
                        .param("input", input))
                .andExpect(status().isOk())
                .andExpect(content().string("1S2B"));
    }

    @Test
    public void scoreResultTest_1B() throws Exception {
        String given = "123";
        String input = "415";
        mvc.perform(get("/BaseBall")
                        .param("given", given) //  ①
                        .param("input", input))
                .andExpect(status().isOk())
                .andExpect(content().string("1B"));
    }

    @Test
    public void scoreResultTest_3S() throws Exception {
        String given = "123";
        String input = "123";
        mvc.perform(get("/BaseBall")
                        .param("given", given) //  ①
                        .param("input", input))
                .andExpect(status().isOk())
                .andExpect(content().string("3S"));
    }

    @Test
    public void scoreResultTest_null() throws Exception {
        String given = "123";
        String input = "456";
        mvc.perform(get("/BaseBall")
                        .param("given", given) //  ①
                        .param("input", input))
                .andExpect(status().isOk())
                .andExpect(content().string(""));
    }
}
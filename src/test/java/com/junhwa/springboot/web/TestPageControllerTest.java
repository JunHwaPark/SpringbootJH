package com.junhwa.springboot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@WebMvcTest(controllers = TestPageController.class)
public class TestPageControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void returnTest() throws Exception {
        String test = "test";

        mvc.perform(get("/test"))
                .andExpect(status().isOk())
                .andExpect(content().string(test));
    }

    @Test
    public void returnTestDto() throws Exception {
        String name = "test";
        int amount = 1000;

        mvc.perform(get("/test/dto").param("name", name).param("amount", String.valueOf(amount)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is(name)))
                .andExpect(jsonPath("$.amount", is(amount)));
    }
}

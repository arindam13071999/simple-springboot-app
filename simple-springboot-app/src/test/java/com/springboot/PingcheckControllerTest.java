package com.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.context.ActiveProfiles;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;


@SpringBootTest
@ActiveProfiles("default")
@AutoConfigureMockMvc
public class PingcheckControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnPong() throws Exception {
        mockMvc.perform(get("/ping"))
               .andExpect(status().isOk())
               .andExpect(content().string("pong"));
    }
}

package com.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
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

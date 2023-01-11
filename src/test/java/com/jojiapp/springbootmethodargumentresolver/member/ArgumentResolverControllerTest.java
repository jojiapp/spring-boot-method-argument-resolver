package com.jojiapp.springbootmethodargumentresolver.member;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.autoconfigure.web.servlet.*;
import org.springframework.boot.test.context.*;
import org.springframework.test.web.servlet.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class ArgumentResolverControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("id값으로 1을 반환한다")
    void test1() throws Exception {

        mockMvc.perform(get("/argument-resolver"))
                .andDo(print())
                .andExpect(content().json("1"));

    }

}

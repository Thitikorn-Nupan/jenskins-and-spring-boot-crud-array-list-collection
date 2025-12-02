package com.ttknp.basicapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// ** Bug test single method on spring boot 4

// *** JUnit5 test cases for CRUD REST APIs. use the @WebMvcTest annotation to load only UserController class. (can multiple rest controller)
// @WebMvcTest(PhoneController.class)
// Or
// JUnit6
@SpringBootTest
@AutoConfigureMockMvc
class BasicApiUsingSpringBootApplicationTests {

    // *** using MockMvc class to make REST API calls.
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testSelectAll() throws Exception {
        mockMvc.perform(get("/api/phone/reads"))
                .andExpect(status().isOk())
                .andDo(print());
    }


}

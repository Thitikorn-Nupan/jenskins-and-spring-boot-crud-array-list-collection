package com.ttknp;

import com.ttknp.controller.PhoneController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// *** JUnit5 test cases for CRUD REST APIs. use the @WebMvcTest annotation to load only UserController class. (can multiple rest controller)
@WebMvcTest(PhoneController.class)
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

    @Test
    public void testSelectOne() throws Exception {
        mockMvc.perform(get("/api/phone/read").param("id","dc2000a7-6bbf-479a-8e7f-cb7d052c668b"))
                .andExpect(status().isOk())
                .andDo(print());
    }


}

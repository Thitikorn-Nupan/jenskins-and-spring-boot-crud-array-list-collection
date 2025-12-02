package com.ttknp;

import com.ttknp.service.PhoneService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// ** Bug test single method on spring boot 4

// In junit 6 @SpringBootTest it's no need
@SpringBootTest // in junit 6 if you cut @SpringBootTest out will not run main
class BasicApiUsingSpringBootServiceTests {

    private final PhoneService phoneService = new PhoneService();

    @Test
    void contextLoads() {
        assertThat(phoneService).isNotNull();
    }

    @Test
    public void testGetAll() {
       assertThat(phoneService.getPhones().size()).isEqualTo(3);
    }

}

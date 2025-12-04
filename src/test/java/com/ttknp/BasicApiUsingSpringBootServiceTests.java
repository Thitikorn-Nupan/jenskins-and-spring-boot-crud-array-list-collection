package com.ttknp;

import com.ttknp.service.PhoneService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

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

    @Test
    public void testGetOne() {
       String id = "dc2000a7-6bbf-479a-8e7f-cb7d052c668b";
       assertThat(phoneService.getPhone(id).getId()).isEqualTo(UUID.fromString(id));
    }

    @Test
    public void testGetAllByBrand() {
        String brand = "brand";
        assertThat(phoneService.getPhones(brand)).isNull();
    }

}

package com.ttknp;

import com.ttknp.valiadationcustomservice.validation.ValidateHelperService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.ComponentScan;

// @ComponentScan(basePackages = {"com.ttknp"}) // *** if you gonna test (with mockito) you have to comment this annotation
@Slf4j
@SpringBootApplication(scanBasePackages = "com.ttknp")
public class BasicApiUsingSpringBoot3Application {

    public static void main(String[] args) {
        SpringApplication.run(BasicApiUsingSpringBoot3Application.class, args);
        log.info("Application started {}", ValidateHelperService.isEmail("thitikorn_nupan@gmail.com"));
    }

}

package com.ttknp.controller;


import com.ttknp.entity.Phone;
import com.ttknp.service.PhoneService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/phone")
public class PhoneController {

    private final PhoneService phoneService;

    public PhoneController() {
        this.phoneService = new PhoneService();
    }

    @GetMapping(value = "/reads")
    private ResponseEntity<List<Phone>> reads() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(phoneService.getPhones());
    }
}

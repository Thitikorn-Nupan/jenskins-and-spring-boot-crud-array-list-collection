package com.ttknp.controller;


import com.ttknp.entity.Phone;
import com.ttknp.service.PhoneService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value = "/api/phone")
public class PhoneController {

    private final PhoneService phoneService;

    public PhoneController() {
        this.phoneService = new PhoneService();
    }

    @GetMapping(value = "/server")
    private ResponseEntity<String> server() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body("Server is up and running");
    }

    @GetMapping(value = "/reads")
    private ResponseEntity<List<Phone>> reads() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(phoneService.getPhones());
    }

    @GetMapping(value = "/readsBy")
    private ResponseEntity<List<Phone>> readsByBrand(@RequestParam String brand) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(phoneService.getPhones(brand));
    }

    @GetMapping(value = "/read")
    private ResponseEntity<Phone> read(@RequestParam String id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(phoneService.getPhone(id));
    }
}

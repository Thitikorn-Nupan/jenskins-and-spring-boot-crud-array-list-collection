package com.ttknp.service;

import com.ttknp.entity.Phone;
import java.util.List;
import java.util.UUID;

public class PhoneService {

    private List<Phone> phones;

    public PhoneService() {
        phones = List.of(
                new Phone(UUID.randomUUID(),"model","brand",0.5d,1L),
                new Phone(UUID.randomUUID(),"model","brand",0.5d,1L),
                new Phone(UUID.randomUUID(),"model","brand",0.5d,1L)
        );
    }

    public List<Phone> getPhones() {
        return phones;
    }
}

package com.ttknp.service;

import com.ttknp.entity.Phone;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class PhoneService {

    private final List<Phone> phones;

    public PhoneService() {
        phones = List.of(
                new Phone(UUID.fromString("dc2000a7-6bbf-479a-8e7f-cb7d052c668b"),"model","brand",0.5d,1L),
                new Phone(UUID.randomUUID(),"model","brand",0.5d,1L),
                new Phone(UUID.randomUUID(),"model","brand",0.5d,1L)
        );
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public Phone getPhone(String id) {
        return phones.stream().filter(p -> p.getId().equals(UUID.fromString(id))).findFirst().orElse(null);
    }

    public List<Phone> getPhones(String brand) {
        return phones.stream().filter(p -> p.getBrand().equals(brand)).collect(Collectors.toList());
    }
}

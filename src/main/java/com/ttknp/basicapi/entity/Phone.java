package com.ttknp.basicapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Phone {
    private UUID id;
    private String model;
    private String brand;
    private Double price;
    private Long inStock;
}

package com.example.bitlab.entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Item {
    private Long id;

    private String name;

    private String description;

    private double price;
}

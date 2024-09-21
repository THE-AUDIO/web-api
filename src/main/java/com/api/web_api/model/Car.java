package com.api.web_api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="cars")
public class Car {
    public enum Color {
        RED,
        BLUE,
        BLACK,
        GREEN,
        YELLOW
    }
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String model;
    private String brand;
    private int years;

    @Enumerated(EnumType.STRING)
    private  Color color;
}

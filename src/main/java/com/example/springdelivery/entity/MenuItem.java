package com.example.springdelivery.entity;


import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "menu_item")
public class MenuItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private BigDecimal price;
    @ManyToOne
    @JoinColumn(name = "restaurant_id",nullable = false)
    private Restaurant restaurant;
    @ManyToOne
    @JoinColumn(name = "category_id",nullable = false )
    private Category category;
}

package com.calorietracker.calorie_tracker.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "dish_products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DishProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dish_id", nullable = false)
    private Dish dish;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(nullable = false)
    private Double grams;
}

package com.calorietracker.calorie_tracker.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DishProductDTO {
    private Long productId;
    private String productName;
    private Double grams;
}

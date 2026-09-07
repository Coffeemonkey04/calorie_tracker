package com.calorietracker.calorie_tracker.dto;

import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDTO {
    private Long id;
    private String name;
    private Double calories;
    private Double proteins;
    private Double fats;
    private Double carbohydrates;
    private String photoUrl;
}

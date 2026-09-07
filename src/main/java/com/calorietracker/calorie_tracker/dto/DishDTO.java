package com.calorietracker.calorie_tracker.dto;

import lombok.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DishDTO {
    private Long id;
    private String name;
    private String recipe;
    private String photoUrl;
    private Double totalCalories;
    private Double totalProteins;
    private Double totalFats;
    private Double totalCarbohydrates;
    private List<DishProductDTO> ingredients;
}

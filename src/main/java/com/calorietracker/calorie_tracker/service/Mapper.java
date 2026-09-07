package com.calorietracker.calorie_tracker.service;

import com.calorietracker.calorie_tracker.dto.DishDTO;
import com.calorietracker.calorie_tracker.dto.DishProductDTO;
import com.calorietracker.calorie_tracker.dto.ProductDTO;
import com.calorietracker.calorie_tracker.model.Dish;
import com.calorietracker.calorie_tracker.model.DishProduct;
import com.calorietracker.calorie_tracker.model.Product;

import java.util.List;

public class Mapper {

    public Product toProduct(ProductDTO dto) {
        return Product.builder()
                .id(dto.getId())
                .name(dto.getName())
                .photoUrl(dto.getPhotoUrl())
                .calories(dto.getCalories())
                .proteins(dto.getProteins())
                .fats(dto.getFats())
                .carbohydrates(dto.getCarbohydrates())
                .build();
    }

    public ProductDTO toProductDTO(Product product) {
        return ProductDTO.builder()
                .id(product.getId())
                .name(product.getName())
                .photoUrl(product.getPhotoUrl())
                .calories(product.getCalories())
                .proteins(product.getProteins())
                .fats(product.getFats())
                .carbohydrates(product.getCarbohydrates())
                .build();
    }

    public Dish toDish(DishDTO dto){
        return Dish.builder()
                .name(dto.getName())
                .recipe(dto.getRecipe())
                .photoUrl(dto.getPhotoUrl())
                .build();
    }

    public DishDTO toDishDTO(Dish dish, List<DishProduct> ingredients) {
        List<DishProductDTO> ingrDTOs = ingredients.stream()
                .map(dp -> DishProductDTO.builder()
                        .productId(dp.getProduct().getId())
                        .productName(dp.getProduct().getName())
                        .grams(dp.getGrams())
                        .build())
                .toList();

        return DishDTO.builder()
                .id(dish.getId())
                .name(dish.getName())
                .recipe(dish.getRecipe())
                .photoUrl(dish.getPhotoUrl())
                .totalCalories(dish.getTotalCalories())
                .totalProteins(dish.getTotalProteins())
                .totalFats(dish.getTotalFats())
                .totalCarbohydrates(dish.getTotalCarbohydrates())
                .ingredients(ingrDTOs)
                .build();
    }
}

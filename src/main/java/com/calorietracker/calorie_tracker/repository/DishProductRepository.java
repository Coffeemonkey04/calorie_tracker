package com.calorietracker.calorie_tracker.repository;

import com.calorietracker.calorie_tracker.model.DishProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DishProductRepository extends JpaRepository<DishProduct, Long> {
    List<DishProduct> findByDishId(long dishId);
}

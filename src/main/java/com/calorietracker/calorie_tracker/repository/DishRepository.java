package com.calorietracker.calorie_tracker.repository;

import com.calorietracker.calorie_tracker.model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DishRepository extends JpaRepository<Dish, Long> {

}

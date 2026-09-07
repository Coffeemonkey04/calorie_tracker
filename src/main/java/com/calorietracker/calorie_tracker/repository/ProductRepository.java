package com.calorietracker.calorie_tracker.repository;

import com.calorietracker.calorie_tracker.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}

package com.swapnil.spring.boot.recipie.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.swapnil.spring.boot.recipie.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
Optional<Category> findByDescription(String description);
}

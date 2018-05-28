package com.swapnil.spring.boot.recipie.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.swapnil.spring.boot.recipie.domain.Category;
import com.swapnil.spring.boot.recipie.domain.UnitOfMeasure;

public interface UnitOfMeasurementRepository extends CrudRepository<UnitOfMeasure, Long >{
	Optional<UnitOfMeasure> findByUnitOfMeasure(String unitOfMeasure);
}

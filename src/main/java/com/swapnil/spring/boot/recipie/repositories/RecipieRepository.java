package com.swapnil.spring.boot.recipie.repositories;

import org.springframework.data.repository.CrudRepository;

import com.swapnil.spring.boot.recipie.domain.Recipie;

public interface RecipieRepository extends CrudRepository<Recipie, Long> {

}

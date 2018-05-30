package com.swapnil.spring.boot.recipie.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.aspectj.weaver.ast.HasAnnotation;
import org.springframework.stereotype.Service;

import com.swapnil.spring.boot.recipie.domain.Recipie;
import com.swapnil.spring.boot.recipie.repositories.RecipieRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class RecipieServiceImpl implements RecipieService{
private RecipieRepository recipieRepository;
	
	public RecipieServiceImpl(RecipieRepository recipieRepository) {
	//super();
	this.recipieRepository = recipieRepository;
}

	@Override
	public Set<Recipie> getAllRecipies() {
		log.debug("Hi! I am in Service");
		Set<Recipie> recipies=new HashSet<>();
		recipieRepository.findAll().iterator().forEachRemaining(recipies:: add);
		return recipies;
	}
	
	 @Override
	    public Recipie findById(Long l) {

	        Optional<Recipie> recipeOptional = recipieRepository.findById(l);

	        if (!recipeOptional.isPresent()) {
	            throw new RuntimeException("Recipe Not Found!");
	        }

	        return recipeOptional.get();
	    }

}

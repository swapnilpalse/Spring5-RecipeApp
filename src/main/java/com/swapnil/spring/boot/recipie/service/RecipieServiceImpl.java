package com.swapnil.spring.boot.recipie.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.aspectj.weaver.ast.HasAnnotation;
import org.springframework.stereotype.Service;

import com.swapnil.spring.boot.recipie.domain.Recipie;
import com.swapnil.spring.boot.recipie.repositories.RecipieRepository;

@Service
public class RecipieServiceImpl implements RecipieService{
private RecipieRepository recipieRepository;
	
	public RecipieServiceImpl(RecipieRepository recipieRepository) {
	//super();
	this.recipieRepository = recipieRepository;
}

	@Override
	public Set<Recipie> getAllRecipies() {
		Set<Recipie> recipies=new HashSet<>();
		recipieRepository.findAll().iterator().forEachRemaining(recipies:: add);
		return recipies;
	}

}

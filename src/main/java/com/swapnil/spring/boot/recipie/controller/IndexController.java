package com.swapnil.spring.boot.recipie.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.swapnil.spring.boot.recipie.domain.Category;
import com.swapnil.spring.boot.recipie.domain.UnitOfMeasure;
import com.swapnil.spring.boot.recipie.repositories.CategoryRepository;
import com.swapnil.spring.boot.recipie.repositories.UnitOfMeasurementRepository;
import com.swapnil.spring.boot.recipie.service.RecipieService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class IndexController {

	private CategoryRepository categoryRepository;
	private UnitOfMeasurementRepository unitOfMeasurementRepository;
	private RecipieService recipieService;
	
	public IndexController(CategoryRepository categoryRepository,
			UnitOfMeasurementRepository unitOfMeasurementRepository, RecipieService recipieService) {
		super();
		this.categoryRepository = categoryRepository;
		this.unitOfMeasurementRepository = unitOfMeasurementRepository;
		this.recipieService=recipieService;
	}
	


	@RequestMapping({"","/","/index"})
	public String getIndexPage(Model model) {
		model.addAttribute("recipies", recipieService.getAllRecipies());
		return "index";
	}
}

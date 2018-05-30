package com.swapnil.spring.boot.recipie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.swapnil.spring.boot.recipie.service.RecipieService;

@Controller
public class RecipeController {
	
	private RecipieService recipeService;
	
	 public RecipeController(RecipieService recipeService) {
		this.recipeService = recipeService;
	}

	@RequestMapping("/recipe/show/{id}")	
	 public String showById(@PathVariable String id, Model model) {
		 model.addAttribute("recipe", recipeService.findById(new Long(id)));
		 return "recipe/show";
	 }
}

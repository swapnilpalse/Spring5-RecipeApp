package com.swapnil.spring.boot.recipie.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import com.swapnil.spring.boot.recipie.repositories.CategoryRepository;
import com.swapnil.spring.boot.recipie.repositories.UnitOfMeasurementRepository;
import com.swapnil.spring.boot.recipie.service.RecipieService;

public class IndexControllerTest {
	@Mock
	private RecipieService recipieService;
	@Mock
	private CategoryRepository categoryRepository;
	@Mock
	private UnitOfMeasurementRepository unitOfMeasurementRepository;
	@Mock
	private Model model;
	private IndexController indexController;
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
		indexController=new IndexController(categoryRepository, unitOfMeasurementRepository, recipieService);
	}
	@Test
	public void getIndexPage() {
		assertEquals(indexController.getIndexPage(model),"index");
		verify(recipieService, times(1)).getAllRecipies();
	}

}

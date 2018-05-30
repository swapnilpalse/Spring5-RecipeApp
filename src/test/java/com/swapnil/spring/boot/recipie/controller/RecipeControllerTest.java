package com.swapnil.spring.boot.recipie.controller;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.swapnil.spring.boot.recipie.domain.Recipie;
import com.swapnil.spring.boot.recipie.service.RecipieService;

import sun.invoke.anon.AnonymousClassLoader;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class RecipeControllerTest {
	@Mock
	private RecipieService recipieService;
	private RecipeController recipieController;
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
		recipieController=new RecipeController(recipieService);
	}
	@Test
	public void testShowById() throws Exception {
		Recipie recipe = new Recipie();
        recipe.setId(1L);
        MockMvc mockMvc=MockMvcBuilders.standaloneSetup(recipieController).build();
        when(recipieService.findById(anyLong())).thenReturn(recipe);

        mockMvc.perform(get("/recipe/show/1"))
        .andExpect(status().isOk())
        .andExpect(view().name("recipe/show"));
	}

}

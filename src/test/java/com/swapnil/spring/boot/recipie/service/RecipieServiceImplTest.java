package com.swapnil.spring.boot.recipie.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.swapnil.spring.boot.recipie.domain.Recipie;
import com.swapnil.spring.boot.recipie.repositories.RecipieRepository;

public class RecipieServiceImplTest {
	RecipieServiceImpl recipeService;

    @Mock
    RecipieRepository recipeRepository;


    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        recipeService = new RecipieServiceImpl(recipeRepository);
    }

    @Test
    public void getRecipeByIdTest() throws Exception {
        Recipie recipe = new Recipie();
        recipe.setId(1L);
        Optional<Recipie> recipeOptional = Optional.of(recipe);

        when(recipeRepository.findById(Mockito.anyLong())).thenReturn(recipeOptional);

        Recipie recipeReturned = recipeService.findById(1L);

        assertNotNull("Null recipe returned", recipeReturned);
        verify(recipeRepository, times(1)).findById(Mockito.anyLong());
        verify(recipeRepository, never()).findAll();
    }

    @Test
    public void getRecipesTest() throws Exception {

        Recipie recipe = new Recipie();
        HashSet receipesData = new HashSet();
        receipesData.add(recipe);

        when(recipeService.getAllRecipies()).thenReturn(receipesData);

        Set<Recipie> recipes = recipeService.getAllRecipies();

        assertEquals(recipes.size(), 1);
        verify(recipeRepository, times(1)).findAll();
        verify(recipeRepository, never()).findById(Mockito.anyLong());
    }

}

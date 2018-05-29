package com.swapnil.spring.boot.recipie.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CategoryTest {
	Category category;
	@Before
	public void setUp() {
		category=new Category();
		
	}
	@Test
	public void testGetId() {
		Long idValue=4L;
		category.setId(idValue);
		assertEquals(4L, category.getId());
	}

//	@Test
//	public void testGetDescription() {
//		fail("Not yet implemented");
//	}

}

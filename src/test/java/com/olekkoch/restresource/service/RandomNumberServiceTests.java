package com.olekkoch.restresource.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.olekkoch.restresource.controllers.RandomController;
import com.olekkoch.restresource.model.RandomNumber;

public class RandomNumberServiceTests {
	RandomNumberService resourceService;
	@Test
	public void getNumerByIdTest() {
        resourceService = Mockito.mock(RandomNumberService.class);
        Mockito.when(resourceService.getNumerById(1)).thenReturn(new RandomNumber(1, 123));
        
        RandomController controller = new RandomController(resourceService);
        RandomNumber resource = controller.getRandomNumberById(1);
        assertEquals(123, resource.getRandom());
	}
	
	@Test
	public void getNumerByIdNegativeTest() {
        resourceService = Mockito.mock(RandomNumberService.class);
        Mockito.when(resourceService.getNumerById(1)).thenReturn(new RandomNumber(1, 123));
       
        RandomController controller = new RandomController(resourceService);
        RandomNumber resource = controller.getRandomNumberById(1);
        assertNotEquals(-123,  resource.getRandom()); 
	}
	
	@Test
	public void getAllNumbersTest() {
		List<RandomNumber> rn = new ArrayList<>();
		rn.add(new RandomNumber(1,123));
		rn.add(new RandomNumber(2,45));
		rn.add(new RandomNumber(6,6));
		
		resourceService = Mockito.mock(RandomNumberService.class);
		Mockito.when(resourceService.getAllNumbers()).thenReturn(rn);
		
		RandomController controller = new RandomController(resourceService);
		assertArrayEquals(rn.toArray(),controller.getRandomNumbers().toArray());
	}
	
	public void getElementFromNumbersListTest() {
		List<RandomNumber> rn = new ArrayList<>();
		rn.add(new RandomNumber(1,123));
		rn.add(new RandomNumber(2,45));
		rn.add(new RandomNumber(6,6));
		
		resourceService = Mockito.mock(RandomNumberService.class);
		Mockito.when(resourceService.getAllNumbers()).thenReturn(rn);
		
		assertEquals(123, rn.get(0).getRandom());
	}
}

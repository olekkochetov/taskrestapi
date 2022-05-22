package com.olekkoch.restresource.controllers;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import com.olekkoch.restresource.model.RandomNumber;
import com.olekkoch.restresource.service.RandomNumberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomController {
//    private HashMap<Integer, RandomNumber> randomNumberResources = new HashMap<>();
	
	@Autowired
	private RandomNumberService randomNumberService;
	
	@GetMapping("/")
    public List<RandomNumber> getRandomNumbers() {
		return randomNumberService.getAllNumbers();
	}
	
	@GetMapping("/{id}")
	public RandomNumber getRandomNumberById(@PathVariable(value="id") int id) {
		RandomNumber randomNumber = randomNumberService.getNumerById(id);
//		randomNumberService.saveNewResource(randomNumber);
		return randomNumber;
	}
}

package com.olekkoch.restresource.controllers;
import java.util.List;

import com.olekkoch.restresource.model.RandomNumber;
import com.olekkoch.restresource.service.RandomNumberService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomController {
	
	private RandomNumberService randomNumberService;
	
	public RandomController(RandomNumberService randomNumberService) {
		this.randomNumberService = randomNumberService;
	}
	
	@GetMapping("/")
    public List<RandomNumber> getRandomNumbers() {
		return randomNumberService.getAllNumbers();
	}
	
	@GetMapping("/{id}")
	public RandomNumber getRandomNumberById(@PathVariable(value="id") int id) {
		RandomNumber randomNumber = randomNumberService.getNumerById(id);
		return randomNumber;
	}
}

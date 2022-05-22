package com.olekkoch.restresource.controllers;
import java.util.HashMap;
import java.util.Random;

import com.olekkoch.restresource.model.RandomNumber;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomController {
    private HashMap<Integer, RandomNumber> randomNumberResources = new HashMap<>();
	private Random rand = new Random();
	
	@GetMapping("/")
	public RandomNumber getRandomNumbers(@RequestParam(value="id", defaultValue= "1") int id) {
		if(!randomNumberResources.containsKey(id)) {
			randomNumberResources.put(id, new RandomNumber(id, rand.nextInt()));
			return randomNumberResources.get(id);
		}
		else {
			return randomNumberResources.get(id);
		}
	}
}

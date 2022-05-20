package com.olekkoch.restresource.controllers;
import java.util.HashMap;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomController {
    private HashMap<Integer, Integer> hashNums = new HashMap<>();
	private Random rand = new Random();
	
	@GetMapping("/")
	public int getRandomNumbers(@RequestParam(value="id", defaultValue= "1") int id) {
			if(!hashNums.containsKey(id)) {
				hashNums.put(id, rand.nextInt());
				return hashNums.get(id);
			}
			else {
				return hashNums.get(id);
			}
	}
}

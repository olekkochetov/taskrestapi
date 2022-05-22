package com.olekkoch.restresource.service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olekkoch.restresource.model.RandomNumber;
import com.olekkoch.restresource.repository.RandomNumberRepository;

@Service
public class ReandomNumberServiceImpl implements RandomNumberService{
	
	private Random rand = new Random();
	
	@Autowired
    RandomNumberRepository repository;

    public ReandomNumberServiceImpl(RandomNumberRepository repository) {
        super();
        this.repository = repository;
    }

    @Override
    public List<RandomNumber> getAllNumbers() {
        return repository.findAll();
    }

    @Override
    public void saveNewResource(RandomNumber numb) {
        repository.save(numb);
    }

    @Override
    public RandomNumber getNumerById(int id) {
    	RandomNumber randomNumber;
        Optional<RandomNumber> optional = repository.findById(id);
        
        if(optional.isPresent()) {
            randomNumber = optional.get();  
        }
        else {
        	randomNumber = new RandomNumber(id, rand.nextInt());
        	repository.save(randomNumber);
        }
        return randomNumber;
    }
    
}

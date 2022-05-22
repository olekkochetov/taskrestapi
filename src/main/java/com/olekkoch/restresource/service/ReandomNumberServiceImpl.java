package com.olekkoch.restresource.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olekkoch.restresource.model.RandomNumber;
import com.olekkoch.restresource.repository.RandomNumberRepository;

@Service
public class ReandomNumberServiceImpl implements RandomNumberService{
	
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
        Optional<RandomNumber> optional = repository.findById(id);
        RandomNumber randomNumber = null;
        if(optional.isPresent()) {
            randomNumber = optional.get();  
        }
        else {
            throw new RuntimeException(String.format("The number with id - %d was not found!", id));
        }
        return randomNumber;
    }
    
}

package com.olekkoch.restresource.service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olekkoch.restresource.model.Resource;
import com.olekkoch.restresource.repository.ResourceRepository;

@Service
public class ResourceServiceImpl implements ResourceService{
	
	private Random rand = new Random();
	
	@Autowired
    ResourceRepository repository;

    public ResourceServiceImpl(ResourceRepository repository) {
        super();
        this.repository = repository;
    }

    @Override
    public List<Resource> getAllResources() {
        return repository.findAll();
    }

    @Override
    public void saveNewResource(Resource numb) {
        repository.save(numb);
    }

    @Override
    public Resource getResourceById(int id) {
    	Resource randomNumberResource;
        Optional<Resource> optional = repository.findById(id);
        
        if(optional.isPresent()) {
            randomNumberResource = optional.get();  
        }
        else {
        	randomNumberResource = new Resource(id, rand.nextInt());
        	repository.save(randomNumberResource);
        }
        return randomNumberResource;
    }
    
}

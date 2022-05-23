package com.olekkoch.restresource.controllers;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import com.olekkoch.restresource.model.Resource;
import com.olekkoch.restresource.service.ResourceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
	
	@Autowired
	private ResourceService resourceService;
	
	@GetMapping("/")
    public List<Resource> getResources() {
		return resourceService.getAllResources();
	}
	
	@GetMapping("/{id}")
	public Resource getResourceById(@PathVariable(value="id") int id) {
		Resource resource = resourceService.getResourceById(id);
		return resource;
	}
}

package com.olekkoch.restresource.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.olekkoch.restresource.service.ResourceService;

class ResourceControllerTest {
	@Autowired
	private ResourceController resourceController;
	
	@Test
	public void getResourceByIdTest() throws Exception {
		
	}

}

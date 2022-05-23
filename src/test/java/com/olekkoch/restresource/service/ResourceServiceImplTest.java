package com.olekkoch.restresource.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import com.olekkoch.restresource.controllers.ResourceController;
import com.olekkoch.restresource.model.Resource;

class ResourceServiceImplTest {

	@Autowired
	ResourceService resourceService;

	@Test
	public void getResourceByIdTest() {
		
		resourceService = Mockito.mock(ResourceService.class);
		Mockito.when(resourceService.getResourceById(1)).thenReturn(new Resource(1, 123));
		ResourceController controller = new ResourceController();
		Resource resource = controller.getResourceById(1);
		assertEquals(123, resource.getRandom());		
	}
}

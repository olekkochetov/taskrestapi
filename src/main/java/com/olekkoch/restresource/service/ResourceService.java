package com.olekkoch.restresource.service;
import com.olekkoch.restresource.model.Resource;
import java.util.List;

public interface ResourceService {
    List<Resource> getAllResources();
    void saveNewResource(Resource number);    
    Resource getResourceById(int id);
}

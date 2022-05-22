package com.olekkoch.restresource.service;
import com.olekkoch.restresource.model.RandomNumber;
import java.util.List;

public interface RandomNumberService {
    List<RandomNumber> getAllNumbers();
    void saveNewResource(RandomNumber number);    
    RandomNumber getNumerById(int id);
}

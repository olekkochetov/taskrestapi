package com.olekkoch.restresource.repository;
import com.olekkoch.restresource.model.RandomNumber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RandomNumberRepository extends JpaRepository<RandomNumber, Integer>{
    
}

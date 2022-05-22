package com.olekkoch.restresource.repository;
import com.olekkoch.restresource.model.RandomNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RandomNumberRepository extends JpaRepository<RandomNumber, Integer>{
    
}

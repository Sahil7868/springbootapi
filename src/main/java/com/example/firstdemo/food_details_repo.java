package com.example.firstdemo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface food_details_repo extends JpaRepository<food_details, Integer> {

}


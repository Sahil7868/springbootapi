package com.example.firstdemo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface category_repository extends JpaRepository<category_details, Integer> {
}

package com.example.firstdemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface exercise_repository extends JpaRepository<exercise, Integer> {
}

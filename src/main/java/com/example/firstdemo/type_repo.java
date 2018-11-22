package com.example.firstdemo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface type_repo extends JpaRepository<type, Integer> {
}



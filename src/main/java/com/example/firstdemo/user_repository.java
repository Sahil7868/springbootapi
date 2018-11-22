package com.example.firstdemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface user_repository extends JpaRepository<user_details, String>  {

    user_details findByEmailAndPassword(String email, String password);

    user_details findByEmail(String email);
}

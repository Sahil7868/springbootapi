package com.example.firstdemo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface workout_repo extends JpaRepository<workout, Integer> {
    @Query("SELECT SUM(calories) FROM workout WHERE email = ?1 AND datee = ?2")
    Double findByEmail(String email, Date datee);
}



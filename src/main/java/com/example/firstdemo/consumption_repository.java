package com.example.firstdemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface consumption_repository extends JpaRepository<consumption_details, Integer> {

    List<consumption_details> findByEmailAndDatee(String email, Date datee);
    @Query("SELECT SUM(calories) FROM consumption_details WHERE email = ?1 AND datee = ?2")
    Double findByEmail(String email,Date datee);

    @Query("SELECT SUM(calories) FROM consumption_details WHERE email = ?1 AND datee = ?2 AND cid=?3")
    Double findByEmailCid(String email,Date datee,Integer cid);
}



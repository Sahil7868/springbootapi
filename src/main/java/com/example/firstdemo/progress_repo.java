package com.example.firstdemo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface progress_repo extends JpaRepository<progress_details, Integer> {

   List<progress_details> findByTidAndEmail(Integer tid, String email);
}




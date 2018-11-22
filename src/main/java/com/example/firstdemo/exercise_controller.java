package com.example.firstdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class exercise_controller {

    @Autowired
    private exercise_repository exercise_repository;

    @GetMapping("/exercise")
    public List<exercise> retriveAllexercise() {

        return exercise_repository.findAll();
    }

    @GetMapping("/exercise/{id}")
    public exercise retriveAllexercise(@PathVariable("id") Integer id) {

        exercise obj=exercise_repository.findById(id).get();
        return obj;
    }

    @PostMapping("/addexercise")
    public exercise addExercise(@RequestBody exercise exercise){
        return  exercise_repository.save(exercise);
    }

    @DeleteMapping("/deleteexercise/{id}")
    public void deleteExercise(@PathVariable("id") Integer id){
        exercise_repository.deleteById(id);
    }

    @PutMapping("/updateexercise/{id}")
    public exercise putExercise(@RequestBody exercise exercise,@PathVariable("id") Integer id){
        return  exercise_repository.save(exercise);
    }





}




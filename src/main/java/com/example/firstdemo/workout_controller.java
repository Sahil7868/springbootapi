package com.example.firstdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class workout_controller {

    @Autowired
    private workout_repo workout_repo;

    @GetMapping("/workout")
    public List<workout> retriveAllworkout() {

        return workout_repo.findAll();
    }

    @GetMapping("/workout/{id}")
    public workout retriveAllworkout (@PathVariable("id") Integer id) {

        workout obj=workout_repo.findById(id).get();
        return obj;
    }

    @PostMapping("/totalWorkout")
    public Double retriveTotalWorkout(@RequestParam("email") String email, @RequestParam("datee") Date datee) {

        Double obj = workout_repo.findByEmail(email,datee);
        return obj;
    }

    @PostMapping("/addworkout")
    public workout addWorkout(@RequestBody workout workout){
        return  workout_repo.save(workout);
    }

    @DeleteMapping("/deleteworkout/{id}")
    public void deleteWorkout(@PathVariable("id") Integer id){
        workout_repo.deleteById(id);
    }

    @PutMapping("/updateworkout/{id}")
    public workout putWorkout(@RequestBody workout workout,@PathVariable("id") Integer id){
        return  workout_repo.save(workout);
    }





}


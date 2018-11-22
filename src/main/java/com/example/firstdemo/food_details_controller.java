package com.example.firstdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class food_details_controller {

    @Autowired
    private food_details_repo food_details_repo;

    @GetMapping("/food")
    public List<food_details> retriveAllFood() {

        return food_details_repo.findAll();
    }

    @GetMapping("/food/{id}")
    public food_details retriveAllFood(@PathVariable("id") Integer id) {

        food_details obj=food_details_repo.findById(id).get();
        return obj;
    }

    @PostMapping("/addfood")
    public food_details addFood(@RequestBody food_details food_details){
        return  food_details_repo.save(food_details);
    }

    @DeleteMapping("/deletefood/{id}")
    public void deleteFood(@PathVariable("id") Integer id){
        food_details_repo.deleteById(id);
    }

    @PutMapping("/updatefood/{id}")
    public food_details putFood(@RequestBody food_details food_details,@PathVariable("id") Integer id){
        return  food_details_repo.save(food_details);
    }





}




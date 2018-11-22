package com.example.firstdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class category_controller {

    @Autowired
    private category_repository category_repository;

    @GetMapping("/category")
    public List<category_details> retriveAllCategory() {

        return category_repository.findAll();
    }

    @GetMapping("/category/{id}")
    public category_details retriveAllCategory(@PathVariable("id") Integer id) {

        category_details obj=category_repository.findById(id).get();
        return obj;
    }

    @PostMapping("/addcategory")
    public category_details addCategory(@RequestBody category_details category_details){
        return  category_repository.save(category_details);
    }

    @DeleteMapping("/deletecategory/{id}")
    public void deleteCategory(@PathVariable("id") Integer id){
        category_repository.deleteById(id);
    }

    @PutMapping("/updatecategory/{id}")
    public category_details putCategory(@RequestBody category_details category_details,@PathVariable("id") Integer id){
        return  category_repository.save(category_details);
    }





}

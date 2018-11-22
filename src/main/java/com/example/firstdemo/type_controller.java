package com.example.firstdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class type_controller {

    @Autowired
    private type_repo type_repo;

    @GetMapping("/alltype")
    public List<type> retriveAllType() {

        return type_repo.findAll();
    }

    @GetMapping("/alltype/{id}")
    public type retriveAllType(@PathVariable("id") Integer id) {

        type obj=type_repo.findById(id).get();
        return obj;
    }

    @PostMapping("/addtype")
    public type addType(@RequestBody type type){
        return  type_repo.save(type);
    }

    @DeleteMapping("/deletetype/{id}")
    public void deleteType(@PathVariable("id") Integer id){
        type_repo.deleteById(id);
    }

    @PutMapping("/updatetype/{id}")
    public type putType(@RequestBody type type,@PathVariable("id") Integer id){
        return  type_repo.save(type);
    }





}




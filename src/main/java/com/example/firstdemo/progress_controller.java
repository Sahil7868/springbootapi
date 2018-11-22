package com.example.firstdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class progress_controller {

    @Autowired
    private progress_repo progress_repo;

    @GetMapping("/progress")
    public List<progress_details> retriveAllProgress() {

        return progress_repo.findAll();
    }

    @GetMapping("/progress/{id}")
    public progress_details retriveAllProgress(@PathVariable("id") Integer id) {

        progress_details obj=progress_repo.findById(id).get();
        return obj;
    }


    @PostMapping("/measurement")
    public List<progress_details> retriveAllMeasurement(@RequestParam("tid") Integer tid, @RequestParam("email") String email) {

        List<progress_details> obj = progress_repo.findByTidAndEmail(tid,email);
        return obj;
    }

    @PostMapping("/addprogress")
    public progress_details addProgress(@RequestBody progress_details progress_details){
        return  progress_repo.save(progress_details);
    }

    @DeleteMapping("/deleteprogress/{id}")
    public void deleteProgress(@PathVariable("id") Integer id){
        progress_repo.deleteById(id);
    }

    @PutMapping("/updateprogress/{id}")
    public progress_details putProgress(@RequestBody progress_details progress_details,@PathVariable("id") Integer id){
        return  progress_repo.save(progress_details);
    }





}


package com.example.firstdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;


@RestController
public class consumption_controller {

    @Autowired
    private consumption_repository consumption_repository;

    @GetMapping("/consumption")
    public List<consumption_details> retriveAllConsumption() {

        return consumption_repository.findAll();
    }

    @GetMapping("/consumption/{id}")
    public consumption_details retriveAllConsumption(@PathVariable("id") Integer id) {

        consumption_details obj=consumption_repository.findById(id).get();
        return obj;
    }


    @PostMapping("/calandcid")
    public List<consumption_details> retriveAllCalandcid(@RequestParam("email") String email, @RequestParam("datee") Date datee) {

        List<consumption_details> obj = consumption_repository.findByEmailAndDatee(email,datee);
        return obj;
    }

    @PostMapping("/total")
    public Double retriveTotal(@RequestParam("email") String email, @RequestParam("datee") Date datee) {

        Double obj = consumption_repository.findByEmail(email,datee);
        return obj;
    }

    @PostMapping("/totalCat")
    public Double retriveTotalCat(@RequestParam("email") String email, @RequestParam("datee") Date datee,@RequestParam("cid") Integer cid) {

        Double obj = consumption_repository.findByEmailCid(email,datee,cid);
        return obj;
    }

    @PostMapping("/addconsumption")
    public consumption_details addConsumption(@RequestBody consumption_details consumption_details){
        return  consumption_repository.save(consumption_details);
    }

    @DeleteMapping("/deleteconsumption/{id}")
    public void deleteConsumption(@PathVariable("id") Integer id){
        consumption_repository.deleteById(id);
    }

    @PutMapping("/updateconsumption/{id}")
    public consumption_details putConsumption(@RequestBody consumption_details consumption_details,@PathVariable("id") Integer id){
        return  consumption_repository.save(consumption_details);
    }
}
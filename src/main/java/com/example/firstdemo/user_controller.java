package com.example.firstdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class user_controller {


    @Autowired
    private user_repository user_repository;

    @GetMapping("/users")
    public List<user_details> retriveAllusers() {

        return user_repository.findAll();
    }


    @GetMapping("/users/{id}")
    public user_details retriveAllusers(@PathVariable("id") String id) {

        user_details obj=user_repository.findById(id).get();
        return obj;

    }

    @PostMapping("/login")
    public LoginResponse addLogin(@RequestParam("email") String email, @RequestParam("password") String password) {

        user_details obj = user_repository.findByEmailAndPassword(email, password);
        LoginResponse loginResponse = new LoginResponse();
        if(obj!=null){
            loginResponse.setStatus(true);
        }
        else{
            loginResponse.setStatus(false);
        }
        loginResponse.setData(obj);
        return loginResponse;
    }

    @PostMapping("/byemail")
    public user_details addLogin(@RequestParam("email") String email) {

        user_details obj = user_repository.findByEmail(email);
        return obj;
    }


    @PostMapping("/adduser")
    public user_details adduser(@RequestBody user_details user_details){
        return  user_repository.save(user_details);
    }

    @DeleteMapping("/deleteuser/{id}")
    public void deleteuser(@PathVariable("id") String id){
        user_repository.deleteById(id);
    }

    @PutMapping("/updateuser/{id}")
    public user_details putuser(@RequestBody user_details user_details,@PathVariable("id") String id){
        return  user_repository.save(user_details);
    }





}

package com.peerlearning.Controller;

import com.peerlearning.Model.user;
import com.peerlearning.Service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class userController {

    @Autowired
    private userService service;

    @GetMapping
    public List<user> getAllUser(){
        return service.getAllUser();
    }

    @PostMapping
    public ResponseEntity<user> creatUser(@RequestBody user user){
        user creatUser = service.creatUser(user);
        return ResponseEntity.ok().body(creatUser);
    }
}

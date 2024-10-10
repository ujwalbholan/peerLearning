package com.peerlearning.Service;

import com.peerlearning.Model.user;
import com.peerlearning.Repo.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class userService {

    @Autowired
    private userRepo repo;

    public List<user> getAllUser() {
        return repo.findAll();
    }

    public user creatUser(user data) {
        data.setCreatedAt(LocalDateTime.now());
        data.setUpdatedAt(LocalDateTime.now());
        return repo.save(data);
    }
}

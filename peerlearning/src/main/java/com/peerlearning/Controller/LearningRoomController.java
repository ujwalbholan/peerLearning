package com.peerlearning.Controller;

import com.peerlearning.Model.LearningRoom;
import com.peerlearning.Service.LearningRoomService;
import org.aspectj.apache.bcel.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/learning")
public class LearningRoomController {

    @Autowired
    private LearningRoomService learningRoomService;

    @GetMapping
    public List<LearningRoom> getAllLearningRooms() {
        return learningRoomService.getAllLearningRoom();
    }

    @PostMapping
    public LearningRoom creatLearingRoom(@RequestBody LearningRoom room) {
       LearningRoom creatRoom = learningRoomService.creatLearningRoom(room);
       return ResponseEntity.ok(creatRoom).getBody();
    }
}

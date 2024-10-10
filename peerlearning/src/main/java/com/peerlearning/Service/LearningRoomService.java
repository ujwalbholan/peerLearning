package com.peerlearning.Service;

import com.peerlearning.Model.LearningRoom;
import com.peerlearning.Repo.LearningRoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class LearningRoomService {

    @Autowired
    private LearningRoomRepo learningRoomRepo;

    public  List<LearningRoom> getAllLearningRoom() {
        return learningRoomRepo.findAll();
    }

    public LearningRoom creatLearningRoom(LearningRoom room) {
        room.setCreatedAt(LocalDateTime.now());
        room.setUpdatedAt(LocalDateTime.now());
        return learningRoomRepo.save(room);
    }

}

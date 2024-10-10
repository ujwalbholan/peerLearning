package com.peerlearning.Service;

import com.peerlearning.Model.Message;
import com.peerlearning.Repo.messageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class messageService {

    @Autowired
    private messageRepo messageRepo;

    public List<Message> getAllMessageByRoomId(int roomId) {
        return messageRepo.findAll().stream()
                .filter(message -> message.getRoomId().equals(roomId))
                .toList();
    }

    public Message creatMessage(Message message) {
        message.setSentAt(LocalDateTime.now());
        message.setMessage(message.getMessage());
        return messageRepo.save(message);
    }

    public List<Message> getAllMessage() {
        return messageRepo.findAll();
    }
}

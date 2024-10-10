package com.peerlearning.Controller;

import com.peerlearning.Model.Message;
import com.peerlearning.Service.messageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class messageController {

    @Autowired
    private messageService service;

    @GetMapping
    public List<Message> getMessages() {
        return service.getAllMessage();
    }
    @GetMapping("/room/{roomId}")
    public List<Message> getMessageByRoomId(@PathVariable("roomId") int roomId) {
       return service.getAllMessageByRoomId(roomId);
    }

    @PostMapping
    public ResponseEntity<Message> creatMessage(@RequestBody Message message) {
        Message creatMessage = service.creatMessage(message);
        return  ResponseEntity.ok(creatMessage);
    }

}

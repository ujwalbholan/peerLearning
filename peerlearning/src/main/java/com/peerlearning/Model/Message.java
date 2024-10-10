package com.peerlearning.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name="messages")
public class Message {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;
    private String userId;
    private String roomId;
    private String message;
    private LocalDateTime sentAt;

}

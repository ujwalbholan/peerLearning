package com.peerlearning.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name="learning_rooms")
public class LearningRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private  String topic;
    private  String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

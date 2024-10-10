package com.peerlearning.Repo;

import com.peerlearning.Model.LearningRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LearningRoomRepo extends JpaRepository<LearningRoom, Long> {
}

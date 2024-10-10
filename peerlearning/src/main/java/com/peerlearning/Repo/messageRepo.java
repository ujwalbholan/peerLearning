package com.peerlearning.Repo;

import com.peerlearning.Model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  messageRepo extends JpaRepository<Message,Integer> {
}

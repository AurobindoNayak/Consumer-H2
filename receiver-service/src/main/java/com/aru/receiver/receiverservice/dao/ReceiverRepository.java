package com.aru.receiver.receiverservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aru.receiver.receiverservice.entity.User;

@Repository
public interface ReceiverRepository extends JpaRepository<User, Integer> {
	
	public User findById(int userId);

}

package com.aru.receiver.receiverservice.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.aru.receiver.receiverservice.entity.User;

@RestController
public class ReceiverController {

	@GetMapping("/id/{id}")
	public String getDetails(@PathVariable int id) {
		Map<String, Integer> uriVariables = new HashMap<>();
		uriVariables.put("id", id);

		ResponseEntity<User> rs = new RestTemplate().getForEntity("http://localhost:8086/user/{id}", User.class,
				uriVariables);
		
		User user = rs.getBody();
		return user.getDetails();

	}

}

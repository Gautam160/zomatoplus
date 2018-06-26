package com.thinkxfactor.zomatoplus.controller;

import com.thinkxfactor.zomatoplus.models.User;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/all")
public class UserController {

	

	/*@GetMapping("/create")
	
		public User create(@RequestParam(value="username")String username,
				@RequestParam(value="password") String password) {
			User user1=new User(username,password);
			
			return user1;
		}*/
	@PostMapping("/create")
	public User create(@RequestBody User user)
	{
		System.out.println(user.toString());
		return user;
	}
	}

	


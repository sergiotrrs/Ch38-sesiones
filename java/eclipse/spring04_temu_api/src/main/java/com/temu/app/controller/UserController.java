package com.temu.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.temu.app.entity.User;
import com.temu.app.service.UserService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/users")
public class UserController {
	
	UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping
	List<User> getAllActiveUsers(){
		return userService.getAllActiveUsers();
	}
	
	

}

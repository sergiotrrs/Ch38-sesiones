package com.temu.app.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.temu.app.entity.User;
import com.temu.app.repository.UserRepository;
import com.temu.app.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	
	UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	
	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllActiveUsers() {		
		return (List<User>) userRepository.findAllByActiveTrue();
	}

	@Override
	public List<User> getAllInactiveUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(User user, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		
	}

}

package com.temu.app.service.impl;

import java.util.List;
import java.util.Optional;

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
		Optional<User> userOptional = userRepository.findById(id);
		User existingUser;
		
		if( userOptional.isPresent() ) {
			existingUser = userOptional.get();
			return existingUser;
		} else {
			throw new IllegalStateException("User does not exist with id " + id);
		}			
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
		return (List<User>) userRepository.findAllByActiveFalse();
	}
	
	@Override
	public List<User> getAllUsers(boolean isActive) {
		if( isActive ) return getAllActiveUsers();
		else return getAllInactiveUsers();		
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

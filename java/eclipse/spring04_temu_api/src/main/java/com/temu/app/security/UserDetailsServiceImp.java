package com.temu.app.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.temu.app.entity.User;
import com.temu.app.service.UserService;

// STEP 4 Leer el usuario de la DB
@Service
public class UserDetailsServiceImp implements UserDetailsService {

	private UserService userService;
	
	public UserDetailsServiceImp( UserService userService ) {
		this.userService = userService;
	}
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		User existingUser = userService.getUserByEmail(email);
				
		return new UserDetailsImp( existingUser );
	}

}

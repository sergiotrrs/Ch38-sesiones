package com.temu.app.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.temu.app.entity.User;

public interface UserRepository extends CrudRepository< User , Long > {
	
	Optional<User> findByEmail(String email);
	Iterable<User> findAllByActiveTrue();
	Iterable<User> findAllByActiveFalse();
	boolean existsByEmail(String email);

}

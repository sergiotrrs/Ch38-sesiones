package com.temu.app.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.temu.app.entity.User;

public interface UserRepository extends CrudRepository< User , Long > {
	
	/**
	 * La clase Optionalse introdujo en Java 8 para representar
	 * un valor que puede ser presente o ausente(null).
	 * Evita el manejo de valores nulos directamente.
	 * 
	 */
	Optional<User> findByEmail(String email); // SELECT * FROM users WHERE email = ?1
	Iterable<User> findAllByActiveTrue(); // SELECT * FROM users WHERE active = 1;
	Iterable<User> findAllByActiveFalse(); // SELECT * FROM users WHERE active = 0;
	// Iterable<User> findAllByActive(boolean state); // SELECT * FROM users WHERE active = ?1;
	boolean existsByEmail(String email);

}

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
	
	/**
	 *  Request Param
	 *  Vincula los parámetros de una solicitud HTTP con los
	 *  parámetros del método.
	 *  Permite extraer los valores de los parámetros de 
	 *  la consulta (query parameters).
	 *  Si no se proporciona los valores, se genera la excepción
	 *  MissingServletRequestParametersException
	 *  
	 *  En el sig. ejemplo manejaremos la url como:
	 *  
	 *  localhost:8080/api/v1/users?active=true  Todos los usuarios activos
	 *  localhost:8080/api/v1/users
	 *  
	 *  localhost:8080/api/v1/users?active=false  Todos los usuarios inactivo
	 */
	@GetMapping 
	List<User> getAllUsers(
			@RequestParam(	name="active", 
							required=false, 
							defaultValue="true") boolean active 
			){
		return userService.getAllUsers( active );
	}
	
	

}

package org.generation.app.controller;

import org.generation.app.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

/**
 *  Una API REST, o Interfaz de Programación de Aplicaciones Representacional 
 *  por sus siglas en inglés (Representational State Transfer), 
 *  es un conjunto de reglas y convenciones para construir 
 *  servicios web que permiten la comunicación entre sistemas 
 *  de software a través del protocolo HTTP de manera simple y eficiente.
 *  
 *  Beneficios: Permite que sistemas desarrollados en diferentes 
 *  lenguajes de programación y ejecutados en diferentes 
 *  plataformas puedan comunicarse entre sí.
 *  
 *  @RequestMapping mapea una solicitud HTTP en la URL indicada.
 *  Se puede aplicar a nivel de clase o método.
 *  A nivel de clase define el prefijo común de la URL para todas
 *  las rutas de los métodos.
 *  
 */

@RestController //@Controller y @ResponseBody
@RequestMapping("api/v1") // localhost:8080/api/v1 
public class UserController {
	
	@Qualifier("generic")
	@Autowired
	User user;
	
	// Mapea solicitudes HTTP GET, en la subruta indicada
	@GetMapping("greeting") // localhost:8080/greeting
	public String greeting() {
		return user.greeting();
	}
	

	

}

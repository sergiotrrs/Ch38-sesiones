package org.generation.app.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 *  @RestController indica que la clase será un controlador API REST
 *  Esta anotación combina @Controller y @ResponseBody.
 *  
 *  @Controller indica que la clase será un controlador MVC
 *  (Model-View-Controller). Esta clase se encarga de manejar
 *  las solicitudes HTTP y devuelve una respuesta(Vista).
 *  
 *  @ResponseBody indica que los métodos devuelven la respuesta
 *  en el cuerpo de la solicitud HTTP. Los objetos devueltos por los métodos
 *  se serializan automáticamente en el formato deseado. Por default la respuesta
 *  es en formato JSON.
 *  
 *  @RequestMapping mapea una solicitud HTTP en la URL indicada.
 *  Se puede aplicar a nivel de clase o método.
 *  A nivel de clase define el prefijo común de la URL para todas
 *  las rutas de los métodos.
 *  
 */

@Controller
@ResponseBody
public class GreetingController {
	
	private int counter;
	
	/*
	 *  @GetMapping mapea solicitudes HTTP GET
	 *  Entre parentesis se indica la ruta donde se mapeará.
	 *  A esta ruta se le incluye el prefijo definido
	 *  con @RequestMapping en la clase.
	 */
	@GetMapping("greeting") // localhost:8080/greeting
	public String greeting() {
		return "Hello Ch38, Greeting number: " + ++counter;
	}

}

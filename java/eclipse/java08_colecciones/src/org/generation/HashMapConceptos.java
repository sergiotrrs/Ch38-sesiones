package org.generation;

import java.util.HashMap;

public class HashMapConceptos {

	public static void main(String[] args) {
		/*
		 * Una colección Map, es una ralación clave(key): valor (value)
		 * que forma una tabla de datos
		 * 
		 *  - Nos funciona mejor para encontrar elementos
		 *  
		 *  Sintaxis:
		 *  HashMap< key, value > varName = new HashMap<>();
		 */

		// Instanciar la clase HashMap
		// matricula del estudiante y su nombre
		HashMap<Integer, String> students = new HashMap<>();
		
		// Instanciar HashMap para crear un directorio telefónico
		// num tel será key, y el nombre será el value
		HashMap<String, String> directory = new HashMap<>();
		
		// Agregamos valores a la colección, put()
		directory.put("1234567890", "Andres");
		directory.put("1876543210", "Maria");
		directory.put("1029384756", "Carlos");
		directory.put("1234567890", "Juan Pérez");
		directory.put("9876543210", "María López");
		directory.put("5551234567", "Pedro Ramirez");
		directory.put("8888888888", "Juan Pérez");
		directory.put("9999999999", "Juan Pérez");
		
		// Reemplazar un elemento
		directory.put("1876543210", "María Belén");
		
		// Obtener el valor de un key, get(key)
		System.out.println("Nombre de 1234567890 " + directory.get("1234567890"));
		
		// Remover un elemento, remove(key)
		System.out.println("Elemento borrado " + directory.remove( "1029384756")); // Carlos
		
		System.out.println( directory );
		
		// Iterar la colección usando keys
		for(String tel : directory.keySet() ) {
			System.out.println(tel + " " + directory.get( tel ));
		}
		
		// Iterar la colección con sus valores
		for(String name : directory.values() ) {
			System.out.println( name );
		}
		
		// Imprimir todos los "Juan Pérez" que existan en nuestro directorio telefónico
		// Imprimir el respectivo número de cada "Juan Pérez"
		System.out.println(">>>>>>>>>>>>>>>>>>>>");
		
		for(String tel : directory.keySet() ) { //["12212142", "12313132", "88888888 ]
			
			if ( directory.get(tel).equals( "Juan Pérez" )) { // "María".equals("Juan Pérez");
				System.out.println( tel + " " + directory.get(tel)  );
			}
		}
		
		// https://docs.oracle.com/javase/tutorial/collections/interfaces/collection.html
		
		directory.keySet()
			.stream()
			.filter( tel -> directory.get(tel).equals("Juan Pérez") )
			.forEach( tel -> System.out.println( tel + " " + directory.get(tel) ) );
		
	}

}

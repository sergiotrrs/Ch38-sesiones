package org.generation;

import java.util.ArrayList;

/*
 * Array List.
 * https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
 * 
 * Una colección List es una colección ...?
 *  - Es una colección ordenada (respeta el orden en que se agregan)
 *  - Se permite elementos duplicados
 *  - Se basa en un array redimensionable que crece su tamaño,
 *   según crece la colección de elementos.
 *  - Esta colección es la mejor rendimiento tiene.
 *  
 *  Sintaxis:
 *  ArrayList<object> varName = new ArrayList<>();
 *  
 * 
 */
public class ArrayListConceptos {

	public static void main(String[] args) {
		
		int age = 17;
		Integer edad = 18;
		
		// Definir una colección de datos numéricos
		ArrayList< Integer > calificaciones;
		
		// Definir una colección para nombre de libros
		ArrayList <String> nombresDeLibros;
		nombresDeLibros = new ArrayList<>();
		
		// agregar elementos a una colección
		// Los array list son de índice cero. 
		// El primer elemento es index 0
		nombresDeLibros.add("Corazón de tinta");
		nombresDeLibros.add("Donde habitan los Angeles");
		nombresDeLibros.add("Las indignas");
		nombresDeLibros.add("Quiobole con"); 
		nombresDeLibros.add("El murmullo de las abejas");
		nombresDeLibros.add("El principito");
		nombresDeLibros.add("1984");
		nombresDeLibros.add("El profesor");
		
		System.out.println( nombresDeLibros );
		
		// Agregar un elemento duplicado
		nombresDeLibros.add("1984");
		System.out.println( nombresDeLibros );
		
		// Obtener el tamaño de una colección
		System.out.println( nombresDeLibros.size() ); // 9
		
		// Mostrar un elemento en particular
		// Indicar el n- de índice, usando el método get()
		System.out.println("Kristian recomienda: " + nombresDeLibros.get(6) );
		
		// Remover un elemento de la colección
		System.out.println("Elemento removido " + nombresDeLibros.remove(3) ); // Quiubole con
		System.out.println( nombresDeLibros );
		
		// Verificar si un elemento existe
		System.out.println("Está 'El libro Vaquero': " + nombresDeLibros.contains("El Libro Vaquero") );
		System.out.println("Está 'El principito': " + nombresDeLibros.contains("El principito") );
		
		// Iterar una colección.
		for (int i = 0; i < nombresDeLibros.size(); i++) {
			System.out.println( nombresDeLibros.get(i) );			
		}
		
		// iterando for loop enhanced
		for (String libro : nombresDeLibros) {
			System.out.println(libro);
		}
		
		// Reemplazar un elemento "Te hubieras ido antes"
		nombresDeLibros.set(2, "Te hubieras ido antes");
		System.out.println( nombresDeLibros );
		
		

	}

}

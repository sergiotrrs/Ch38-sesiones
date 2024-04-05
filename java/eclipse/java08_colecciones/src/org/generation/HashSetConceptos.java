package org.generation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetConceptos {

	public static void main(String[] args) {
		/*
		 * Una colección de tipo set es una colección NO ordenada.
		 *  - No se permiten elementos duplicados
		 *  - cualquier elemento duplicado no se insertará
		 *  
		 *  Sintaxis:
		 *    HashSet<Object> varName = new HashSet<>();
		 */
		
		// Definir una colección de paises con HashSet
		HashSet<String> paises = new HashSet<>();
		
		// Agregamos valores con add()
		paises.add( "Genovia" );
		// agregar 3 paises
		paises.add( "Wakanda" );
		paises.add( "México" );
		paises.add( "Alemania" );
		
		boolean esInsertado = paises.add("Genovia");
		System.out.println("Se insertó Genovia? " + esInsertado);
		System.out.println( paises );
		
		//  Obtener el tamaño de la colección con size()
		System.out.println( paises.size() ); // 4
		
		// Verificar si existe un elemento
		System.out.println("Existe Alemania: " + paises.contains("Alemania")); // true
		// Verificar si existe USA
		System.out.println("existe USA: " + paises.contains("USA")); // false
		
		// Remover un elemento con remove()
		System.out.println("Eliminado? " + paises.remove("México") ); // true
		System.out.println( paises ); 
		
		// Iterar la colección
		for (String pais : paises) {
			System.out.println(pais);			
		}
		
		// ====================================================
		// agreguen el nombre de los artículos que Andrés tiene
		// en su colección, en un ArrayList
		// Iterar el arreglo.
		System.out.println("=============================");
		ArrayList< String > articulosAndres;
		articulosAndres = new ArrayList<>();
		
		articulosAndres.add("balón de futbol");
		articulosAndres.add("peluche de borrego");
		articulosAndres.add("cara de papa de futbol");
		articulosAndres.add("vaso de Dolphins");
		articulosAndres.add("Gorra de Eagles");
		articulosAndres.add("Gorra de Eagles");
		articulosAndres.add("balón de futbol");
		articulosAndres.add("casco de juguete");
		articulosAndres.add("gorro de cowboys");
		articulosAndres.add("baloncitos de cowboys");
		articulosAndres.add("balón de futbol");
		
		for (String articulo : articulosAndres) {
			System.out.println( articulo );
		}
		
		
		// ====================================================
		// Depurar los elementos duplicados de la colección de Andrés
		// HashSet<String> articulosDepurados = new HashSet<>();
		// articulosDepurados.addAll(articulosAndres);
		HashSet<String> articulosDepurados = new HashSet<>( articulosAndres );
		
		System.out.println("N. de elementos únicos: " + articulosDepurados.size() ); // 8
		System.out.println( articulosDepurados );
		
		LinkedHashSet<String> articulosOrdenadosUnicos = new LinkedHashSet<>( articulosAndres );
		System.out.println( articulosOrdenadosUnicos );
		
	}

}

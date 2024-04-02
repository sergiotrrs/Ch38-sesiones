package org.generation;

import java.util.Scanner;

public class CicloWhileDoWhile {

	public static void main(String[] args) {
		/**
		 * Ciclo While
		 * Mientras la condición sea verdadera, se realiza un nuevo ciclo.
		 * 
		 * Sintaxis:
		 *     
		 *     while( condicion ) instruccion;
		 *     
		 *     while( condicion ) {
		 *        instrucciones;
		 *     }
		 * 
		 */
		
		Scanner sc = new Scanner( System.in );
		
		boolean active = true;
		
		while( active  ) {
			System.out.println("Bienvenido a mi programa");
			System.out.println("Quieres seguir activo (s/n)? ");
			char response = sc.nextLine().toLowerCase().charAt(0);
			if( response != 's' ) active = false; // break;
		}
		
		active = true;
		do {
			System.out.println("Quieres seguir en línea (s/n)? ");
			char response = sc.nextLine().toLowerCase().charAt(0);
			if( response != 's' ) active = false; // break;
		} while( active );
		

		sc.close();

	}

}

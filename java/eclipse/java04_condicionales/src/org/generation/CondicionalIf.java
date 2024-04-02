package org.generation;

import java.util.Scanner;

public class CondicionalIf {

	public static void main(String[] args) {
		/**
		 * Sintaxis de la condicional if Si la condicional es verdadera, se ejecuta la
		 * instrucción de if
		 * 
		 * if ( condicional ) sentencia;
		 * 
		 * if ( condicional ) { sentencias; }
		 * 
		 * if ( condicional ) sentencia; else sentencia_Si_condicional_es_falsa;
		 * ------------------------------------------------------ 
		 * if ( condicional )
		 *   sentencia; 
		 * else if ( nueva_condicional) 
		 *   sentencia; 
		 * else if ( n_condición ) 
		 *   sentencia; 
		 * else sentencia;
		 * 
		 */
		
		/*
		 * Verifiquen la edad de una persona. Si es mayor o igual de 18 imprimir:
		 * "Puede votar", caso contrario: "No puede votar"
		 */
		int edad = 18;

		if (edad >= 18) {
			System.out.println("la persona puede votar");
		}else {
			System.out.println("la persona es menor de edad");
		}
		
		/*
		 * Operador ternario.
		 * 
		 * Sintaxis: expresión ? respuesta_si_es_true : si_es_false
		 *
		 * Realizar el ejercicio anterior usado el operador ternario
		 */
		edad = 18;
		// System.out.println(edad >= 18 ? "La persona puede votar" : "La persona es menor de edad");
		String result = edad >= 18  ? "Mayor" : "menor";
		System.out.println(result);
		
		// --------------------------------------------------------------
		// -------------- Clase Scaner --------------------------------

		Scanner sc;
		sc = new Scanner( System.in );
		
		System.out.print("Escribe tu nombre: ");
		String myName = sc.nextLine(); // lee toda la línea hasta /n"
	
		System.out.print("Escribe tu apellido: ");
		String myLastName = sc.nextLine(); 
		
		System.out.print("Escribe tu edad: ");
		int age = 0;
		if( sc.hasNextInt()  ) {
			age = sc.nextInt(); // lee un valor numérico entero
		}
		sc.nextLine(); // consumimos el resto de caracteres (\n) del buffer			
		
		System.out.print("Escribe tu dirección: ");
		String address = sc.nextLine(); 
				
		System.out.println("Tu nombre es: " + myName + " " + myLastName);
		System.out.println("Edad " + age);
		System.out.println("En 10 años tendrás " + (age + 10));
		System.out.println("Vives en: " + address);
		
		sc.close();
		
		
	}

}

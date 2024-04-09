package org.generation.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Excepciones {


/**
 * Una excepción es una situación no esperada
 * durante la ejecución de un programa.
 * 
 * Existen dos tipos de excepciones.
 * 
 * A) Checked Exceptions: Son  excepciones que se heredan
 * de la clase Exceptions. Se tiene que declarar la excepción
 * en la firma del método o bien manejar la excepción con 
 * el bloque try-catch.
 * 
 * B) Unchecked Exceptions: Son excepciones que se heredan
 * de la clase RuntimeException. No se está obligado a procesarlas.
 * Es opcional el uso de try-catch o declar en la firma del método.
 * 
 * Las excepciones de Error, son arrojadas por la JVM, son errores
 * de los que no se pueden recuperar.
 * 
 * Manejo de excepciones con el bloque try-catch
 * 
 * Sintaxis:
 * 
 *  try{
 *  
 *  }
 *  catch(exception e  ){
 *  
 *  }
 * 
 * try: bloque que contendrá sentencias que pudieran generar una excepción.
 * catch: se ejecutará si ocurre una excepción en try
 * finally: se ejecutará después de try o catch.
 * 
 * El stacktrace de una excepción es el conjunto
 * de mensajes desde el origen de la excepción
 * hasta la última clase que recibe la excepción.
 * 
 * 
 */
	public static void main(String[] args) {
		
		System.out.println("Inicio de mi programa");
		// declarar un array de 2 dimensiones con los valores [5, 6]
		int[] numbers= {5,6};
		
		try {
			divide();
			// char lastChar = lastChar("Hoy nos vamos a las 4:15 pm");
			// System.out.println( lastChar );
			// readFile();
			numbers[5] = 20;
			readFileWithException();
			
			
		} catch(ArithmeticException e ) {
			System.out.println("Excepción de aritmética");
			e.printStackTrace();
		} catch(StringIndexOutOfBoundsException e ) {
			System.out.println("Fuera de rango en el string");
			e.printStackTrace();
			System.out.println( e.getMessage());
		} catch(FileNotFoundException e) {
			System.out.println("El archivo no se encuentra en la ruta");
			e.printStackTrace();
		} catch(Exception e) {
			System.err.println("Algo está mal");
			e.printStackTrace();
		}
		
		System.out.println("Fin de mi programa");
				
	}
	
	static void divide() {
		double divide = 5 / 2;		
		System.out.println(divide);		
	}
	
	static char lastChar( String word) {
//		return word.charAt( word.length() -1 );
		return word.charAt( 50 ); // StringIndexOutOfBoundsException
	}
	
	static void readFile() {
		File file = new File("myFile.txt");
		
		try {
			Scanner sc = new Scanner( file );
		} catch (FileNotFoundException e) {			
			System.out.println("El archivo no existe");
			e.printStackTrace();
		}
		
	}
	
	static void readFileWithException() throws FileNotFoundException {
		File file = new File("myFile.txt");
		Scanner sc = new Scanner( file );
	}
	
	
	

}

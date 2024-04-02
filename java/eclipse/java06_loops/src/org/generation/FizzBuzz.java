package org.generation;

public class FizzBuzz {

	public static void main(String[] args) {
		/*
		 * Escribir un programa que muestre en pantalla los números del 1 al 20,
		 * sustituyendo los múltiplos de 3 por la palabra “fizz”, los múltiplos de 5 por
		 * “buzz” y los múltiplos de ambos, es decir, los múltiplos de 3 y 5 (o de 15),
		 * por la palabra “fizzbuzz”.
		 * 
		 * 1 2 fizz 4 buzz fizz 7 8 fizz
		 * 
		 * 
		 * 
		 */
		String frase;
		for (int i = 1; i <= 100; i++) {
			frase = "";
			if( i % 3 == 0 ) frase = "Fizz";			
			if( i % 5 == 0 ) frase += "Buzz";
			
			if( frase.equals("") ) System.out.println(i);
			else System.out.println(frase);

		}
	}

}

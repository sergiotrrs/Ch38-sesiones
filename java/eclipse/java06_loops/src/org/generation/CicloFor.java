package org.generation;

public class CicloFor {

	public static void main(String[] args) {
		/**
		 * Sintaxis:
		 * 
		 * for( expresion_inicial ; comparacion; expresion_final) instrucción;
		 * 
		 * for( expresion_inicial ; comparacion; expresion_final){ 
		 *      instrucciones; 
		 *   }
		 * 
		 */
		
		int iteracion = 1;
		for(  ;  ;  ) {
			if( iteracion > 5 ) break;
			System.out.println("Iteración: " + iteracion++ );
		}
		
		// Uso de break
		
		ciclo:
		for (int i = 0; i < 5; i++) {
			System.out.println("Valor de i : " + i); // 0,1,2,3,4
			if( i > 3) break ciclo;
		}
		
		// Uso de continue
		// Imprimir los números impares del 1 al 20(incluyendo)
		
		for (int i = 0; i <= 20; i++) {
			if( i % 2 == 0 ) continue; // valores pares
			System.out.println("Valor impar" + i);			
		}
		
		for (int i = 0; i <= 20; i++) {
			if( i % 2 != 0 ) System.out.println("Valor impar" + i);			
		}
		
		
	}
}

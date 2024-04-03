package org.generation;

import java.util.Scanner;

public class OperacionesMathTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		OperacionesMath operacion; // Declarar la variable
		operacion = new OperacionesMath(); // Instanciar la clase (crear un objeto)

		double resultadoSuma = operacion.add(5, 5.5);
		
		System.out.println( resultadoSuma  );
		// Mostrar el resultado de la función con 6.6 y 4.2
		System.out.println( operacion.add(6.6, 4.2) );
		
		
		// Crear un método en la case OperacionesMath que realice una resta
		// Mostrar en la clase OperacionesMathTest el resultado de 22.3 - 10
		System.out.println(operacion.subtract(22.3, 10));
		
		// Generar 2 núm aleatorios del 0 al 100
		System.out.println("numero 1: " + operacion.random());
		System.out.println("numero 2: " + operacion.random());
		
	}

}

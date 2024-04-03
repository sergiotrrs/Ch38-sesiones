package org.generation;

public class ArrayConceptos {

	public static void main(String[] args) {
		/*
		 *  Las variables de tipo array se definen con corchetes []
		 *  Los corchetes pueden ir antes o después de la variable
		 *  ej. int[] myArray;
		 *      int myArray[]
		 *  
		 *  Para los array se debe asignar la cantidad de elementos
		 *  que contendrá.
		 *  Una vez definido, el arreglo no púede cambiar su tamaño
		 *      
		 *      
		 */
		
		// Definir un arreglo de 4 elementos de tipo int.		
		int[] codigoColores = new int[4]; // creando un obejto de tipo array de integers.
		                 // [ 0 , 0  , 0 , 0 ]
		
		// modificando elementos al arreglo.
		codigoColores[0] = 0x00_00_ff;  // azul
		// agregar en el índice 1 el color amarillo en hexadecimal
		codigoColores[1] = 0xFF_FF_00;//Amarillo 
		// agregar en el índice 2 el color negro en hexadecimal
		codigoColores[2] = 0x00_00_00;//Negro
		// agregar en el índice 3 el color naranja en hexadecimal
		codigoColores[3] = 0xfc_4b_08; //naranja
		
		// Si se intenta acceder a un elemento que no exista
		// se genera una excepción.
		// Index 10 out of bounds for length 4
		// codigoColores[10] = 0xff_ff_ff; //blanco
		
		// iterando un arreglo
		// usando for loop
		for (int i = 0; i < codigoColores.length; i++) {
			// String.format(null, args)
			// System.out.println();			
			System.out.printf("Índice: %d tiene el código 0x%06X %n", i, codigoColores[i] );
		}
		
		// for loop enhanced 
		for(int color : codigoColores) {
			System.out.printf("Código 0x%06X %n", color );
		}
		
		// Iniciar un arreglo.
		// String[] frutas = new String[3];
		String[] frutas = {"Uva", "Fresa", "Manzana"};
		
		// Generar un arreglo de 2 dimensiones
		String[][] participantes = new String[3][5]; // 3 filas, 5 columnas
		
		
	}

}

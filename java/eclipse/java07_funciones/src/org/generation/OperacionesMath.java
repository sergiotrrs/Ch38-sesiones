package org.generation;


/**
 *  Las funciones(métodos) son fundamentales por:
 *  
 *  - Reutilización del código.
 *  - Organizar el código.
 *  - Facilidad de depuración.
 *  - Mejora la legibilidad.
 *  - Abstracción: encapsular la lógica de una tarea
 */
public class OperacionesMath {
	/*
	 *  https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html
	 *  Sintaxis de un método:
	 *  
	 *   <modificadores_de_acceso> <tipo_retorno> nombreMétodo( parámetros ) <lista_de_excepciones> {
	 *   
	 *      // cuerpo del método
	 *   }
	 *   
	 *   Modificadores de acceso: public, protected, default, private.
	 *   Tipo retorno: Especifica el tipo de valor que el método devolverá( return ).
	 *   		Si el método no devuelve ningún valor(String, int, etc), 
	 *   		se usa la palabra reservada "void".
	 *   Nombre del método: Se recomienda comenzar el nombre con un verbo, 
	 *   		seguido por un adjetivo, sustantivo, etc. Usar la convención camelCase.
	 *   Parámetros: Lista de parámetros separados por coma.
	 *   
	 *   La firma del método es como:
	 *   nombreMétodo( double, int, double, double  )
	 *   
	 *   
	 */
	
	/**
	 * Sumatoria de dos números de punto flotante.
	 * @param a operando 1
	 * @param b operando 2
	 * @return resultado de la sumatoria
	 */
	double add ( double a, double b) {
		double result = a + b;
		return result;
	}
	
	/**
	 *  Sobrecarga de métodos. (Method overloading)
	 *  Tener múltiples métodos con el mismo nombre, pero diferente lista de parámetros
	 *  
	 *  reglas:
	 *   - El método debe tener el mismo nombre
	 *   - Debe tener diferente orden en los tipos de parámdtros o
	 *     números de parámetros
	 *   - No se base en el tipo de retorno. Aunque pueda tener diferente
	 *     tipo de retorno, se recomienda que sean de tipo compatible.
	 *   - Puede tener diferentes modificadores de acceso
	 *  
	 *  
	 * @param a operando 1
	 * @param b operando 2
	 * @return resultado de la sumatoria
	 */
	double add(String a, String b) {
		double aDouble = Double.parseDouble(a);
		double bDouble = Double.parseDouble(b);
		double result = add( aDouble, bDouble);
		return result;
		
		//return aDouble + bDouble;
	}
	
	// Crear dos sobrecargas más para add()
	double add(String a, double b) {
		return add( Double.parseDouble(a) , b);
	}
	
	double add(double a, String b) {
		return add( a , Double.parseDouble(b) );
	}
	
	
	double subtract (double a, double b){
	    return a - b;
	}
	
	/**
	 * Genera número entero aleatorio del 0 al 100
	 * @return número entero aleatorio
	 */
	int random() {
		double randomNumber = Math.random();
		int randomInteger = (int)(randomNumber * 101);
				
		return randomInteger;		
	}
	
	
	void printFormattedAmount(double number ) {		
		// System.out.println( "$" + number );
		/*
		 *  https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
		 *  
		 *  String.format: Método estático de la clase String que
		 *  permite formatear un texto de acuerdo al patrón especificado.
		 *  
		 *  Sintaxis: String.format( pattern, args );
		 *  
		 *  pattern: Texto que contiene expecificadores de formato que definen
		 *  	como se mostrarán los argumentos proporcionados
		 *  args: argumentos que se formatearán
		 * 
		 */
		
		String text = String.format("$%,7.2f MXN. %n\tSin decimales $%04d MXN. " , number, (int)number);
		System.out.println( text );
		
		// System.out.format(text, null);
	}

}

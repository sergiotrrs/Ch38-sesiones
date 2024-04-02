package org.generation;

import java.util.Scanner;

public class CondicionalSwitch {
	
	public static void main(String[] args) {
		/**
		 * Sintaxis:
		 * 
		 *  switch( expresión ){ 
		 *    case valor1 : expresión; 
		 *                  break; 
		 *    case valor2 : expresión;
		 *                  break; 
		 *    default: expresión; 
		 *             break; 
		 *   }
		 * 
		 * La expresión a evaluar debe ser un tipo entero, string o enum. La condicional
		 * Switch usa el método equals para comparar los Strings.
		 */
		int key = 1;
		switch (key) {
		case 1:

			break;
		case 2, 3, 4, 5:

			break;
		case 6:
		case 7:

			break;
		default:

		}
		
		/**
		 * Leer usando la clase Scanner un mes (1 - 12) e indicar el mes en texto.
		 * ej:entrada-> "Escribe tu mes de nacimiento: " 12 
		 * salida-> Naciste en diciembre.
		 * 
		 */

		Scanner sc = new Scanner(System.in);

        System.out.print("Escribe tu mes de nacimiento: ");
        int mes = sc.nextInt();
        sc.nextLine();
        
        String nombreMes;
		switch (mes) {
            case 1:  nombreMes = "enero"; break;
            case 2:  nombreMes = "febrero"; break;
            case 3:  nombreMes = "marzo"; break;
            case 4:  nombreMes = "abril"; break;
            case 5:  nombreMes = "mayo"; break;
            case 6:  nombreMes = "junio"; break;
            case 7:  nombreMes = "julio"; break;
            case 8:  nombreMes = "agosto"; break;
            case 9:  nombreMes = "septiembre"; break;
            case 10: nombreMes = "octubre"; break;
            case 11: nombreMes = "noviembre"; break;
            case 12: nombreMes = "diciembre"; break;
            default: nombreMes = "mes inválido"; break;
        }

        System.out.println("Naciste en " + nombreMes);

        sc.close();

		
		
	}

}

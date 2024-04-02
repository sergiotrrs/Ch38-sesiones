package org.generation;

import java.util.Scanner;

/**
 * El sistema de fechas que utilizamos se basa en el calendario gregoriano,
 * establecido por primera vez en 1582 por el Papa Gregorio XIII. Este
 * calendario fue diseñado para corregir los errores introducidos por el
 * calendario juliano que era menos preciso
 * 
 * La Tierra tarda alrededor de 365.2425 días en completar su órbita alrededor
 * del Sol, pero nuestro calendario tiene solo 365 días. Para compensar este
 * desfase, cada cuatro años añadimos un día adicional al mes de febrero.
 * 
 * Cualquier año divisible por 4 es un año bisiesto: por ejemplo, 1988, 1992 y
 * 1996 son años bisiestos.
 * 
 * Sin embargo, hay un pequeño error de cálculo que debe tenerse en cuenta. Para
 * eliminar este error, el calendario gregoriano estipula que un año que es
 * divisible por 100 (por ejemplo, 1900) es un año bisiesto solo si también es
 * divisible por 400.
 * 
 * Por esta razón, los años siguientes no son años bisiestos:1700, 1800, 1900,
 * 2100, 2200, 2300, 2500, 2600. Esto se debe a que son divisibles por 100 pero
 * no por 400.
 * 
 * Para determinar si un año es bisiesto, siga estos pasos:
 * 
 * 1.- Si el año es divisible por 4, vaya al paso 2. De lo contrario, vaya al
 * paso 5. 2.- Si el año es divisible por 100, vaya al paso 3. De lo contrario,
 * vaya al paso 4. 3.- Si el año es divisible por 400, vaya al paso 4. De lo
 * contrario, vaya al paso 5. 4.- El año es un año bisiesto (tiene 366 días).
 * 5.- El año no es un año bisiesto (tiene 365 días).
 * 
 */
public class LeapYear {

	public static void main(String[] args) {
		// int month = 2;
		// int year = 1900;
		// int numDays = 0;
		// Indicar el num de días del mes
		// Enero, marzo, mayo, julio,
		// agosto, octubre, diciembre: 31 días
		// Abril, junio, septiembre, noviembre : 30 días

		// Febrero: 28 o 29 días.

		Scanner sc = new Scanner(System.in);
		int month = -1;
		int year = -1;

		do {
			System.out.print("Dime el numero de un mes: ");
			month = sc.nextInt();
			sc.nextLine();
			System.out.print("Dime el año de ese mes: ");
			year = sc.nextInt();
			sc.nextLine();

			switch (month) {
			// 31 days
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("El mes tiene 31 días");
				break;
			// 30 days
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("El mes tiene 30 días");
				break;
			// February
			case 2:
				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
					System.out.println("El mes tiene 29 días");
				} else {
					System.out.println("El mes tiene 28 días");
				}
				break;
			// Error
			default:
				System.out.println("Número de mes inválido");
			}
			;
		} while (month <= -1 || month > 12);

		sc.close();

	}

}

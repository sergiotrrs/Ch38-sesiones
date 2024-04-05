package com.santander;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.print.attribute.standard.PrinterLocation;

/**
 *  Clase: Una clase es una componente fundamental de la programación
 *  orientada a objeto(OOP: Object oriented Programming). 
 *  Una clase es una plantilla que define el
 *  comportamiento(métodos) y las propiedades(atributos) de los objetos
 *  que se crean(instancian) a partir de ella. Una clase puede
 *  considerarse como un plano o un molde a partir del cual se crean
 *  los objetos( instanciar la clase).
 *  
 */
public class Atm {
	
	// atributos de instancia (non-static fields)
	int serialNumber;
	String model;
	double balance;	
	
	/* atributos de clase (static fields)
	 Atributos que pertenecen a la clase. Esto significa que
	 tendrá el mismo valor para todos los objetos.
	 Estos atributos son útiles para mantener información común en todos
	 los objetos. También, para propiedades donde no se requiere crear objetos.
	*/
	static String bankName = "BBVA";
	
	// métodos constructores
	
	// métodos de instancia (non-static methods)
	double withdraw(double amout) {
		balance = balance - amout; //  balance -= amout;
		return balance;
	}
	
	double makeADeposit(double amount) {
		balance += amount; 
		return balance; 
	}
	
	void checkBalance() {
		LocalDateTime now = LocalDateTime.now(); // feha y hora del sistema
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); // formatear
		String formatDateTime = now.format(format);
		
		System.out.printf("%s - Balance for %s (Serial Number %04d): $%,.2f%n", 
				      formatDateTime,      model,        serialNumber,  balance);
	}
	
	// métodos estáticos(static methods)
	static void printBankName() {
		System.out.println("Bank Name: " +  bankName );
	}
}

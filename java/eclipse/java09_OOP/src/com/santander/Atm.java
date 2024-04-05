package com.santander;

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
	
	
	// atributos de clase (static fields)
	
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
	
	// métodos estáticos(static methods)

}

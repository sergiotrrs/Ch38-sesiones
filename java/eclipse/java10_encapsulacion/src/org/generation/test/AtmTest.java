package org.generation.test;

import com.santander.Atm;

public class AtmTest {

	public static void main(String[] args) {
		// instanciar la clase Atm y asignarlo a una variable
		Atm cajero01 = new Atm();
		// cajero01.balance = 10_000; No se puede acceder al atributo encapsulado
		cajero01.setBalance( 600_000 );
		// imprimir el Balance de cajero01
		System.out.println("Disponible cajero01: $" + cajero01.getBalance() );
		// usar el set y get de model
		cajero01.setModel("T-800");
		System.out.println("El cajero 1 con modelo" +" "+ cajero01.getModel());
		System.out.println("Num Serie cajero01: " + cajero01.getSerialNumber());
		
		Atm cajero02 = new Atm("T-1000", 500_000);
		System.out.println("Num Serie cajero02: " + cajero02.getSerialNumber());
		System.out.println(cajero02.getModel() + ": " + cajero02.getBalance());
	}

}

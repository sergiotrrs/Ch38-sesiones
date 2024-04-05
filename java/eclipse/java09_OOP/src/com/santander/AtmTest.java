package com.santander;

public class AtmTest {

	public static void main(String[] args) {
		
		// Instanciar la clase ATM y asignarlo a una variable
		Atm cajero01 = new Atm();
		cajero01.serialNumber = 1;
		cajero01.model = "T-800";
		cajero01.balance = 450_000;
		
		// Instanciar la clase ATM y asignarle atributos
		Atm cajero02 = new Atm();
		cajero02.serialNumber = 2;
		cajero02.model = "T-1000";
		cajero02.balance = 600_000;
		
		// Monto total de dinero en la sucursal, cajero01 + cajero02
		 double totalBalance = cajero01.balance + cajero02.balance;	      
	     System.out.println("Total balance in the branch: " + totalBalance);
	     System.out.printf("Total balance in the branch: $%,3.2f dollars%n", totalBalance);
		
		cajero01.withdraw( 400_000 );
		// imprimir cuanto dinero queda en cajero01
		cajero01.checkBalance();
		
		// Crear el método makeADeposit() en Class Atm,
		// y hacer un depósito de $500_000 en AtmTest en cajero01, imprimir el monto total
		cajero01.makeADeposit(500_000);
		cajero01.checkBalance();
	
		// Crear el método checkBalance() e imprimir el monto de cajero 01 y cajero 02
		// Total balance in model: MODEL , serial number: SERIALNUMBER $BALANCE dollars
		cajero01.checkBalance();
		cajero02.checkBalance();
	}

}
package org.generation;

public class DatosInmutables {
	
	
	public static void main(String[] args ) {
		
		// Dato inmutable: No se puede modificar
		int nCuentaBancaria = 999;
		nCuentaBancaria = 888;
		
		String nombre = "Uli"; // 0x2BC2
		nombre = "Joce"; // 0x0x53A1 
		nombre = new String("Uli"); // 0x555B
		
		// los objetos con el comparador ==, se compara
		// la referencia de los objetos
		
		 //  0x555B == 0x2BC2
		//if( nombre == "Uli"  ) {
		if( nombre.equals( "Uli" )  ) {	
			System.out.println("Nombre son iguales");
		} else {
			System.out.println("El nombre es diferente");
		}
		
	}

}

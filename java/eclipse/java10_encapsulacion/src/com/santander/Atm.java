package com.santander;

/**
 *  Los pilares de OOP: encapsulación, herencia, polimorfismo, abstracción.
 *  
 *  Encapsulación: Principio de consiste en ocultar los detalles de como 
 *  funciona un obejto. Un aspecto importante de la encapsulación es el
 *  concepto de acceso controlado. Se puede establecer diferentes
 *  niveles de acceso para los atributos y métodos de un objeto.
 *  
 *  La encapsulación ofrece beneficios como:
 *  - Seguridad de datos: Ocultar los detalles internos o que los datos
 *  	sean modificados de manera incorrecta o no autorizada.
 *  - Modularidad: Se facilita la creacíón de componentes independientes
 *  	que pueden ser reutilizados.
 *  - Abstracción: Permite que los usuarios de un objeto se centren en
 *  	lo que hace el objeto en lugar de cómo lo hace.
 *  
 *  Niveles de acceso para la encapsulación:
 *  1.- Public: Son accesibles desde cualquier parte del código.
 *  2.- Protected: Son accesibles desde la misma clase, paquete y clases derivadas.
 *  3.- Default: Son accesibles dentro de la misma clase y del mismo paquete.
 *  4.- Private: Son accesibles dentro de la misma clase.
 * 
 */
public class Atm {
	
	private int serialNumber;
	private double balance;
	private String model;
	
	/* Métodos constructores
	 *  Un constructor es un tipo especial de método que se llama automáticamente
	 *  cuando se crea una instancia(objeto) de una clase. Su propósito principal
	 *  es inicializar el estado de un objeto recién creado.
	 *  
	 *  Reglas:
	 *  - El nombre del constructor debe ser el mismo que el de la clase.
	 *  - Un constructor no tiene retorno.
	 *  - Un constructor puede llamar a otro constructor de la misma clase usando
	 *  	la palabra this(). Esta llamada debe ser la primera instrucción del constructor.
	 *  - Es posible tener una sobrecar de constructores.
	 *  - Constructor por default: Si no se proporciona un constructor en la clase, Java
	 *  	proporciona un constructor por defecto sin parámetros.
	 */
	public Atm(){
		
	}
	
	public Atm(String model, double balance){
		this.model = model;
		this.balance = balance;
	}
	
	
	public void setBalance(double amount) {
		balance = amount;
	}
	
	public double getBalance() {
	    return balance;
	}
	
	// realizar el set y get de model
	public void setModel(String modelNumber) {
		model = modelNumber;
	}
	
	public String getModel() {
		return model;
	}
	
	// realizar el set y get de serialNumber
	private void setSerialNumber( int serialNumber ) {
		this.serialNumber =  serialNumber;
	}
	
	public int getSerialNumber() {
		return this.serialNumber;
	}
	
	
	

}

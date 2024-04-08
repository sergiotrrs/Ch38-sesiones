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
	
	private static int counter; // llevará la contabilidad del num. de objetos
	
	// bloque de inicialización estático
	static {
		counter = 1000;
	}
	
	// bloque de inicialización no-estático
	{
		System.out.println("Estoy creando el objeto ATM " + this.serialNumber);
	}
	
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
		this.serialNumber = counter++ ;
	}
	
	public Atm(String model, double balance){
		this();
		// this.serialNumber = counter++; Se está duplicando la responsabilidad 
		this.model = model;
		this.balance = balance;
	}
	
	/* 
	 * Realizar una sobrecarga para que funcione agregando el model y balance 
	 * como string.
	 * Respetar el principio de Responsabilidad Única 
	 * 
	 * La sobrecarga de constructores en Java se refiere a la capacidad 
	 * de una clase para tener múltiples constructores con la misma firma 
	 * (nombre de método), pero con diferentes listas de parámetros. 
	 * Esto permite que los objetos de la clase sean inicializados de 
	 * diferentes maneras, proporcionando flexibilidad al programador 
	 * para crear instancias con diferentes conjuntos de datos iniciales.
	 */
	public Atm(String model, String balance) {
		this(model , Double.parseDouble(balance));
	}
	
	
	/**
	 *  factory method
	 *  https://refactoring.guru/es/design-patterns
	 *  Los patrones de diseño creacionales se utilizan para promover 
	 *  el código limpio, modular y fácil de mantener, así como para 
	 *  mejorar la flexibilidad y la reutilización del código.
	 */
	public static Atm createAirPortAtm() {
		return new Atm("T-8888", 1_000_000);
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
	
	// Crear un método que me muestre el serialNumber, model, balance
	public String showDetails() {
		return String.format("Model %s, Serial Number %s , Balance $%,3.2f",
				this.model, this.serialNumber, this.balance);
	}
	
	/** Crear el método deposit() y withdraw()
	 *  - No permitir depósitos de valores negativos.
	 *  - No permitir retiros mayores al balance
	 *  
	 *  No realizar la operación y enviar un mensaje
	 */
	public Double deposit(double amount) {
	    if (amount <= 0) {
	        System.out.println("No se pueden relizar depositos menores a 1");
	    }else {
	            this.balance += amount;
	            System.out.println("El saldo nuevo es: " + this.balance);
	        }
	    return this.balance;
	}

	public Double withdraw(double amount) {
	    if ( amount <= 0 || amount > this.balance ) {
	        System.out.println("No se pueden realizar retiros menores a 0 ni mayores que el saldo disponible");
	    } else{
	        this.balance -= amount;
	        System.out.println("El saldo nuevo es: " + this.balance);
	    }
	    return this.balance;
	}
	
	
	

}

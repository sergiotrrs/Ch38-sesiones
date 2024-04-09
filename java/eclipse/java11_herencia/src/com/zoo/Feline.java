package com.zoo;

/**
 *  La herencia en Java significa que una clase 
 *  (llamada subclase o clase derivada) puede 
 *  heredar atributos y métodos de otra clase 
 *  (llamada superclase o clase base). 
 *  
 *  La subclase hereda todos los campos y métodos 
 *  no privados de la superclase, lo que significa 
 *  que puede utilizarlos como si fueran 
 *  parte de la propia subclase.
 */
public abstract class Feline extends Animal {

	public Feline(double age) {
		// Invoca al constructor de la superclase para inicializar
		// parte de la funcionalidad que comparten ambas clases
		super("Feline", "Felidae", 0); 
	}
	
	/**
	 *  Sobreescritura de métodos (Override)
	 *  
	 *  Para que un método sea sobreescrito, este debe tener la misma
	 *  firma del método de la clase superior. La sobreescritura permite
	 *  personalizar el comportamiento heredado.
	 *  
	 *  @Override: Anotación que indica que el método está sobreescribiendo
	 *  el comportamiento de una método de la clase heredada.
	 *  Su propósito es hacer una validación en tiempo de
	 *  compilación para asegurarse que la subclase está
	 *  sobreescribiendo correctamente y coincide
	 *  con la firma del método.
	 */
	@Override
	public String makeANoise() {
		return "grrrrrr";
	}
	
}

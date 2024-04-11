package org.generation.math;

public class MathOperations {
	
	private double value;

	public MathOperations(double value) {		
		this.value = value;
	}
	
	public double addition(double addend) {
		return this.value += addend;
	}
		
}

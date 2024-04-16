package org.generation.math;

public class MathOperations {
	
	private double value;

	public MathOperations(double value) {		
		this.value = value;
	}
	
	public double addition(double addend) {
		if ( addend < 0 ) throw new IllegalStateException("Negative Number");
		return this.value += addend;
	}
		
}

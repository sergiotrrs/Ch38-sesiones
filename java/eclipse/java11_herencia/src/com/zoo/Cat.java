package com.zoo;

public class Cat extends Feline {
	
	private String name;
	
	public Cat(String name, double age) {
		super(age);
		this.name = name;		
	}

	@Override
	public String sleep() {
		return "El gato " + this.name + " duerme bien Agustin Lara"; 
	}

	@Override
	public String eat() {
		return "El gato " + this.name + " come croquetas"; 
	}
	
	@Override
	public String makeANoise() {
		return "El gato " + this.name + " hace miauu";
	}
	

	public String makeANoise(Cat streetCat) {
		if( streetCat.getAge() > this.getAge() ) {
			return "prrrrrr";
		} else {
			return "Raaaauuuullll";
		}
					
	}
	
	

}

package org.generation.app.model;

import org.springframework.stereotype.Component;

@Component
// @Entity
public class UserGeneric implements User {
	
	private String firstName;
	private String lastName;
	
	public UserGeneric() {
		
	}
	
	public UserGeneric(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String greeting() {
		return "Hola, soy un usuario general";
	}

}

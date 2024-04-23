package org.generation.app.model;

public class UserVip extends UserGeneric {
	
	public UserVip() {
		super();
	}
	public UserVip(String firstName, String lastname) {
		super(firstName, lastname);
	}
	
	@Override
	public String greeting() {
		return "Compers, soy usuario VIP";
	}

}

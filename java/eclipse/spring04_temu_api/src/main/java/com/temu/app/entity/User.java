package com.temu.app.entity;

import java.sql.Timestamp;


import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	// TODO personalizar los campos name, nullable, length
	private String firstName;
	
	private String lastName;
	
	@Column(name = "email", nullable = false, length = 100, unique = true)
	private String email;
	
	private String password;
	
	private String telephone;
	
	private Timestamp birthDate;
	
	private Boolean active; 
	
	/*
	 * Relaciones entre Entidades: JPA permite definir relaciones 
	 * entre entidades, como relaciones uno a uno, uno a muchos 
	 * y muchos a muchos. Estas relaciones se pueden configurar
	 *  usando anotaciones como @OneToOne, @OneToMany, @ManyToOne y @ManyToMany. 
	 */
	@ManyToOne
	private Role role;
	
	public User() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Timestamp getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Timestamp birthDate) {
		this.birthDate = birthDate;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=");
		builder.append(id);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", email=");
		builder.append(email);
		builder.append(", password=");
		builder.append(password);
		builder.append(", telephone=");
		builder.append(telephone);
		builder.append(", birthDate=");
		builder.append(birthDate);
		builder.append(", active=");
		builder.append(active);
		builder.append(", role=");
		builder.append(role);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}

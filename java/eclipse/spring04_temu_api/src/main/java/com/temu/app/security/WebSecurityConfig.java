package com.temu.app.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;

/**
* @EnableWebSecurity: habilita la configuración de seguridad web 
*   en una aplicación Spring Boot.
* @Configuration: contiene configuraciones para la aplicación, 
*  como definiciones de beans y configuración de componentes, 
*  y que debe ser considerada durante la inicialización del 
*  contexto de la aplicación.
*
*/
@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

	
	// STEP 1 Autenticación basada en usuarios en memoria
	@Bean
	UserDetailsService userDetailsService( PasswordEncoder passwordEncoder ) {
		UserDetails sergio = User.builder()
								.username("sergio")
								.password("$2a$10$Su5Y7B0V9ab24ZBUG6OsBOWyzXchSLp6AshwOq6mlDu8rA6zmt2oW") // 123
								.roles("ADMIN") // ROLE_ADMIN
								.build();
		UserDetails tania = User.builder()
								.username("tania")
								.password(passwordEncoder.encode("456"))
								.roles("CUSTOMER") // ROLE_CUSTOMER
								.build();
		UserDetails kristian = User.builder()
								.username("kristian")
								.password(passwordEncoder.encode("789"))// .password("{noop}789")
								.roles("WAREHOUSE") // ROLE_WAREHOUSE
								.build();
		
		return new InMemoryUserDetailsManager(sergio, tania, kristian);
	}
	
	// STEP 1.1 Crear un bean de PassworsEncoder
	/**
	 *  Crear un bean de BCryptPasswordEncoder.
	 *  BCrypPasswordEncoder es una implementación de PasswordEncoder proporcionada
	 *  por Spring Security. Se utiliza para codificar y verificar contraseñas utilizando
	 *  el algoritmo de hashing bcrypt.
	 *  El algoritmo incorpora un sal aleatoria por cada contraseña, lo que agrega un capa
	 *  adicional de seguridad.
	 */	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	public static void main(String[] args) {
		System.out.println( new BCryptPasswordEncoder().encode("123")  );
	}
	
	
	// STEP 2 Realizar configuraciones personalizadas del filter chain
	@Bean
	SecurityFilterChain filterChain( HttpSecurity http  ) throws Exception {
		
		// STEP 2.1 Deshabilitar la seguridad
		/*return http
				.authorizeHttpRequests( authorize -> authorize.anyRequest().permitAll() )
				.csrf( csrf-> csrf.disable() )
				.httpBasic( withDefaults() ) 
				.build(); */
		
		// STEP 2.2 PErsonalizar la seguridad en los endpoints
		// TODO cambiar el nombre de los endposint y roles utilizados
		return http
				.authorizeHttpRequests( authorize -> authorize
						.requestMatchers("/", "index.html", "/assets/**").permitAll()
						.requestMatchers(HttpMethod.POST, "/api/v1/users").permitAll()
						.requestMatchers(HttpMethod.GET, "/api/v1/products","/api/v1/products/**").permitAll()
						.requestMatchers("/api/v1/users", "/api/v1/roles/**").hasRole("ADMIN")
						.requestMatchers("/api/v1/users/**",
										"/api/v1/purchases/**",
										"/api/v1/order-has-products/**"
								).hasAnyRole("ADMIN","CUSTOMER")
						.anyRequest().authenticated()						
						)
				.csrf( csrf-> csrf.disable() )
				.httpBasic( withDefaults() ) 
				.build();
		
	}
	
	
	
}
package com.temu.app.security.jwt;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.SecretKey;

import org.springframework.security.core.GrantedAuthority;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

public class TokenUtils {
	

	private final static String ACCESS_TOKEN_SECRET = "2e58420b7a254484a496f8a5ac38f8f52e58420b7a254484a496f8a5ac38f8f5";
	private final static long ACCESS_TOKEN_VALID_SECONDS = 900L;
	
	// STEP 7.3 Creación del token JWT
	public static String createToken(
			String name, 
			String email, 
			Collection<? extends GrantedAuthority> authorities  ) {
		
		
		Date expirationDate = new Date( System.currentTimeMillis() + ACCESS_TOKEN_VALID_SECONDS * 1000 );
		SecretKey secretKey = Keys.hmacShaKeyFor( Decoders.BASE64.decode(ACCESS_TOKEN_SECRET ));
		
		// Datos extras en el payload
		Map<String , Object > extra = new HashMap<>();
		extra.put("name", name  );
		extra.put("authorities", authorities);
		
		// Generación del token JWT
		return Jwts
				.builder()
				.subject(email)
				.expiration(expirationDate)
				.claims(extra)
				.signWith(secretKey)
				.compact();
		
		
	}
	

}

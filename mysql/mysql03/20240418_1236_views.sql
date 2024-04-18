-- Creación de vistas

CREATE VIEW `users_age` AS	
	SELECT 	id, 
			name, 
			birth_date,
			FLOOR(DATEDIFF( CURDATE(), birth_date )/ 365) AS age
		FROM users		
		ORDER BY age ASC
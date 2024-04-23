
-- Agregar 3 roles a la tabla roles
-- admin, customer, warehouse

-- indicando el id, name y description
INSERT INTO roles(`id`, `name`, `description` ) 
	VALUES(1, "customer", "Cliente de la ecommerce");

-- indicando name, description
INSERT INTO roles( `name`, `description`) 
	    VALUES("admin", "Administrador de la ecommerce");

-- indicando name
INSERT INTO roles( name ) 
	    VALUES("warehouse");
        
INSERT INTO roles( name, description ) 
	    VALUES("user tester", "Influencer");

SELECT * FROM roles;
 -- DELETE FROM roles WHERE id = 100;
 -- DELETE FROM roles WHERE id = 101;
 -- DELETE FROM roles WHERE id = 102;
 
 -- Establecer el contador a un valor determinado
 -- ALTER TABLE roles AUTO_INCREMENT = 1;
 
 -- Elimina todos los registros y reinicia AUTO_INCREMENT;
 -- TRUNCATE TABLE roles;
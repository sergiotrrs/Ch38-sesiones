SELECT * FROM temu_penny.users;

/* mostrar solo los usuarios con id 1, 3, 4, 6 (estos usuarios tienen compras)
 SELECT:  se utiliza para recuperar datos de una o 
 varias tablas de una base de datos.
 Es una de las sentencias más fundamentales en SQL 
 y se utiliza comúnmente en consultas para filtrar y recuperar 
 datos específicos que cumplan con ciertos criterios.
 
 SELECT columns_name FROM table_name WHERE condition;
*/
SELECT id, name, email FROM users WHERE id = 1;

SELECT id, name, email FROM users WHERE id = 1 OR id = 3; 

SELECT id,name, email FROM users WHERE id=1 OR id=3 OR id=4 OR id=6;
 -- IN: Valores que están dentro de una lista
 SELECT id, name, email FROM users WHERE id IN (1,3,4,6);
 
SELECT id, name, email, birth_date 
	FROM users 
    WHERE birth_date 
    BETWEEN "1999-04-17" AND  "2006-04-17";
    
-- Contabilizar el num de registros
SELECT COUNT( * ) 
	FROM users 
    WHERE birth_date 
    BETWEEN "1999-04-17" AND  "2006-04-17";

-- Patrones de búsqueda
SELECT * FROM users;
SELECT * FROM users WHERE email = "gmail.com"; -- no funciona la búsqueda
SELECT * FROM users 
	WHERE email LIKE "gmail.com"; -- no funciona
-- Comidín _ : busqueda de cualquier caracter
-- Comodín % : busqueda de cualquier número de caracteres
SELECT * FROM users 
	WHERE email LIKE "%gmail.com"; -- todos los caracteres a la izquierda
    
SELECT * FROM users 
	WHERE email LIKE "_______@gmail.com"; -- que su user tenga 6 caracteres

-- Busqueda de los usuarios que su email contenga "ped"
SELECT * FROM users
	WHERE email LIKE "%ped%";
    
-- Buscar los usuarios que email no tenga @
SELECT * FROM users
	WHERE email NOT LIKE "%@%";
    
-- Trabajando con fechas
SELECT * FROM users;

SELECT CURDATE(); -- Fecha actual
SELECT NOW(); -- Fecha y hora;
SELECT localtimestamp(); -- Fecha y hora

-- Mostrar todos los usuarios que nacieron en abril
SELECT id, name, birth_date
	FROM users
    WHERE MONTH(birth_date) = MONTH( CURDATE() + INTERVAL 1 MONTH );
    
-- Tajeta de crédito
-- Fecha de corte, se cortan los 30 días de compra.
-- Fecha límite de pago, aprox 10 días para pagar las compras.
-- Hoy es tu fecha de corte, tienes 10 días para pagar
-- Cuál es tu día límite?

SELECT CURDATE(), CURDATE() + INTERVAL 10 DAY AS "Fecha_limite";

-- La edad de las personas de la tabla user
SELECT id, name, birth_date from users;

SELECT FLOOR(DATEDIFF( CURDATE(), "1995-05-15" ) / 365);
SELECT FLOOR(DATEDIFF( CURDATE(), "1994-12-09" )/ 365);

SELECT 	id, 
		name, 
        birth_date,
        FLOOR(DATEDIFF( CURDATE(), birth_date )/ 365) AS age
	FROM users
    WHERE FLOOR(DATEDIFF( CURDATE(), birth_date )/ 365) > 25
    ORDER BY age ASC;
    



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



/*
 MySQL y en la mayoría de los sistemas de gestión 
 de bases de datos relacionales, existen varios 
 tipos de joins que se utilizan para combinar 
 datos de múltiples tablas.

- INNER JOIN
- LEFT JOIN
- RIGHT JOIN 
- FULL JOIN (o FULL OUTER JOIN)

*/

-- Mostrar los usuarios que tenga un role asignado
SELECT *
	FROM users
    INNER JOIN roles
    ON users.role_id = roles.id;

-- Mostrar los usuarios que tengan el role 1 y 2 asignado
-- Mostrar el nombre del role
SELECT *
	FROM users
    INNER JOIN roles
    ON users.role_id = roles.id
    WHERE users.role_id IN(1,2); 

SELECT users.*, roles.name
	FROM users
    INNER JOIN roles
    ON users.role_id = roles.id
    WHERE users.role_id IN(1,2); 

-- Usando Alias en las tablas
SELECT u.*, r.name
	FROM users u
    INNER JOIN roles r
    ON u.role_id = r.id
    WHERE u.role_id IN(1,2); 

-- Mostrar todos los productos con el nombre de su categoría.
-- Mostrar los campos: idProducto, nombre_producto, price, nombre_categoría

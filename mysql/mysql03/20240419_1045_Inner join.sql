/*
 MySQL y en la mayoría de los sistemas de gestión 
 de bases de datos relacionales, existen varios 
 tipos de joins que se utilizan para combinar 
 datos de múltiples tablas.

- INNER JOIN: Este tipo de join devuelve solo las filas 
	que tienen una coincidencia en ambas tablas basadas 
    en una condición de unión especificada. 
- LEFT JOIN: Este join devuelve todas las filas de la tabla 
	izquierda (tabla1) y las filas coincidentes de la tabla 
	derecha (tabla2). Si no hay ninguna coincidencia en la 
    tabla derecha, se devolverán NULL para las columnas de 
    la tabla derecha.
- RIGHT JOIN:Es similar al LEFT JOIN, pero devuelve todas 
	las filas de la tabla derecha y las filas coincidentes 
    de la tabla izquierda. Si no hay ninguna coincidencia 
    en la tabla izquierda, se devolverán NULL para las 
    columnas de la tabla izquierda.

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
SELECT p.id, p.name, p.price, c.name
	FROM products p
    INNER JOIN categories c
    ON p.category_id = c.id;

-- Mostrar solo los usuarios(users) que tengan compras(purchases)
-- Mostrar los campos: id_user, user_name, role_name, 
--                     id_purchase , purchase_date
SELECT 
	users.id AS "User id", 
    users.name AS "User name", 
    roles.name AS "Role", 
    purchases.id AS "Purchase id", 
    purchases.date AS "Date"
	FROM users
    INNER JOIN roles
    ON users.role_id = roles.id
    INNER JOIN purchases
    ON users.id = user_id;


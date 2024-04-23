
-- Mostrar TODOS los roles con los usuarios

SELECT * 
	FROM roles
    LEFT JOIN users
    ON roles.id = users.role_id;
    
-- Mostrar TODOS los usuarios y las compras asociadas que tuvieran los users
SELECT * 
	FROM users
    LEFT JOIN purchases
    ON users.id = purchases.user_id;
    

-- Mostrar TODOS los usuarios y las compras asociadas que tuvieran los users
-- incluir el nombre del ROLE de cada usuario
SELECT *
	FROM users u
    LEFT JOIN purchases p
    ON u.id = p.user_id
    LEFT JOIN roles r
    ON r.id = u.role_id;


SELECT *
	FROM purchases p
    RIGHT JOIN users u
    ON u.id = p.user_id
    LEFT JOIN roles r
    ON r.id = u.role_id;




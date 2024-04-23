
-- Mostrar todas las compras incluyendo
-- Nombre del cliente, role(nombre) del cliente
-- Nombre del producto, categoria(nombre) del producto

SELECT 
		u.name, u.email,
        roles.name AS role_name,
		p.id AS purchase_id,
        p.date,
        p.address,
        products.name,
        php.quantity
	FROM purchases p
    INNER JOIN users u
    ON p.user_id = u.id
    LEFT JOIN roles
    ON u.role_id = roles.id
    INNER JOIN purchase_has_product php
    ON p.id = php.purchase_id
    INNER JOIN products
    ON php.product_id = products.id;
    
    
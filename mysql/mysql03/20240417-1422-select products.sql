SELECT * FROM temu_penny.products;

 -- seleccionar valores que estén dentro de un rango
 -- productos que su precio esté dentro del rango de 100 a 500;
 SELECT name, price FROM products WHERE price>=100 AND price<=500;
 SELECT name, price FROM products WHERE price BETWEEN 100 AND 500;
 
 -- Contabilizar los productos que su precio esté dentro del rango de 100 a 500;
 SELECT COUNT(*) AS "products"
	FROM products 
    WHERE price>=100 AND price<=500;

-- Mostrar todos los productos de category = 3;
 SELECT * 
	FROM products 
    WHERE category_id = 3;
    
-- Cuántos productos existen con category = 3 ?
SELECT COUNT(*) AS "productos de categoria 3"
	FROM products 
    WHERE category_id = 3;

-- Monto total(suma de price) de productos con category = 3
-- SUM(), AVG(), MIN(), MAX()
SELECT SUM(price) AS "total categoria 3"
	FROM products
    WHERE category_id = 3;

-- Mostrar todos los registros de productos de category = 6
SELECT * 
	FROM products
	WHERE category_id = 6;

-- El valor máximo de precio de los productos con category = 6
SELECT MAX(price) AS "max"
	FROM products 
    WHERE category_id = 6;

-- El valor mínimo de precio de los productos con category = 6
SELECT MIN(price) AS "min"
	FROM products 
    WHERE category_id = 6;
    
-- Consultas anidadas ----------------------------
-- Mostrar el registro que tenga el valor máximo
-- de los productos con category = 6
SELECT id, name, price
	FROM products
    WHERE category_id = 2 AND price = (
		SELECT MAX(price)
			FROM products 
			WHERE category_id = 2
    );


-- Mostrar el registro que tenga el valor mínimo
-- de los productos con category = 3
SELECT id, name, price, category_id 
	FROM products 
    WHERE category_id = 3 AND price= (
		SELECT MIN(price) FROM products WHERE category_id = 3
        );
        
SELECT * from products ORDER BY category_id DESC;

-- Modificar un registro UPDATE
/*UPDATE products 
	SET price = 100 -- nuevo valor
    WHERE id = 4;
*/

SELECT * FROM products;

-- Mostrar el valor de price como subtotoal y mostrar el total(price * IVA) 
-- Ordenar por precio total de forma descendente.
-- Limitar el números de elementos mostrados a 5
SELECT 	id, 
		name, 
		stock, 
        price AS subtotal, 
        price * 1.16 AS total
	FROM products
    ORDER by total DESC, id DESC -- ordenar
    LIMIT 5 OFFSET 2;  -- Limitar el número de elementos mostrados

-- Mostrar el registro que tenga el mayor price, de cualquier categoría
SELECT * FROM products 
	WHERE price = ( SELECT MAX(price) FROM products );


-- 
SELECT * FROM products ORDER BY category_id;

-- Qué categorias se están usando?
SELECT DISTINCT category_id 
	FROM products;





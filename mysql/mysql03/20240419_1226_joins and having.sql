
SELECT 
		p.id, 
		p.name, 
        p.price, 
        c.id AS category,
        c.name AS category_name
	FROM products p
    INNER JOIN categories c
    ON p.category_id = c.id;
    
-- Obtener la sumatoria por categorias de productos
-- Mostrar el nombre de la categoria
SELECT 
		p.category_id,
        c.name,
        SUM(p.price) AS total        
	FROM products p
    LEFT JOIN categories c
    ON p.category_id = c.id
    GROUP BY p.category_id;
    

-- Mostrar solo las agrupaciones donde el total sea > $500
SELECT 
		p.category_id,
        c.name,
        SUM(p.price) AS total        
	FROM products p
    LEFT JOIN categories c
    ON p.category_id = c.id 
    WHERE category_id IN (1,2,3,4)
    GROUP BY p.category_id
    HAVING total >= 500; -- Filtrar filas de grupos de resultados
-- WHERE se utiliza para filtrar filas antes de agruparse
-- HAVING filtrar a los grupos de resultados después que se hayan agrupado


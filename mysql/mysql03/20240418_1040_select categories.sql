SELECT * FROM categories;

-- Qué categorias NO se están usando en productos?
SELECT * FROM categories
 WHERE id NOT IN ( 
	SELECT DISTINCT category_id FROM products  -- 1,2,3,4,5,6
    );
    
SELECT * FROM categories;
-- Buscara valores nulos
SELECT * FROM categories WHERE description IS NULL;
-- SELECT * FROM categories WHERE ISNULL(description);
-- Buscar valores que description sea NOT NULL.
SELECT * FROM categories WHERE description IS NOT NULL;



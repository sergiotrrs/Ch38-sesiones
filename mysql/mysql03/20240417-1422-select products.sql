SELECT * FROM temu_penny.products;

 -- seleccionar valores que estén dentro de un rango
 -- productos que su precio esté dentro del rango de 100 a 500;
 SELECT name, price FROM products WHERE price>=100 AND price<=500;
 SELECT name, price FROM products WHERE price BETWEEN 100 AND 500;
 
 -- Contabilizar los productos que su precio esté dentro del rango de 100 a 500;
 SELECT COUNT(*) 
	FROM products 
    WHERE price>=100 AND price<=500;

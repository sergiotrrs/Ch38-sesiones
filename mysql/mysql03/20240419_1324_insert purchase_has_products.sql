-- INSERTS purchase_has_product

SELECT * FROM purchases;
SELECT * FROM products;
SELECT * FROM purchase_has_product;

INSERT INTO purchase_has_product(purchase_id, product_id, quantity) 
						  VALUES(     1     ,     2   ,        1); -- pantalón
INSERT INTO purchase_has_product(purchase_id, product_id, quantity) 
						  VALUES(     1     ,     4   ,        4); -- sillas

INSERT INTO purchase_has_product(purchase_id, product_id, quantity) 
						  VALUES(     2     ,     4   ,        8); -- sillas                          
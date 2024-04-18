-- Operaciones matemáticas
SELECT 6%2; -- Residuo
SELECT 3*4 AS resultado; -- multiplicación

-- Funciones matemáticas
SELECT ABS(-6); -- valor absoluto de un número
SELECT CEIL(8.1); -- redonderar en el número entero superior
SELECT FLOOR(8.9); -- redondea al número entero inferior
SELECT MOD(5,2); -- residuo de una división
SELECT PI(); -- valor de pi
SELECT POWER(3,2); -- elevadar un número a la potencia determinada
SELECT RAND(); -- número aleatorio entre 0 y 1
SELECT CEIL(RAND() * 100); 
SELECT ROUND(9.49); -- redoneda hacía arriba, si es menor a 0.5 redondea hacía abajo
SELECT TRUNCATE(5.4567, 2); -- trunca un número los decimales que indiquemos


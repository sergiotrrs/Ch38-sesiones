-- Crear usuarios

CREATE USER "kristian"@"%" IDENTIFIED BY "poioloko15";

-- todas las tablas de temu_penny
GRANT ALL PRIVILEGES ON temu_penny.* TO "kristian"@"%";

-- activar los permisos
FLUSH PRIVILEGES; 
SELECT user FROM mysql.user;
SHOW GRANTS FOR 'kristian'@'%';

-- Usuario de solo lectura
CREATE USER "andres"@"%" IDENTIFIED BY "madrugo12";
GRANT SELECT ON temu_penny.* TO "andres"@"%";
FLUSH PRIVILEGES;

SELECT user FROM mysql.user;
SHOW GRANTS FOR 'andres'@'%';




INSERT INTO roles(name, description) VALUES("customer","Cliente de la ecommerce");
INSERT INTO roles(name, description) VALUES("admin","Administrador de la ecommerce");
INSERT INTO roles(name, description) VALUES("warehouse","Almacenista de la ecommerce");

INSERT INTO users(first_name,last_name, telephone, birth_date, email, password, active, role_id ) VALUES("Winnie","Pooh","666666666","1976-04-12","winnie@disney.com","ricamiel",1, 2);

INSERT INTO roles(name, description) VALUES("customer","Cliente de la ecommerce");
INSERT INTO roles(name, description) VALUES("admin","Administrador de la ecommerce");
INSERT INTO roles(name, description) VALUES("warehouse","Almacenista de la ecommerce");

INSERT INTO users(first_name,last_name, telephone, birth_date, email, password, active, role_id ) VALUES("Winnie","Pooh","666666666","1976-04-12","winnie@disney.com","ricamiel",1, 2);
INSERT INTO users(first_name,last_name, telephone, birth_date, email, password, active, role_id ) VALUES("Bob","Esponja","1111111116","1996-05-10","bob@nickelodeon.com","cangreburguer",1, 1);
INSERT INTO users(first_name,last_name, telephone, birth_date, email, password, active, role_id ) VALUES("Arenita","Mejillas","101010108","1996-06-1","arenita@nickelodeon.com","amotexas",0, 1);
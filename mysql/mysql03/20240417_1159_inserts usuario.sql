
-- usuario cliente (customer)
INSERT INTO users (`name`,`email`,`telephone`,`address`,`birth_date`,`role_id`) VALUES ("Jose","jose123@gmail.com","123456789","Av.Jose 1234","1997-01-01",1);
INSERT INTO users (`name`,`email`,`telephone`,`address`,`birth_date`,`role_id`) VALUES ("Kristian","kris123@gmail.com","987654321","Av.Kris 4321","1998-02-02",1);
INSERT INTO users (`name`, `email`,`telephone`,`address`, `birth_date`, `role_id`) VALUES ("Victor Mellado","vic123gmail.com",123456789,"av.siempre viva", "1999-11-12",1);
INSERT INTO users (`name`, `email`,`telephone`,`address`, `birth_date`, `role_id`) VALUES ("Luis Gomez","lui123gmail.com",223456789,"narnia", "1999-06-22",1);

-- chatGPT
INSERT INTO users (name, email, telephone, address, birth_date, role_id) VALUES ('Alice Johnson', 'alice@example.com', '1112223333', '789 Customer St, CustomerCity, CustomerCountry', '1992-08-10', 1);
INSERT INTO users (name, email, telephone, address, birth_date, role_id) VALUES ('Bob Williams', 'bob@example.com', '2223334444', '1011 Client Rd, ClientCity, ClientCountry', '1987-03-25', 1);
INSERT INTO users (name, email, telephone, address, birth_date, role_id) VALUES ('Emily Brown', 'emily@example.com', '3334445555', '1213 Buyer Blvd, BuyerCity, BuyerCountry', '1995-12-15', 1);
INSERT INTO users (name, email, telephone, address, birth_date, role_id) VALUES ('Michael Davis', 'michael@example.com', '4445556666', '1415 Shopper St, ShopperCity, ShopperCountry', '1983-06-20', 1);
INSERT INTO users (name, email, telephone, address, birth_date, role_id) VALUES ('Sarah Taylor', 'sarah@example.com', '5556667777', '1617 Retailer Rd, RetailerCity, RetailerCountry', '1990-04-05', 1);
INSERT INTO users (name, email, telephone, address, birth_date, role_id) VALUES ('David Martinez', 'david@example.com', '6667778888', '1819 Buyer Blvd, BuyerCity, BuyerCountry', '1988-11-30', 1);
INSERT INTO users (name, email, telephone, address, birth_date, role_id) VALUES ('Jessica Garcia', 'jessica@example.com', '7778889999', '2021 Client Rd, ClientCity, ClientCountry', '1993-09-12', 1);
INSERT INTO users (name, email, telephone, address, birth_date, role_id) VALUES ('Christopher Rodriguez', 'chris@example.com', '8889990000', '2223 Shopper St, ShopperCity, ShopperCountry', '1985-07-18', 1);

-- usuario administradores(admin)
INSERT INTO users(`name`, `email`, `telephone`, `address`, `birth_date`, `role_id`) VALUES("Juan Perez", "juanperez@gmail.com", "5521478963", "Av.siempreviva 23", "1999-05-26", 2);
INSERT INTO users (`name`,`email`,`telephone`,`address`,`birth_date`,`role_id`) VALUES ("Karen","karen321@gmail.com","1234554321","Av.Karen 5678","1999-03-03",2);
INSERT INTO users (`name`, `email`,`telephone`,`address`, `birth_date`,`role_id`) VALUES ("Andres Pardo","and123gmail.com",323456789,"mexico", "1999-11-17",2);

-- usuarios almacen(warehouse)
INSERT INTO users (`name`,`email`,`telephone`,`address`,`birth_date`,`role_id`) VALUES ("Emma","emma456@gmail.com","5678998765","Av.Emma 9876","2000-04-04",3);
INSERT INTO users (`name`, `email`,`telephone`,`address`, `birth_date`,`role_id`) VALUES ("Pedro Ruiz","ped123gmail.com",423456789,"en su casa", "1994-11-22",3);

SELECT * FROM users;
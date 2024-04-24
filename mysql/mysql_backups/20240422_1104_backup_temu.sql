-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: temu_penny
-- ------------------------------------------------------
-- Server version	8.0.34

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `categories`
--

DROP TABLE IF EXISTS `categories`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categories` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `description` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categories`
--

LOCK TABLES `categories` WRITE;
/*!40000 ALTER TABLE `categories` DISABLE KEYS */;
INSERT INTO `categories` VALUES (1,'clothes','ropa'),(2,'beauty','belleza'),(3,'home','hogar'),(4,'travel','viajes'),(5,'electronic','electronicos'),(6,'pets','mascotas'),(7,'babies','bebés'),(8,'car','car accesories'),(9,'bakery','Desserts for humans and dogs'),(10,'verduras',NULL),(11,'office',NULL);
/*!40000 ALTER TABLE `categories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `products` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `price` decimal(9,2) NOT NULL,
  `stock` int NOT NULL,
  `category_id` bigint NOT NULL,
  PRIMARY KEY (`id`,`category_id`),
  KEY `product_has_category_idx` (`category_id`),
  CONSTRAINT `product_has_category` FOREIGN KEY (`category_id`) REFERENCES `categories` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (1,'blusa',500.00,2,1),(2,'pantalon',800.00,10,1),(3,'delineador',80.00,50,2),(4,'silla',100.00,10,3),(5,'vela',200.00,15,3),(6,'mochila',700.00,100,4),(7,'audifonos',1500.00,10,5),(8,'laptop',20000.00,15,5),(9,'camaperro',600.00,5,6),(10,'juguete',100.00,10,6);
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `purchase_has_product`
--

DROP TABLE IF EXISTS `purchase_has_product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `purchase_has_product` (
  `purchase_id` bigint NOT NULL,
  `product_id` bigint NOT NULL,
  `quantity` int NOT NULL,
  PRIMARY KEY (`purchase_id`,`product_id`),
  KEY `fk_compras_has_products_products1_idx` (`product_id`),
  KEY `fk_compras_has_products_compras1_idx` (`purchase_id`),
  CONSTRAINT `fk_compras_has_products_compras1` FOREIGN KEY (`purchase_id`) REFERENCES `purchases` (`id`),
  CONSTRAINT `fk_compras_has_products_products1` FOREIGN KEY (`product_id`) REFERENCES `products` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purchase_has_product`
--

LOCK TABLES `purchase_has_product` WRITE;
/*!40000 ALTER TABLE `purchase_has_product` DISABLE KEYS */;
INSERT INTO `purchase_has_product` VALUES (1,2,1),(1,4,4),(2,4,8);
/*!40000 ALTER TABLE `purchase_has_product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `purchases`
--

DROP TABLE IF EXISTS `purchases`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `purchases` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `date` timestamp NOT NULL,
  `ammount` decimal(9,2) NOT NULL,
  `address` varchar(250) NOT NULL,
  `user_id` bigint NOT NULL,
  PRIMARY KEY (`id`,`user_id`),
  KEY `fk_compras_users_idx` (`user_id`),
  CONSTRAINT `fk_compras_users` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purchases`
--

LOCK TABLES `purchases` WRITE;
/*!40000 ALTER TABLE `purchases` DISABLE KEYS */;
INSERT INTO `purchases` VALUES (1,'2024-12-01 06:00:00',0.00,'siempre viva 123',1),(2,'2024-12-01 06:00:00',0.00,'siempre viva 123',1),(3,'2024-11-21 06:00:00',0.00,'tequis 50',3),(4,'2021-06-12 06:00:00',0.00,'nacozari 105',4),(5,'2020-10-01 06:00:00',0.00,'valledorado 123',6);
/*!40000 ALTER TABLE `purchases` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `roles` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` VALUES (1,'customer','Cliente de la ecommerce'),(2,'admin','Administrador de la ecommerce'),(3,'warehouse',NULL),(4,'user tester','Influencer');
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(85) NOT NULL,
  `email` varchar(45) NOT NULL,
  `telephone` varchar(25) NOT NULL,
  `address` varchar(100) NOT NULL,
  `birth_date` date DEFAULT NULL,
  `role_id` bigint NOT NULL,
  PRIMARY KEY (`id`,`role_id`),
  UNIQUE KEY `email_UNIQUE` (`email`),
  KEY `user_has_role_idx` (`role_id`),
  CONSTRAINT `user_has_role` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Juan Perez','juanperez@gmail.com','5521478963','Av.siempreviva 23','1999-05-26',2),(2,'Jose','jose123@gmail.com','123456789','Av.Jose 1234','1997-01-01',1),(3,'Kristian','kris123@gmail.com','987654321','Av.Kris 4321','1998-02-02',1),(4,'Karen','karen321@gmail.com','1234554321','Av.Karen 5678','1999-03-03',2),(5,'Emma','emma456@gmail.com','5678998765','Av.Emma 9876','2000-04-04',3),(6,'Victor Mellado','vic123gmail.com','123456789','av.siempre viva','1999-11-12',1),(7,'Luis Gomez','lui123gmail.com','223456789','narnia','1999-06-22',1),(8,'Andres Pardo','and123gmail.com','323456789','mexico','1999-11-17',2),(9,'Pedro Ruiz','ped123gmail.com','423456789','en su casa','1994-11-22',3),(11,'Alice Johnson','alice@example.com','1112223333','789 Customer St, CustomerCity, CustomerCountry','1992-08-10',1),(12,'Bob Williams','bob@example.com','2223334444','1011 Client Rd, ClientCity, ClientCountry','1987-03-25',1),(13,'Emily Brown','emily@example.com','3334445555','1213 Buyer Blvd, BuyerCity, BuyerCountry','1995-12-15',1),(14,'Michael Davis','michael@example.com','4445556666','1415 Shopper St, ShopperCity, ShopperCountry','1983-06-20',1),(15,'Sarah Taylor','sarah@example.com','5556667777','1617 Retailer Rd, RetailerCity, RetailerCountry','1990-04-05',1),(16,'David Martinez','david@example.com','6667778888','1819 Buyer Blvd, BuyerCity, BuyerCountry','1988-11-30',1),(17,'Jessica Garcia','jessica@example.com','7778889999','2021 Client Rd, ClientCity, ClientCountry','1993-09-12',1),(18,'Christopher Rodriguez','chris@example.com','8889990000','2223 Shopper St, ShopperCity, ShopperCountry','1985-07-18',1);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `users_age`
--

DROP TABLE IF EXISTS `users_age`;
/*!50001 DROP VIEW IF EXISTS `users_age`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `users_age` AS SELECT 
 1 AS `id`,
 1 AS `name`,
 1 AS `birth_date`,
 1 AS `age`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `users_age`
--

/*!50001 DROP VIEW IF EXISTS `users_age`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `users_age` AS select `users`.`id` AS `id`,`users`.`name` AS `name`,`users`.`birth_date` AS `birth_date`,floor(((to_days(curdate()) - to_days(`users`.`birth_date`)) / 365)) AS `age` from `users` order by floor(((to_days(curdate()) - to_days(`users`.`birth_date`)) / 365)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-22 11:04:56
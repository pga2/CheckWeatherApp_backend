-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: weather_database
-- ------------------------------------------------------
-- Server version	8.0.27

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
-- Table structure for table `weather_data`
--

DROP TABLE IF EXISTS `weather_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `weather_data` (
  `id` int NOT NULL AUTO_INCREMENT,
  `lon` double NOT NULL,
  `lat` double NOT NULL,
  `date` date NOT NULL,
  `sunrise` int DEFAULT NULL,
  `sunset` int DEFAULT NULL,
  `temp` double NOT NULL,
  `humidity` int DEFAULT NULL,
  `pressure` int DEFAULT NULL,
  `main` varchar(100) NOT NULL,
  `description` varchar(1000) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `weather_data`
--

LOCK TABLES `weather_data` WRITE;
/*!40000 ALTER TABLE `weather_data` DISABLE KEYS */;
INSERT INTO `weather_data` VALUES (10,12.5,12.3,'2023-06-27',200,400,20.5,44,555,'clouds','a lot of clouds'),(12,12.5,12.3,'2023-06-20',200,400,20.5,44,555,'clouds','a lot of clouds'),(13,12.5,12.3,'2023-06-21',200,400,20.5,44,555,'clouds','a lot of clouds'),(14,12.5,12.3,'2023-06-22',200,400,20.5,44,555,'clouds','a lot of clouds'),(15,12.5,12.3,'2023-06-23',200,400,25.6,44,555,'clouds','a lot of clouds'),(16,12.5,12.3,'2023-06-24',200,400,20.2,44,555,'clouds','a lot of clouds'),(17,12.5,12.3,'2023-06-25',200,400,23,44,555,'clouds','a lot of clouds'),(18,12.5,12.3,'2023-06-26',200,400,18,44,555,'clouds','a lot of clouds'),(20,21.0122,52.2297,'2024-01-13',200,400,20.5,44,555,'clouds','a lot of clouds'),(21,21.0122,52.2297,'2024-01-14',200,400,20.5,44,555,'clouds','a lot of clouds'),(22,21.0122,52.2297,'2024-01-15',200,400,20.5,44,555,'clouds','a lot of clouds'),(23,21.0122,52.2297,'2024-01-16',200,400,20.5,44,555,'clouds','a lot of clouds'),(24,21.0122,52.2297,'2024-01-17',200,400,20.5,44,555,'clouds','a lot of clouds'),(25,21.0122,52.2297,'2024-01-18',1705559752,1705589759,-1.52,90,999,'Clouds','few clouds');
/*!40000 ALTER TABLE `weather_data` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-01-18 23:32:14

-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: gestor_activos_amenazas_salvaguardas
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
-- Table structure for table `activo`
--

DROP TABLE IF EXISTS `activo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `activo` (
  `PK` int unsigned NOT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `activo`
--

LOCK TABLES `activo` WRITE;
/*!40000 ALTER TABLE `activo` DISABLE KEYS */;
/*!40000 ALTER TABLE `activo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `amenaza`
--

DROP TABLE IF EXISTS `amenaza`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `amenaza` (
  `PK` int unsigned NOT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `amenaza`
--

LOCK TABLES `amenaza` WRITE;
/*!40000 ALTER TABLE `amenaza` DISABLE KEYS */;
/*!40000 ALTER TABLE `amenaza` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `criterio_adm`
--

DROP TABLE IF EXISTS `criterio_adm`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `criterio_adm` (
  `PK` int unsigned NOT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `criterio_adm`
--

LOCK TABLES `criterio_adm` WRITE;
/*!40000 ALTER TABLE `criterio_adm` DISABLE KEYS */;
/*!40000 ALTER TABLE `criterio_adm` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `criterio_cei`
--

DROP TABLE IF EXISTS `criterio_cei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `criterio_cei` (
  `PK` int unsigned NOT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `criterio_cei`
--

LOCK TABLES `criterio_cei` WRITE;
/*!40000 ALTER TABLE `criterio_cei` DISABLE KEYS */;
/*!40000 ALTER TABLE `criterio_cei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `criterio_da`
--

DROP TABLE IF EXISTS `criterio_da`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `criterio_da` (
  `PK` int unsigned NOT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `criterio_da`
--

LOCK TABLES `criterio_da` WRITE;
/*!40000 ALTER TABLE `criterio_da` DISABLE KEYS */;
/*!40000 ALTER TABLE `criterio_da` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `criterio_ibl_national`
--

DROP TABLE IF EXISTS `criterio_ibl_national`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `criterio_ibl_national` (
  `PK` int unsigned NOT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `criterio_ibl_national`
--

LOCK TABLES `criterio_ibl_national` WRITE;
/*!40000 ALTER TABLE `criterio_ibl_national` DISABLE KEYS */;
/*!40000 ALTER TABLE `criterio_ibl_national` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `criterio_ibl_ue`
--

DROP TABLE IF EXISTS `criterio_ibl_ue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `criterio_ibl_ue` (
  `PK` int unsigned NOT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `criterio_ibl_ue`
--

LOCK TABLES `criterio_ibl_ue` WRITE;
/*!40000 ALTER TABLE `criterio_ibl_ue` DISABLE KEYS */;
/*!40000 ALTER TABLE `criterio_ibl_ue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `criterio_lg`
--

DROP TABLE IF EXISTS `criterio_lg`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `criterio_lg` (
  `PK` int unsigned NOT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `criterio_lg`
--

LOCK TABLES `criterio_lg` WRITE;
/*!40000 ALTER TABLE `criterio_lg` DISABLE KEYS */;
/*!40000 ALTER TABLE `criterio_lg` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `criterio_lpo`
--

DROP TABLE IF EXISTS `criterio_lpo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `criterio_lpo` (
  `PK` int unsigned NOT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `criterio_lpo`
--

LOCK TABLES `criterio_lpo` WRITE;
/*!40000 ALTER TABLE `criterio_lpo` DISABLE KEYS */;
/*!40000 ALTER TABLE `criterio_lpo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `criterio_olm`
--

DROP TABLE IF EXISTS `criterio_olm`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `criterio_olm` (
  `PK` int unsigned NOT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `criterio_olm`
--

LOCK TABLES `criterio_olm` WRITE;
/*!40000 ALTER TABLE `criterio_olm` DISABLE KEYS */;
/*!40000 ALTER TABLE `criterio_olm` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `criterio_pi`
--

DROP TABLE IF EXISTS `criterio_pi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `criterio_pi` (
  `PK` int unsigned NOT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `criterio_pi`
--

LOCK TABLES `criterio_pi` WRITE;
/*!40000 ALTER TABLE `criterio_pi` DISABLE KEYS */;
/*!40000 ALTER TABLE `criterio_pi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `criterio_po`
--

DROP TABLE IF EXISTS `criterio_po`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `criterio_po` (
  `PK` int unsigned NOT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `criterio_po`
--

LOCK TABLES `criterio_po` WRITE;
/*!40000 ALTER TABLE `criterio_po` DISABLE KEYS */;
/*!40000 ALTER TABLE `criterio_po` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `criterio_rto`
--

DROP TABLE IF EXISTS `criterio_rto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `criterio_rto` (
  `PK` int unsigned NOT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `criterio_rto`
--

LOCK TABLES `criterio_rto` WRITE;
/*!40000 ALTER TABLE `criterio_rto` DISABLE KEYS */;
/*!40000 ALTER TABLE `criterio_rto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `criterio_si`
--

DROP TABLE IF EXISTS `criterio_si`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `criterio_si` (
  `PK` int unsigned NOT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `criterio_si`
--

LOCK TABLES `criterio_si` WRITE;
/*!40000 ALTER TABLE `criterio_si` DISABLE KEYS */;
/*!40000 ALTER TABLE `criterio_si` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dimensiones_valoracion`
--

DROP TABLE IF EXISTS `dimensiones_valoracion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dimensiones_valoracion` (
  `PK` int unsigned NOT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dimensiones_valoracion`
--

LOCK TABLES `dimensiones_valoracion` WRITE;
/*!40000 ALTER TABLE `dimensiones_valoracion` DISABLE KEYS */;
/*!40000 ALTER TABLE `dimensiones_valoracion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `escala_valor`
--

DROP TABLE IF EXISTS `escala_valor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `escala_valor` (
  `PK` int unsigned NOT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `escala_valor`
--

LOCK TABLES `escala_valor` WRITE;
/*!40000 ALTER TABLE `escala_valor` DISABLE KEYS */;
/*!40000 ALTER TABLE `escala_valor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `puesto`
--

DROP TABLE IF EXISTS `puesto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `puesto` (
  `PK` int unsigned NOT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `puesto`
--

LOCK TABLES `puesto` WRITE;
/*!40000 ALTER TABLE `puesto` DISABLE KEYS */;
/*!40000 ALTER TABLE `puesto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rel_tipo_activo_tipo_amenaza`
--

DROP TABLE IF EXISTS `rel_tipo_activo_tipo_amenaza`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rel_tipo_activo_tipo_amenaza` (
  `PK` int unsigned NOT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rel_tipo_activo_tipo_amenaza`
--

LOCK TABLES `rel_tipo_activo_tipo_amenaza` WRITE;
/*!40000 ALTER TABLE `rel_tipo_activo_tipo_amenaza` DISABLE KEYS */;
/*!40000 ALTER TABLE `rel_tipo_activo_tipo_amenaza` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rel_tipo_amenaza_dimensiones`
--

DROP TABLE IF EXISTS `rel_tipo_amenaza_dimensiones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rel_tipo_amenaza_dimensiones` (
  `PK` int unsigned NOT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rel_tipo_amenaza_dimensiones`
--

LOCK TABLES `rel_tipo_amenaza_dimensiones` WRITE;
/*!40000 ALTER TABLE `rel_tipo_amenaza_dimensiones` DISABLE KEYS */;
/*!40000 ALTER TABLE `rel_tipo_amenaza_dimensiones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rol`
--

DROP TABLE IF EXISTS `rol`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rol` (
  `PK` int unsigned NOT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rol`
--

LOCK TABLES `rol` WRITE;
/*!40000 ALTER TABLE `rol` DISABLE KEYS */;
/*!40000 ALTER TABLE `rol` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salvaguarda`
--

DROP TABLE IF EXISTS `salvaguarda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `salvaguarda` (
  `PK` int unsigned NOT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salvaguarda`
--

LOCK TABLES `salvaguarda` WRITE;
/*!40000 ALTER TABLE `salvaguarda` DISABLE KEYS */;
/*!40000 ALTER TABLE `salvaguarda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_salvaguarda`
--

DROP TABLE IF EXISTS `tipo_salvaguarda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_salvaguarda` (
  `PK` int unsigned NOT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_salvaguarda`
--

LOCK TABLES `tipo_salvaguarda` WRITE;
/*!40000 ALTER TABLE `tipo_salvaguarda` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipo_salvaguarda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `valor_criterio`
--

DROP TABLE IF EXISTS `valor_criterio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `valor_criterio` (
  `PK` int unsigned NOT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `valor_criterio`
--

LOCK TABLES `valor_criterio` WRITE;
/*!40000 ALTER TABLE `valor_criterio` DISABLE KEYS */;
/*!40000 ALTER TABLE `valor_criterio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `valoracion`
--

DROP TABLE IF EXISTS `valoracion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `valoracion` (
  `PK` int unsigned NOT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `valoracion`
--

LOCK TABLES `valoracion` WRITE;
/*!40000 ALTER TABLE `valoracion` DISABLE KEYS */;
/*!40000 ALTER TABLE `valoracion` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-18 12:53:49

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
  `cod` varchar(10) DEFAULT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `descripcion` varchar(600) DEFAULT NULL,
  `fk_tipo` int unsigned DEFAULT NULL,
  `fk_superior` int unsigned DEFAULT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`),
  KEY `fk_tipo` (`fk_tipo`),
  KEY `fk_superior` (`fk_superior`),
  CONSTRAINT `activo_ibfk_1` FOREIGN KEY (`fk_tipo`) REFERENCES `tipo_activo` (`PK`),
  CONSTRAINT `activo_ibfk_2` FOREIGN KEY (`fk_superior`) REFERENCES `activo` (`PK`)
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
  `cod` varchar(10) DEFAULT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `descripcion` varchar(600) DEFAULT NULL,
  `fk_tipo` int unsigned DEFAULT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`),
  KEY `fk_tipo` (`fk_tipo`),
  CONSTRAINT `amenaza_ibfk_1` FOREIGN KEY (`fk_tipo`) REFERENCES `tipo_amenaza` (`PK`)
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
  `NIVEL` int unsigned DEFAULT NULL,
  `codigo` varchar(10) DEFAULT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `criterio_adm`
--

LOCK TABLES `criterio_adm` WRITE;
/*!40000 ALTER TABLE `criterio_adm` DISABLE KEYS */;
INSERT INTO `criterio_adm` VALUES (1,9,'9.adm','probablemente impediría seriamente la operación efectiva de la Organización, pudiendo llegar a su cierre'),(2,7,'7.adm','probablemente impediría la operación efectiva de la Organización'),(3,5,'5.adm','probablemente impediría la operación efectiva de más de una parte de la Organización'),(4,3,'3.adm','probablemente impediría la operación efectiva de una parte de la Organización'),(5,1,'1.adm','pudiera impedir la operación efectiva de una parte de la Organización');
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
  `NIVEL` int unsigned DEFAULT NULL,
  `codigo` varchar(10) DEFAULT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `criterio_cei`
--

LOCK TABLES `criterio_cei` WRITE;
/*!40000 ALTER TABLE `criterio_cei` DISABLE KEYS */;
INSERT INTO `criterio_cei` VALUES (1,9,'9.cei.a','de enorme interés para la competencia'),(2,9,'9.cei.b','de muy elevado valor comercial'),(3,9,'9.cei.c','causa de pérdidas económicas excepcionalmente elevadas'),(4,9,'9.cei.d','causa de muy significativas ganancias o ventajas para individuos u organizaciones'),(5,9,'9.cei.e','constituye un incumplimiento excepcionalmente grave de las obligaciones contractuales relativas a la seguridad de la información proporcionada por terceros'),(6,7,'7.cei.a','de alto interés para la competencia'),(7,7,'7.cei.b','de elevado valor comercial'),(8,7,'7.cei.c','causa de graves pérdidas económicas'),(9,7,'7.cei.d','proporciona ganancias o ventajas desmedidas a individuos u organizaciones'),(10,7,'7.cei.e','constituye un serio incumplimiento de obligaciones contractuales relativas a la seguridad de la información proporcionada por terceros'),(11,3,'3.cei.a','de cierto interés para la competencia'),(12,3,'3.cei.b','de cierto valor comercial'),(13,3,'3.cei.c','causa de pérdidas financieras o merma de ingresos'),(14,3,'3.cei.d','facilita ventajas desproporcionadas a individuos u organizaciones'),(15,3,'3.cei.e','constituye un incumplimiento leve de obligaciones contractuales para mantener la seguridad de la información proporcionada por terceros'),(16,2,'2.cei.a','de bajo interés para la competencia'),(17,2,'2.cei.b','de bajo valor comercial'),(18,1,'1.cei.a','de pequeño interés para la competencia'),(19,1,'1.cei.b','de pequeño valor comercial'),(20,0,'0.3','supondría pérdidas económicas mínimas');
/*!40000 ALTER TABLE `criterio_cei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `criterio_crm`
--

DROP TABLE IF EXISTS `criterio_crm`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `criterio_crm` (
  `PK` int unsigned NOT NULL,
  `NIVEL` int unsigned DEFAULT NULL,
  `codigo` varchar(10) DEFAULT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `criterio_crm`
--

LOCK TABLES `criterio_crm` WRITE;
/*!40000 ALTER TABLE `criterio_crm` DISABLE KEYS */;
INSERT INTO `criterio_crm` VALUES (1,8,'8.crm','Impida la investigación de delitos graves o facilite su comisión'),(2,4,'4.crm','Dificulte la investigación o facilite la comisión de delitos');
/*!40000 ALTER TABLE `criterio_crm` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `criterio_da`
--

DROP TABLE IF EXISTS `criterio_da`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `criterio_da` (
  `PK` int unsigned NOT NULL,
  `NIVEL` int unsigned DEFAULT NULL,
  `codigo` varchar(10) DEFAULT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `criterio_da`
--

LOCK TABLES `criterio_da` WRITE;
/*!40000 ALTER TABLE `criterio_da` DISABLE KEYS */;
INSERT INTO `criterio_da` VALUES (1,9,'9.da','Probablemente cause una interrupción excepcionalmente seria de las actividades propias de la Organización con un serio impacto en otras organizaciones'),(2,9,'9.da2','Probablemente tenga un serio impacto en otras organizaciones'),(3,7,'7.da','Probablemente cause una interrupción seria de las actividades propias de la Organización con un impacto significativo en otras organizaciones'),(4,7,'7.da2','Probablemente tenga un gran impacto en otras organizaciones'),(5,5,'5.da','Probablemente cause la interrupción de actividades propias de la Organización con impacto en otras organizaciones'),(6,5,'5.da2','Probablemente cause un cierto impacto en otras organizaciones'),(7,3,'3.da','Probablemente cause la interrupción de actividades propias de la Organización'),(8,1,'1.da','Pudiera causar la interrupción de actividades propias de la Organización');
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
  `NIVEL` int unsigned DEFAULT NULL,
  `codigo` varchar(10) DEFAULT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `criterio_ibl_national`
--

LOCK TABLES `criterio_ibl_national` WRITE;
/*!40000 ALTER TABLE `criterio_ibl_national` DISABLE KEYS */;
INSERT INTO `criterio_ibl_national` VALUES (1,10,'10.lbl','Secreto'),(2,9,'9.lbl','Reservado'),(3,8,'8.lbl','Confidencial'),(4,7,'7.lbl','Confidencial'),(5,6,'6.lbl','Difusión limitada'),(6,5,'5.lbl','Difusión limitada'),(7,4,'4.lbl','Difusión limitada'),(8,3,'3.lbl','Difusión limitada'),(9,2,'2.lbl','Sin clasificar'),(10,1,'1.lbl','Sin clasificar');
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
  `NIVEL` int unsigned DEFAULT NULL,
  `codigo` varchar(10) DEFAULT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `criterio_ibl_ue`
--

LOCK TABLES `criterio_ibl_ue` WRITE;
/*!40000 ALTER TABLE `criterio_ibl_ue` DISABLE KEYS */;
INSERT INTO `criterio_ibl_ue` VALUES (1,10,'10.ue','TRES SECRET UE'),(2,9,'9.ue','SECRET UE'),(3,8,'8.ue','CONFIDENTIEL UE'),(4,7,'7.ue','CONFIDENTIEL UE'),(5,6,'6.ue','RESTREINT UE'),(6,5,'5.ue','RESTREINT UE'),(7,4,'4.ue','RESTREINT UE'),(8,3,'3.ue','RESTREINT UE');
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
  `NIVEL` int unsigned DEFAULT NULL,
  `codigo` varchar(10) DEFAULT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `criterio_lg`
--

LOCK TABLES `criterio_lg` WRITE;
/*!40000 ALTER TABLE `criterio_lg` DISABLE KEYS */;
INSERT INTO `criterio_lg` VALUES (1,9,'9.lg.a','Probablemente causaría una publicidad negativa generalizada por afectar de forma excepcionalmente grave a las relaciones a las relaciones con otras organizaciones'),(2,9,'9.lg.b','Probablemente causaría una publicidad negativa generalizada por afectar de forma excepcionalmente grave a las relaciones a las relaciones con el público en general'),(3,7,'7.lg.a','Probablemente causaría una publicidad negativa generalizada por afectar gravemente a las relaciones con otras organizaciones'),(4,7,'7.lg.b','Probablemente causaría una publicidad negativa generalizada por afectar gravemente a las relaciones con el público en general'),(5,5,'5.lg.a','Probablemente sea causa una cierta publicidad negativa por afectar negativamente a las relaciones con otras organizaciones'),(6,5,'5.lg.b','Probablemente sea causa una cierta publicidad negativa por afectar negativamente a las relaciones con el público'),(7,3,'3.lg','Probablemente afecte negativamente a las relaciones internas de la Organización'),(8,2,'2.lg','Probablemente cause una pérdida menor de la confianza dentro de la Organización'),(9,1,'1.lg','Pudiera causar una pérdida menor de la confianza dentro de la Organización'),(10,0,'0.4','no supondría daño a la reputación o buena imagen de las personas u organizaciones');
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
  `NIVEL` int unsigned DEFAULT NULL,
  `codigo` varchar(10) DEFAULT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `criterio_lpo`
--

LOCK TABLES `criterio_lpo` WRITE;
/*!40000 ALTER TABLE `criterio_lpo` DISABLE KEYS */;
INSERT INTO `criterio_lpo` VALUES (1,9,'9.lro','probablemente cause un incumplimiento excepcionalmente grave de una ley o regulación'),(2,7,'7.lro','probablemente cause un incumplimiento grave de una ley o regulación'),(3,5,'5.lro','probablemente sea causa de incumplimiento de una ley o regulación'),(4,3,'3.lro','probablemente sea causa de incumplimiento leve o técnico de una ley o regulación'),(5,1,'1.lro','pudiera causar el incumplimiento leve o técnico de una ley o regulación');
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
  `NIVEL` int unsigned DEFAULT NULL,
  `codigo` varchar(10) DEFAULT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `criterio_olm`
--

LOCK TABLES `criterio_olm` WRITE;
/*!40000 ALTER TABLE `criterio_olm` DISABLE KEYS */;
INSERT INTO `criterio_olm` VALUES (1,10,'10.olm','Probablemente cause un daño excepcionalmente serio a la eficacia o seguridad de la misión operativa o logística'),(2,9,'9.olm','Probablemente cause un daño serio a la eficacia o seguridad de la misión operativa o logística'),(3,7,'7.olm','Probablemente perjudique la eficacia o seguridad de la misión operativa o logística'),(4,5,'5.olm','Probablemente merme la eficacia o seguridad de la misión operativa o logística más allá del ámbito local'),(5,3,'3.olm','Probablemente merme la eficacia o seguridad de la misión operativa o logística (alcance local)'),(6,1,'1.olm','Pudiera mermar la eficacia o seguridad de la misión operativa o logística (alcance local)');
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
  `NIVEL` int unsigned DEFAULT NULL,
  `codigo` varchar(10) DEFAULT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
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
  `NIVEL` int unsigned DEFAULT NULL,
  `codigo` varchar(10) DEFAULT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `criterio_po`
--

LOCK TABLES `criterio_po` WRITE;
/*!40000 ALTER TABLE `criterio_po` DISABLE KEYS */;
INSERT INTO `criterio_po` VALUES (1,6,'6.pi1','probablemente afecte gravemente a un grupo de individuos'),(2,6,'6.pi2','probablemente quebrante seriamente la ley o algún reglamento de protección de información personal'),(3,5,'5.pi1','probablemente afecte gravemente a un individuo'),(4,5,'5.pi2','probablemente quebrante seriamente leyes o regulaciones'),(5,4,'4.pi1','probablemente afecte a un grupo de individuos'),(6,4,'4.pi2','probablemente quebrante leyes o regulaciones'),(7,3,'3.pi1','probablemente afecte a un individuo'),(8,3,'3.pi2','probablemente suponga el incumplimiento de una ley o regulación'),(9,2,'2.pi1','pudiera causar molestias a un individuo'),(10,2,'2.pi2','pudiera quebrantar de forma leve leyes o regulaciones'),(11,1,'1.pi1','pudiera causar molestias a un individuo');
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
  `NIVEL` int unsigned DEFAULT NULL,
  `codigo` varchar(10) DEFAULT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `criterio_rto`
--

LOCK TABLES `criterio_rto` WRITE;
/*!40000 ALTER TABLE `criterio_rto` DISABLE KEYS */;
INSERT INTO `criterio_rto` VALUES (1,7,'(,7.rto','RTO < 4 horas'),(2,4,'4.rto','4 horas < RTO < 1 día'),(3,1,'1.rto','1 día < RTO < 5 días'),(4,0,'0.rto','5 días < RTO');
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
  `NIVEL` int unsigned DEFAULT NULL,
  `codigo` varchar(10) DEFAULT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `criterio_si`
--

LOCK TABLES `criterio_si` WRITE;
/*!40000 ALTER TABLE `criterio_si` DISABLE KEYS */;
INSERT INTO `criterio_si` VALUES (1,10,'10.si','probablemente sea causa de un incidente excepcionalmente serio de seguridad o dificulte la investigación de incidentes excepcionalmente serios'),(2,9,'9.si','probablemente sea causa de un serio incidente de seguridad o dificulte la investigación de incidentes serios'),(3,7,'7.si','probablemente sea causa de un grave incidente de seguridad o dificulte la investigación de incidentes graves'),(4,3,'3.si','probablemente sea causa de una merma en la seguridad o dificulte la investigación de un incidente'),(5,1,'1.si','pudiera causar una merma en la seguridad o dificultar la investigación de un incidente');
/*!40000 ALTER TABLE `criterio_si` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `degradacion`
--

DROP TABLE IF EXISTS `degradacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `degradacion` (
  `PK` int unsigned NOT NULL,
  `fecha_creacion` datetime DEFAULT NULL,
  `grado` double DEFAULT NULL,
  `probabilidad` varchar(150) DEFAULT NULL,
  `fk_valoracion` int unsigned DEFAULT NULL,
  `fk_amenaza` int unsigned DEFAULT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`),
  KEY `fk_valoracion` (`fk_valoracion`),
  KEY `fk_amenaza` (`fk_amenaza`),
  CONSTRAINT `degradacion_ibfk_1` FOREIGN KEY (`fk_valoracion`) REFERENCES `valoracion` (`PK`),
  CONSTRAINT `degradacion_ibfk_2` FOREIGN KEY (`fk_amenaza`) REFERENCES `amenaza` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `degradacion`
--

LOCK TABLES `degradacion` WRITE;
/*!40000 ALTER TABLE `degradacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `degradacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dimensiones_valoracion`
--

DROP TABLE IF EXISTS `dimensiones_valoracion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dimensiones_valoracion` (
  `PK` int unsigned NOT NULL,
  `cod` varchar(10) DEFAULT NULL,
  `nombre` varchar(200) DEFAULT NULL,
  `definicion` varchar(400) DEFAULT NULL,
  `descripcion` varchar(1200) DEFAULT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dimensiones_valoracion`
--

LOCK TABLES `dimensiones_valoracion` WRITE;
/*!40000 ALTER TABLE `dimensiones_valoracion` DISABLE KEYS */;
INSERT INTO `dimensiones_valoracion` VALUES (1,'D','Disponibilidad','Propiedad o cadimensiones_valoraciondimensiones_valoracionracterística de los activos consistente en que las entidades o procesos autorizados tienen acceso a los mismos cuando lo requieren. [UNE 71504:2008]','¿Qué importancia tendría que el activo no estuviera disponible?\nUn activo tiene un gran valor desde el punto de vista de disponibilidad cuando si una amenaza afectara a su disponibilidad, las consecuencias serían graves.\nY recíprocamente, un activo carece de un valor apreciable desde el punto de vista de disponibilidad cuando puede no estar disponible frecuentemente y durante largos periodos de tiempo sin por ello causar mayor daño.\nLa disponibilidad es una característica que afecta a todo tipo de activos.\nA menudo la disponibilidad requiere un tratamiento por escalones pues el coste de la indisponibilidad aumenta de forma no lineal con la duración de la interrupción, desde breves interrupciones sin importancia, pasando por interrupciones que causan daños considerables y llegando a interrupciones que no admiten recuperación: la organización está acabada.'),(2,'I','Integridad de los datos','Propiedad o característica consistente en que el activo de información no ha sido alterado de manera no autorizada. [ISO/IEC 13335-1:2004]','¿Qué importancia tendría que los datos fueran modificados fuera de control?\nLos datos reciben una alta valoración desde el punto de vista de integridad cuando su alteración, voluntaria o intencionada, causaría graves daños a la organización.\nY, recíprocamente, los datos carecen de un valor apreciable desde el punto de vista de integridad cuando su alteración no supone preocupación alguna.'),(3,'C','Confidencialidad de la información','Propiedad o característica consistente en que la información ni se pone a disposición, ni se revela a individuos, entidades o procesos no autorizados. [UNE-ISO/IEC 27001:2007]','¿Qué importancia tendría que el dato fuera conocido por personas no autorizadas?\nLos datos reciben una alta valoración desde el punto de vista de confidencialidad cuando su revelación causaría graves daños a la organización.\nY, recíprocamente, los datos carecen de un valor apreciable desde el punto de vista de confidencialidad cuando su conocimiento por cualquiera no supone preocupación alguna.'),(4,'A','Autenticidad','Propiedad o característica consistente en que una entidad es quien dice ser o bien que\ngarantiza la fuente de la que proceden los datos. [UNE 71504:2008]','¿Qué importancia tendría que quien accede al servicio no sea realmente quien se cree?\nLa autenticidad de los usuarios de un servicio es lo contrario de la oportunidad de fraude o uso no autorizado de un servicio.\nAsí, un servicio recibe una elevada valoración desde el punto de vista de autenticidad cuando su prestación a falsos usuarios supondría un grave perjuicio para la organización.\nY, recíprocamente, un servicio carece de un valor apreciable desde el punto de vista de autenticidad cuando su acceso por cualquiera no supone preocupación alguna.\n¿Qué importancia tendría que los datos no fueran realmente imputables a quien se cree?\nLos datos reciben una elevada valoración desde el punto de vista de autenticidad del origen cuando un defecto de imputación causaría graves quebrantos a la organización. Típicamente, se habilita la oportunidad de repudio.\nY, recíprocamente, los datos carecen de un valor apreciable desde el punto de vista de autenticidad del origen cuando ignorar la fuente es irrelevante.'),(5,'T','Trazabilidad','Propiedad o característica consistente en que las actuaciones de una entidad pueden ser imputadas exclusivamente a dicha entidad. [UNE 71504:2008]','¿Qué importancia tendría que no quedara constancia fehaciente del uso del servicio?\nAbriría las puertas al fraude, incapacitaría a la Organización para perseguir delitos y podría suponer el incumplimiento de obligaciones legales.\n¿Qué importancia tendría que no quedara constancia del acceso a los datos?\nAbriría las puertas al fraude, incapacitaría a la Organización para perseguir delitos y podría suponer el incumplimiento de obligaciones legales.');
/*!40000 ALTER TABLE `dimensiones_valoracion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `eficiencia`
--

DROP TABLE IF EXISTS `eficiencia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `eficiencia` (
  `PK` int unsigned NOT NULL,
  `fecha_creacion` datetime DEFAULT NULL,
  `eficiencia_valor` varchar(60) DEFAULT NULL,
  `eficiencia_frecuencia` varchar(150) DEFAULT NULL,
  `fk_degradacion` int unsigned DEFAULT NULL,
  `fk_salvaguarda` int unsigned DEFAULT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`),
  KEY `fk_degradacion` (`fk_degradacion`),
  KEY `fk_salvaguarda` (`fk_salvaguarda`),
  CONSTRAINT `eficiencia_ibfk_1` FOREIGN KEY (`fk_degradacion`) REFERENCES `degradacion` (`PK`),
  CONSTRAINT `eficiencia_ibfk_2` FOREIGN KEY (`fk_salvaguarda`) REFERENCES `salvaguarda` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `eficiencia`
--

LOCK TABLES `eficiencia` WRITE;
/*!40000 ALTER TABLE `eficiencia` DISABLE KEYS */;
/*!40000 ALTER TABLE `eficiencia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `escala_impacto`
--

DROP TABLE IF EXISTS `escala_impacto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `escala_impacto` (
  `PK` int unsigned NOT NULL,
  `abreviadura` varchar(5) DEFAULT NULL,
  `magnitud` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `escala_impacto`
--

LOCK TABLES `escala_impacto` WRITE;
/*!40000 ALTER TABLE `escala_impacto` DISABLE KEYS */;
INSERT INTO `escala_impacto` VALUES (1,'MB','muy bajo'),(2,'B','bajo'),(3,'M','medio'),(4,'A','alto'),(5,'MA','muy alto');
/*!40000 ALTER TABLE `escala_impacto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `escala_probabilidad`
--

DROP TABLE IF EXISTS `escala_probabilidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `escala_probabilidad` (
  `PK` int unsigned NOT NULL,
  `abreviadura` varchar(5) DEFAULT NULL,
  `magnitud` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `escala_probabilidad`
--

LOCK TABLES `escala_probabilidad` WRITE;
/*!40000 ALTER TABLE `escala_probabilidad` DISABLE KEYS */;
INSERT INTO `escala_probabilidad` VALUES (1,'MB','muy raro'),(2,'B','poco probable'),(3,'M','posible'),(4,'A','probable'),(5,'MA','prácticamente seguro');
/*!40000 ALTER TABLE `escala_probabilidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `escala_riesgo`
--

DROP TABLE IF EXISTS `escala_riesgo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `escala_riesgo` (
  `PK` int unsigned NOT NULL,
  `abreviadura` varchar(5) DEFAULT NULL,
  `magnitud` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `escala_riesgo`
--

LOCK TABLES `escala_riesgo` WRITE;
/*!40000 ALTER TABLE `escala_riesgo` DISABLE KEYS */;
INSERT INTO `escala_riesgo` VALUES (1,'MB','muy despreciabe'),(2,'B','bajo'),(3,'M','apreciable'),(4,'A','importante'),(5,'MA','crítico');
/*!40000 ALTER TABLE `escala_riesgo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `escala_valor`
--

DROP TABLE IF EXISTS `escala_valor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `escala_valor` (
  `PK` int unsigned NOT NULL,
  `abreviadura` varchar(5) DEFAULT NULL,
  `magnitud` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `escala_valor`
--

LOCK TABLES `escala_valor` WRITE;
/*!40000 ALTER TABLE `escala_valor` DISABLE KEYS */;
INSERT INTO `escala_valor` VALUES (1,'MB','muy bajo'),(2,'B','bajo'),(3,'M','medio'),(4,'A','alto'),(5,'MA','muy alto');
/*!40000 ALTER TABLE `escala_valor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persona`
--

DROP TABLE IF EXISTS `persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `persona` (
  `PK` int unsigned NOT NULL,
  `nombre` varchar(60) DEFAULT NULL,
  `apellido1` varchar(150) DEFAULT NULL,
  `apellido2` varchar(150) DEFAULT NULL,
  `fk_puesto` int unsigned DEFAULT NULL,
  `fk_rol` int unsigned DEFAULT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`),
  KEY `fk_puesto` (`fk_puesto`),
  KEY `fk_rol` (`fk_rol`),
  CONSTRAINT `persona_ibfk_1` FOREIGN KEY (`fk_puesto`) REFERENCES `puesto` (`PK`),
  CONSTRAINT `persona_ibfk_2` FOREIGN KEY (`fk_rol`) REFERENCES `rol` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persona`
--

LOCK TABLES `persona` WRITE;
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `puesto`
--

DROP TABLE IF EXISTS `puesto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `puesto` (
  `PK` int unsigned NOT NULL,
  `nombre` varchar(100) DEFAULT NULL,
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
  `fk_tipo_activo` int unsigned DEFAULT NULL,
  `fk_tipo_amenaza` int unsigned DEFAULT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`),
  KEY `fk_tipo_activo` (`fk_tipo_activo`),
  KEY `fk_tipo_amenaza` (`fk_tipo_amenaza`),
  CONSTRAINT `rel_tipo_activo_tipo_amenaza_ibfk_1` FOREIGN KEY (`fk_tipo_activo`) REFERENCES `tipo_activo` (`PK`),
  CONSTRAINT `rel_tipo_activo_tipo_amenaza_ibfk_2` FOREIGN KEY (`fk_tipo_amenaza`) REFERENCES `tipo_amenaza` (`PK`)
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
  `fk_tipo_amenaza` int unsigned DEFAULT NULL,
  `fk_dimension` int unsigned DEFAULT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`),
  KEY `fk_dimension` (`fk_dimension`),
  CONSTRAINT `rel_tipo_amenaza_dimensiones_ibfk_1` FOREIGN KEY (`PK`) REFERENCES `tipo_amenaza` (`PK`),
  CONSTRAINT `rel_tipo_amenaza_dimensiones_ibfk_2` FOREIGN KEY (`fk_dimension`) REFERENCES `dimensiones_valoracion` (`PK`)
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
  `nombre` varchar(100) DEFAULT NULL,
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
  `cod` varchar(10) DEFAULT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `descripcion` varchar(600) DEFAULT NULL,
  `fk_tipo` int unsigned DEFAULT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`),
  KEY `fk_tipo` (`fk_tipo`),
  CONSTRAINT `salvaguarda_ibfk_1` FOREIGN KEY (`fk_tipo`) REFERENCES `tipo_salvaguarda` (`PK`)
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
-- Table structure for table `tipo_activo`
--

DROP TABLE IF EXISTS `tipo_activo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_activo` (
  `PK` int unsigned NOT NULL,
  `cod` varchar(25) DEFAULT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `descripcion` varchar(600) DEFAULT NULL,
  `fk_superior` int unsigned DEFAULT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`),
  KEY `fk_superior` (`fk_superior`),
  CONSTRAINT `tipo_activo_ibfk_1` FOREIGN KEY (`fk_superior`) REFERENCES `tipo_activo` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_activo`
--

LOCK TABLES `tipo_activo` WRITE;
/*!40000 ALTER TABLE `tipo_activo` DISABLE KEYS */;
INSERT INTO `tipo_activo` VALUES (1,'essential','Activos esenciales','',NULL),(2,'info','información','',1),(3,'adm','datos de interés para la administración pública','',1),(4,'vr','datos vitales (registros de la organización)','Dícese de aquellos que son esenciales para la supervivencia de la Organización; es decir que su carencia o daño afectaría directamente a la existencia de la Organización. Se pueden identificar aquellos que son imprescindibles para que la Organización supere una situación de emergencia, aquellos que permiten desempeñar o reconstruir las misiones críticas, aquellos sustancian la naturaleza legal o los derechos financieros de la Organización o sus usuarios.',1),(5,'per','datos de carácter personal','',1),(6,'A','nivel alto','',5),(7,'M','nivel medio','',5),(8,'B','nivel bajo','',5),(9,'classified','datos clasificados','Dícese de cualquier información concerniente a personas físicas identificadas o identificables. Los datos de carácter personal están regulados por leyes y reglamentos en cuanto afectan a las libertades públicas y los derechos fundamentales de las personas físicas, y especialmente su honor e intimidad personal y familiar.',1),(10,'C','nivel confidencial o','',9),(11,'R','difusión limitada o','',9),(12,'UC','sin clasificar o','',9),(13,'pub','de carácter público','Dícese de aquellos sometidos a normativa específica de control de acceso y distribución; es decir aquellos cuya confidencialidad es especialmente relevante. La tipificación de qué datos deben ser clasificados y cuales son las normas para su tratamiento, vienen determinadas por regulaciones sectoriales, por acuerdos entre organizaciones o por normativa interna.',1),(14,'service','servicioo','',1),(15,'arch','Arquitectura del sistema','Se trata de elementos que permiten estructurar el sistema, definiendo su arquitectura interna y sus relaciones con el exterior.',NULL),(16,'sap','punto de acceso al servicio','Establece una frontera entre la prestación de un servicio (proveedor) y el usuario (consumidor). Los requisitos de seguridad del usuario se convierten en obligaciones del prestatario, mientras que los incidentes de seguridad en el proveedor repercuten en el usuario.',15),(17,'ip','punto de interconexión','Establece una frontera inter-pares: cuando dos sistemas se interconectan para intercambiar información.',15),(18,'ext','proporcionado por terceros','Establece una frontera inferior, cuando para la prestación de nuestros servicios recurrimos a un tercero.',15),(19,'D','Datos / Información','Los datos son el corazón que permite a una organización prestar sus servicios. La información es un activo abstracto que será almacenado en equipos o soportes de información (normalmente agrupado como ficheros o bases de datos) o será transferido de un lugar a otro por los medios de transmisión de datos.',NULL),(20,'files','ficheros (backup) copias de respaldo','',18),(21,'conf','datos de configuración','Los datos de configuración son críticos para mantener la funcionalidad de las partes y del conjunto del sistema de información.',18),(22,'int','datos de gestión interna','',18),(23,'password','credenciales (ej. contraseñas)','',18),(24,'auth','datos de validación de credenciales','',18),(25,'acl','datos de control de acceso','',18),(26,'log','registro de actividad','Los registros de actividad sustancian los requisitos de trazabilidad.',18),(27,'source','código fuente [exe] código ejecutable [test] datos de prueba','',18),(28,'K','Claves criptográficas','Las criptografía se emplea para proteger el secreto o autenticar a las partes. Las claves criptográficas, combinando secretos e información pública, son esenciales para garantizar el funcionamiento de los mecanismos criptográficos.',NULL),(29,'info','protección de la información','',NULL),(30,'encrypt','claves de cifra','',29),(31,'shared_secret','secreto compartido (clave simétrica)','Por ejemplo, DES, 3-DES, AES, etc.',30),(32,'public_encryption','clave pública de cifra (2)','Por ejemplo, RSA, Diffie-Hellman, curvas elípticas, etc.',30),(33,'public_decryption','clave privada de descifrado','Por ejemplo, RSA, Diffie-Hellman, curvas elípticas, etc.',30),(34,'sign','claves de firma','',29),(35,'shared_secret','secreto compartido (clave simétrica)','',34),(36,'public_signature','clave privada de firma)','Por ejemplo, RSA, Diffie-Hellman, curvas elípticas, etc.',34),(37,'public_verification','clave pública de verificación de firma','Por ejemplo, RSA, Diffie-Hellman, curvas elípticas, etc.',34),(38,'com','protección de las comunicaciones','',29),(39,'channel','claves de cifrado del canal','',38),(40,'authentication','claves de autenticación','',38),(41,'verification','claves de verificación de autenticación','',38),(42,'disk','cifrado de soportes de información','',29),(43,'encrypt','claves de cifra','',42),(44,'x509','certificados de clave pública','',29),(45,'S','Servicios','Función que satisface una necesidad de los usuarios (del servicio). Esta sección contempla servicios prestados por el sistema',NULL),(46,'anon','anónimo (sin requerir identificación del usuario)','',45),(47,'pub','al público en general (sin relación contractual)','',45),(48,'ext','a usuarios externos (bajo una relación contractual)','',45),(49,'int','interno (a usuarios de la propia organización)','',45),(50,'www','world wide web','',45),(51,'telnet','acceso remoto a cuenta local','',45),(52,'email','correo electrónico','',45),(53,'file','almacenamiento de ficheros','',45),(54,'ftp','transferencia de ficheros','',45),(55,'edi','intercambio electrónico de datos','',45),(56,'dir','servicio de directorio','Localización de personas (páginas blancas), empresas o servicios (páginas amarillas); permitiendo la identificación y facilitando los atributos que caracterizan al elemento determinado.',45),(57,'idm','gestión de identidades','Servicios que permiten altas y bajas de usuarios de los sistemas, incluyendo su caracterización y activando los servicios de aprovisionamiento asociados a sus cambios de estado respecto de la organización.',45),(58,'ipm','gestión de privilegios','',45),(59,'pki','PKI - infraestructura de clave pública','Servicios asociados a sistemas de criptografía de clave pública, incluyendo especialmente la gestión de certificados.',45),(60,'SW','Software - Aplicaciones informáticas','Con múltiples denominaciones (programas, aplicativos, desarrollos, etc.) este epígrafe se refiere a tareas que han sido automatizadas para su desempeño por un equipo informático. Las aplicaciones gestionan, analizan y transforman los datos permitiendo la explotación de la información para la prestación de los servicios.No preocupa en este apartado el denominado “código fuente” o programas que serán datos de interés comercial, a valorar y proteger como tales. Dicho código aparecería como datos.',NULL),(61,'prp','desarrollo propio (in house)','',60),(62,'sub','desarrollo a medida (subcontratado)','',60),(63,'std','estándar (off the shelf)','',60),(64,'browser','navegador web','',63),(65,'www','servidor de presentación','',63),(66,'app','servidor de aplicaciones','',63),(67,'email_client','cliente de correo electrónico','',63),(68,'email_server','servidor de correo electrónico','',63),(69,'file','servidor de ficheros','',63),(70,'dbms','sistema de gestión de bases de datos','',63),(71,'tm','monitor transaccional','',63),(72,'office','ofimática','',63),(73,'av','anti virus','',63),(74,'os','sistema operativo','',63),(75,'hypervisor','gestor de máquinas virtuales','',63),(76,'ts','servidor de terminales','',63),(77,'backup','sistema de backup','',63),(78,'HW','Equipamiento informático (hardware)','Dícese de los medios materiales, físicos, destinados a soportar directa o indirectamente los servicios que presta la organización, siendo pues depositarios temporales o permanentes de los datos,soporte de ejecución de las aplicaciones informáticas o responsables del procesado o la transmisión de datos.',NULL),(79,'host','grandes equipos','Se caracterizan por haber pocos, frecuentemente uno sólo, ser económicamente gravosos y requerir un entorno específico para su operación. Son difícilmente reemplazables en caso de destrucción.',78),(80,'mid','equipos medios','Se caracterizan por haber varios, tener un coste económico medio tanto de adquisición como de mantenimiento e imponer requerimientos estándar como entorno de operación. No es difícil reemplazarlos en caso de destrucción.',78),(81,'pc','informática personal','Se caracterizan por ser multitud, tener un coste económico relativamente pequeño e imponer solamente unos requerimientos mínimos como entorno de operación. Son fácilmente reemplazables en caso de destrucción.',78),(82,'mobile','informática móvil','Se caracterizan por ser equipos afectos a la clasificación como informática personal que, además, son fácilmente transportables de un sitio a otro, pudiendo estar tanto dentro del recinto propio de la organización como en cualquier otro lugar.',78),(83,'pda','agendas electrónicas','',78),(84,'vhost','equipo virtual','',78),(85,'backup','equipamiento de respaldo','Son aquellos equipos preparados para hacerse cargo inmediato de los equipos en producción.',78),(86,'peripheral','periféricos','',78),(87,'print','medios de impresión','Dícese de impresoras y servidores de impresión.',86),(88,'scan','escáneres','',86),(89,'crypto','dispositivos criptográficos','',86),(90,'bp','dispositivo de frontera (7)','Son los equipos que se instalan entre dos zonas de confianza.',78),(91,'network','soporte de la red (8)','Dícese de equipamiento necesario para transmitir datos: routers, módems, etc.',78),(92,'modem','módems','',91),(93,'hub','concentradores','',91),(94,'switch','conmutadores','',91),(95,'router','encaminadores','',91),(96,'bridge','pasarelas','',91),(97,'firewall','cortafuegos','',91),(98,'wap','punto de acceso inalámbrico','',91),(99,'pabx','centralita telefónica[ipphone] teléfono IP','',78),(100,'COM','Redes de comunicaciones','Incluyendo tanto instalaciones dedicadas como servicios de comunicaciones contratados a terceros; pero siempre centrándose en que son medios de transporte que llevan datos de un sitio a otro.',NULL),(101,'PSTN','red telefónica','',100),(102,'ISDN','rdsi (red digital)','',100),(103,'X25','X25 (red de datos)','',100),(104,'ADSL','ADSL','',100),(105,'[pp','punto a punto','',100),(106,'radio','comunicaciones radio','',100),(107,'wifi','red inalámbrica','',100),(108,'mobile','telefonía móvil','',100),(109,'sat','por satélite','',100),(110,'LAN','red local','',100),(111,'MAN','red metropolitana','',100),(112,'Internet','Internet','',100),(113,'Media','Soportes de información','En este epígrafe se consideran dispositivos físicos que permiten almacenar información de forma permanente o, al menos, durante largos periodos de tiempo.',NULL),(114,'electronic','electrónicos','',113),(115,'disk','discos','',114),(116,'vdisk','discos virtuales','',114),(117,'san','almacenamiento en red','',114),(118,'disquette','disquetes','',114),(119,'cd','cederrón (CD-ROM)','',114),(120,'usb','memorias USB','',114),(121,'dvd','DVD','',114),(122,'tape','cinta magnética','',114),(123,'mc','tarjetas de memoria','',114),(124,'ic','tarjetas inteligentes','',114),(125,'non_electronic','no electrónicos','',113),(126,'[printed','material impreso','',125),(127,'tape','cinta de papel','',125),(128,'film','microfilm','',125),(129,'cards','tarjetas perforadas','',125),(130,'L','Instalaciones','En este epígrafe entran los lugares donde se hospedan los sistemas de información y comunicaciones.',NULL),(131,'site','recinto','',129),(132,'building','edificio','',129),(133,'local','cuarto','',129),(134,'mobile','plataformas móviles','',129),(135,'car','vehículo terrestre: coche, camión, etc.','',133),(136,'plane','vehículo aéreo: avión, etc.','',133),(137,'ship','vehículo marítimo: buque, lancha, etc.','',133),(138,'shelter','contenedores','',133),(139,'channel','canalización','',129),(140,'backup','instalaciones de respaldo','',129),(141,'P','Personal','En este epígrafe aparecen las personas relacionadas con los sistemas de información.',NULL),(142,'ue','usuarios externos','',140),(143,'ui','usuarios internos','',140),(144,'op','operadores','',140),(145,'adm','administradores de sistemas','',140),(146,'com','administradores de comunicaciones','',140),(147,'dba','administradores de BBDD','',140),(148,'sec','administradores de seguridad','',140),(149,'des','desarrolladores / programadores','',140),(150,'sub','subcontratas','',140),(151,'prov','proveedores','',140);
/*!40000 ALTER TABLE `tipo_activo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_amenaza`
--

DROP TABLE IF EXISTS `tipo_amenaza`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_amenaza` (
  `PK` int unsigned NOT NULL,
  `cod` varchar(5) DEFAULT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `descripcion` varchar(1000) DEFAULT NULL,
  `fk_superior` int unsigned DEFAULT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`),
  KEY `fk_superior` (`fk_superior`),
  CONSTRAINT `tipo_amenaza_ibfk_1` FOREIGN KEY (`fk_superior`) REFERENCES `tipo_amenaza` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_amenaza`
--

LOCK TABLES `tipo_amenaza` WRITE;
/*!40000 ALTER TABLE `tipo_amenaza` DISABLE KEYS */;
INSERT INTO `tipo_amenaza` VALUES (1,'N','Desastres naturales','Sucesos que pueden ocurrir sin intervención de los seres humanos como causa directa o indirecta.Origen: Natural (accidental)',NULL),(2,'N.1','Fuego','incendios: posibilidad de que el fuego acabe con recursos del sistema. Ver: EBIOS: 01- INCENDIO',1),(3,'N.2','Daños por agua','inundaciones: posibilidad de que el agua acabe con recursos del sistema. Ver: EBIOS: 02 - PERJUICIOS OCASIONADOS POR EL AGUA',1),(4,'N.*','Desastres naturales','otros incidentes que se producen sin intervención humana: rayo, tormenta eléctrica, terremoto, ciclones, avalancha, corrimiento de tierras, ... Se excluyen desastres específicos tales como incendios (ver [N.1]) e inundaciones (ver [N.2]). Se excluye al personal por cuanto se ha previsto una amenaza específica [E.31] para cubrir la indisponibilidad involuntaria del personal sin entrar en sus causas. Ver: EBIOS: 03 – CONTAMINACIÓN 04 - SINIESTRO MAYOR 06 - FENÓMENO CLIMÁTICO 07 - FENÓMENO SÍSMICO 08 - FENÓMENO DE ORIGEN VOLCÁNICO 09 - FENÓMENO METEOROLÓGICO 10 - INUNDACIÓN',1),(5,'I','De origen industrial','Sucesos que pueden ocurrir de forma accidental, derivados de la actividad humana de tipo industrial. Estas amenazas puede darse de forma accidental o deliberada.',NULL),(6,'I.1','Fuego','incendio: posibilidad de que el fuego acabe con los recursos del sistema. Origen: Entorno (accidental) Humano (accidental o deliberado) Ver: EBIOS: 01- INCENDIO',1),(7,'I.2','Daños por agua','escapes, fugas, inundaciones: posibilidad de que el agua acabe con los recursos del sistema. Origen: Entorno (accidental) Humano (accidental o deliberado) Ver: EBIOS: 02 - PERJUICIOS OCASIONADOS POR EL AGUA',1),(8,'A.3','Manipulación de los registros de actividad (log)','Ver: EBIOS: no disponible',38),(9,'I.*','Desastres industriales','otros desastres debidos a la actividad humana: explosiones, derrumbes, ... contaminación química, ... sobrecarga eléctrica, fluctuaciones eléctricas, ... accidentes de tráfico, ... Se excluyen amenazas específicas como incendio (ver [I.1]) e inundación (ver [I.2]). Se excluye al personal por cuanto se ha previsto una amenaza específica, [E.31], para cubrir la indisponibilidad involuntaria del personal sin entrar en sus causas. Origen: Entorno (accidental) Humano (accidental o deliberado) Ver: EBIOS: 04 - SINIESTRO MAYOR',NULL),(10,'I.3','Contaminación mecánica','vibraciones, polvo, suciedad, ... Origen: Entorno (accidental) Humano (accidental o deliberado) Ver: EBIOS: 03 – CONTAMINACIÓN',9),(11,'I.4','Contaminación electromagnética','interferencias de radio, campos magnéticos, luz ultravioleta, ... Origen: Entorno (accidental) Humano (accidental o deliberado) Ver: EBIOS: 14 - EMISIONES ELECTROMAGNÉTICAS 15- RADIACIONES TÉRMICAS 16 - IMPULSOS ELECTROMAGNÉTICOS',9),(12,'I.5','Avería de origen físico o lógico','fallos en los equipos y/o fallos en los programas. Puede ser debida a un defecto de origen o sobrevenida durante el funcionamiento del sistema. En sistemas de propósito específico, a veces es difícil saber si el origen del fallo es físico o lógico; pero para las consecuencias que se derivan, esta distinción no suele ser relevante. Origen: Entorno (accidental) Humano (accidental o deliberado) Ver: EBIOS: 28 - AVERÍA DEL HARDWARE 29 - FALLA DE FUNCIONAMIENTO DEL HARDWARE',9),(13,'I.6','Corte del suministro eléctrico','cese de la alimentación de potencia Origen: Entorno (accidental) Humano (accidental o deliberado) Ver: EBIOS: 12 - PÉRDIDA DE SUMINISTRO DE ENERGÍA',9),(14,'I.7','Condiciones inadecuadas de temperatura y/o humedad','deficiencias en la aclimatación de los locales, excediendo los márgenes de trabajo de los equipos: excesivo calor, excesivo frío, exceso de humedad, ... Origen: Entorno (accidental) Humano (accidental o deliberado) Ver: EBIOS: 11- FALLAS EN LA CLIMATIZACIÓN',9),(15,'I.8','Fallo de servicios de comunicaciones','cese de la capacidad de transmitir datos de un sitio a otro. Típicamente se debe a la destrucción física de los medios físicos de transporte o a la detención de los centros de conmutación, sea por destrucción, detención o simple incapacidad para atender al tráfico presente. Origen: Entorno (accidental) Humano (accidental o deliberado) Ver: EBIOS: 13 - PÉRDIDA DE LOS MEDIOS DE TELECOMUNICACIÓN',9),(16,'I.9','Interrupción de otros servicios y suministros esenciales','otros servicios o recursos de los que depende la operación de los equipos; por ejemplo, papel para las impresoras, toner, refrigerante, ... Origen: Entorno (accidental) Humano (accidental o deliberado) Ver: EBIOS: no disponible',9),(17,'I.10','Degradación de los soportes de almacenamiento de la información','como consecuencia del paso del tiempo Origen: Entorno (accidental) Humano (accidental o deliberado) Ver: EBIOS: 28 - AVERÍA DEL HARDWARE 29 - FALLA DE FUNCIONAMIENTO DEL HARDWARE',9),(18,'I.11','Emanaciones electromagnéticas','hecho de poner vía radio datos internos a disposición de terceros. Es una amenaza donde el emisor es víctima pasiva del ataque. Prácticamente todos los dispositivos electrónicos emiten radiaciones al exterior que pudieran ser interceptadas por otros equipos (receptores de radio) derivándose una fuga de información. Esta amenaza se denomina, incorrecta pero frecuentemente, ataque TEMPEST (del inglés “Transient Electromagnetic Pulse Standard”). Abusando del significado primigenio, es frecuente oír hablar de que un equipo disfruta de \"TEMPEST protection\", queriendo decir que se ha diseñado para que no emita, electromagnéticamente, nada de interés por si alguien lo captara. No se contempla en esta amenaza la emisión por necesidades del medio de comunicación: redes inalámbricas, enlaces de microondas, etc. que estarán amenazadas de interceptación. Origen: Entorno (accidental) Humano (accidental o deliberado) Ver: EBIOS: 17 - INTERCEPTACIÓN DE SEÑALES PARÁSITAS COMPROMETEDORAS',9),(19,'E','Errores y fallos no intencionados','Fallos no intencionales causados por las personas. La numeración no es consecutiva, sino que está alineada con los ataques deliberados, muchas veces de naturaleza similar a los errores no intencionados, difiriendo únicamente en el propósito del sujeto. Origen: Humano (accidental) Ver correlación de errores y amenazas. 5.3.1. [E.1] Errores de los usuarios',NULL),(20,'E.1','Errores de los usuarios','equivocaciones de las personas cuando usan los servicios, datos, etc. Ver: EBIOS: 38 - ERROR DE USO',19),(21,'E.2','Errores del administrador','equivocaciones de personas con responsabilidades de instalación y operación Ver: EBIOS: 38 - ERROR DE USO',19),(22,'E.3','Errores de monitorización (log)','inadecuado registro de actividades: falta de registros, registros incompletos, registros incorrectamente fechados, registros incorrectamente atribuidos, ... Ver: EBIOS: no disponible',19),(23,'E.4','Errores de configuración','introducción de datos de configuración erróneos. Prácticamente todos los activos dependen de su configuración y ésta de la diligencia del administrador: privilegios de acceso, flujos de actividades, registro de actividad, encaminamiento, etc. Ver: EBIOS: no disponible',19),(24,'E.7','Deficiencias en la organización','cuando no está claro quién tiene que hacer exactamente qué y cuándo, incluyendo tomar medidas sobre los activos o informar a la jerarquía de gestión. Acciones descoordinadas, errores por omisión, etc. Ver: EBIOS: no disponible',19),(25,'E.8','Difusión de software dañino','propagación inocente de virus, espías (spyware), gusanos, troyanos, bombas lógicas, etc. Ver: EBIOS: no disponible',19),(26,'E.9','Errores de [re-]encaminamiento','envío de información a través de un sistema o una red usando, accidentalmente, una ruta incorrecta que lleve la información a donde o por donde no es debido; puede tratarse de mensajes entre personas, entre procesos o entre unos y otros. Es particularmente destacable el caso de que el error de encaminamiento suponga un error de entrega, acabando la información en manos de quien no se espera. Ver: EBIOS: no disponible',19),(27,'E.10','Errores de secuencia','alteración accidental del orden de los mensajes transmitidos. Ver: EBIOS: no disponible',19),(28,'E.14','Escapes de información','la información llega accidentalmente al conocimiento de personas que no deberían tener conocimiento de ella, sin que la información en sí misma se vea alterada.',19),(29,'E.15','Alteración accidental de la información','alteración accidental de la información. Esta amenaza sólo se identifica sobre datos en general, pues cuando la información está en algún soporte informático, hay amenazas específicas. Ver: EBIOS: no disponible',19),(30,'E.18','Destrucción de información','pérdida accidental de información. Esta amenaza sólo se identifica sobre datos en general, pues cuando la información está en algún soporte informático, hay amenazas específicas. Ver: EBIOS: no disponible',19),(31,'E.19','Fugas de información','revelación por indiscreción. Incontinencia verbal, medios electrónicos, soporte papel, etc. Ver: EBIOS: no disponible',19),(32,'E.20','Vulnerabilidades de los programas (software)','defectos en el código que dan pie a una operación defectuosa sin intención por parte del usuario pero con consecuencias sobre la integridad de los datos o la capacidad misma de operar. Ver: EBIOS: no disponible',19),(33,'E.21','Errores de mantenimiento / actualización de programas (software)','defectos en los procedimientos o controles de actualización del código que permiten que sigan utilizándose programas con defectos conocidos y reparados por el fabricante. Ver: EBIOS: 31 - FALLA DE FUNCIONAMIENTO DEL SOFTWARE 32 - PERJUICIO A LA MANTENIBILIDAD DEL SISTEMA DE INFORMACIÓN',19),(34,'E.23','Errores de mantenimiento / actualización de equipos (hardware)','defectos en los procedimientos o controles de actualización de los equipos que permiten que sigan utilizándose más allá del tiempo nominal de uso. Ver: EBIOS: 32 - PERJUICIO A LA MANTENIBILIDAD DEL SISTEMA DE INFORMACIÓN',19),(35,'E.24','Caída del sistema por agotamiento de recursos','la carencia de recursos suficientes provoca la caída del sistema cuando la carga de trabajo es desmesurada. Ver: EBIOS: 30 - SATURACIÓN DEL SISTEMA INFORMÁTICO',19),(36,'E.25','Robo','la pérdida de equipos provoca directamente la carencia de un medio para prestar los servicios, es decir una indisponibilidad. Se puede perder todo tipo de equipamiento, siendo la pérdida de equipos y soportes de información los más habituales. En el caso de equipos que hospedan datos, además se puede sufrir una fuga de información. Ver: EBIOS: 22 - RECUPERACIÓN DE SOPORTES RECICLADOS O DESECHADOS',19),(37,'E.28','Indisponibilidad del personal','ausencia accidental del puesto de trabajo: enfermedad, alteraciones del orden público, guerra bacteriológica, ... Ver: EBIOS: 42 - DAÑO A LA DISPONIBILIDAD DEL PERSONAL',19),(38,'A','Ataques','Intencionados. Fallos deliberados causados por las personas.La numeración no es consecutiva para coordinarla con los errores no intencionados, muchas veces de naturaleza similar a los ataques deliberados, difiriendo únicamente en el propósito del sujeto.Origen: Humano (deliberado)',NULL),(39,'A.4','Manipulación de la configuración','prácticamente todos los activos dependen de su configuración y ésta de la diligencia del administrador: privilegios de acceso, flujos de actividades, registro de actividad, encaminamiento, etc. Ver: EBIOS: no disponible',38),(40,'A.5','Suplantación de la identidad del usuario','cuando un atacante consigue hacerse pasar por un usuario autorizado, disfruta de los privilegios de este para sus fines propios. Esta amenaza puede ser perpetrada por personal interno, por personas ajenas a la Organización o por personal contratado temporalmente. Ver: EBIOS: 40 - USURPACIÓN DE DERECHO',38),(41,'A.6','Abuso de privilegios de acceso','cada usuario disfruta de un nivel de privilegios para un determinado propósito; cuando un usuario abusa de su nivel de privilegios para realizar tareas que no son de su competencia, hay problemas. Ver: EBIOS: 39 - ABUSO DE DERECHO',38),(42,'A.7','Uso no previsto','utilización de los recursos del sistema para fines no previstos, típicamente de interés personal: juegos, consultas personales en Internet, bases de datos personales, programas personales, almacenamiento de datos personales, etc. Ver: EBIOS: no disponible',38),(43,'A.8','Difusión de software dañino','propagación intencionada de virus, espías (spyware), gusanos, troyanos, bombas lógicas, etc. Ver: EBIOS: no disponible',38),(44,'A.9','[Re-]encaminamiento de mensajes','envío de información a un destino incorrecto a través de un sistema o una red, que llevan la información a donde o por donde no es debido; puede tratarse de mensajes entre personas, entre procesos o entre unos y otros. Un atacante puede forzar un mensaje para circular a través de un nodo determinado de la red donde puede ser interceptado. Es particularmente destacable el caso de que el ataque de encaminamiento lleve a una entrega fraudulenta, acabando la información en manos de quien no debe. Ver: EBIOS: no disponible',38),(45,'A.10','Alteración de secuencia','alteración del orden de los mensajes transmitidos. Con ánimo de que el nuevo orden altere el significado del conjunto de mensajes, perjudicando a la integridad de los datos afectados. Ver: EBIOS: 36 - ALTERACIÓN DE DATOS',38),(46,'A.11','Acceso no autorizado','el atacante consigue acceder a los recursos del sistema sin tener autorización para ello, típicamente aprovechando un fallo del sistema de identificación y autorización. Ver: EBIOS: 33 - USO ILÍCITO DEL HARDWARE',38),(47,'A.12','Análisis de tráfico','el atacante, sin necesidad de entrar a analizar el contenido de las comunicaciones, es capaz de extraer conclusiones a partir del análisis del origen, destino, volumen y frecuencia de los intercambios. A veces se denomina “monitorización de tráfico”. Ver: EBIOS: no disponible',38),(48,'A.13','Repudio','negación a posteriori de actuaciones o compromisos adquiridos en el pasado. Repudio de origen: negación de ser el remitente u origen de un mensaje o comunicación. Repudio de recepción: negación de haber recibido un mensaje o comunicación. Repudio de entrega: negación de haber recibido un mensaje para su entrega a otro. Ver: EBIOS: 41 - NEGACIÓN DE ACCIONES',38),(49,'A.14','Interceptación de información (escucha)','el atacante llega a tener acceso a información que no le corresponde, sin que la información en sí misma se vea alterada. Ver: EBIOS: 19 - ESCUCHA PASIVA',38),(50,'A.15','Modificación deliberada de la información','alteración intencional de la información, con ánimo de obtener un beneficio o causar un perjuicio. Ver: EBIOS: no disponible',38),(51,'A.18','Destrucción de información','eliminación intencional de información, con ánimo de obtener un beneficio o causar un perjuicio. Ver: EBIOS: no disponible',38),(52,'A.19','Revelación de información','revelación de información. Ver: EBIOS: 23 – DIVULGACIÓN 27 – GEOLOCALIZACIÓN 34 - COPIA ILEGAL DE SOFTWARE',38),(53,'A.22','Manipulación de programas','alteración intencionada del funcionamiento de los programas, persiguiendo un beneficio indirecto cuando una persona autorizada lo utiliza. Ver: EBIOS: 26 - ALTERACIÓN DE PROGRAMAS',38),(54,'A.22','Manipulación de los equipos','alteración intencionada del funcionamiento de los programas, persiguiendo un beneficio indirecto cuando una persona autorizada lo utiliza. Ver: EBIOS: 25 - SABOTAJE DEL HARDWARE',38),(55,'A.24','Denegación de servicio','la carencia de recursos suficientes provoca la caída del sistema cuando la carga de trabajo es desmesurada. Ver: EBIOS: 30 - SATURACIÓN DEL SISTEMA INFORMÁTICO',38),(56,'A.25','Robo','la sustracción de equipamiento provoca directamente la carencia de un medio para prestar los servicios, es decir una indisponibilidad. El robo puede afectar a todo tipo de equipamiento, siendo el robo de equipos y el robo de soportes de información los más habituales. El robo puede realizarlo personal interno, personas ajenas a la Organización o personas contratadas de forma temporal, lo que establece diferentes grados de facilidad para acceder al objeto sustraído y diferentes consecuencias. En el caso de equipos que hospedan datos, además se puede sufrir una fuga de información. Ver: EBIOS: 20 - ROBO DE SOPORTES O DOCUMENTOS 21 - ROBO DE HARDWARE',38),(57,'A.26','Ataque destructivo','vandalismo, terrorismo, acción militar, ... Esta amenaza puede ser perpetrada por personal interno, por personas ajenas a la Organización o por personas contratadas de forma temporal. Ver: EBIOS: 05 - DESTRUCCIÓN DE HARDWARE O DE SOPORTES',38),(58,'A.27','Ocupación enemiga','cuando los locales han sido invadidos y se carece de control sobre los propios medios de trabajo. Ver: EBIOS: no disponible',38),(59,'A.28','Indisponibilidad del personal','ausencia deliberada del puesto de trabajo: como huelgas, absentismo laboral, bajas no justificadas, bloqueo de los accesos, ... Ver: EBIOS: 42 - DAÑO A LA DISPONIBILIDAD DEL PERSONAL',38),(60,'A.29','Extorsión','presión que, mediante amenazas, se ejerce sobre alguien para obligarle a obrar en determinado sentido. Ver: EBIOS: no disponible',38),(61,'A.30','Ingeniería social (picaresca)','abuso de la buena fe de las personas para que realicen actividades que interesan a un tercero. Ver: EBIOS: no disponible',38);
/*!40000 ALTER TABLE `tipo_amenaza` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_salvaguarda`
--

DROP TABLE IF EXISTS `tipo_salvaguarda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_salvaguarda` (
  `PK` int unsigned NOT NULL,
  `cod` varchar(15) DEFAULT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `descripcion` varchar(600) DEFAULT NULL,
  `fk_superior` int unsigned DEFAULT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`),
  KEY `fk_superior` (`fk_superior`),
  CONSTRAINT `tipo_salvaguarda_ibfk_1` FOREIGN KEY (`fk_superior`) REFERENCES `tipo_salvaguarda` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_salvaguarda`
--

LOCK TABLES `tipo_salvaguarda` WRITE;
/*!40000 ALTER TABLE `tipo_salvaguarda` DISABLE KEYS */;
INSERT INTO `tipo_salvaguarda` VALUES (1,'H','Protecciones Generales','',NULL),(2,'H.IA','Identificación y autenticación','',1),(3,'H.AC','Control de acceso lógico','',1),(4,'H.ST','Segregación de tareas','',1),(5,'H.IR','Gestión de incidencias','',1),(6,'H.tools','Herramientas de seguridad','',1),(7,'H.tools.AV','Herramienta contra código dañino','',1),(8,'H.tools.IDS','IDS/IPS: Herramienta de detección / prevención de intrusión','',1),(9,'H.tools.CC','Herramienta de chequeo de configuración','',1),(10,'H.tools.VA','Herramienta de análisis de vulnerabilidades','',1),(11,'H.tools.TM','Herramienta de monitorización de tráfico','',1),(12,'H.tools.DLP','DLP: Herramienta de monitorización de contenidos','',1),(13,'H.tools.LA','Herramienta para análisis de logs','',1),(14,'H.tools.HP','Honey net / honey pot','',1),(15,'H.tools.SFV','Verificación de las funciones de seguridad','',1),(16,'H.VM','Gestión de vulnerabilidades','',1),(17,'H.AU','Registro y auditoría','',1),(18,'D','Protección de la Información','',NULL),(19,'D.A','Copias de seguridad de los datos (backup)','',18),(20,'D.I','Aseguramiento de la integridad','',18),(21,'D.C','Cifrado de la información','',18),(22,'D.DS','Uso de firmas electrónicas','',18),(23,'D.TS','Uso de servicios de fechado electrónico (time stamping)','',18),(24,'K','Gestión de claves criptográficas','',NULL),(25,'K.IC','Gestión de claves de cifra de información','',24),(26,'K.DS','Gestión de claves de firma de información','',24),(27,'K.disk','Gestión de claves para contenedores criptográficos','',24),(28,'K.comms','Gestión de claves de comunicaciones','',24),(29,'K.509','Gestión de certificados','',24),(30,'S','Protección de los Servicios','',NULL),(31,'S.A','Aseguramiento de la disponibilidad','',30),(32,'S.start','Aceptación y puesta en operación','',30),(33,'S.SC','Se aplican perfiles de seguridad','',30),(34,'S.op','Explotación','',30),(35,'S.CM','Gestión de cambios (mejoras y sustituciones)','',30),(36,'S.end','Terminación','',30),(37,'S.www','Protección de servicios y aplicaciones web','',30),(38,'S.email','Protección del correo electrónico','',30),(39,'S.dir','Protección del directorio','',30),(40,'S.dns','Protección del servidor de nombres de dominio (DNS)','',30),(41,'S.TW','Teletrabajo','',30),(42,'S.voip','Voz sobre IP','',30),(43,'SW','Protección de las Aplicaciones Informáticas','',NULL),(44,'SW.A','Copias de seguridad (backup)','',43),(45,'SW.start','Puesta en producción','',43),(46,'SW.SC','Se aplican perfiles de seguridad','',43),(47,'SW.op','Explotación / Producción','',43),(48,'SW.CM','Cambios (actualizaciones y mantenimiento)','',43),(49,'SW.end','Terminación','',43),(50,'HW','Protección de los Equipos Informáticos','',NULL),(51,'HW.start','Puesta en producción','',50),(52,'HW.SC','Se aplican perfiles de seguridad','',50),(53,'HW.A','Aseguramiento de la disponibilidad','',50),(54,'HW.op','Operación HW.CM Cambios (actualizaciones y mantenimiento)','',50),(55,'HW.end','Terminación HW.PCD Informática móvil','',50),(56,'HW.print','Reproducción de documentos','',50),(57,'HW.pabx','Protección de la centralita telefónica (PABX)','',50),(58,'COM','Protección de las Comunicaciones','',NULL),(59,'COM.start','Entrada en servicio','',58),(60,'COM.SC','Se aplican perfiles de seguridad','',58),(61,'COM.A','Aseguramiento de la disponibilidad','',58),(62,'COM.aut','Autenticación del canal','',58),(63,'COM.I','Protección de la integridad de los datos intercambiados','',58),(64,'COM.C','Protección criptográfica de la confidencialidad de los datos intercambiados','',58),(65,'COM.op','Operación','',58),(66,'COM.CM','Cambios (actualizaciones y mantenimiento)','',58),(67,'COM.end','Terminación','',58),(68,'COM.internet','Internet: uso de, acceso a','',58),(69,'COM.wifi','Seguridad Wireless (WiFi)','',58),(70,'COM.mobile','Telefonía móvil','',58),(71,'COM.DS','Segregación de las redes en dominios','',58),(72,'IP','Puntos de interconexión: conexiones entre zonas de confianza','',NULL),(73,'IP.SPP','Sistema de protección perimetral','',72),(74,'IP.BS','Protección de los equipos de frontera','',72),(75,'MP','Protección de los Soportes de Información','',72),(76,'MP.A','Aseguramiento de la disponibilidad','',72),(77,'MP.IC','Protección criptográfica del contenido','',72),(78,'MP.clean','Limpieza de contenidos','',72),(79,'MP.end','Destrucción de soportes','',72),(80,'AUX','Elementos Auxiliares','',NULL),(81,'AUX.A','Aseguramiento de la disponibilidad','',80),(82,'AUX.start','Instalación','',80),(83,'AUX.power','Suministro eléctrico','',80),(84,'AUX.AC','Climatización','',80),(85,'AUX.wires','Protección del cableado','',80),(86,'L','Protección de las Instalaciones','',80),(87,'L.design','Diseño','',NULL),(88,'L.depth','Defensa en profundidad','',88),(89,'L.AC','Control de los accesos físicos','',88),(90,'L.A','Aseguramiento de la disponibilidad','',88),(91,'L.end','Terminación','',88),(92,'PS','Gestión del Personal','',NULL),(93,'PS.AT','Formación y concienciación','',92),(94,'PS.A','Aseguramiento de la disponibilidad','',92),(95,'G','Organización','',NULL),(96,'G.RM','Gestión de riesgos','',95),(97,'G.plan','Planificación de la seguridad','',95),(98,'G.exam','Inspecciones de seguridad','',95),(99,'BC','Continuidad del negocio','',NULL),(100,'BC.BIA','Análisis de impacto (BIA)','',99),(101,'BC.DRP','Plan de Recuperación de Desastres (DRP)','',99),(102,'E','Relaciones Externas','',NULL),(103,'E.1','Acuerdos para intercambio de información y software','',102),(104,'E.2','Acceso externo','',102),(105,'E.3','Servicios proporcionados por otras organizaciones','',102),(106,'E.4','Personal subcontratado','',102),(107,'NEW','Adquisición / desarrollo','',NULL),(108,'NEW.S','Servicios: Adquisición o desarrollo','',107),(109,'NEW.SW','Aplicaciones: Adquisición o desarrollo','',107),(110,'NEW.HW','Equipos: Adquisición o desarrollo','',107),(111,'NEW.COM','Comunicaciones: Adquisición o contratación','',107),(112,'NEW.MP','Soportes de Información: Adquisición','',107),(113,'NEW.C','Productos certificados o acreditados','',107);
/*!40000 ALTER TABLE `tipo_salvaguarda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `PK` int unsigned NOT NULL,
  `contrasenya` varchar(100) DEFAULT NULL,
  `permisos` bigint DEFAULT NULL,
  `fk_persona` int unsigned DEFAULT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`),
  CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`PK`) REFERENCES `persona` (`PK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `valor_criterio`
--

DROP TABLE IF EXISTS `valor_criterio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `valor_criterio` (
  `PK` int unsigned NOT NULL,
  `fk_crm` int unsigned DEFAULT NULL,
  `fk_si` int unsigned DEFAULT NULL,
  `fk_pi` int unsigned DEFAULT NULL,
  `fk_rto` int unsigned DEFAULT NULL,
  `fk_lg` int unsigned DEFAULT NULL,
  `fk_adm` int unsigned DEFAULT NULL,
  `fk_olm` int unsigned DEFAULT NULL,
  `fk_lpo` int unsigned DEFAULT NULL,
  `fk_ibl_national` int unsigned DEFAULT NULL,
  `fk_ibl_ue` int unsigned DEFAULT NULL,
  `fk_cei` int unsigned DEFAULT NULL,
  `fk_da` int unsigned DEFAULT NULL,
  `fk_po` int unsigned DEFAULT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`),
  KEY `fk_crm` (`fk_crm`),
  KEY `fk_si` (`fk_si`),
  KEY `fk_pi` (`fk_pi`),
  KEY `fk_rto` (`fk_rto`),
  KEY `fk_lg` (`fk_lg`),
  KEY `fk_adm` (`fk_adm`),
  KEY `fk_olm` (`fk_olm`),
  KEY `fk_lpo` (`fk_lpo`),
  KEY `fk_ibl_national` (`fk_ibl_national`),
  KEY `fk_ibl_ue` (`fk_ibl_ue`),
  KEY `fk_cei` (`fk_cei`),
  KEY `fk_da` (`fk_da`),
  KEY `fk_po` (`fk_po`),
  CONSTRAINT `valor_criterio_ibfk_1` FOREIGN KEY (`fk_crm`) REFERENCES `criterio_crm` (`PK`),
  CONSTRAINT `valor_criterio_ibfk_10` FOREIGN KEY (`fk_ibl_ue`) REFERENCES `criterio_ibl_ue` (`PK`),
  CONSTRAINT `valor_criterio_ibfk_11` FOREIGN KEY (`fk_cei`) REFERENCES `criterio_cei` (`PK`),
  CONSTRAINT `valor_criterio_ibfk_12` FOREIGN KEY (`fk_da`) REFERENCES `criterio_da` (`PK`),
  CONSTRAINT `valor_criterio_ibfk_13` FOREIGN KEY (`fk_po`) REFERENCES `criterio_po` (`PK`),
  CONSTRAINT `valor_criterio_ibfk_2` FOREIGN KEY (`fk_si`) REFERENCES `criterio_si` (`PK`),
  CONSTRAINT `valor_criterio_ibfk_3` FOREIGN KEY (`fk_pi`) REFERENCES `criterio_pi` (`PK`),
  CONSTRAINT `valor_criterio_ibfk_4` FOREIGN KEY (`fk_rto`) REFERENCES `criterio_rto` (`PK`),
  CONSTRAINT `valor_criterio_ibfk_5` FOREIGN KEY (`fk_lg`) REFERENCES `criterio_lg` (`PK`),
  CONSTRAINT `valor_criterio_ibfk_6` FOREIGN KEY (`fk_adm`) REFERENCES `criterio_adm` (`PK`),
  CONSTRAINT `valor_criterio_ibfk_7` FOREIGN KEY (`fk_olm`) REFERENCES `criterio_olm` (`PK`),
  CONSTRAINT `valor_criterio_ibfk_8` FOREIGN KEY (`fk_lpo`) REFERENCES `criterio_lpo` (`PK`),
  CONSTRAINT `valor_criterio_ibfk_9` FOREIGN KEY (`fk_ibl_national`) REFERENCES `criterio_ibl_national` (`PK`)
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
  `fecha_creacion` datetime DEFAULT NULL,
  `economia` double DEFAULT NULL,
  `fk_activo` int unsigned DEFAULT NULL,
  `fk_escala` int unsigned DEFAULT NULL,
  `fk_criterio` int unsigned DEFAULT NULL,
  PRIMARY KEY (`PK`),
  UNIQUE KEY `PK_UNIQUE` (`PK`),
  KEY `fk_activo` (`fk_activo`),
  KEY `fk_escala` (`fk_escala`),
  KEY `fk_criterio` (`fk_criterio`),
  CONSTRAINT `valoracion_ibfk_1` FOREIGN KEY (`fk_activo`) REFERENCES `activo` (`PK`),
  CONSTRAINT `valoracion_ibfk_2` FOREIGN KEY (`fk_escala`) REFERENCES `escala_valor` (`PK`),
  CONSTRAINT `valoracion_ibfk_3` FOREIGN KEY (`fk_criterio`) REFERENCES `valor_criterio` (`PK`)
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

-- Dump completed on 2023-10-21 17:30:26

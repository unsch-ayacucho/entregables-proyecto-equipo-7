CREATE DATABASE  IF NOT EXISTS `tesisexperienciaprofesional` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `tesisexperienciaprofesional`;
-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: tesisexperienciaprofesional
-- ------------------------------------------------------
-- Server version	8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `actadessustentacion`
--

DROP TABLE IF EXISTS `actadessustentacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `actadessustentacion` (
  `idActaDeSustentacion` int(11) NOT NULL,
  `idDocumento` int(11) NOT NULL,
  `idJuradoCalificador` int(11) NOT NULL,
  `idNotaDeSustentacion` int(11) NOT NULL,
  `codigo` varchar(8) NOT NULL,
  PRIMARY KEY (`idActaDeSustentacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `actadessustentacion`
--

LOCK TABLES `actadessustentacion` WRITE;
/*!40000 ALTER TABLE `actadessustentacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `actadessustentacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bachiller`
--

DROP TABLE IF EXISTS `bachiller`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `bachiller` (
  `codigo` varchar(8) NOT NULL,
  `dni` varchar(8) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellidoPaterno` varchar(50) NOT NULL,
  `apellidoMaterno` varchar(50) NOT NULL,
  `escuela` varchar(45) NOT NULL,
  `email` varchar(80) NOT NULL,
  `telefono` varchar(9) NOT NULL,
  `nombreCompleto` varchar(500) NOT NULL,
  PRIMARY KEY (`codigo`),
  UNIQUE KEY `codigo_UNIQUE` (`codigo`),
  UNIQUE KEY `dni_UNIQUE` (`dni`),
  UNIQUE KEY `UK13n3a6vy3gln1017e0ibyt417` (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bachiller`
--

LOCK TABLES `bachiller` WRITE;
/*!40000 ALTER TABLE `bachiller` DISABLE KEYS */;
INSERT INTO `bachiller` VALUES ('1','12345654','MARIA','FARFAN','OCHATOMA','IS','GFSF','123456789','OIMUNHGF');
/*!40000 ALTER TABLE `bachiller` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comisiondictaminadora`
--

DROP TABLE IF EXISTS `comisiondictaminadora`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `comisiondictaminadora` (
  `idComisionDictaminadora` int(11) NOT NULL,
  PRIMARY KEY (`idComisionDictaminadora`),
  UNIQUE KEY `idComisionDictaminadora_UNIQUE` (`idComisionDictaminadora`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comisiondictaminadora`
--

LOCK TABLES `comisiondictaminadora` WRITE;
/*!40000 ALTER TABLE `comisiondictaminadora` DISABLE KEYS */;
/*!40000 ALTER TABLE `comisiondictaminadora` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `consejofacultad`
--

DROP TABLE IF EXISTS `consejofacultad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `consejofacultad` (
  `idConsejoFacultad` int(11) NOT NULL,
  PRIMARY KEY (`idConsejoFacultad`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `consejofacultad`
--

LOCK TABLES `consejofacultad` WRITE;
/*!40000 ALTER TABLE `consejofacultad` DISABLE KEYS */;
/*!40000 ALTER TABLE `consejofacultad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `constanciadeaprobacion`
--

DROP TABLE IF EXISTS `constanciadeaprobacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `constanciadeaprobacion` (
  `idConstanciaDeAprobacion` int(11) NOT NULL,
  `idDocumento` int(11) NOT NULL,
  `codigo` varchar(8) NOT NULL,
  PRIMARY KEY (`idConstanciaDeAprobacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `constanciadeaprobacion`
--

LOCK TABLES `constanciadeaprobacion` WRITE;
/*!40000 ALTER TABLE `constanciadeaprobacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `constanciadeaprobacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `decano`
--

DROP TABLE IF EXISTS `decano`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `decano` (
  `dni` varchar(8) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellidoPaterno` varchar(50) NOT NULL,
  `apellidoMaterno` varchar(50) NOT NULL,
  `email` varchar(60) NOT NULL,
  `telefono` varchar(9) NOT NULL,
  `nombreCompleto` varchar(500) NOT NULL,
  PRIMARY KEY (`dni`),
  UNIQUE KEY `dni_UNIQUE` (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `decano`
--

LOCK TABLES `decano` WRITE;
/*!40000 ALTER TABLE `decano` DISABLE KEYS */;
INSERT INTO `decano` VALUES ('12345678','sas','adf','f','g','654','');
/*!40000 ALTER TABLE `decano` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dictamen`
--

DROP TABLE IF EXISTS `dictamen`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `dictamen` (
  `idDictamen` int(11) NOT NULL,
  `idDocumento` int(11) NOT NULL,
  `idCominsionDictaminadora` int(11) NOT NULL,
  PRIMARY KEY (`idDictamen`),
  UNIQUE KEY `idDictamen_UNIQUE` (`idDictamen`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dictamen`
--

LOCK TABLES `dictamen` WRITE;
/*!40000 ALTER TABLE `dictamen` DISABLE KEYS */;
/*!40000 ALTER TABLE `dictamen` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `directorescuela`
--

DROP TABLE IF EXISTS `directorescuela`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `directorescuela` (
  `dni` varchar(8) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellidoPaterno` varchar(50) NOT NULL,
  `apellidoMaterno` varchar(50) NOT NULL,
  `email` varchar(80) NOT NULL,
  `telefono` varchar(9) NOT NULL,
  PRIMARY KEY (`dni`),
  UNIQUE KEY `dni_UNIQUE` (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `directorescuela`
--

LOCK TABLES `directorescuela` WRITE;
/*!40000 ALTER TABLE `directorescuela` DISABLE KEYS */;
/*!40000 ALTER TABLE `directorescuela` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `documento`
--

DROP TABLE IF EXISTS `documento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `documento` (
  `idDocumento` int(11) NOT NULL AUTO_INCREMENT,
  `tipoDocumento` varchar(250) NOT NULL,
  `descripcion` varchar(500) NOT NULL,
  PRIMARY KEY (`idDocumento`),
  UNIQUE KEY `idResolucionDecanalI_UNIQUE` (`idDocumento`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `documento`
--

LOCK TABLES `documento` WRITE;
/*!40000 ALTER TABLE `documento` DISABLE KEYS */;
INSERT INTO `documento` VALUES (1,'SOLICITUD PARA SUSTENTACIONDE INFORME DE EXPERIENCIA PROFESIONAL','DOCUMENTO SOLICITUD DE SUSTENTACION DE INFORME DE EXPERIENCIA PROFESIONAL');
/*!40000 ALTER TABLE `documento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `juradocalificador`
--

DROP TABLE IF EXISTS `juradocalificador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `juradocalificador` (
  `idJuradoCalificador` int(11) NOT NULL,
  PRIMARY KEY (`idJuradoCalificador`),
  UNIQUE KEY `idJuradoCalificador_UNIQUE` (`idJuradoCalificador`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `juradocalificador`
--

LOCK TABLES `juradocalificador` WRITE;
/*!40000 ALTER TABLE `juradocalificador` DISABLE KEYS */;
/*!40000 ALTER TABLE `juradocalificador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `memorandomultiple`
--

DROP TABLE IF EXISTS `memorandomultiple`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `memorandomultiple` (
  `idMemorandoMultiple` int(11) NOT NULL,
  `idDocumento` int(11) NOT NULL,
  PRIMARY KEY (`idMemorandoMultiple`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `memorandomultiple`
--

LOCK TABLES `memorandomultiple` WRITE;
/*!40000 ALTER TABLE `memorandomultiple` DISABLE KEYS */;
/*!40000 ALTER TABLE `memorandomultiple` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `modulo`
--

DROP TABLE IF EXISTS `modulo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `modulo` (
  `idmodulo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `icono` varchar(20) DEFAULT NULL,
  `estado` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`idmodulo`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `modulo`
--

LOCK TABLES `modulo` WRITE;
/*!40000 ALTER TABLE `modulo` DISABLE KEYS */;
INSERT INTO `modulo` VALUES (1,'Administración','fa-th-list',1),(2,'Organiación','fa-clone',1),(3,'Administración RH','fa-globe',1),(4,'Evaluacion 360°','fa-pencil',1),(5,'Estadísticas','fa-bar-chart-o',1);
/*!40000 ALTER TABLE `modulo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `notadesustentacion`
--

DROP TABLE IF EXISTS `notadesustentacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `notadesustentacion` (
  `idNotaDeSustentacion` int(11) NOT NULL,
  `idJurado` int(11) NOT NULL,
  `codigo` varchar(8) NOT NULL,
  `Calificacion` int(2) NOT NULL,
  PRIMARY KEY (`idNotaDeSustentacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notadesustentacion`
--

LOCK TABLES `notadesustentacion` WRITE;
/*!40000 ALTER TABLE `notadesustentacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `notadesustentacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `opcion`
--

DROP TABLE IF EXISTS `opcion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `opcion` (
  `idopcion` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `estado` tinyint(4) DEFAULT NULL,
  `idsubmodulo` int(11) NOT NULL,
  PRIMARY KEY (`idopcion`),
  KEY `fk_opcion_submodulo_idx` (`idsubmodulo`),
  CONSTRAINT `fk_opcion_submodulo` FOREIGN KEY (`idsubmodulo`) REFERENCES `submodulo` (`idsubmodulo`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `opcion`
--

LOCK TABLES `opcion` WRITE;
/*!40000 ALTER TABLE `opcion` DISABLE KEYS */;
INSERT INTO `opcion` VALUES (1,'Nuevo',1,1),(2,'Editar',1,1),(3,'Cambiar estado',1,1),(4,'Eliminar',1,1),(5,'Nuevo',1,2),(6,'Editar',1,2),(7,'Nuevo',1,3),(8,'Editar',1,3),(9,'Nuevo',1,4);
/*!40000 ALTER TABLE `opcion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `perfil`
--

DROP TABLE IF EXISTS `perfil`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `perfil` (
  `idperfil` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idperfil`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `perfil`
--

LOCK TABLES `perfil` WRITE;
/*!40000 ALTER TABLE `perfil` DISABLE KEYS */;
INSERT INTO `perfil` VALUES (1,'Administrador'),(2,'Vendedor');
/*!40000 ALTER TABLE `perfil` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `perfil_opcion`
--

DROP TABLE IF EXISTS `perfil_opcion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `perfil_opcion` (
  `idperfilopcion` int(11) NOT NULL AUTO_INCREMENT,
  `estado` tinyint(4) DEFAULT NULL,
  `idperfil` int(11) NOT NULL,
  `idopcion` int(11) NOT NULL,
  PRIMARY KEY (`idperfilopcion`),
  KEY `fk_perfilopcion_perfil_idx` (`idperfil`),
  KEY `fk_perfilopcion_opcion_idx` (`idopcion`),
  CONSTRAINT `fk_perfilopcion_opcion` FOREIGN KEY (`idopcion`) REFERENCES `opcion` (`idopcion`),
  CONSTRAINT `fk_perfilopcion_perfil` FOREIGN KEY (`idperfil`) REFERENCES `perfil` (`idperfil`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `perfil_opcion`
--

LOCK TABLES `perfil_opcion` WRITE;
/*!40000 ALTER TABLE `perfil_opcion` DISABLE KEYS */;
INSERT INTO `perfil_opcion` VALUES (1,1,1,1),(2,1,1,2),(3,1,1,3),(4,1,1,4),(5,1,1,5),(6,1,1,6),(7,1,1,7),(8,1,1,8),(9,1,1,9);
/*!40000 ALTER TABLE `perfil_opcion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `presidentecomisionacademina`
--

DROP TABLE IF EXISTS `presidentecomisionacademina`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `presidentecomisionacademina` (
  `idPresidenteComisionAcademina` int(11) NOT NULL,
  PRIMARY KEY (`idPresidenteComisionAcademina`),
  UNIQUE KEY `idPresidenteComisionAcademina_UNIQUE` (`idPresidenteComisionAcademina`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `presidentecomisionacademina`
--

LOCK TABLES `presidentecomisionacademina` WRITE;
/*!40000 ALTER TABLE `presidentecomisionacademina` DISABLE KEYS */;
/*!40000 ALTER TABLE `presidentecomisionacademina` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `resoluciondecanal`
--

DROP TABLE IF EXISTS `resoluciondecanal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `resoluciondecanal` (
  `idResolucionDecanal` int(11) NOT NULL,
  `idDocumento` int(11) NOT NULL,
  PRIMARY KEY (`idResolucionDecanal`),
  UNIQUE KEY `idResolucionDecanal_UNIQUE` (`idResolucionDecanal`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `resoluciondecanal`
--

LOCK TABLES `resoluciondecanal` WRITE;
/*!40000 ALTER TABLE `resoluciondecanal` DISABLE KEYS */;
/*!40000 ALTER TABLE `resoluciondecanal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `secreatriofacultad`
--

DROP TABLE IF EXISTS `secreatriofacultad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `secreatriofacultad` (
  `dni` varchar(8) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellidoPaterno` varchar(50) NOT NULL,
  `apellidoMaterno` varchar(50) NOT NULL,
  `email` varchar(80) NOT NULL,
  `telefono` varchar(9) NOT NULL,
  `apellido_materno` varchar(50) NOT NULL,
  `apellido_paterno` varchar(50) NOT NULL,
  PRIMARY KEY (`dni`),
  UNIQUE KEY `dni_UNIQUE` (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `secreatriofacultad`
--

LOCK TABLES `secreatriofacultad` WRITE;
/*!40000 ALTER TABLE `secreatriofacultad` DISABLE KEYS */;
/*!40000 ALTER TABLE `secreatriofacultad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `solicitud`
--

DROP TABLE IF EXISTS `solicitud`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `solicitud` (
  `idSolicitud` int(11) NOT NULL,
  `idDocumento` int(11) NOT NULL,
  `codigo` varchar(8) NOT NULL,
  `dni` varchar(8) NOT NULL,
  PRIMARY KEY (`idSolicitud`),
  UNIQUE KEY `idtable1_UNIQUE` (`idSolicitud`),
  UNIQUE KEY `codigo_UNIQUE` (`codigo`),
  UNIQUE KEY `UKm50gvo8n2c7exi117c7hfpje3` (`codigo`),
  KEY `dni_idx` (`dni`),
  KEY `documento_idx` (`idDocumento`),
  CONSTRAINT `codigo` FOREIGN KEY (`codigo`) REFERENCES `bachiller` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `dni` FOREIGN KEY (`dni`) REFERENCES `decano` (`dni`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `documento` FOREIGN KEY (`idDocumento`) REFERENCES `documento` (`idDocumento`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `solicitud`
--

LOCK TABLES `solicitud` WRITE;
/*!40000 ALTER TABLE `solicitud` DISABLE KEYS */;
INSERT INTO `solicitud` VALUES (1,1,'1','12345678');
/*!40000 ALTER TABLE `solicitud` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `submodulo`
--

DROP TABLE IF EXISTS `submodulo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `submodulo` (
  `idsubmodulo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `estado` tinyint(4) DEFAULT NULL,
  `idmodulo` int(11) NOT NULL,
  PRIMARY KEY (`idsubmodulo`),
  KEY `fk_submodulo_modulo_idx` (`idmodulo`),
  CONSTRAINT `fk_submodulo_modulo` FOREIGN KEY (`idmodulo`) REFERENCES `modulo` (`idmodulo`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `submodulo`
--

LOCK TABLES `submodulo` WRITE;
/*!40000 ALTER TABLE `submodulo` DISABLE KEYS */;
INSERT INTO `submodulo` VALUES (1,'Usuarios',1,1),(2,'Perfiles',1,1),(3,'Facultades',1,2),(4,'Departamentos',1,2),(5,'Áreas',1,2),(6,'Escuelas',1,2),(7,'Perfil puesto',1,3),(8,'Cargo',1,3),(9,'Competencias',1,4),(10,'Comportamientos',1,4),(11,'Evaluaciones',1,4),(12,'Clasificación general',1,5),(13,'Clasificación por Facultad',1,5),(14,'Clasificación por Departamento',1,5),(15,'Clasificación por Escuela',1,5);
/*!40000 ALTER TABLE `submodulo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tituloprofesional`
--

DROP TABLE IF EXISTS `tituloprofesional`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tituloprofesional` (
  `idTituloProfesional` int(11) NOT NULL,
  `codigo` varchar(8) NOT NULL,
  `idResolucionDecanal` int(11) NOT NULL,
  `id_titulo_profesional` int(11) NOT NULL,
  `id_resolucion_decanal` int(11) NOT NULL,
  PRIMARY KEY (`idTituloProfesional`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tituloprofesional`
--

LOCK TABLES `tituloprofesional` WRITE;
/*!40000 ALTER TABLE `tituloprofesional` DISABLE KEYS */;
/*!40000 ALTER TABLE `tituloprofesional` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `usuario` (
  `idusuario` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `usuario` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `foto` varchar(100) DEFAULT NULL,
  `estado` tinyint(4) DEFAULT NULL,
  `ultimo_login` datetime DEFAULT NULL,
  PRIMARY KEY (`idusuario`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'admin','admin','admin',NULL,1,NULL);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario_perfil`
--

DROP TABLE IF EXISTS `usuario_perfil`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `usuario_perfil` (
  `idusuarioperfil` int(11) NOT NULL AUTO_INCREMENT,
  `estado` tinyint(4) DEFAULT NULL,
  `idusuario` int(11) NOT NULL,
  `idperfil` int(11) NOT NULL,
  PRIMARY KEY (`idusuarioperfil`),
  KEY `fk_usuarioperfil_usuario_idx` (`idusuario`),
  KEY `fk_usuarioperfil_perfil_idx` (`idperfil`),
  CONSTRAINT `fk_usuarioperfil_perfil` FOREIGN KEY (`idperfil`) REFERENCES `perfil` (`idperfil`),
  CONSTRAINT `fk_usuarioperfil_usuario` FOREIGN KEY (`idusuario`) REFERENCES `usuario` (`idusuario`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario_perfil`
--

LOCK TABLES `usuario_perfil` WRITE;
/*!40000 ALTER TABLE `usuario_perfil` DISABLE KEYS */;
INSERT INTO `usuario_perfil` VALUES (1,1,1,1);
/*!40000 ALTER TABLE `usuario_perfil` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-07-03 20:04:39

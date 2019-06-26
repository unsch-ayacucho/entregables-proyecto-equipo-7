-- MySQL Script generated by MySQL Workbench
-- Thu Jun  6 22:59:29 2019
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema tesisExperienciaProfesional
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `tesisExperienciaProfesional` ;

-- -----------------------------------------------------
-- Schema tesisExperienciaProfesional
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `tesisExperienciaProfesional` DEFAULT CHARACTER SET utf8 ;
SHOW WARNINGS;
USE `tesisExperienciaProfesional` ;

-- -----------------------------------------------------
-- Table `ActaDesSustentacion`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ActaDesSustentacion` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `ActaDesSustentacion` (
  `idActaDeSustentacion` INT NOT NULL,
  `idDocumento` INT NOT NULL,
  `idJuradoCalificador` INT NOT NULL,
  `idNotaDeSustentacion` INT NOT NULL,
  `codigo` VARCHAR(8) NOT NULL,
  PRIMARY KEY (`idActaDeSustentacion`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `Bachiller`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Bachiller` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `Bachiller` (
  `codigo` VARCHAR(8) NOT NULL,
  `dni` VARCHAR(8) NOT NULL,
  `nombre` VARCHAR(50) NOT NULL,
  `apellidoPaterno` VARCHAR(50) NOT NULL,
  `apellidoMaterno` VARCHAR(50) NOT NULL,
  `escuela` VARCHAR(45) NOT NULL,
  `email` VARCHAR(80) NOT NULL,
  `telefono` VARCHAR(9) NOT NULL,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE UNIQUE INDEX `codigo_UNIQUE` ON `Bachiller` (`codigo` ASC) VISIBLE;

SHOW WARNINGS;
CREATE UNIQUE INDEX `dni_UNIQUE` ON `Bachiller` (`dni` ASC) VISIBLE;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `ComisionDictaminadora`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ComisionDictaminadora` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `ComisionDictaminadora` (
  `idComisionDictaminadora` INT NOT NULL,
  PRIMARY KEY (`idComisionDictaminadora`))
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE UNIQUE INDEX `idComisionDictaminadora_UNIQUE` ON `ComisionDictaminadora` (`idComisionDictaminadora` ASC) VISIBLE;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `ConsejoFacultad`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ConsejoFacultad` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `ConsejoFacultad` (
  `idConsejoFacultad` INT NOT NULL,
  PRIMARY KEY (`idConsejoFacultad`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `ConstanciaDeAprobacion`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ConstanciaDeAprobacion` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `ConstanciaDeAprobacion` (
  `idConstanciaDeAprobacion` INT NOT NULL,
  `idDocumento` INT NOT NULL,
  `codigo` VARCHAR(8) NOT NULL,
  PRIMARY KEY (`idConstanciaDeAprobacion`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `Decano`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Decano` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `Decano` (
  `dni` VARCHAR(8) NOT NULL,
  `nombre` VARCHAR(50) NOT NULL,
  `apellidoPaterno` VARCHAR(50) NOT NULL,
  `apellidoMaterno` VARCHAR(50) NOT NULL,
  `email` VARCHAR(60) NOT NULL,
  `telefono` VARCHAR(9) NOT NULL,
  PRIMARY KEY (`dni`))
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE UNIQUE INDEX `dni_UNIQUE` ON `Decano` (`dni` ASC) VISIBLE;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `Dictamen`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Dictamen` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `Dictamen` (
  `idDictamen` INT NOT NULL,
  `idDocumento` INT NOT NULL,
  `idCominsionDictaminadora` INT NOT NULL,
  PRIMARY KEY (`idDictamen`))
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE UNIQUE INDEX `idDictamen_UNIQUE` ON `Dictamen` (`idDictamen` ASC) VISIBLE;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `DirectorEscuela`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `DirectorEscuela` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `DirectorEscuela` (
  `dni` VARCHAR(8) NOT NULL,
  `nombre` VARCHAR(50) NOT NULL,
  `apellidoPaterno` VARCHAR(50) NOT NULL,
  `apellidoMaterno` VARCHAR(50) NOT NULL,
  `email` VARCHAR(80) NOT NULL,
  `telefono` VARCHAR(9) NOT NULL,
  PRIMARY KEY (`dni`))
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE UNIQUE INDEX `dni_UNIQUE` ON `DirectorEscuela` (`dni` ASC) VISIBLE;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `Documento`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Documento` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `Documento` (
  `idDocumento` INT NOT NULL AUTO_INCREMENT,
  `Fecha` DATE NOT NULL,
  `hora` TIME NOT NULL,
  `tipoDocumento` VARCHAR(60) NOT NULL,
  PRIMARY KEY (`idDocumento`))
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE UNIQUE INDEX `idResolucionDecanalI_UNIQUE` ON `Documento` (`idDocumento` ASC) VISIBLE;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `JuradoCalificador`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `JuradoCalificador` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `JuradoCalificador` (
  `idJuradoCalificador` INT NOT NULL,
  PRIMARY KEY (`idJuradoCalificador`))
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE UNIQUE INDEX `idJuradoCalificador_UNIQUE` ON `JuradoCalificador` (`idJuradoCalificador` ASC) VISIBLE;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `MemorandoMultiple`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `MemorandoMultiple` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `MemorandoMultiple` (
  `idMemorandoMultiple` INT NOT NULL,
  `idDocumento` INT NOT NULL,
  PRIMARY KEY (`idMemorandoMultiple`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `NotaDeSustentacion`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `NotaDeSustentacion` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `NotaDeSustentacion` (
  `idNotaDeSustentacion` INT NOT NULL,
  `idJurado` INT NOT NULL,
  `codigo` VARCHAR(8) NOT NULL,
  `Calificacion` INT(2) NOT NULL,
  PRIMARY KEY (`idNotaDeSustentacion`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `PresidenteComisionAcademina`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `PresidenteComisionAcademina` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `PresidenteComisionAcademina` (
  `idPresidenteComisionAcademina` INT NOT NULL,
  PRIMARY KEY (`idPresidenteComisionAcademina`))
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE UNIQUE INDEX `idPresidenteComisionAcademina_UNIQUE` ON `PresidenteComisionAcademina` (`idPresidenteComisionAcademina` ASC) VISIBLE;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `ResolucionDecanal`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ResolucionDecanal` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `ResolucionDecanal` (
  `idResolucionDecanal` INT NOT NULL,
  `idDocumento` INT NOT NULL,
  PRIMARY KEY (`idResolucionDecanal`))
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE UNIQUE INDEX `idResolucionDecanal_UNIQUE` ON `ResolucionDecanal` (`idResolucionDecanal` ASC) VISIBLE;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `SecreatrioFacultad`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `SecreatrioFacultad` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `SecreatrioFacultad` (
  `dni` VARCHAR(8) NOT NULL,
  `nombre` VARCHAR(50) NOT NULL,
  `apellidoPaterno` VARCHAR(50) NOT NULL,
  `apellidoMaterno` VARCHAR(50) NOT NULL,
  `email` VARCHAR(80) NOT NULL,
  `telefono` VARCHAR(9) NOT NULL,
  PRIMARY KEY (`dni`))
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE UNIQUE INDEX `dni_UNIQUE` ON `SecreatrioFacultad` (`dni` ASC) VISIBLE;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `Solicitud`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Solicitud` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `Solicitud` (
  `idSolicitud` INT NOT NULL,
  `idDocumento` INT NOT NULL,
  `codigo` VARCHAR(8) NOT NULL,
  `dni` VARCHAR(8) NOT NULL,
  PRIMARY KEY (`idSolicitud`))
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE UNIQUE INDEX `idtable1_UNIQUE` ON `Solicitud` (`idSolicitud` ASC) VISIBLE;

SHOW WARNINGS;
CREATE UNIQUE INDEX `codigo_UNIQUE` ON `Solicitud` (`codigo` ASC) VISIBLE;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `TituloProfesional`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `TituloProfesional` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `TituloProfesional` (
  `idTituloProfesional` INT NOT NULL,
  `codigo` VARCHAR(8) NOT NULL,
  `idResolucionDecanal` INT NOT NULL,
  PRIMARY KEY (`idTituloProfesional`))
ENGINE = InnoDB;

SHOW WARNINGS;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `modulo`
--

DROP TABLE IF EXISTS `modulo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
-- Table structure for table `opcion`
--

DROP TABLE IF EXISTS `opcion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `opcion` (
  `idopcion` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `estado` tinyint(4) DEFAULT NULL,
  `idsubmodulo` int(11) NOT NULL,
  PRIMARY KEY (`idopcion`),
  KEY `fk_opcion_submodulo_idx` (`idsubmodulo`),
  CONSTRAINT `fk_opcion_submodulo` FOREIGN KEY (`idsubmodulo`) REFERENCES `submodulo` (`idsubmodulo`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `perfil_opcion` (
  `idperfilopcion` int(11) NOT NULL AUTO_INCREMENT,
  `estado` tinyint(4) DEFAULT NULL,
  `idperfil` int(11) NOT NULL,
  `idopcion` int(11) NOT NULL,
  PRIMARY KEY (`idperfilopcion`),
  KEY `fk_perfilopcion_perfil_idx` (`idperfil`),
  KEY `fk_perfilopcion_opcion_idx` (`idopcion`),
  CONSTRAINT `fk_perfilopcion_opcion` FOREIGN KEY (`idopcion`) REFERENCES `opcion` (`idopcion`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_perfilopcion_perfil` FOREIGN KEY (`idperfil`) REFERENCES `perfil` (`idperfil`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
-- Table structure for table `submodulo`
--

DROP TABLE IF EXISTS `submodulo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `submodulo` (
  `idsubmodulo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `estado` tinyint(4) DEFAULT NULL,
  `idmodulo` int(11) NOT NULL,
  PRIMARY KEY (`idsubmodulo`),
  KEY `fk_submodulo_modulo_idx` (`idmodulo`),
  CONSTRAINT `fk_submodulo_modulo` FOREIGN KEY (`idmodulo`) REFERENCES `modulo` (`idmodulo`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario_perfil` (
  `idusuarioperfil` int(11) NOT NULL AUTO_INCREMENT,
  `estado` tinyint(4) DEFAULT NULL,
  `idusuario` int(11) NOT NULL,
  `idperfil` int(11) NOT NULL,
  PRIMARY KEY (`idusuarioperfil`),
  KEY `fk_usuarioperfil_usuario_idx` (`idusuario`),
  KEY `fk_usuarioperfil_perfil_idx` (`idperfil`),
  CONSTRAINT `fk_usuarioperfil_perfil` FOREIGN KEY (`idperfil`) REFERENCES `perfil` (`idperfil`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_usuarioperfil_usuario` FOREIGN KEY (`idusuario`) REFERENCES `usuario` (`idusuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
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

-- Dump completed on 2019-06-04 14:31:45

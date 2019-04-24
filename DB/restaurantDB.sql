-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.2.18-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para restaurant
CREATE DATABASE IF NOT EXISTS `restaurant` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `restaurant`;

-- Volcando estructura para tabla restaurant.cliente
CREATE TABLE IF NOT EXISTS `cliente` (
  `IDCLIENTE` varchar(50) NOT NULL,
  `FIRSTNAME` varchar(50) DEFAULT NULL,
  `LASTNAME` varchar(50) DEFAULT NULL,
  `TELEPHONE` varchar(50) DEFAULT NULL,
  `MAIL` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`IDCLIENTE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla restaurant.cliente: ~6 rows (aproximadamente)
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` (`IDCLIENTE`, `FIRSTNAME`, `LASTNAME`, `TELEPHONE`, `MAIL`) VALUES
	('A00', 'Xavier', 'Vaca', '2324209', 'vxvaca1@gamil.com'),
	('A01', 'Santiago', 'Perez', '8642134', 'sperez@gamail.com'),
	('A02', 'Danilo', 'Lasso', '9834698', 'dlasso@gmail.com'),
	('A03', 'Kevin', 'Taday', '1598712', 'Ktaday@gmail.com'),
	('A04', 'Bryan', 'Rodriguez', '7531594', 'Brodriguez@gmail.com'),
	('A05', 'Luigi', 'Villarreal', '0985246604', 'mega777leo@hotmail.com');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;

-- Volcando estructura para tabla restaurant.menu
CREATE TABLE IF NOT EXISTS `menu` (
  `IDMENU` varchar(50) NOT NULL,
  `NAMEMENU` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`IDMENU`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla restaurant.menu: ~6 rows (aproximadamente)
/*!40000 ALTER TABLE `menu` DISABLE KEYS */;
INSERT INTO `menu` (`IDMENU`, `NAMEMENU`) VALUES
	('B00', 'ComidaSierra'),
	('B01', 'ComidaCosta'),
	('B02', 'ComidaOriente'),
	('B03', 'ComidaGalapagos'),
	('B04', 'ComidaRegional'),
	('B05', 'Oriental');
/*!40000 ALTER TABLE `menu` ENABLE KEYS */;

-- Volcando estructura para tabla restaurant.purchase
CREATE TABLE IF NOT EXISTS `purchase` (
  `idPurchase` varchar(50) NOT NULL,
  `namePurchase` varchar(50) DEFAULT NULL,
  `costPurchase` float DEFAULT NULL,
  `qualification` int(11) DEFAULT NULL,
  `tiket` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idPurchase`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla restaurant.purchase: ~10 rows (aproximadamente)
/*!40000 ALTER TABLE `purchase` DISABLE KEYS */;
INSERT INTO `purchase` (`idPurchase`, `namePurchase`, `costPurchase`, `qualification`, `tiket`) VALUES
	('P0000', 'Encebollado', 2.5, 9, 'Adr84'),
	('P0442', 'Encebollado', 2.5, 7, 'hOH13'),
	('P3366', 'Encebollado', 2.5, 7, 'J_i60'),
	('P3525', 'Encebollado', 2.5, 10, 'jN[59'),
	('P4827', 'Encebollado', 2.5, 10, '`tL95'),
	('P6232', 'Encebollado', 2.5, 7, '[Id91'),
	('P6566', 'Encebollado', 2.5, 7, '?Ds39'),
	('P6643', 'Encebollado', 2.5, 7, 'J[[02'),
	('P9013', 'Encebollado', 2.5, 7, 'F}k19'),
	('P9546', 'Encebollado', 2.5, 7, 'VlS43');
/*!40000 ALTER TABLE `purchase` ENABLE KEYS */;

-- Volcando estructura para tabla restaurant.qualification
CREATE TABLE IF NOT EXISTS `qualification` (
  `IDSAUCER` varchar(50) NOT NULL,
  `IDCLIENTE` varchar(50) DEFAULT NULL,
  `IDQUALIFICATION` varchar(50) NOT NULL,
  `RANKING` int(11) DEFAULT NULL,
  PRIMARY KEY (`IDQUALIFICATION`),
  KEY `FK1_SAUCER` (`IDSAUCER`),
  KEY `FK2_CLIENTE` (`IDCLIENTE`),
  CONSTRAINT `FK1_SAUCER` FOREIGN KEY (`IDSAUCER`) REFERENCES `saucer` (`IDSAUCER`),
  CONSTRAINT `FK2_CLIENTE` FOREIGN KEY (`IDCLIENTE`) REFERENCES `cliente` (`IDCLIENTE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla restaurant.qualification: ~5 rows (aproximadamente)
/*!40000 ALTER TABLE `qualification` DISABLE KEYS */;
INSERT INTO `qualification` (`IDSAUCER`, `IDCLIENTE`, `IDQUALIFICATION`, `RANKING`) VALUES
	('D03', 'A04', 'C00', 8),
	('D04', 'A02', 'C01', 7),
	('D01', 'A03', 'C02', 6),
	('D02', 'A01', 'C03', 9),
	('D00', 'A00', 'C04', 6);
/*!40000 ALTER TABLE `qualification` ENABLE KEYS */;

-- Volcando estructura para tabla restaurant.saucer
CREATE TABLE IF NOT EXISTS `saucer` (
  `IDSAUCER` varchar(50) NOT NULL,
  `IDMENU` varchar(50) DEFAULT NULL,
  `NAMESAUCER` varchar(50) DEFAULT NULL,
  `COSTSAUCER` float DEFAULT NULL,
  `QUALIFICATION` int(11) DEFAULT NULL,
  PRIMARY KEY (`IDSAUCER`),
  KEY `FK1_men` (`IDMENU`),
  CONSTRAINT `FK1_men` FOREIGN KEY (`IDMENU`) REFERENCES `menu` (`IDMENU`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla restaurant.saucer: ~6 rows (aproximadamente)
/*!40000 ALTER TABLE `saucer` DISABLE KEYS */;
INSERT INTO `saucer` (`IDSAUCER`, `IDMENU`, `NAMESAUCER`, `COSTSAUCER`, `QUALIFICATION`) VALUES
	('D00', 'B01', 'Encebollado', 2.5, 9),
	('D01', 'B00', 'MenestraConCarne', 3.5, 8),
	('D02', 'B01', 'CevicheCamaron', 5, 8),
	('D03', 'B02', 'MaitoDePescado', 4.5, 6),
	('D04', 'B03', 'CevichedeCanchalagua', 5, 8),
	('D05', 'B01', 'stuffed rice', 3.5, 8);
/*!40000 ALTER TABLE `saucer` ENABLE KEYS */;

-- Volcando estructura para tabla restaurant.user
CREATE TABLE IF NOT EXISTS `user` (
  `NAMEUSER` varchar(50) NOT NULL,
  `PASSUSER` varchar(50) DEFAULT NULL,
  `TYPEUSER` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`NAMEUSER`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla restaurant.user: ~7 rows (aproximadamente)
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`NAMEUSER`, `PASSUSER`, `TYPEUSER`) VALUES
	('AXEL', 'alex', 'employee'),
	('LEO', 'jeje', 'admin'),
	('Lucas', 'Ld123', 'admin'),
	('LUVISAN', 'ldvc', 'admin'),
	('MEGA7', '7568', 'admin'),
	('MRPRO', 'wait', 'employee'),
	('SKYLAN', 'xdxd', 'employee');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

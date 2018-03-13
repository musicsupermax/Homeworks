-- --------------------------------------------------------
-- Хост:                         127.0.0.1
-- Версия сервера:               5.6.26-log - MySQL Community Server (GPL)
-- Операционная система:         Win32
-- HeidiSQL Версия:              9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Дамп структуры базы данных catalog
CREATE DATABASE IF NOT EXISTS `catalog` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `catalog`;

-- Дамп структуры для таблица catalog.phones
CREATE TABLE IF NOT EXISTS `phones` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `user_id` int(5) DEFAULT NULL,
  `phone_number` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- Дамп данных таблицы catalog.phones: ~4 rows (приблизительно)
DELETE FROM `phones`;
/*!40000 ALTER TABLE `phones` DISABLE KEYS */;
INSERT INTO `phones` (`id`, `user_id`, `phone_number`) VALUES
	(1, NULL, '0959321974'),
	(2, NULL, '4567891237'),
	(3, NULL, '0543874598'),
	(4, NULL, '7564891237');
/*!40000 ALTER TABLE `phones` ENABLE KEYS */;

-- Дамп структуры для таблица catalog.rooms
CREATE TABLE IF NOT EXISTS `rooms` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `phone_id` int(5) DEFAULT NULL,
  `room_number` int(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- Дамп данных таблицы catalog.rooms: ~0 rows (приблизительно)
DELETE FROM `rooms`;
/*!40000 ALTER TABLE `rooms` DISABLE KEYS */;
INSERT INTO `rooms` (`id`, `phone_id`, `room_number`) VALUES
	(1, NULL, 24),
	(2, NULL, 301),
	(3, NULL, 97),
	(4, NULL, 76);
/*!40000 ALTER TABLE `rooms` ENABLE KEYS */;

-- Дамп структуры для таблица catalog.users
CREATE TABLE IF NOT EXISTS `users` (
  `id` smallint(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- Дамп данных таблицы catalog.users: ~4 rows (приблизительно)
DELETE FROM `users`;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`id`, `username`) VALUES
	(1, 'Din'),
	(2, 'Boss'),
	(3, 'Rocky'),
	(4, 'Shadow');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

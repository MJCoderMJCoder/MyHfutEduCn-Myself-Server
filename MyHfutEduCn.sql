CREATE DATABASE  IF NOT EXISTS `myhfuteducn` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `myhfuteducn`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: myhfuteducn
-- ------------------------------------------------------
-- Server version	5.7.21-log

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
-- Table structure for table `comment`
--

DROP TABLE IF EXISTS `comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comment` (
  `commentId` int(11) NOT NULL AUTO_INCREMENT,
  `commentTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `commentTxt` varchar(100) NOT NULL,
  `commentLog` int(11) NOT NULL,
  `commentUserName` varchar(45) NOT NULL,
  `commentUserPhone` varchar(45) NOT NULL,
  `commentUserEmail` varchar(45) NOT NULL,
  `commentUserGender` varchar(5) NOT NULL,
  `commentUserBirthday` varchar(45) NOT NULL,
  `commentUserDepart` varchar(45) NOT NULL,
  `commentUserMajor` varchar(45) NOT NULL,
  `commentUserClass` varchar(45) NOT NULL,
  `commentIsAnonymity` tinyint(1) NOT NULL,
  `replyUserName` varchar(45) DEFAULT NULL,
  `replyUserPhone` varchar(45) DEFAULT NULL,
  `replyUserEmail` varchar(45) DEFAULT NULL,
  `replyUserGender` varchar(5) DEFAULT NULL,
  `replyUserBirthday` varchar(45) DEFAULT NULL,
  `replyUserDepart` varchar(45) DEFAULT NULL,
  `replyUserMajor` varchar(45) DEFAULT NULL,
  `replyUserClass` blob,
  PRIMARY KEY (`commentId`),
  UNIQUE KEY `idcomment_UNIQUE` (`commentId`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COMMENT='评论';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comment`
--

LOCK TABLES `comment` WRITE;
/*!40000 ALTER TABLE `comment` DISABLE KEYS */;
INSERT INTO `comment` VALUES (4,'2019-02-18 03:37:53','上班时间时间????????',6,'赵文翔','17355305937','zwx19980125@qq.com','男','1998-01-25','机械工程学院','工业工程','工业工16-2班',0,'','','','','','','',''),(5,'2019-02-18 03:38:01','这种必须',6,'赵文翔','17355305937','zwx19980125@qq.com','男','1998-01-25','机械工程学院','工业工程','工业工16-2班',1,'','','','','','','',''),(6,'2019-02-18 03:38:10','身上代表',6,'赵文翔','17355305937','zwx19980125@qq.com','男','1998-01-25','机械工程学院','工业工程','工业工16-2班',1,'','','','','','','',''),(7,'2019-02-18 05:57:28','点点滴滴',6,'赵文翔','17355305937','zwx19980125@qq.com','男','1998-01-25','机械工程学院','工业工程','工业工16-2班',0,'','','','','','','',''),(8,'2019-02-18 06:27:28','标准张柏芝?',8,'赵文翔','17355305937','zwx19980125@qq.com','男','1998-01-25','机械工程学院','工业工程','工业工16-2班',1,'','','','','','','',''),(9,'2019-02-18 06:39:43','是郭德纲',8,'赵文翔','17355305937','zwx19980125@qq.com','男','1998-01-25','机械工程学院','工业工程','工业工16-2班',1,'','','','','','','',''),(10,'2019-02-18 06:42:54','知识点',7,'赵文翔','17355305937','zwx19980125@qq.com','男','1998-01-25','机械工程学院','工业工程','工业工16-2班',0,'','','','','','','',''),(11,'2019-02-18 06:43:31','张见',8,'赵文翔','17355305937','zwx19980125@qq.com','男','1998-01-25','机械工程学院','工业工程','工业工16-2班',0,'','','','','','','',''),(12,'2019-02-18 06:43:43','实际上见',8,'赵文翔','17355305937','zwx19980125@qq.com','男','1998-01-25','机械工程学院','工业工程','工业工16-2班',1,'','','','','','','',''),(13,'2019-02-18 07:32:37','学半',7,'赵文翔','17355305937','zwx19980125@qq.com','男','1998-01-25','机械工程学院','工业工程','工业工16-2班',0,'','','','','','','',''),(14,'2019-02-18 08:56:13','高红',10,'赵文翔','17355305937','zwx19980125@qq.com','男','1998-01-25','机械工程学院','工业工程','工业工16-2班',0,'','','','','','','',''),(15,'2019-02-18 09:01:36','效果嘘嘘的评论',9,'赵文翔','17355305937','zwx19980125@qq.com','男','1998-01-25','机械工程学院','工业工程','工业工16-2班',0,'','','','','','','',''),(16,'2019-02-18 09:02:19','???????',7,'赵文翔','17355305937','zwx19980125@qq.com','男','1998-01-25','机械工程学院','工业工程','工业工16-2班',1,'','','','','','','',''),(17,'2019-02-18 09:03:17','新发评论',11,'赵文翔','17355305937','zwx19980125@qq.com','男','1998-01-25','机械工程学院','工业工程','工业工16-2班',0,'','','','','','','','');
/*!40000 ALTER TABLE `comment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `log`
--

DROP TABLE IF EXISTS `log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `log` (
  `logId` int(11) NOT NULL AUTO_INCREMENT,
  `logTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `logImg` varchar(100) NOT NULL,
  `logTxt` varchar(100) NOT NULL,
  `logPraise` int(11) NOT NULL,
  `logUserName` varchar(45) NOT NULL,
  `logUserPhone` varchar(45) NOT NULL,
  `logUserEmail` varchar(45) NOT NULL,
  `logUserGender` varchar(5) NOT NULL,
  `logUserBirthday` varchar(45) NOT NULL,
  `logUserDepart` varchar(45) NOT NULL,
  `logUserMajor` varchar(45) NOT NULL,
  `logUserClass` varchar(45) NOT NULL,
  `logIsAnonymity` tinyint(1) NOT NULL,
  PRIMARY KEY (`logId`),
  UNIQUE KEY `logId_UNIQUE` (`logId`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COMMENT='发表的日志记录';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `log`
--

LOCK TABLES `log` WRITE;
/*!40000 ALTER TABLE `log` DISABLE KEYS */;
INSERT INTO `log` VALUES (6,'2019-02-18 06:15:03','upload/9264a387-6997-4128-a415-5330df63cdfe_cameraCache.jpg','?????????⛔?????????????',17,'赵文翔','17355305937','zwx19980125@qq.com','男','1998-01-25','机械工程学院','工业工程','工业工16-2班',0),(7,'2019-02-18 06:14:49','upload/f3798750-9b11-47bc-b1a0-78538c6a31f4_cameraCache.jpg','血小板行不行????????',5,'赵文翔','17355305937','zwx19980125@qq.com','男','1998-01-25','机械工程学院','工业工程','工业工16-2班',0),(8,'2019-02-18 07:13:06','upload/29461ca8-4a05-4cef-a6cd-b2bc2b33686e_cameraCache.jpg','这种必须',5,'赵文翔','17355305937','zwx19980125@qq.com','男','1998-01-25','机械工程学院','工业工程','工业工16-2班',1),(9,'2019-02-18 07:15:44','upload/07d8de53-5b16-4d7f-99d1-631103d58e28_cameraCache.jpg','效果嘘嘘',7,'赵文翔','17355305937','zwx19980125@qq.com','男','1998-01-25','机械工程学院','工业工程','工业工16-2班',0),(10,'2019-02-18 08:55:53','upload/c95ee16b-2374-4bd7-b2ee-1ba5f09c280c_cameraCache.jpg','沟沟壑壑???',3,'赵文翔','17355305937','zwx19980125@qq.com','男','1998-01-25','机械工程学院','工业工程','工业工16-2班',0),(11,'2019-02-18 09:02:59','upload/24e24d0c-357e-4556-9d66-22cc2335c5bd_cameraCache.jpg','BD大家都好???????♊⏳♎♉♋??',0,'赵文翔','17355305937','zwx19980125@qq.com','男','1998-01-25','机械工程学院','工业工程','工业工16-2班',0);
/*!40000 ALTER TABLE `log` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'myhfuteducn'
--

--
-- Dumping routines for database 'myhfuteducn'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-02-20 20:13:49

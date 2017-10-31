/*
SQLyog Enterprise v10.51 
MySQL - 5.0.67-community-nt : Database - fitment
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`fitment` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `fitment`;

/*Table structure for table `goods` */

DROP TABLE IF EXISTS `goods`;

CREATE TABLE `goods` (
  `good_id` int(11) NOT NULL auto_increment COMMENT '商品id 主键',
  `good_name` varchar(30) default NULL COMMENT '商品名称',
  `good_introduce` varchar(100) default NULL COMMENT '商品简介',
  `good_desc` varchar(2000) default NULL COMMENT '商品详细描述',
  `good_price` int(10) default NULL COMMENT '商品价格',
  `good_discount` float default NULL COMMENT '商品折扣',
  `good_img_path` varchar(150) default NULL COMMENT '商品图片链接',
  `good_ercode_path` varchar(150) default NULL COMMENT '商品二维码链接',
  `good_update` datetime default NULL COMMENT '商品上传日期',
  PRIMARY KEY  (`good_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `goods` */

insert  into `goods`(`good_id`,`good_name`,`good_introduce`,`good_desc`,`good_price`,`good_discount`,`good_img_path`,`good_ercode_path`,`good_update`) values (1,'冰箱','好用的冰箱','真的是好用的冰箱',1900,0,NULL,NULL,NULL),(2,'电动车','实用的电车','超级实用的电车',1200,0,NULL,NULL,NULL);

/*Table structure for table `t_user` */

DROP TABLE IF EXISTS `t_user`;

CREATE TABLE `t_user` (
  `id` int(11) NOT NULL auto_increment COMMENT '主键',
  `userName` varchar(30) NOT NULL COMMENT '用户账户',
  `passWord` varchar(50) NOT NULL COMMENT '用户密码',
  `status` int(11) default NULL COMMENT '用户状态',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `t_user` */

insert  into `t_user`(`id`,`userName`,`passWord`,`status`) values (1,'admin','admin',1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

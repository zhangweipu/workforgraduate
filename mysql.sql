=##create database forgradute default charset utf8;

  use forgradute;
##--菜单表
drop table if exists t_food;
CREATE TABLE `t_food` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `image_name` varchar(50) DEFAULT NULL,
  `type` varchar(20) DEFAULT NULL,
  `size` int(11) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `la` varchar(5) DEFAULT NULL,
  `detail` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

##--菜单类型表
drop table if exists t_foodtype;
create table t_foodtype(
     id int auto_increment primary key,
     type varchar(20)
);


##--每单订单列表  订单详细表
drop table if exists t_order;
CREATE TABLE `t_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `food_id` int(11) DEFAULT NULL,
  `food_name` varchar(20) DEFAULT NULL,
  `food_type` varchar(20) DEFAULT NULL,
  `food_size` int(11) DEFAULT NULL,
  `num` int(11) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  `la` varchar(5) DEFAULT NULL,
  `food_price` int(11) DEFAULT NULL,
  `orderid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
##--所有订单列表
drop table if exists t_orderid;
CREATE TABLE `t_orderid` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `time` date DEFAULT NULL,
  `stat` varchar(20) DEFAULT NULL,
  `money` int(11) DEFAULT NULL,
  `seat` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=935 DEFAULT CHARSET=utf8;
##--账目流水表
drop table if exists t_trans;
create table t_trans(
  transId int auto_increment primary key,
  type int,
  time date,
  turnover double,
  detail varchar(200)
);
##--资产表
drop table if exists t_account;
create table t_account(
   accountId int auto_increment primary key,
   amount double,
   type varchar(20)
);

##--职员表
drop table if exists t_emp;
create table t_emp(
  id int auto_increment primary key,
  name varchar(20),
  sex varchar(20),
  age int,
  duty int,
  worktime date,
  salary int,
  power int,
  password varchar(20)
);
##餐厅信息表
drop table  if exists t_resturant;
CREATE TABLE `t_resturant` (
  `id` int(11) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `begindate` date DEFAULT NULL,
  `duedate` date DEFAULT NULL,
  `auth` varchar(20) DEFAULT NULL,
  `changedate` date DEFAULT NULL,
  `detail` varchar(100) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

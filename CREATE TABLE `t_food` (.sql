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
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8

-- create table t_order(
--    id int primary key auto_increment,
-- 	 seat_mark varchar(10),
--    food_name varchar(20),
--    food_type varchar(20),
--    food_size int,
--    Food_stutas int,
--    time date
-- )

drop table if exists t_order;
CREATE TABLE `t_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `seat_mark` varchar(10) DEFAULT NULL,
  `food_name` varchar(20) DEFAULT NULL,
  `food_type` varchar(20) DEFAULT NULL,
  `food_size` int(11) DEFAULT NULL,
  `Food_stutas` int(11) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  `la` varchar(5) DEFAULT NULL,
  `food_price` int(11) DEFAULT NULL,
  `orderid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8
CREATE DATABASE  IF NOT EXISTS `weather_database`;
create user 'admin'@'localhost' identified by 'admin';
//dodanie uprawnien do bazki dla admin
CREATE TABLE `weather_data` (
	`id` int not null auto_increment,
    `lon` double not null,
    `lat` double not null,
    `date` date not null,
    `sunrise` int,
    `sunset` int,
    `temp` double not null,
    `humidity` int,
    `pressure` int,
    `main` varchar(100) not null,
    `description` varchar(1000) not null,
    primary key (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
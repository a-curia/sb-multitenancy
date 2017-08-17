CREATE SCHEMA IF NOT EXISTS `mydb1` DEFAULT CHARACTER SET utf8 ;
CREATE USER IF NOT EXISTS 'mydb1user'@'localhost' IDENTIFIED BY 'mydb1user';
GRANT ALL PRIVILEGES ON mydb1.* TO 'mydb1user'@'localhost' WITH GRANT OPTION;
CREATE TABLE IF NOT EXISTS `mydb1`.`article` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `description` VARCHAR(45) NULL,
  `price` INT NULL DEFAULT 0,
  PRIMARY KEY (`id`));
insert into mydb1.article(name, description, price) values ('myprod1', 'this is myprod1', 123);


CREATE SCHEMA IF NOT EXISTS `mydb2` DEFAULT CHARACTER SET utf8 ;
CREATE USER IF NOT EXISTS 'mydb2user'@'localhost' IDENTIFIED BY 'mydb2user';
GRANT ALL PRIVILEGES ON mydb2.* TO 'mydb2user'@'localhost' WITH GRANT OPTION;
CREATE TABLE IF NOT EXISTS `mydb2`.`article` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `description` VARCHAR(45) NULL,
  `price` INT NULL DEFAULT 0,
  PRIMARY KEY (`id`));
insert into mydb2.article(name, description, price) values ('myprod2', 'this is myprod2', 124);


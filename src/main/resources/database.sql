CREATE DATABASE  IF NOT EXISTS `pets`;
USE `pets`;

--
-- Table structure for table pet
--

DROP TABLE IF EXISTS pet;
CREATE TABLE pet (
  id int auto_increment primary key,
  name varchar(255) NOT NULL,
  age int NOT NULL,
  male boolean NOT NULL,
);

--
-- Table structure for table pet_friends
--

DROP TABLE IF EXISTS pet_friends;
CREATE TABLE pet_friends (
  pet_id int NOT NULL,
  friend_id int NOT NULL,
  PRIMARY KEY (pet_id,friend_id),
  CONSTRAINT fk_pet_id FOREIGN KEY (pet_id) REFERENCES pet (id) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT fk_friend_id FOREIGN KEY (friend_id) REFERENCES pet (id) ON DELETE CASCADE ON UPDATE CASCADE
);
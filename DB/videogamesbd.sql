-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema videogamedb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `videogamedb` ;

-- -----------------------------------------------------
-- Schema videogamedb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `videogamedb` DEFAULT CHARACTER SET utf8 ;
USE `videogamedb` ;

-- -----------------------------------------------------
-- Table `videogame`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `videogame` ;

CREATE TABLE IF NOT EXISTS `videogame` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(45) NOT NULL,
  `co_op` VARCHAR(6) NULL,
  `platform` VARCHAR(45) NULL,
  `release_date` DATE NULL,
  `developer` VARCHAR(45) NULL,
  `img_url` VARCHAR(1000) NULL,
  `multiplayer` VARCHAR(6) NULL,
  `esrb_rating` VARCHAR(1) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS specialist@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'specialist'@'localhost' IDENTIFIED BY 'specialist';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'specialist'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `videogame`
-- -----------------------------------------------------
START TRANSACTION;
USE `videogamedb`;
INSERT INTO `videogame` (`id`, `title`, `co_op`, `platform`, `release_date`, `developer`, `img_url`, `multiplayer`, `esrb_rating`) VALUES (1, 'Ghost Of Tsushima', 'True', 'Playstation', '2020-07-17', 'Sucker Punch Studio', 'https://upload.wikimedia.org/wikipedia/en/b/b6/Ghost_of_Tsushima.jpg', 'True', 'M');
INSERT INTO `videogame` (`id`, `title`, `co_op`, `platform`, `release_date`, `developer`, `img_url`, `multiplayer`, `esrb_rating`) VALUES (2, 'Horizon Zero Dawn', 'False', 'Playstation', '2017-02-28', 'Guerrilla Games', 'https://upload.wikimedia.org/wikipedia/en/9/93/Horizon_Zero_Dawn.jpg', 'False', 'T');
INSERT INTO `videogame` (`id`, `title`, `co_op`, `platform`, `release_date`, `developer`, `img_url`, `multiplayer`, `esrb_rating`) VALUES (3, 'Fallout 4 ', 'False', 'Xbox', '2015-11-10', 'Bethesda Game Studios', 'https://upload.wikimedia.org/wikipedia/en/7/70/Fallout_4_cover_art.jpg', 'False', 'M');
INSERT INTO `videogame` (`id`, `title`, `co_op`, `platform`, `release_date`, `developer`, `img_url`, `multiplayer`, `esrb_rating`) VALUES (4, 'No Mans Sky', 'True', 'PC', '2016-08-09', 'Hello Games', 'https://upload.wikimedia.org/wikipedia/en/6/67/No_Man%27s_Sky.jpg', 'True', 'E');
INSERT INTO `videogame` (`id`, `title`, `co_op`, `platform`, `release_date`, `developer`, `img_url`, `multiplayer`, `esrb_rating`) VALUES (5, 'The Last of Us', 'False', 'Playstation', '2013-06-14', 'Naughty Dog', 'https://upload.wikimedia.org/wikipedia/en/4/46/Video_Game_Cover_-_The_Last_of_Us.jpg', 'True', 'M');

COMMIT;


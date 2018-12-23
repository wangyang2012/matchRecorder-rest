CREATE SCHEMA `match_recorder` DEFAULT CHARACTER SET utf8 ;

USE `match_recorder`;


CREATE TABLE `match_recorder`.`match` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `player_1` INT NOT NULL,
  `player_2` INT NOT NULL,
  `score_1` INT NOT NULL,
  `score_2` INT NOT NULL,
  `sub_score_1_1` INT NULL,
  `sub_score_2_1` INT NULL,
  `sub_score_1_2` INT NULL,
  `sub_score_2_2` INT NULL,
  `sub_score_1_3` INT NULL,
  `sub_score_2_3` INT NULL,
  `sub_score_1_4` INT NULL,
  `sub_score_2_4` INT NULL,
  `sub_score_1_5` INT NULL,
  `sub_score_2_5` INT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  INDEX `pk_match_player_1_idx` (`player_1` ASC),
  INDEX `pk_match_player_2_idx` (`player_2` ASC),
  CONSTRAINT `pk_match_player_1`
    FOREIGN KEY (`player_1`)
    REFERENCES `match_recorder`.`player` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `pk_match_player_2`
    FOREIGN KEY (`player_2`)
    REFERENCES `match_recorder`.`player` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

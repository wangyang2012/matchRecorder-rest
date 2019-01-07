ALTER TABLE `match_recorder`.`matches`
ADD COLUMN `match_date_time` DATETIME NOT NULL;

ALTER TABLE `match_recorder`.`matches`
CHANGE COLUMN `match_date_time` `match_date_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ;

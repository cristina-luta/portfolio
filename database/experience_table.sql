CREATE TABLE `portfolio_db`.`experience` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `company_name` VARCHAR(100) NOT NULL,
  `position_name` VARCHAR(100) NOT NULL,
  `start_date` VARCHAR(15) NOT NULL,
  `end_date` VARCHAR(15) NOT NULL,
  `tasks` VARCHAR(1000) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

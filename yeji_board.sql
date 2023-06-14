DROP SCHEMA IF EXISTS `yeji_board` ;

CREATE SCHEMA IF NOT EXISTS `yeji_board` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ;
USE `yeji_board` ;

DROP TABLE IF EXISTS `board` ;

CREATE TABLE IF NOT EXISTS `board` (
	`seq` INT NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(45) NOT NULL,
    primary key (`seq`)
)
ENGINE = InnoDB;

INSERT board(name)
VALUES
('전체 공지'),('홋카이도'),('혼슈'),('시코쿠'),('큐슈');

select *
FROM board;
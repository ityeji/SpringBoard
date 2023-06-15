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

DROP TABLE IF EXISTS `sub_board` ;

CREATE TABLE IF NOT EXISTS `sub_board` (
    `name` VARCHAR(45) NOT NULL,
    `board_seq` INT NOT NULL,
    primary key (`name`, `board_seq`),
    foreign key (`board_seq`) references `board` (`seq`)
)
ENGINE = InnoDB;

INSERT sub_board(name, board_seq)
VALUES
('이런저런' , 2),('이건 어떄요?', 2),('이거 좋아요!', 2),
('이런저런' , 3),('이건 어떄요?', 3),('이거 좋아요!', 3),
('이런저런' , 4),('이건 어떄요?', 4),('이거 좋아요!', 4),
('이런저런' , 5),('이건 어떄요?', 5),('이거 좋아요!', 5);

SELECT *
FROM sub_board;
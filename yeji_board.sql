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
('홋카이도'),('혼슈'),('시코쿠'),('큐슈');

select *
FROM board;

DROP TABLE IF EXISTS `sub_board` ;

CREATE TABLE IF NOT EXISTS `sub_board` (
    `seq` INT NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(45) NOT NULL,
    primary key (`seq`)
)
ENGINE = InnoDB;

INSERT sub_board(name)
VALUES
('이런저런'),('이건 어떄요?'),('이거 좋아요!');

SELECT *
FROM sub_board;

DROP TABLE IF EXISTS `article` ;

CREATE TABLE IF NOT EXISTS `article` (
	`seq` INT NOT NULL AUTO_INCREMENT,
    `title` VARCHAR(45) NOT NULL,
    `writer` VARCHAR(45) NOT NULL,
    `content` VARCHAR(45) NOT NULL,
    `board_seq` INT NOT NULL,
    `subBoard_seq` INT NOT NULL,
    `view_cnt` INT NOT NULL,
    primary key (`seq`),
    foreign key (`board_seq`) references `board` (`seq`),
    FOREIGN KEY (`subBoard_seq`) REFERENCES `sub_board` (`seq`)
)
ENGINE = InnoDB;

INSERT article(title, writer, content, board_seq, subBoard_seq, view_cnt)
VALUES
('다카마쓰' , '우동덕후', '우동이 너무 맛있어용', 4, 1, 0),
('다카마쓰' , '우동덕후', '우동이 너무 맛있어용', 1, 1, 0),
('다카마쓰' , '스시덕후', '스시는 어때요?', 1, 2, 0);

SELECT *
FROM article;

CREATE TABLE IF NOT EXISTS `user` (
    `seq` INT NOT NULL AUTO_INCREMENT,
    `id` VARCHAR(45) NOT NULL,
    `password` VARCHAR(45) NOT NULL,
    `email` VARCHAR(45) NOT NULL,
    `nickname` VARCHAR(45) NOT NULL,
    primary key (`seq`)
)
ENGINE = InnoDB;

INSERT user(id, password, email, nickname)
VALUES
('admin','admin','wjddpwl1222@gmail.com','관리자');
CREATE TABLE IF NOT EXISTS students
(
    id         BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50)   NOT NULL,
    last_name  VARCHAR(100)  NOT NULL,
    course   VARCHAR(1000) NOT NULL,
    birth_year     INTEGER(4)      NOT NULL
);
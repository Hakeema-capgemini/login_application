-- Create User Table
CREATE TABLE  users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(100) NOT NULL,
    name VARCHAR(100),
    age INT,
    branch VARCHAR(100)
);

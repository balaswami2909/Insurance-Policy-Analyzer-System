CREATE DATABASE IF NOT EXISTS insurance_db;
USE insurance_db;

CREATE TABLE IF NOT EXISTS policies (
    id INT PRIMARY KEY AUTO_INCREMENT,
    holder_name VARCHAR(100),
    policy_type VARCHAR(100),
    start_date DATE,
    end_date DATE,
    premium DOUBLE
);
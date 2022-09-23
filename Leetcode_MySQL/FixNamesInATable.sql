# Write your MySQL query statement below
SELECT u.user_id AS user_id, CONCAT(UPPER(SUBSTRING(u.name,1,1)),LOWER(SUBSTRING(u.name,2,LENGTH(u.name)-1))) AS name
FROM Users u
ORDER BY u.user_id;


/* Write an SQL query to fix the names so that only the first character is uppercase and the rest are lowercase.

Return the result table ordered by user_id. */


// References I looked up: 

// https://www.w3schools.com/sql/trymysql.asp?filename=trysql_func_mysql_length

// https://www.w3resource.com/mysql/string-functions/mysql-substring-function.php

// https://www.w3resource.com/mysql/string-functions/mysql-upper-function.php
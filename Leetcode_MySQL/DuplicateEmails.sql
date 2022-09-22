# Write your MySQL query statement below
SELECT DISTINCT p1.email
FROM person p1, person p2
WHERE p2.email = p1.email && p2.id <> p1.id;


/*SQL Schema
Table: Person

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| id          | int     |
| email       | varchar |
+-------------+---------+
id is the primary key column for this table.
Each row of this table contains an email. The emails will not contain uppercase letters.
 

Write an SQL query to report all the duplicate emails.

Return the result table in any order.

The query result format is in the following example.*/

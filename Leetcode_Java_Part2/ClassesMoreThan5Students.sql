# Write your MySQL query statement below

SELECT co.class
FROM Courses co
GROUP BY co.class
HAVING COUNT(*) >= 5;


/* Write an SQL query to report all the classes that have at least five students.

Return the result table in any order.

The query result format is in the following example. */
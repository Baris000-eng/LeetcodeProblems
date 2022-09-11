# Write your MySQL query statement below

SELECT *
FROM Cinema c
WHERE c.description <> "boring" AND MOD(c.id,2) = 1
ORDER BY c.rating DESC;


/*Write an SQL query to report the movies with an odd-numbered ID and a description that is not "boring".

Return the result table ordered by rating in descending order.

The query result format is in the following example.*/
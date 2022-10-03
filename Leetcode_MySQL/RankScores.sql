# Write your MySQL query statement below

SELECT s.score AS "score", DENSE_RANK() OVER (ORDER BY s.score DESC) AS "rank"
FROM Scores s;

/* Write an SQL query to rank the scores. The ranking should be calculated according to the following rules:

The scores should be ranked from the highest to the lowest.
If there is a tie between two scores, both should have the same ranking.
After a tie, the next ranking number should be the next consecutive integer value. In other words, there should be no holes between ranks.
Return the result table ordered by score in descending order. */
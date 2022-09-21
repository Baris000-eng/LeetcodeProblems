# Write your MySQL query statement below

SELECT v.author_id AS id
FROM Views v
WHERE v.viewer_id = v.author_id
GROUP BY v.author_id
ORDER BY v.author_id ASC;


/* Write an SQL query to find all the authors that viewed at least one of their own articles.

Return the result table sorted by id in ascending order.

The query result format is in the following example. */
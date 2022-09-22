# Write your MySQL query statement below


SELECT f.user_id AS user_id , COUNT(f.follower_id) AS followers_count
FROM Followers f
GROUP BY f.user_id
ORDER BY f.user_id ASC;

/* Write an SQL query that will, for each user, return the number of followers.

Return the result table ordered by user_id.

The query result format is in the following example. */
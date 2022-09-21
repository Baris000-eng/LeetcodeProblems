# Write your MySQL query statement below

SELECT act.player_id , MIN(act.event_date) AS first_login
FROM Activity act
GROUP BY act.player_id;



/* Write an SQL query to report the first login date for each player.

Return the result table in any order.

The query result format is in the following example. */
# Write your MySQL query statement below

SELECT l.user_id, MAX(l.time_stamp) AS last_stamp
FROM Logins l
WHERE YEAR(l.time_stamp) = 2020
GROUP BY l.user_id;

/*Write an SQL query to report the latest login for all users in the year 2020. Do not include the users who did not login in 2020.*/
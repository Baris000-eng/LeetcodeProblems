# Write your MySQL query statement below


SELECT u.user_id AS buyer_id, u.join_date, COUNT(o.order_date) AS orders_in_2019
FROM Users u
LEFT JOIN Orders o
ON o.buyer_id = u.user_id AND SUBSTRING_INDEX(o.order_date, '-', 1) = "2019"
GROUP BY u.user_id
ORDER BY u.user_id;


/* Write an SQL query to find for each user, the join date and the number of orders they made as a buyer in 2019.

Return the result table in any order.

The query result format is in the following example. */
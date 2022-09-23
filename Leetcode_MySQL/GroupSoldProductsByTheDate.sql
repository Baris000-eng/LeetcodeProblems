# Write your MySQL query statement below



SELECT a.sell_date AS sell_date, COUNT(DISTINCT a.product) AS num_sold, GROUP_CONCAT(DISTINCT a.product ORDER BY a.product ASC) AS products
FROM Activities a
GROUP BY a.sell_date;


/* Write an SQL query to find for each date the number of different products sold and their names.

The sold products names for each date should be sorted lexicographically.

Return the result table ordered by sell_date. */


# Write your MySQL query statement below
SELECT ord.customer_number 
FROM Orders ord
GROUP BY ord.customer_number
ORDER BY COUNT(ord.order_number) DESC
LIMIT 1;

/*Write an SQL query to find the customer_number for the customer who has placed the largest number of orders.*/
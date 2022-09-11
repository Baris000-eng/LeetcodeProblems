# Write your MySQL query statement below


SELECT u.name AS name, SUM(t.amount) AS balance
FROM Users u
JOIN Transactions t
ON t.account = u.account
GROUP BY u.account
HAVING balance >= 10000;





/*Write an SQL query to report the name and balance of users with a balance higher than 10000. The balance of an account is equal to the sum of the amounts of all transactions involving that account.

Return the result table in any order.

The query result format is in the following example.*/
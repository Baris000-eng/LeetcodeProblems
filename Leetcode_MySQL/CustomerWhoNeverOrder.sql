# Write your MySQL query statement below


SELECT c.name AS Customers FROM Customers c WHERE c.id NOT IN
(SELECT o.customerId FROM Orders o);


/*Write an SQL query to report all customers who never order anything.

Return the result table in any order.*/
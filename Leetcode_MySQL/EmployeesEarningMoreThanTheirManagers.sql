# Write your MySQL query statement below

SELECT emp1.name AS Employee
FROM Employee emp1, Employee emp2
WHERE emp1.salary > emp2.salary AND emp1.managerId = emp2.id;

/*Write an SQL query to find the employees who earn more than their managers.

Return the result table in any order.

The query result format is in the following example.*/

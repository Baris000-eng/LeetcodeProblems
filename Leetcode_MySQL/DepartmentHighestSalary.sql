SELECT dep.name AS Department, 
emp.name AS Employee, 
emp.salary AS Salary
FROM Employee emp 
JOIN Department dep 
ON emp.departmentId=dep.id 
where emp.salary = (SELECT MAX(e.salary) FROM Employee e WHERE e.departmentId=dep.id);


/* Write an SQL query to find employees who have the highest salary in each of the departments.

Return the result table in any order.

The query result format is in the following example.*/
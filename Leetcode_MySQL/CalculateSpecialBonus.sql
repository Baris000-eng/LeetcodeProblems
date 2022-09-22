# Write your MySQL query statement below
select emp.employee_id AS employee_id,
CASE WHEN MOD(emp.employee_id,2)=1 AND emp.name NOT LIKE "M%" THEN emp.salary
ELSE 0
END AS bonus
FROM Employees emp
ORDER BY emp.employee_id;


/* Write an SQL query to calculate the bonus of each employee. The bonus of an employee is 100% of their salary if the ID of the employee is an odd number and the employee name does not start with the character 'M'. The bonus of an employee is 0 otherwise.

Return the result table ordered by employee_id.

The query result format is in the following example. */
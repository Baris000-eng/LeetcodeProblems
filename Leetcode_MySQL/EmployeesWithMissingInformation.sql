# Write your MySQL query statement below

SELECT sa.employee_id FROM Salaries sa
WHERE sa.employee_id NOT IN (SELECT em.employee_id FROM Employees em)
UNION
SELECT emp.employee_id FROM Employees emp
WHERE emp.employee_id NOT IN (SELECT sal.employee_id FROM Salaries sal)
ORDER BY employee_id;


/* Write an SQL query to report the IDs of all the employees with missing information. The information of an employee is missing if:

The employee's name is missing, or
The employee's salary is missing.
Return the result table ordered by employee_id in ascending order.

The query result format is in the following example. */
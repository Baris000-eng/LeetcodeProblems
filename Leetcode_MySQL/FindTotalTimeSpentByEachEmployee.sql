# Write your MySQL query statement below

SELECT e.event_day AS day, e.emp_id AS emp_id, SUM(e.out_time-e.in_time) as total_time
FROM employees e
GROUP BY e.emp_id,e.event_day;



/*Write an SQL query to calculate the total time in minutes spent by each employee on each day at the office. Note that within one day, an employee can enter and leave more than once. The time spent in the office for a single entry is out_time - in_time.

Return the result table in any order.

The query result format is in the following example.*/
# Write your MySQL query statement below


SELECT c.name AS name FROM CUSTOMER c WHERE c.referee_id IS NULL OR c.referee_id <> 2; 







/* Write an SQL query to report the names of the customer that are not referred by the customer with id = 2.

Return the result table in any order.

The query result format is in the following example. */
# Write your MySQL query statement below

SELECT ds.date_id AS date_id , ds.make_name AS make_name , COUNT(DISTINCT ds.lead_id) AS unique_leads, COUNT(DISTINCT ds.partner_id) AS unique_partners
FROM DailySales ds
GROUP BY ds.date_id, ds.make_name;



/* Write an SQL query that will, for each date_id and make_name, return the number of distinct lead_id's and distinct partner_id's.

Return the result table in any order. */
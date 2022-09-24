# Write your MySQL query statement below

SELECT patient.patient_id, patient.patient_name, patient.conditions 
FROM Patients patient
WHERE patient.conditions LIKE '% DIAB1%' OR patient.conditions LIKE 'DIAB1%';


/* Write an SQL query to report the patient_id, patient_name all conditions of patients who have Type I Diabetes. Type I Diabetes always starts with DIAB1 prefix

Return the result table in any order.

The query result format is in the following example. */
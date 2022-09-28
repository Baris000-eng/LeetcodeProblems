DELETE secondPerson FROM PERSON firstPerson, PERSON secondPerson 
WHERE firstPerson.email=secondPerson.email AND firstPerson.id<secondPerson.id;

/* Write an SQL query to delete all the duplicate emails, keeping only one unique email with the smallest id. Note that you are supposed to write a DELETE statement and not a SELECT one.

After running your script, the answer shown is the Person table. The driver will first compile and run your piece of code and then show the Person table. The final order of the Person table does not matter.

The query result format is in the following example. */


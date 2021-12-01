REM   Script: SQL_Activity3
REM   first query 

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

Describ salesman



---Activity 2

---In this activity, we will be inserting values in the table created in the last activity.
---Add the following values to the salesman table.

-- salesman_id | salesman_name  |   salesman_city  | commission
---------------+----------------+------------------+------------
--      5001 | James Hoog     | New York         |    15
--      5002 | Nail Knite     | Paris            |    13
--      5005 | Pit Alex       | London           |    11
--      5006 | McLyon         | Paris            |    14
--      5007 | Paul Adam      | Rome             |    13
--      5003 | Lauson Hen     | San Jose         |    12

-------------------------------------------------------------------------------------------


INSERT INTO salesman VALUES(5001, 'James Hoog', 'New York', 15);
INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;


--Activity 3

--In this activity, we will be writing different SELECT statements with WHERE clause.
--    Write SELECT statements for the following outputs:
--   		 Show data from the salesman_id and salesman_city columns

--------------------------------------------------------------------------------------------------------

Select salesman_id, salesman_name from salesman;

--Activity 3

--In this activity, we will be writing different SELECT statements with WHERE clause.
--	Write SELECT statements for the following outputs:
--		Show data of salesman from Paris


select * from salesman where SALESMAN_CITY='Paris';


--Activity 3

--In this activity, we will be writing different SELECT statements with WHERE clause.
--Write SELECT statements for the following outputs:
--		Show salesman_id and commission of Paul Adam

select SALESMAN_ID, COMMISSION from salesman where SALESMAN_NAME = 'Paul Adam';


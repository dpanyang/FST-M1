REM   Script: SQL_Activity4
REM   script for Activity 4 

Describ Salesman


CREATE TABLE salesman (  
    salesman_id int,  
    salesman_name varchar2(32),  
    salesman_city varchar2(32),  
    commission int  
);

Describ Salesman


INSERT INTO salesman VALUES(5001, 'James Hoog', 'New York', 15);

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT INTO salesman VALUES(5005, 'Pit Alex', 'London', 11);

INSERT INTO salesman VALUES(5006, 'McLyon', 'Paris', 14);

INSERT INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) ;

INSERT INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) ;



----------------------------------------------------------------------------------------------



--Activity 4

--In this activity, we will be modifying the salesman table.

--    Add a new column - grade - to the salesman table. The grade will be integer values.
--    Set the value in the grade column for everyone to 100.
--    Use SELECT command to display the results.

----------------------------------------------------------------------------------------------

ALTER TABLE SALESMAN ADD GRAD int;

UPDATE SALESMAN SET grad=100;

SELECT * FROM SALESMAN;

----------------------------------------------------------------------------------------------
--Activity 5

---In this activity we will be updating the data in the salesman table.

---    Update the grade score of salesmen from Rome to 200.
---    Update the grade score of James Hoog to 300.
---    Update the name McLyon to Pierre.


-------------------------------------------------------------------------------------------



UPDATE SALESMAN SET GRAD=200 WHERE salesman_city='Rome';

UPDATE SALESMAN SET GRAD=300 WHERE salesman_name='James Hoog';

UPDATE SALESMAN SET salesman_name='Pierre' WHERE salesman_name='McLyon';

Select * from salesman;


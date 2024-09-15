SELECT 'Low Salary' AS category, 
    SUM(if(income<20000,1,0)) AS accounts_count
FROM Accounts
UNION
SELECT 'Average Salary', 
   SUM(if(income>=20000 and income<=50000,1,0))
FROM Accounts
UNION
SELECT 'High Salary', 
   SUM(if(income>50000,1,0))
FROM Accounts;
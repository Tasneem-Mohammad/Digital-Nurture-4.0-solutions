INSERT INTO Accounts VALUES (101, 'Alice', 'Savings', 1000);
INSERT INTO Accounts VALUES (102, 'Bob', 'Savings', 2500);
INSERT INTO Accounts VALUES (103, 'Carol', 'Checking', 3000);
COMMIT;

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
   UPDATE Accounts
   SET Balance = Balance + (Balance * 0.01)
   WHERE AccountType = 'Savings';
   
   COMMIT;
END;
/
EXEC ProcessMonthlyInterest;
SELECT * FROM Accounts;
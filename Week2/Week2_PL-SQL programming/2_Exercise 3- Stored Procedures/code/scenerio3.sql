CREATE OR REPLACE PROCEDURE TransferFunds (
   from_account IN NUMBER,
   to_account   IN NUMBER,
   amount       IN NUMBER
) IS
   from_balance NUMBER;
BEGIN
   -- Lock and check source balance
   SELECT Balance INTO from_balance
   FROM Accounts
   WHERE AccountID = from_account
   FOR UPDATE;

   IF from_balance < amount THEN
      RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account.');
   END IF;

   -- Deduct from sender
   UPDATE Accounts
   SET Balance = Balance - amount
   WHERE AccountID = from_account;

   -- Credit receiver
   UPDATE Accounts
   SET Balance = Balance + amount
   WHERE AccountID = to_account;

   COMMIT;
END;
/


EXEC TransferFunds(102, 101, 500);
SELECT * FROM Accounts;
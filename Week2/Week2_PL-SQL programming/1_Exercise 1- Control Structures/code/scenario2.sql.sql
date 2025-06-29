BEGIN
   FOR cust IN (SELECT CustomerID, Balance FROM CUSTOMERS) LOOP
      IF cust.Balance > 10000 THEN
         UPDATE CUSTOMERS
         SET IsVIP = 'TRUE'
         WHERE CustomerID = cust.CustomerID;
      END IF;
   END LOOP;
   COMMIT;
END;
SELECT * FROM CUSTOMERS;
BEGIN
   FOR cust_rec IN (SELECT CustomerID, Age, InterestRate FROM CUSTOMERS) LOOP
      IF cust_rec.Age > 60 THEN
         UPDATE CUSTOMERS
         SET InterestRate = cust_rec.InterestRate - 1
         WHERE CustomerID = cust_rec.CustomerID;
      END IF;
   END LOOP;
   COMMIT;
END;
SELECT * FROM CUSTOMERS;
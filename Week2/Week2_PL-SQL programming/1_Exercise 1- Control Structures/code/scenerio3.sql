DECLARE
   v_name VARCHAR2(100);
BEGIN
   FOR loan IN (
      SELECT l.LoanID, l.CustomerID, l.DueDate
      FROM LOANS l
      WHERE l.DueDate BETWEEN SYSDATE AND SYSDATE + 30
   ) LOOP
      SELECT Name INTO v_name FROM CUSTOMERS WHERE CustomerID = loan.CustomerID;

      DBMS_OUTPUT.PUT_LINE('Reminder: Loan ' || loan.LoanID ||
                           ' for customer ' || v_name || 
                           ' is due on ' || TO_CHAR(loan.DueDate, 'DD-MON-YYYY'));
   END LOOP;
END;
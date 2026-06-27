```
Scenario 1: Apply 1% Discount to Loan Interest Rate
The bank wants to Apply a 1% discount to loan interest rates for customers above 60 years of age.
solution```

DECLARE
    CURSOR cust_cur IS
        SELECT CustomerID, Age
        FROM Customers;

BEGIN
    FOR cust IN cust_cur LOOP

        IF cust.Age > 60 THEN

            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = cust.CustomerID;

        END IF;

    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Interest rate updated successfully.');

END;
/


```
# Scenario 2: Promote Customers to VIP
If customer's balance is greater than 10000, set IsVIP = TRU.
Solution

```
DECLARE

    CURSOR cust_cur IS
        SELECT CustomerID, Balance
        FROM Customers;

BEGIN

    FOR cust IN cust_cur LOOP

        IF cust.Balance > 10000 THEN

            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = cust.CustomerID;

        END IF;

    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('VIP Customers Updated.');

END;
/


```#Scenario 3: Loan Due Reminder
Display reminder messages for customers whose loans are due Within the next 30 days.
solution```


DECLARE

    CURSOR loan_cur IS
        SELECT CustomerID, LoanID, DueDate
        FROM Loans
        WHERE DueDate BETWEEN SYSDATE AND SYSDATE + 30;

BEGIN

    FOR loan IN loan_cur LOOP

        DBMS_OUTPUT.PUT_LINE('Reminder: Customer '|| loan.CustomerID|| ' Loan '|| loan.LoanID|| ' is due on '
            || loan.DueDate
        );

    END LOOP;

END;
/


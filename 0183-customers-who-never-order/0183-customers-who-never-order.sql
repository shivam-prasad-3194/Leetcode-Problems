# Write your MySQL query statement below
-- Using subqueries
SELECT name AS Customers 
FROM Customers
WHERE id NOT IN(
    SELECT customerId 
    FROM Orders
);
# Write your MySQL query statement below
SELECT ( 
    SELECT salary 
    FROM Employee
    GROUP BY salary
    ORDER BY salary DESC
    LIMIT 1 OFFSET 1    -- This skips the highest salary and returns the second one
    ) AS SecondHighestSalary;

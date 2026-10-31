
SELECT eU.unique_id, e.name
FROM Employees e LEFT JOIN EmployeeUNI eU
ON e.id = eU.id;
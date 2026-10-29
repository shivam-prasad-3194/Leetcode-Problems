# Write your MySQL query statement below

-- The outer SELECT turns an empty 0-row result into a 1-row result containing NULL
SELECT(
    SELECT num FROM MyNumbers
    GROUP BY num
    HAVING COUNT(num) = 1
    ORDER BY num DESC
    LIMIT 1
) AS num;
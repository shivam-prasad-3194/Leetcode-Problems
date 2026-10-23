# Write your MySQL query statement below
SELECT score, DENSE_RANK() OVER (ORDER BY score DESC) AS `rank`
FROM Scores;

-- The DENSE_RANK() function assigns a consecutive integer rank to each row in a sorted group, giving identical values the same rank without leaving any gaps in the numbering sequence (e.g., 1, 2, 2, 3).
SELECT 
    count(*) 
FROM employee AS e JOIN project AS p ON e.project_id = p.project_id 
WHERE p.name IN (
    SELECT name FROM project p WHERE p.project_id IN (
        SELECT project_id FROM employee GROUP BY project_id HAVING count(*) < 2
    )
);

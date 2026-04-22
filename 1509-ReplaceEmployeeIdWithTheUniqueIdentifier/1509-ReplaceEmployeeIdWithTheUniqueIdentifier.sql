-- Last updated: 4/22/2026, 3:45:05 PM
# Write your MySQL query statement below
select unique_id,name
from employees
left join employeeuni 
on employees.id=employeeuni.id


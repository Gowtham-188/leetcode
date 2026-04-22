-- Last updated: 4/22/2026, 3:47:34 PM
# Write your MySQL query statement below

select c.name  as customers
from  customers as c left join orders  as o
on c.id = o.customerId 
 where o.id is null;



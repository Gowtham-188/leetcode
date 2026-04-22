-- Last updated: 4/22/2026, 3:47:31 PM
# Write your MySQL query statement below

select today.id
from weather yesterday cross join weather today

where dateDiff(today.recordDate,yesterday.recordDate)=1

and today.temperature > yesterday.temperature ;


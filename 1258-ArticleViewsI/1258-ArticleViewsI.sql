-- Last updated: 4/22/2026, 3:45:48 PM
# Write your MySQL query statement below
select distinct author_id as id
from views
where author_id=viewer_id
order by id;


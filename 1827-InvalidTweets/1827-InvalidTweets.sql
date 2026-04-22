-- Last updated: 4/22/2026, 3:44:36 PM
# Write your MySQL query statement below

select tweet_id

from tweets

where  length(content)> 15;

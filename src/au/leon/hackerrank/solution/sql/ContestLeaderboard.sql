/*
 * @author Leon Wang
 * @email seasparta618@gmail.com, dev.leon618@gmail.com
 * @question-url https://www.hackerrank.com/challenges/contest-leaderboard/problem
 */

set sql_mode = '';
select hackers.hacker_id, hackers.name, sum(grouped_submission.max_score) as total_score from
hackers
inner join
(select hacker_id, challenge_id, max(score) as max_score
from 
submissions
group by challenge_id,hacker_id) as grouped_submission
on hackers.hacker_id = grouped_submission.hacker_id
group by hackers.hacker_id
having total_score > 0
order by total_score desc, hackers.hacker_id asc;
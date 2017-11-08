SELECT DISTINCT u.user_info_id uuser_info_id,t.user_info_id ttuser_info_id,u.user_name,
t.work_years,t.join_date,t.ms_count_sum,t.current_place,t.pq_place,t.xm_date_end
 FROM t_zy_res_details t INNER JOIN t_user_info u ON t.user_info_id = u.user_info_id
  WHERE t.type_id = '01' order by u.user_info_id asc
  
  
  
  
select t.*,u.user_name 

select u.user_info_id uuser_info_id,t.user_info_id ttuser_info_id,u.user_name,
t.work_years,t.join_date,t.ms_count_sum,t.current_place,t.pq_place,t.xm_date_end
from t_zy_res_details t 
inner join t_user_info u on t.user_info_id = u.user_info_id  
where t.zy_res_id = (select zy_res_id from t_zy_res order by date desc limit 1) 
and t.type_id = 1
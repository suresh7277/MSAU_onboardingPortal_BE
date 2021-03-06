package com.msau.onboard.repository;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("trendrepo")
@Transactional
public class trendrepo {
	@Autowired
    JdbcTemplate jdbcTemplate;

   
    public List<Map<String, Object>> getCountLoc() {
        String SQL = "SELECT job_location as name , count(id) as value from onboardees group by job_location ";
        return jdbcTemplate.queryForList(SQL);
        
    }


	public List<Map<String, Object>> getCountSkills() {
		String SQL = "SELECT skills as name , count(id) as value from onboardees group by skills ";
        return jdbcTemplate.queryForList(SQL);
		
	}

	public List<Map<String, Object>> getCountBGC() {
		String SQL = "SELECT bgc_status as name , count(id) as value from onboardees group by bgc_status ";
        return jdbcTemplate.queryForList(SQL);
	}

	public List<Map<String, Object>> getCountOnboarding() {
		String SQL = "SELECT onboarding_status as name , count(id) as value from onboardees group by onboarding_status ";
        return jdbcTemplate.queryForList(SQL);
	}
	public List<Map<String, Object>> getCountjobRole() {
		String SQL = "SELECT job_role as name , count(id) as value from onboardees group by job_role ";
        return jdbcTemplate.queryForList(SQL);
	}
}

package com.msau.onboard.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msau.onboard.repository.trendrepo;

@RestController
@RequestMapping("/trends")
public class ForTrends {
	@Autowired
    trendrepo trendsRepository;

    @GetMapping("/getLocation")
    public List<Map<String, Object>> getCountLoc()
    {
    	List<Map<String, Object>> list = trendsRepository.getCountLoc();
        return list;
    }
    
    @GetMapping("/getSkills")
    public List<Map<String, Object>> getCountSkills()
    {
    	List<Map<String, Object>> list = trendsRepository.getCountSkills();
        return list;
    }
    
    @GetMapping("/getBGC")
    public List<Map<String, Object>> getCountBGC()
    {
    	List<Map<String, Object>> list = trendsRepository.getCountBGC();
        return list;
    }
    
    @GetMapping("/getOnboarding")
    public List<Map<String, Object>> getCountOnboarding()
    {
    	List<Map<String, Object>> list = trendsRepository.getCountOnboarding();
        return list;
    }
    @GetMapping("/getjobRole")
    public List<Map<String, Object>> getCountjobRole()
    {
    	List<Map<String, Object>> list = trendsRepository.getCountjobRole();
        return list;
    }
}

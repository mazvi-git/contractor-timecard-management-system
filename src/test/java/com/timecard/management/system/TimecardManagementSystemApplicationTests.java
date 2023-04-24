package com.timecard.management.system;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.timecard.management.system.dto.JobRepo;
import com.timecard.management.system.models.Job;
//import org.junit.Test;


@SpringBootTest
class TimecardManagementSystemApplicationTests {
	@Autowired
	JobRepo jobRepo;
	
	
	@Test
	void contextLoads() {
	}
	
	@Test 
	public void listJobs() {
		Job j = new Job();
		j.setDescription("Plumbing job");
		j.setJobName("Plumber");
		j.setHourlyRate(32.0);
		j.setMaxHoursPerDay(6);
		
		jobRepo.save(j);
	  
		//jobRepo.findAll();
	  
		System.out.println("data has been stord in db");
	}
	 
}

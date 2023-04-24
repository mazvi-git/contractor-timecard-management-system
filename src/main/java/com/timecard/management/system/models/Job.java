package com.timecard.management.system.models;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name="job")
@Getter
@Setter
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id")
    private Long job_idd;

    @Column(name = "jobName")
    private String jobName;

    @Column(name = "desription")
    private String description;

    @Column(name = "hourlyRate")
    private double hourlyRate;

    @Column(name = "maxHoursPerDay")
    private int maxHoursPerDay;


    public Job() {

    }


	public Job(String jobName, String description, double hourlyRate, int maxHoursPerDay) {
		this.jobName = jobName;
		this.description = description;
		this.hourlyRate = hourlyRate;
		this.maxHoursPerDay = maxHoursPerDay;
	}

}



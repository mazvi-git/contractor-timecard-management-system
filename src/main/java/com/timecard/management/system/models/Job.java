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
    @Column(name="job_id")
    private Long id;

    @Column(name="jobName")
    private String jobName;

    @Column(name="desription")
    private String description;

    @Column(name="hourlyRate")
    private double hourlyRate;

    @Column(name="maxHoursPerDay")
    private int maxHoursPerDay;
}

package com.timecard.management.system.dto;

import com.timecard.management.system.models.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepo extends JpaRepository<Job, Long> {
}

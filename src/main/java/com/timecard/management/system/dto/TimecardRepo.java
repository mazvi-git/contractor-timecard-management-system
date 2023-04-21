package com.timecard.management.system.dto;

import com.timecard.management.system.models.Timecard;
import org.springframework.data.jpa.repository.JpaRepository;

interface TimecardRepo extends JpaRepository<Timecard, Long>  {
}

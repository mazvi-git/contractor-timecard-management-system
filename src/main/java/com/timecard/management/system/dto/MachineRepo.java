package com.timecard.management.system.dto;

import com.timecard.management.system.models.Machine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MachineRepo extends JpaRepository<Machine, Long> {
}

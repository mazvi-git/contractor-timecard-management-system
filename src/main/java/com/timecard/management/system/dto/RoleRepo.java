package com.timecard.management.system.dto;

import com.timecard.management.system.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
}

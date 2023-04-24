package com.timecard.management.system.dto;

import org.springframework.data.jpa.repository.JpaRepository;
import com.timecard.management.system.models.User;

interface UserRepo extends JpaRepository<User, Long> {
}

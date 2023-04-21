package com.timecard.management.system.dto;

import com.timecard.management.system.models.Site;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SiteRepo extends JpaRepository<Site, Long> {
}

package com.jio.leadmanagement.repository;

import com.jio.leadmanagement.domain.Lead;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Lead entity.
 */
@SuppressWarnings("unused")
@Repository
public interface LeadRepository extends JpaRepository<Lead, Long> {}

package com.jio.leadmanagement.service.mapper;

import com.jio.leadmanagement.domain.Lead;
import com.jio.leadmanagement.service.dto.LeadDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Lead} and its DTO {@link LeadDTO}.
 */
@Mapper(componentModel = "spring")
public interface LeadMapper extends EntityMapper<LeadDTO, Lead> {}

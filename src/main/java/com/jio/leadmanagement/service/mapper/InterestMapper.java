package com.jio.leadmanagement.service.mapper;

import com.jio.leadmanagement.domain.Interest;
import com.jio.leadmanagement.domain.Lead;
import com.jio.leadmanagement.service.dto.InterestDTO;
import com.jio.leadmanagement.service.dto.LeadDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Interest} and its DTO {@link InterestDTO}.
 */
@Mapper(componentModel = "spring")
public interface InterestMapper extends EntityMapper<InterestDTO, Interest> {
    @Mapping(target = "lead", source = "lead", qualifiedByName = "leadId")
    InterestDTO toDto(Interest s);

    @Named("leadId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    LeadDTO toDtoLeadId(Lead lead);
}

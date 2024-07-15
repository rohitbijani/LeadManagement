package com.jio.leadmanagement.service.impl;

import com.jio.leadmanagement.domain.Interest;
import com.jio.leadmanagement.repository.InterestRepository;
import com.jio.leadmanagement.service.InterestService;
import com.jio.leadmanagement.service.dto.InterestDTO;
import com.jio.leadmanagement.service.mapper.InterestMapper;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link com.jio.leadmanagement.domain.Interest}.
 */
@Service
@Transactional
public class InterestServiceImpl implements InterestService {

    private static final Logger log = LoggerFactory.getLogger(InterestServiceImpl.class);

    private final InterestRepository interestRepository;

    private final InterestMapper interestMapper;

    public InterestServiceImpl(InterestRepository interestRepository, InterestMapper interestMapper) {
        this.interestRepository = interestRepository;
        this.interestMapper = interestMapper;
    }

    @Override
    public InterestDTO save(InterestDTO interestDTO) {
        log.debug("Request to save Interest : {}", interestDTO);
        Interest interest = interestMapper.toEntity(interestDTO);
        interest = interestRepository.save(interest);
        return interestMapper.toDto(interest);
    }

    @Override
    public InterestDTO update(InterestDTO interestDTO) {
        log.debug("Request to update Interest : {}", interestDTO);
        Interest interest = interestMapper.toEntity(interestDTO);
        interest = interestRepository.save(interest);
        return interestMapper.toDto(interest);
    }

    @Override
    public Optional<InterestDTO> partialUpdate(InterestDTO interestDTO) {
        log.debug("Request to partially update Interest : {}", interestDTO);

        return interestRepository
            .findById(interestDTO.getId())
            .map(existingInterest -> {
                interestMapper.partialUpdate(existingInterest, interestDTO);

                return existingInterest;
            })
            .map(interestRepository::save)
            .map(interestMapper::toDto);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<InterestDTO> findAll(Pageable pageable) {
        log.debug("Request to get all Interests");
        return interestRepository.findAll(pageable).map(interestMapper::toDto);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<InterestDTO> findOne(Long id) {
        log.debug("Request to get Interest : {}", id);
        return interestRepository.findById(id).map(interestMapper::toDto);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Interest : {}", id);
        interestRepository.deleteById(id);
    }
}

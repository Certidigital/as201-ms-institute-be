package com.as201msinstitute.service.impl;

import com.as201msinstitute.model.Institute;
import com.as201msinstitute.repository.InstituteRepository;
import com.as201msinstitute.service.InstituteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.*;

import java.util.List;


@Service
public class InstituteServiceImpl implements InstituteService {

    @Autowired
    private InstituteRepository instituteRepository;

    @Override
    public Flux<Institute> findAll() {
        return instituteRepository.findAll();
    }

    @Override
    public Mono<Institute> findId(Long id) {
        return instituteRepository.findById(id);
    }

    @Override
    public Flux<Institute> findIds(List<Long> ids) {
        return instituteRepository.findAllById(ids);
    }

    @Override
    public Mono<Institute> save(Institute institute) {
        institute.setActive(true);
        return instituteRepository.save(institute);
    }

    @Override
    public Mono<Institute> update(Institute institute) {
        return instituteRepository.save(institute);
    }

    @Override
    public Flux<Institute> findByName(String term) {
        String termConcat= "%"+term+"%";
        return instituteRepository.findByName(termConcat);
    }
}

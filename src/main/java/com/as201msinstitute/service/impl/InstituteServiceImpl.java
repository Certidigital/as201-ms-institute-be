package com.as201msinstitute.service.impl;

import com.as201msinstitute.model.Institute;
import com.as201msinstitute.repository.InstituteRepository;
import com.as201msinstitute.service.InstituteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.*;
import java.util.List;
@Slf4j
@Service
public class InstituteServiceImpl implements InstituteService {

    @Autowired
    private InstituteRepository instituteRepository;

    @Override
    public Flux<Institute> findAll() {
        log.info("Listando todos los institutos");
        return instituteRepository.findAll();
    }

    @Override
    public Flux<Institute> findStatus(boolean active) {
        log.info("Listando institutos por estado en: " + active);
        return instituteRepository.findByStatus(active);
    }

    @Override
    public Mono<Institute> findId(Long id) {
        log.info("Listando un instituto");
        return instituteRepository.findById(id);
    }

    @Override
    public Flux<Institute> findIds(List<Long> ids) {
        return instituteRepository.findAllById(ids);
    }

    @Override
    public Mono<Institute> save(Institute institute) {
        log.info("Guardando instituto");
        institute.setActive(true);
        return instituteRepository.save(institute);
    }

    @Override
    public Mono<Institute> update(Institute institute) {
        log.info("Actualizando instituto");
        institute.setActive(true);
        return instituteRepository.save(institute);
    }

    @Override
    public Flux<Institute> findByName(String term) {
        log.info("Buscando institutos por termino: " + term);
        String termConcat= "%"+term+"%";
        return instituteRepository.findByName(termConcat);
    }
}

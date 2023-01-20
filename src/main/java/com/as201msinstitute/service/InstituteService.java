package com.as201msinstitute.service;

import com.as201msinstitute.model.Institute;
import org.springframework.stereotype.Service;
import reactor.core.publisher.*;

import java.util.List;

@Service
public interface InstituteService {

    Flux<Institute> findAll();

    Mono<Institute> findId(Long id);

    Flux<Institute> findIds(List<Long> id);

    Mono<Institute> save(Institute institute);

    Mono<Institute> update(Institute institute);

    Flux<Institute> findByName(String name);
}

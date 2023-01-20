package com.as201msinstitute.controller;

import com.as201msinstitute.model.Institute;
import com.as201msinstitute.service.InstituteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/v1/institute")
public class InstituteController {

    @Autowired
    InstituteService instituteService;

    @GetMapping
    public Flux<Institute>all() {
        return instituteService.findAll();
    }

    @GetMapping("/status/{status}")
    public Flux<Institute> findInstituteByStatus(@PathVariable boolean status) {
        return instituteService.findStatus(status);
    }


    @GetMapping("/{id}")
    Mono<Institute>findId(@PathVariable Long id){
        return instituteService.findId(id);
    }

    @GetMapping("/ids")
    Flux<Institute>findId(@RequestParam List<Long> ids){
        return instituteService.findIds(ids);
    }

    @PostMapping
    Mono<Institute>save(@RequestBody Institute institute){
        return instituteService.save(institute);
    }

    @PutMapping
    Mono<Institute>update(@RequestBody Institute institute){
        return  instituteService.update(institute);
    }

    @GetMapping("/filter-name/{term}")
    public Flux<Institute> findByName(@PathVariable String term){
        return instituteService.findByName(term);
    }
}

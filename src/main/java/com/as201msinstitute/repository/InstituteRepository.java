package com.as201msinstitute.repository;

import com.as201msinstitute.model.Institute;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface InstituteRepository extends ReactiveCrudRepository<Institute, Long> {

    @Query("SELECT id,CONCAT(ruc,', ',name) as name,active FROM institute where UPPER(name) like UPPER(:term) OR UPPER(ruc) like UPPER(:term) AND active=true")
    Flux<Institute> findByName(@Param("term") String term);

}

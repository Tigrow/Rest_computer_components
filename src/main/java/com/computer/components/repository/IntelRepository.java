package com.computer.components.repository;

import com.computer.components.entities.IntelEntity;
import org.springframework.data.repository.CrudRepository;

public interface IntelRepository extends CrudRepository<IntelEntity, Long> {
    //IntelEntity findByUsername(String name);

    @Override
    IntelEntity findOne(Long aLong);


    @Override
    Iterable<IntelEntity> findAll();

    @Override
    Iterable<IntelEntity> findAll(Iterable<Long> iterable);

}

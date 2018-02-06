package com.computer.components.repository;

import com.computer.components.entities.IntelEntity;
import com.computer.components.entities.SimpleIntelEntity;
import org.springframework.data.repository.CrudRepository;

public interface SimpleIntelRepository extends CrudRepository<SimpleIntelEntity, Long> {
    Iterable<SimpleIntelEntity> findTop20ByIdGreaterThan(Long aLong);
}

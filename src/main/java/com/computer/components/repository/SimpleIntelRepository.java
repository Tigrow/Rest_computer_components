package com.computer.components.repository;

import com.computer.components.entities.IntelEntity;
import com.computer.components.entities.SimpleIntelEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SimpleIntelRepository extends CrudRepository<SimpleIntelEntity, Long> {
    @Query("from SimpleIntelEntity a where a.name like %:name% ORDER BY a.launchDate DESC")
    List<SimpleIntelEntity> find20Intel(@Param("name") String name, Pageable pageable);
    Iterable<SimpleIntelEntity> findTop20ByNameLike(String name);
}


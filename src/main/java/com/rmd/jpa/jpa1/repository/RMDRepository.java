package com.rmd.jpa.jpa1.repository;

import com.rmd.jpa.jpa1.model.RMD;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RMDRepository extends CrudRepository<RMD,Long> {
}

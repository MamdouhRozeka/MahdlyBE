package com.mahdlyBE.mahdly.repository;

import com.mahdlyBE.mahdly.data.model.Major;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MajorRepository extends CrudRepository<Major, Long> {

    @Query("select m from Major m")
    public List<Major> findAllMajors();

    @Query("select m from Major m where m.id  = :id")
    public Major findMajor( @Param("id") Long  id);
}

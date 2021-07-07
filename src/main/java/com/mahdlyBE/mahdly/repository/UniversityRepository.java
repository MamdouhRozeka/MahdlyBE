package com.mahdlyBE.mahdly.repository;

import com.mahdlyBE.mahdly.data.model.University;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UniversityRepository extends CrudRepository<University, Long> {

    @Query("select u from University u")
    public List<University> findAllUniversities();

    @Query("select u from University u where u.id  = :id")
    public University findUniversity( @Param("id") Long  id);
}

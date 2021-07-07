package com.mahdlyBE.mahdly.service;

import com.mahdlyBE.mahdly.data.model.University;
import com.mahdlyBE.mahdly.repository.UniversityRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UniversityService {

    @Autowired
    private UniversityRepository universityRepository;

    public Iterable<University> getUniversities(){
        return universityRepository.findAll();
    }

    public University getUniversity(Long id){
        return universityRepository.findUniversity(id);
    }
}

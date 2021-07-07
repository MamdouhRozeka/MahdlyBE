package com.mahdlyBE.mahdly.service;

import com.mahdlyBE.mahdly.data.model.Major;
import com.mahdlyBE.mahdly.repository.MajorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MajorService {

    @Autowired
    private MajorRepository majorRepository;

    public Iterable<Major> getMajors(){
        return majorRepository.findAll();
    }

    public Major getMajor(Long id){
        return majorRepository.findMajor(id);
    }
}

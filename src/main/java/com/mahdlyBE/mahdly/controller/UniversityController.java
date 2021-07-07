package com.mahdlyBE.mahdly.controller;

import com.mahdlyBE.mahdly.data.model.University;
import com.mahdlyBE.mahdly.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/university")
public class UniversityController {

    @Autowired
    private UniversityService universityService;

    @GetMapping("/all")
    public Iterable<University> getUniversities( ) {
        return universityService.getUniversities();
    }

    @GetMapping("/{id}")
    public University getUniversity(@PathVariable Long id) {
        return universityService.getUniversity(id);
    }
}

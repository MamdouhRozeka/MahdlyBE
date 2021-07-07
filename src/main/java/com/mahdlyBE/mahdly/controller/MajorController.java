package com.mahdlyBE.mahdly.controller;

import com.mahdlyBE.mahdly.data.model.Major;
import com.mahdlyBE.mahdly.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/major")
public class MajorController {
    @Autowired
    private MajorService majorService;

    @GetMapping("/all")
    public Iterable<Major> getMajors( ) {
        return majorService.getMajors();
    }

    @GetMapping("/{id}")
    public Major getMajor(@PathVariable Long id) {
        return majorService.getMajor(id);
    }
}

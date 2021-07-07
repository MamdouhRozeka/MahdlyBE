package com.mahdlyBE.mahdly.data.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Major extends BaseEntity{

    private String name;
    @ManyToMany(cascade = {CascadeType.MERGE})
    private Set<Subject> preRequisiteSubjects;
    private boolean trending;

    private double requiredGPALow;
    private double requiredGPAHigh;

}

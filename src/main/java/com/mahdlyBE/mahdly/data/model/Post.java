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
public class Post extends BaseEntity{

    @ManyToOne
    private University university;

    @OneToMany
    private Set<Image> postImages;

    @Lob
    private String description;

}

package com.mahdlyBE.mahdly.data.model;

import com.mahdlyBE.mahdly.data.enums.Area;
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
public class University extends BaseEntity{

    private String name;
    private Double currLong;
    private Double currLat;
    @Lob
    private String description;
    private String image;
    private String phone;
    @Enumerated(value = EnumType.STRING)
    private Area area;

    private boolean featured;

    @OneToMany
    private Set<Image> imageCarousel;
    
}

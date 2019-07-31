package com.example.demo;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Formation {

    private String libelle;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private String description;

}

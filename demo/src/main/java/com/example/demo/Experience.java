package com.example.demo;

import java.time.LocalDate;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Singular;

@Setter
@Getter
@Builder
public class Experience {

    private String societe;
    private String poste;
    @Singular
    private List<String> missions;
    private LocalDate dateDebut;
    private LocalDate dateFin;

}

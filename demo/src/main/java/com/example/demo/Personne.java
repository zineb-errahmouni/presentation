package com.example.demo;

import java.time.LocalDate;
import java.util.List;

import lombok.*;

@Getter
@Setter
@Builder
@EqualsAndHashCode
public class Personne {

    private String nom;
    private String prenom;
    private String matricule;
    private LocalDate dateNaissance;
    @Singular
    private List<Formation> formations;
    @Singular
    private List<Experience> experiences;
}

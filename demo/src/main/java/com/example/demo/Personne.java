package com.example.demo;

import java.time.LocalDate;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Singular;

@Getter
@Setter
@Builder
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

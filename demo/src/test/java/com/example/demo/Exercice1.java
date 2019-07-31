package com.example.demo;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Exercice1 {

    private List<Personne> personneList;
    private Personne personne1;
    private Personne personne2;
    private Personne personne3;

    @Before
    public void setUp() {
        initialiserListeDePersonne();
    }

    /**
     * recupérer les personnes dont le prenom commence par 'A'
     */
    @Test
    public void test1() {
        List<Personne> personnesExpected = Arrays.asList(personne2);
        List<Personne> resultat = null /* solution*/;

        resultat = /*recupérer le resultat en stream */ null;

        // TODO

        Assert.assertEquals(personnesExpected, resultat);
    }

    /**
     * recupérer les personnes qui ont effectué au minimum 2 formations
     */
    @Test
    public void test2() {
        List<Personne> personnesExpected = Arrays.asList(personne2, personne3);

        List<Personne> resultat = /*recupérer le resultat en stream */ null;

        // TODO

        Assert.assertEquals(personnesExpected, resultat);
    }

    /**
     * récupérer les personnes qui ont déja travaillé chez la cnieg
     */
    @Test
    public void test3() {
        List<Personne> personnesExpected = Arrays.asList(personne1, personne2);

        List<Personne> resultat = /* stream pour récupérer les résultats*/ null;

        // TODO

        Assert.assertEquals(personnesExpected, resultat);
    }

    /**
     * recupérer toutes les formations des personnes qui ont déja travaillé à GOOGLE
     */
    @Test
    public void test4(){
        List<Formation> resultatExpected  = new ArrayList<>();
        resultatExpected.add(Formation.builder().libelle("java").build());
        resultatExpected.add(Formation.builder().libelle("Scrum").build());
        resultatExpected.add(Formation.builder().libelle("DOT NET").build());
        resultatExpected.add(Formation.builder().libelle("SQL").build());

        List<Formation> formations = null  /* stream pour récupérer les résultats*/;

        // TODO

        Assert.assertEquals(resultatExpected, formations);
    }



    private void initialiserListeDePersonne() {
        personneList = new ArrayList<>();
        personne1 = Personne.builder()//
            .dateNaissance(LocalDate.now())//
            .experience(Experience.builder()//
                .societe("CNIEG").build())//
            .experience(Experience.builder()//
                .societe("GOOGLE").build()).experience(Experience.builder()//
                .societe("TERADATA").build())//
            .experience(Experience.builder().societe("SNCF").build())//
                .nom("DUPOND").prenom("François").build();

        personne2 = Personne.builder()//
            .dateNaissance(LocalDate.now())//
            .experience(Experience.builder()//
                .societe("CNIEG").build())//
            .experience(Experience.builder()//
                .societe("GOOGLE").build()).experience(Experience.builder()//
                .societe("TERADATA").build())//
            .experience(Experience.builder().societe("SNCF").build()).
                formation(Formation.builder()//
                    .libelle("java").build()).formation(Formation.builder()//
                .libelle("SQL").build()).nom("DUPOND").prenom("Antoine").build();

        personne3 = Personne.builder()//
            .dateNaissance(LocalDate.now())//
            .experience(Experience.builder()//
                .societe("MICROSOFT").build())//
            .experience(Experience.builder()//
                .societe("GOOGLE").build()).experience(Experience.builder()//
                .societe("TERADATA").build())//
            .experience(Experience.builder().societe("SNCF").build()).
                formation(Formation.builder()//
                    .libelle("Scrum").build())//
               .formation(Formation.builder()//
                    .libelle("DOT NET").build()).nom("DUPOND").prenom("Guillaume").build();

        personneList.add(personne1);
        personneList.add(personne2);
        personneList.add(personne3);
    }
}

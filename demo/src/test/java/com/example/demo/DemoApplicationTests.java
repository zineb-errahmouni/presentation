package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
    }

    /**
     * chercher tous les elements qui commecent par
     * la lettre 'c' en le mettant en Maj
     */
    @Test
    public void test1() {
        List<String> listeElements = Arrays.asList("a1", "b1", "c1", "c2", "b3", "a7", "z4");
        List<String> resultatExpected = Arrays.asList("C1", "C2");
        // solution en Java 6
        List<String> resultats = new ArrayList<>();
        for (String element : listeElements) {
            if (element.startsWith("c")) {
                resultats.add(element.toUpperCase());
            }
        }

        //        // solution en Java 8
        //        resultats = listeElements.stream().filter(element -> element.startsWith("c"))
        //            .map(String::toUpperCase)
        //            .collect(Collectors.toList());

        Assert.assertEquals(resultats, resultatExpected);
    }

    /**
     * recupérer les numéros de la suite a1, b2, a3, z9
     * et calculer le max
     * si trouvé
     */
    @Test
    public void test2() {

        List<String> listeElements = Arrays.asList("a1", "a2", "z4", "a5");
        Integer maxExpected = 5;

        // en java 6
        Integer maxResultat = 0;
        List<Integer> resultats = new ArrayList<>();
        for (String element : listeElements) {
            resultats.add(Integer.parseInt(element.substring(1)));
        }

        maxResultat = resultats.get(0);
        for (Integer res : resultats) {
            if (res > maxResultat) {
                maxResultat = res;
            }
        }

        //        maxResultat = listeElements.stream().map(elem -> elem.substring(1)).mapToInt(Integer::parseInt).max().orElse(0);

        Assert.assertEquals(maxResultat, maxExpected);
    }

    /**
     * réutilisation de stream
     * opération terminal et non terminal
     * les limites et les possibilité
     */
    @Test
    public void test3() {

        Supplier<Stream<String>> stream = () -> Stream.of("d2", "a2", "b1", "b3", "c").filter(s -> s.startsWith("a"));

        stream.get().anyMatch(s -> true);

        stream.get().noneMatch(s->false);

    }

    public void correction1() {

    }
}

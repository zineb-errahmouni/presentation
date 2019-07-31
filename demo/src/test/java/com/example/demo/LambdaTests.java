package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LambdaTests {

    @Test
    public void test1(){
        Operation addition = (Integer x, Integer y) -> {return x+y;};

        Operation soustraction  = (Integer x, Integer y) -> {return x-y;};

        Operation multiplication = (Integer x, Integer y ) -> {return x*y;};


        Integer resultatAddition = addition.calculer(10, 20);
        Integer resultatSoustsraction = soustraction.calculer(20, 3);
        Integer resultatMultiplication = multiplication.calculer(10, 2);


        Assert.assertEquals(new Integer(30), resultatAddition);
        Assert.assertEquals(new Integer(17), resultatSoustsraction);
        Assert.assertEquals(new Integer(20), resultatMultiplication);
    }


    @Test
    public void test2(){
        //code 1
    }

}

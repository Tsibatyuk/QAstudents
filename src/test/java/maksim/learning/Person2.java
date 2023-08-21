package maksim.learning;

import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.IntStream;

@Test
public class Person2 {
    public void fr() {

        Person apple = new Person("golden", "yellow", 1.0);
        Person kiwi = new Person("armenia", "green", 3.1);
        Person lime = new Person("amazon", "green", 2.2);
        Person cherry = new Person("kherson", "red", 1.1);


        Map<String, Person> fru = new HashMap<>();

        fru.put("apple", apple);
        fru.put("kiwi", kiwi);
        fru.put("lime", lime);
        fru.put("cherry", cherry);

        Person retrievedApple = fru.get("apple");
        if (retrievedApple != null) {
            String name = retrievedApple.getName();
            String color = retrievedApple.getColor();
            double weight = retrievedApple.getWeigh();

            System.out.println("Name: " + name);
            System.out.println("Color: " + color);
            System.out.println("Weight: " + weight);
        } else {
            System.out.println("Apple not found in the map.");


        }
    }

    @Test
    public void yut() {
        String [] i = {"r", "gjh", "gjhh"};
        for (int j = 0; j < i.length; j++) {
            System.out.println(i[j]);

        }
    }

    @Test
    public void yut1() {
        int[][] iq = {{1, 2, 3},{15, 12, 18}};
        for (int j = 0; j < iq.length; j++) { //вкликаю довжину масиву .lenght
            System.out.println(iq[j]);

        }
    }public void ar(){
        double [] rr = {20,02,30.01,22.04,43.34,45 };
       rr [0]=1;
       rr [1]=2;
       rr [2]=3;
       rr [3]=4;
       rr [4]=5;
       rr [5]=6;
       
       IntStream.iterate(0, i -> {
                   boolean b = i <= Arrays.stream(rr).sorted().sum();
                   return b;
                }, i -> i + 1)
                .forEach(System.out::println);
        //Порахувало елементи в масиві


    }
}


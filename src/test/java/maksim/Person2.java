package maksim;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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


    }}



package ilia;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Personrealisation {

    public static void main(String[] args)
    {
        List<String> names = new LinkedList<>();
        List<Integer> ages = new LinkedList<>();
        List<Double> weights = new LinkedList<>();
        List<Double> heights = new LinkedList<>();
        List<String> countries = new LinkedList<>();

        Person[] people = new Person[5];
         people[0] = new Person("Ilia", 18, 68.5, 178, "Ukraine");
         people[1] = new Person("Artem", 19, 70, 189, "USA");
         people[2] = new Person("Liza", 45, 94,159, "Belgium");
         people[3] = new Person("Vanya", 21, 89, 190, "Spain");
         people[4] = new Person("Katya", 22, 54, 186, "Italy");

        for (Person person : people) {
            names.add(person.getName());
            ages.add(person.getAge());
            weights.add(person.getWeight());
            heights.add(person.getHeight());
            countries.add(person.getCountry());
        }


        Map<Integer, String> peopleNames = new HashMap<>();
        for (int i = 0; i < names.size(); i++)
        {
            System.out.println("**************************");
            System.out.println("Name: "+ names.get(i));
            System.out.println("Age: "+ ages.get(i));
            System.out.println("Weight: "+ weights.get(i));
            System.out.println("Height: "+ heights.get(i));
            System.out.println("Country: "+ countries.get(i));
            System.out.println("**************************");
        }



//        for(int i = 0; i < people.length; i++)
//        {
//            System.out.println("*****************");
//            System.out.println("Person " + i + ":");
//            System.out.println("Name: " + people[i].getName());
//            System.out.println("Age: " + people[i].getAge() + "years");
//            System.out.println("Weight: " + people[i].getWeight() + "Kg");
//            System.out.println("Height: " + people[i].getHeight() + "Cm");
//            System.out.println("*****************");
//        }

    }
}

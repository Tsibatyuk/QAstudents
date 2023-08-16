package zhenia;

import ilia.Person;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MapLesson {


    public static void main(String[] args) {
        Map<String, Object> people = new HashMap<>();

        Person[] peopleArray = new Person[5];
        peopleArray[0] = new Person("Ilia", 18, 68.5, 178, "Ukraine");
        peopleArray[1] = new Person("Artem", 19, 70, 189, "USA");
        peopleArray[2] = new Person("Liza", 45, 94, 159, "Belgium");
        peopleArray[3] = new Person("Vanya", 21, 89, 190, "Spain");
        peopleArray[4] = new Person("Katya", 22, 54, 186, "Italy");

        for (Person person : peopleArray) {
            String key = person.getCountry() + " " +person.getHeight() + " " +person.getWeight() + " " + person.getAge();
            people.put("\n"+person.getName(), key);

//            people.put("Name: "+person.getName(), "data: "+ person);
        }


        System.out.println(people);
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
@Test
public void exmethodForDebug(){
    System.out.println(1);
    System.out.println(2);
    System.out.println(3);
    System.out.println(4);
    System.out.println(5);
    System.out.println(6);
    System.out.println(7);
}

}

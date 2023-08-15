package maksim;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    String gender;
    String name;
    int age;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        /*people.add(new Person("Анна", 30, "Ж"));
        people.add(new Person("іван", 28, "М"));
        people.add(new Person("Марія", 22, "Ж"));
        people.add(new Person("Петька", 35, "М"));
        people.add(new Person("Екатерина", 26, "Ж"));*/

        List<String> filtered = people.stream()
                .filter(person -> person.getAge() > 25)
                .sorted(Comparator.comparing(Person::getName))
                .map(person -> person.getName() + " "+person.getGender()+" - " + person.getAge())
                .collect(Collectors.toList());

        filtered.forEach(System.out::println);
    }
}

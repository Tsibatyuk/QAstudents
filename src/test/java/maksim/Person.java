package maksim;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private static Comparator<? super Person> getName;
    String gender;
    String name;
    int age = 4;

    public Person(int i, String gender) {
    }


    public void uu(){
    this.name = name;
    this.age = age;
    this.gender = gender;
}
public String getName(){
   return name;}
public int getAge(){
    return age;
}
public String getGender(){
    return gender;
}

    public  static void main(String[] args) {

    List<Person> people = new  ArrayList<>();
        people.add(new Person(30, "Ж"));
        people.add(new Person(28, "М"));
        people.add(new Person(22, "Ж"));
        people.add(new Person(35, "М"));
        people.add(new Person(26, "Ж"));


        List<String> filtered = people.stream()
                .filter(person -> person.getAge() > 25)
                .sorted(Person.getName)
                .map(person -> person.getName() + " - " + person.getAge())
                .collect(Collectors.toList());

        filtered.forEach(System.out::println);
    }
}

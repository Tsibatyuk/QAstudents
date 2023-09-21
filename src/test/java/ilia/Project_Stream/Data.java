package ilia.Project_Stream;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private static List<Person> persons = new ArrayList<>();

    static
    {
        Person person1 = new Person("Emma ", "Johnson", 33);
        Person person2 = new Person("Benjamin ", "Davis", 19);
        Person person3 = new Person("Olivia ", "Smith", 24);
        Person person4 = new Person("William ", "Anderson", 28);
        Person person5 = new Person("Sophia ", "Martinez", 45);
        Person person6 = new Person("Noah ", "Brown",23);
        Person person7 = new Person("Ava ", "Taylor", 26);
        Person person8 = new Person("Liam ", "Miller", 31);
        Person person9 = new Person("Mia ", "Wilson", 68);
        Person person10 = new Person("James ", "Jones", 54);

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        persons.add(person7);
        persons.add(person8);
        persons.add(person9);
        persons.add(person10);
    }

    public static List<Person> getPersons()
    {return persons;}
}

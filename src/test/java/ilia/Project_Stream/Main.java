package ilia.Project_Stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)
    {
        List<Person> persons = Data.getPersons();

        List<Person> persons2 = persons.stream()
                .filter(p -> p.getAge() > 30)
                .sorted()
                //.map(person -> new Person(person.getFirstname(), person.getLastname(),person.getAge() + 100)) // Работаєм з типами данних на пряму
                .collect(Collectors.toList());

       persons2.forEach(p -> System.out.println(p));


        //обєкт Optional як вийде, якщо буде підходящий то він буде , якщо не буде то не буде
        /*Optional<Person> person = persons.stream()
                .filter(p -> p.getAge() > 30)
                //.findFirst(); //кажемо найди першого
                        .findAny();//найди любого хто страще 30 років
        System.out.println(person.get());*/

    }
}

package ilia;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Class1
{
    @Test
    public void class1()
    {
        List<String> myList = new ArrayList<>();

        myList.add("First elemnt ");
        myList.add("Second element");
        myList.add("Third element");


        myList.stream()
                .filter(item -> myList.indexOf(item) == 2)
                .forEach(System.out::println);
        System.out.println(" ");
        System.out.println(myList.get(1));
    }

}

package ilia;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Class2
{
    @Test
    public void class2()
    {
        List<Integer> myList = new ArrayList<>();
        int size = 100;
        for(int i = 1; i < size; i++)
        {
            myList.add(i);
        }
        System.out.println("Number which division for 2 :");
        myList.stream()
                .filter(num -> num % 2 == 0 && num % 3 == 0 )
                .forEach(System.out::println);
    }
}

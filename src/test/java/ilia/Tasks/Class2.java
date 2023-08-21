package ilia.Tasks;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

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

    @Test
    public static void main(String[] args)
    {
        List<Integer> array = new ArrayList<>();
        List<Integer> vector = new Vector<>();

        for (int i = 0; i < 1000000; i++)
        {
            array.add(i);
            vector.add(i);
        }

        long arrayListStartTime = System.currentTimeMillis();
        for (int i = 0; i < array.size(); i++)
        {
            array.get(i);
        }

        long arrayListEndTime = System.currentTimeMillis();
        long arrayListTime = arrayListEndTime - arrayListStartTime;
        System.out.println("ArrayList access time: " + arrayListTime + "ms");

        long vectorStartTime = System.currentTimeMillis();
        for (int i = 0; i < vector.size(); i++)
        {
            vector.get(i);
        }

        long vectorEndTime = System.currentTimeMillis();
        long vectorTime = vectorEndTime - vectorStartTime;
        System.out.println("Vector access time: " + vectorTime + "ms");
    }
}

package ilia.Stream;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class task_for_stream3
{
    public static void main(String[] args)
    {
        List<Integer> randomNumbers = new Random().ints(20,1,100)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> evenNumbers = randomNumbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);
    }
}

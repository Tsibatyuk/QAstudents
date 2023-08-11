package ilia;

import java.util.HashSet;
import java.util.Set;

public class Class7
{
    public static void main(String[] args)
    {
        Set<String> fruit = new HashSet<>();
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Cherry");

        fruit.add("Apple");//дублікат не буде доданий
        int size = fruit.size();
        System.out.println("Size of the set = " + size);
    }
}

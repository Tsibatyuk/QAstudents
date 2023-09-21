package ilia.Stream;

import java.util.*;
import java.util.stream.Collectors;

public class Stream1
{
    static public void main(String[] args)
    {
        List<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Box");
        words.add("Computer");
        words.add("Fruit");
        words.add("Dog");
        words.add("Cat");
        words.add("Tea");
        words.add("Desk");
        words.add("Food");
        words.add("Energy");
        words.add("Language");
        words.add("Dark");
        words.add("Light");
        words.add("Tomato");

        List<String> word = words.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Words = " + word);

        long count = words.stream()
                .filter(w -> w.length()> 5)
                .count();
        System.out.println("Filter: " + count);

        List<String> limitWords = words.stream()
                .limit(5)
                .collect(Collectors.toList());
        System.out.println("Limit Words: " + limitWords);

        boolean wordsWithA = words.stream()
                .anyMatch(a -> a.contains("A"));
        System.out.println("Words With A: " + wordsWithA );

        Optional<String> longWord = words.stream()
                .max(Comparator.comparingInt(String::length));
        System.out.println("The longest word: " + longWord);

        Optional<String> shortWord = words.stream()
                .min(Comparator.comparingInt(String::length));
        System.out.println("The shortest word: " + shortWord);


    }
}

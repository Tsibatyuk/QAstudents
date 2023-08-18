package ilia.Stream;

import org.testng.reporters.AbstractXmlReporter;

import java.util.*;
import java.util.stream.Collectors;

public class Task_for_stream {
    public static void main(String[] args)
    {
        List<String> words = new ArrayList<>();
        words.add("Book");
        words.add("Sun");
        words.add("Bicycle");
        words.add("Ice Cream");
        words.add("Ocean");
        words.add("Coffee");
        words.add("Wind");
        words.add("Guitar");
        words.add("Basket");
        words.add("Medal");
        words.add("Park");
        words.add("Candle");
        words.add("Store");
        words.add("Koala");
        words.add("Park");
        words.add("Store");
        words.add("Rain");
        words.add("Lantern");
        words.add("Milk");
        words.add("Rocket");
        words.add("Theatre");
        words.add("Flamingo");
        words.add("Chocolate");
        words.add("Summer");
        words.add("Garland");
        words.add("Pizza");
        words.add("Cow");
        words.add("Pasta");
        words.add("Water");
        words.add("Computer");

        List<String> sortedAlphabet = words.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("In Alphabet: " + sortedAlphabet);

        List<String> sortedLetter = words.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        System.out.println("For Symbol: "+ sortedLetter);

        List<String> sortedReverseAlphabet = words.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("In Reverse Alphabet: " + sortedReverseAlphabet);

        List<String> sortedReverseLetter = words.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .collect(Collectors.toList());
        System.out.println("In Reverse Letter: " + sortedReverseLetter);

        Map<Integer, List<String>> groupedByLength = words.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("Grouped by length: " + groupedByLength);

        List<String> shortWord = words.stream()
                .filter(word -> word.length()<5)
                .collect(Collectors.toList());
        System.out.println("Word which < 5: "+ shortWord);

        Random random = new Random();
        String randomWord = words.stream()
                .skip(random.nextInt(words.size()))
                .findFirst()
                .orElse(" ");
        System.out.println("Your favorite word in the world is - " + randomWord);


    }
}

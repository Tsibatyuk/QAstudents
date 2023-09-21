package ilia.Stream;

import org.checkerframework.checker.units.qual.A;

import java.util.*;
import java.util.stream.Collectors;

public class Task_for_stream2 {
    public static void main(String[] args)
    {
        //Порахувати кількість парних чисел у списку
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        long count = numbers.stream()
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println("Number of even numbers: " + count);

        //Перетворити список рядків у новий список , де всі рядки написані з великої букви
        List<String> words = Arrays.asList("This is an example of strings to convert");//Переклад:Це приклад рядків для перетворення
        List<String> upperWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperWords);

        //Знайти середнє значення чисел у списку
        List<Double> scores = Arrays.asList(83.5,67.0,43.0,3.6,32.0,90.1,56.2,11.0);
        double average = scores.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println("Score: " + average );

        //Вибрати усі унікальні слова в рядку
        List<String> sentences = Arrays.asList("This is a string 1", "This is a string 2","This is a string 3", "One more line");
        List<String> uniqueWords = sentences.stream()
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Extra words: " + uniqueWords);
    }
}

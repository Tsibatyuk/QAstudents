package ilia.Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreemMethods {
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

        //метод map виводить кількість елментів в елементі(букв в слові)
        List<Integer> words2 = words.stream().map(element -> element.length())
                        .collect(Collectors.toList());
        System.out.println("Map: " + words2);

        //метод filter і count для фільтрування даниих(в моєму випадку слова які мають більше ніж 5 букв)
        long count = words.stream()
                .filter(word -> word.length()>5)
                .count();
        System.out.println("Filter: " + count);

        //Метод sorted використовується для сортування елементів(в цьому випадку за алфавітом)
        List<String> alphabet = words.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sort: " + alphabet);

        //метод limit використовується для обмеження кількості(у цьому випадку ми обмежуємо кількість слів, так щоб він містив лише 5 елементів)
        List<String> limitWords = words.stream()
                .limit(5)
                .collect(Collectors.toList());
        System.out.println("limit: " + limitWords);

        //метод AnyMatch перевіряє чи є хочаб один елемент який задовольняє певну умову(У нашому випадку перевіряємо чи є хоча б одне слово яке містить С  )
        boolean wordsWithC = words.stream()
                .anyMatch(word -> word.contains("C"));
        System.out.println("Words with letter C: " + wordsWithC);

        //метод collect використовується для збору елементів в колекцію або інший тип колекції (У даному випадку, ми збираємо слова в одну стрічку які розділені ",")
        String allWords = words.stream()
                .collect(Collectors.joining(", "));
        System.out.println("Collect: " + allWords);

        //метод max and min потрібен знаходження максимально та мінімального елмента(в моєму випадку це max елемент в листу )
        Optional<String> longestWord = words.stream()
                .max(Comparator.comparingInt(String::length));
        longestWord.ifPresent(word -> System.out.println("Longest word: " + word));

        //метод ForEach застосовує дію для кожного елементу(У нашому випадку ми виводимо кожне слово на екран)
        words.stream()
                .forEach(word -> System.out.println("For Each: "+ word));
    }
}

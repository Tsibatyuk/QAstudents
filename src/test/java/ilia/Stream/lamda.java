package ilia.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class lamda {

    public static void main(String[] args) {
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

        //інтерфейс Consumer використовується для виконання деяких дій над обєктом типу Т, при цьому не повертаючи результат
        //Тут printUpperCase це обєкти типу Consumer, який приймає рядок(слово) та виводить його у верхньому регістрі
        Consumer<String> printUpperCase = word -> System.out.println(word.toUpperCase());
        words.forEach(printUpperCase);

        System.out.println("--------------------------");

        //інтерфейс Supplier використовується для створення та повернення обєкта типу Т без передачі інформації
        //обєкт random word є реалізацією інтерфейсу Supplier<String> і використовується для генерації випадкового слова зі списку words
        Supplier<String> randomWord = () -> words.get((int)(Math.random()* words.size()));
        System.out.println("Random word: " + randomWord.get());

        System.out.println("--------------------------");

        //інтерфес Function використовується для виконання перетворення над обєктом типа Т та обєкта типа R
        //обєкт wordLenght є реалізацією інтерфейсу Function<String, Integer>. Лямбда-вираз 'word -> word.length' означає
        //що для кожного слова в списку words буде викликано метод length() для довжини рядка в словa
        Function<String, Integer> wordLength = word -> word.length();
        words.forEach(word-> System.out.println("Word: " + word + "Length: " + wordLength.apply(word)));

        System.out.println("------------------------");

        //інтерфейс Predicate використовується для виконання перевірки на булевий обєкт типу Т
        //обєкт containsSpace є реалізацією інтерфейсу Predicate<String>. Лямбда-вираз 'word -> word.contains(" ")' перевіряє чи містить слово пробіли
        //Метод "filterWords" використовує цей предикат для відбору слів які задоволняють умову
        Predicate<String> containsSpace = word -> word.contains(" ");
        List<String> wordsWithSpace = filterWords(words, containsSpace);
        wordsWithSpace.forEach(System.out::println);

        System.out.println("------------------------");

        //
        //
        UnaryOperator<String> addFun = word -> word + " - Fun";
        List<String> funWords = transformFromWords(words, addFun);
        funWords.forEach(System.out::println);
    }
    private static  List<String> filterWords(List<String> words,Predicate<String> predicate)
    {
        return words.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    private static List<String> transformFromWords(List<String> words, UnaryOperator<String> operator)
    {
        return words.stream()
                .map(operator)
                .collect(Collectors.toList());
    }
}

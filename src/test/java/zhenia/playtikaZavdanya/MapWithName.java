package zhenia.playtikaZavdanya;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MapWithName {
    public static void main(String[] args) {
        String grades = "Ihor=1,Glib=2,Roman=3";
        String[] words = grades.split(",");
        Map<String, Integer> gradeMap = new HashMap<>();

        for (String word : words) {
            String[] parts = word.split("=");
            if (parts.length == 2) {
                String name = parts[0];
                int grade = Integer.parseInt(parts[1]);
                gradeMap.put(name, grade);
            }
        }

        // Print the map
        for (Map.Entry<String, Integer> entry : gradeMap.entrySet()) {
            System.out.println("Ім'я: " + entry.getKey() + ", оцінка: " + entry.getValue());
        }
    }

    @Test
    public void testq(){
        String grades = "Ihor=1,Glib=2,Roman=3";

        Map<String, Integer> gradeMap = Arrays.stream(grades.split(","))
                .map(entry -> entry.split("="))
                .filter(parts -> parts.length == 2)
                .collect(Collectors.toMap(parts -> parts[0], parts -> Integer.parseInt(parts[1])));

        // Вивести мапу
        gradeMap.forEach((name, grade) -> System.out.println("Ім'я: " + name + ", Оцінка: " + grade));

    }
}

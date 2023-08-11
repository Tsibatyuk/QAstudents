package ilia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Class9 {
    public static void main(String[] args) {
        List<String> carList = new ArrayList<>();

        carList.add("BMW");
        carList.add("Mercedes");
        carList.add("Toyota");
        carList.add("Honda");
        carList.add("Volvo");
        carList.add("Kia");
        carList.add("Ford");
        carList.add("Bugatti");
        carList.add("Lamborghini");
        carList.add("Chevrolet");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter letter = ");
        String letter = scanner.nextLine();

        if(letter.length() != 1)
        {
            System.out.println("Error. Please enter ");
            return;
        }

        char targetLetter = letter.charAt(0);

        List<String> filteredCars = new ArrayList<>();
        IntStream.range(0, carList.size())
                .forEach(index -> {String car = carList.get(index);
                    if(car.startsWith(String.valueOf(targetLetter)))
                    {
                        filteredCars.add(car);
                    }

                });

        if (filteredCars.isEmpty())
        {
            System.err.println("No cars found");
        }
        else
        {
            filteredCars.forEach(System.out::println);
        }

    }
}

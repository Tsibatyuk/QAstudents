package ilia;

import java.util.*;
import java.util.stream.IntStream;

public class Class6 {

    public static void main(String[] args)
    {
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

        for (int i = 0; i < carList.size(); i++)
        {
            System.out.println(carList.get(i));
        }
        Map<Integer,String> number = new HashMap<>();
//TODO        for(int i = 0; i < carList.size(); i++)
//        {
//            number.put(i+1, carList.get(i));
//        }
        IntStream.range(0, carList.size())
                .forEach(i -> number.put(i + 1 , carList.get(i)));

        System.out.println(number);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number = ");
        int numberInput = scanner.nextInt();
        String carName = number.get(numberInput);
        System.out.println(carName);
    }
}


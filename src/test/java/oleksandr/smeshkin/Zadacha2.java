package oleksandr.smeshkin;

import java.util.*;
import java.util.stream.IntStream;

public class Zadacha2 {

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

        Map<Integer, String> marsh = new HashMap<>();
//        for (int i = 0; i < carList.size() ; i++) {
//            marsh.put(i+1, carList.get(i));
//        }
        IntStream.range(0, carList.size()).forEach(i -> marsh.put(i+1, carList.get(i)));
        System.out.println(marsh);
        Scanner scaner = new Scanner(System.in);
        int osss = scaner.nextInt();
        System.out.println(marsh.get(osss));
    }
}



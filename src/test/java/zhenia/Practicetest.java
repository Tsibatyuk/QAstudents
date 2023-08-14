package zhenia;

import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.IntStream;

public class Practicetest {

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

        Map<Integer, String> carListTest = new HashMap<>();

        IntStream.range(0, carList.size()).forEach(i -> carListTest.put(i + 1, carList.get(i)));
        Scanner sc = new Scanner(System.in);
        int carNum = sc.nextInt();
        System.out.println(carListTest.get(carNum));

        for (int i = 0; i <carList.size() ; i++) {
            carListTest.put(i + 1, carList.get(i));
        }
    }


}

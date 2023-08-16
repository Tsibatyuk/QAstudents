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

        FirstClass fc = new FirstClass();
        fc.x = 10;
    }
    @Test
    public void arrays(){
            int [] number = {8787,45345,3,4,5,6,7,9878766};  //створила масив в якому буде 6 обєктів

            number[0] = 10;
            number[1] = 20;
            number[2] = 30;
            number[3] = 40;
            number[4] = 50;
            number[5] = 60;
            number[6] = 70;
            number[7] = 70;


            for (int i = 0; i < number.length; i++)  //цим методом я викликаю довжину масиву


                System.out.println(number[i]);


        }



}

package ilia;

import org.testng.annotations.Test;

import java.util.*;

public class Class3
{
    @Test
    public void class3()
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

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number = ");
        int numberInput = scanner.nextInt();

        Map<Integer, String> carBrands = new HashMap<>();
        for(int i = 1; i <= carList.size(); i++)
        {
            carBrands.put(i, carList.get(i - 1));

            if(numberInput >= 1 && numberInput <= carList.size()) {
                String brand = carBrands.get(numberInput);
                System.out.println("Your choice car: car" + numberInput + " - " + brand);
            }
            else
            {
                System.out.println("False number. Input number 1 for 10" + carList.size());
            }
        }
    }
}

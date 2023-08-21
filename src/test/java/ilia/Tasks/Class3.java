package ilia.Tasks;

import org.testng.annotations.Test;

import java.util.*;

public class Class3
{
    @Test
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

        Scanner scanner = new Scanner(System.in);
        System.out.println("You have 10 type of car: BMW, Mercedes, Toyota, Honda, Volvo, Kia, Ford, Bugatti, Lamborghini, Chevrolet");
        System.out.print("Input number = ");
        int numberInput = scanner.nextInt();

        Map<Integer, String> carBrands = new HashMap<>();
        for(int i = 1; i <= carList.size(); i++)
        {
            carBrands.put(i, carList.get(i - 1));

            if(numberInput >= 1 && numberInput <= carList.size()) {
                String brand = carBrands.get(numberInput);
                System.out.println("Your choice car: car" + numberInput + " - " + brand);
                break;
            }
            else
            {
                System.out.println("False number. Input number 1 for " + carList.size());
            }
        }
    }
}

package oleksandr.smeshkin;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

@Test
public class Zadacha {
    public void someMethod() {
//        openUrl("https://makeup.com.ua/ua/");
        List<Integer> apple = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            apple.add(i);
//            System.out.println(i);
//            System.out.println(apple);

        }
        apple.stream()
                .filter(x -> x % 5 == 0)
                .forEach(System.out::println);


//
//Apple.add(3);
//Apple.add(4);
//Apple.add(5);
//    System.out.println("порахуй"+);

    }



    public void aa() {
        List<String> fj = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        fj.add("3");
        fj.add("Olenka");
        fj.add("55");
        fj.add("Vladik");
        fj.add("Zenya");
        fj.add("Sanya");
System.out.println("3");
String name = sc.nextLine();
fj.add("3");
System.out.println("Оленка");
  int age = sc.nextInt();
//    fj.add(Integer.toString(age).toString();
    }




        }

      //  for (int i =0; i <5; i++){
//            System.out.println(fj.get(i) );
//        }
//       for (int i = 0; i <= 5; i++) {
//            System.out.println(fj.get(i));
//        }
//        fj.stream()
//                .filter(number -> number % 2 == 0)
//                .forEach(System.out::println);
//    }



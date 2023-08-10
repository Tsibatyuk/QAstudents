package olena;

import java.util.*;

public class klass5avto {


    public static void main(String[] args) {

        List<String> as = new ArrayList<>();

        as.add("Audi");
        as.add("BMW");
        as.add("Mercedes");
        as.add("Opel");
        as.add("Kia");
        as.add("Ford");
        as.add("Chevrolet");
        as.add("Toyota");
        as.add("Volkswagen");
        as.add("Tesla");

        Map<Integer, String> avto = new HashMap<>();
        for (int i = 0; i < as.size(); i++) {
            avto.put(i + 1, as.get(i));


        }
        System.out.println(avto);
        Scanner scanner = new Scanner(System.in);
         int carlist = scanner.nextInt();
        if (avto.containsKey(carlist)) {
            String carName = avto.get(carlist);
            System.out.println("Ви обрали авто з номером " + carlist + ": " + carName);
        } else {
            System.out.println("Авто з номером " + carlist + " не знайдено.");
        }
    }

    }

import java.util.*;

public class Class24 {

    public static void main(String[] args) {
        List<String> qm = new ArrayList<>();

        qm.add("BMW");
        qm.add("Mercedes");
        qm.add("Toyota");
        qm.add("Honda");
        qm.add("Volvo");
        qm.add("Kia");
        qm.add("Ford");
        qm.add("Bugatti");
        qm.add("Lamborghini");
        qm.add("Chevrolet");

        Map<Integer, String> auto = new HashMap<>();

        for (int i = 0; i < qm.size(); i++) {
            auto.put( i + 1, qm.get(i));


        }
        System.out.println(auto);

        Scanner scanner = new Scanner(System.in);
        int carlist = scanner.nextInt();
         if (auto.containsKey(carlist)) {
             String carName = auto.get(carlist);
             System.out.println("Ви обрали авто з номером " + carlist + ": " + carName);
         }else  {
             System.out.println("Авто з номером " + carlist + "не занйдено.");
         }

    }


}
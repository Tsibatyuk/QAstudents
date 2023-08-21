package maksim.learning;

import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Mapa {
//    int i;
//
//    @Test
//    public void m1apa() {
//        Map<Integer, String> hash = new HashMap<>();
//
//        hash.put(1, "orange");
//        hash.put(3, "apple");
//        hash.put(7, "lemon");
//        hash.put(11, "peach");
//        hash.put(null, "choco");
//        System.out.println(hash.get(null));
//        List<String> ls = new LinkedList<>();
//        for (i = 0; i <= 10; i++) {
//            ls.add(String.valueOf(i));
//        }
//        System.out.println(ls);
//
//        List<Double> yi = new ArrayList<>();
//        yi.add(878762.16);
//    }
//
//    @Test
//    public void v() {
//        List<String> cars = new ArrayList<>();
//
//        cars.add("renault");
//        cars.add("mazda");
//        cars.add("opel");
//        cars.add("jeep");
//        cars.add("заз");
//        cars.add("ford");
//        cars.add("audi");
//        cars.add("wv");
//        cars.add("chevrolet");
//        cars.add("ferrari");
//
//
//        Map<Integer, String> car = new HashMap<>();
//        for (int j = 0; j < cars.size(); j++) {
//            car.put(j + 1, cars.get(j));
//        }
//
//        for (Map.Entry<Integer, String> entry : car.entrySet()) {
//            Integer key = entry.getKey();
//            String value = entry.getValue();
//
//
//
//        Map<Integer, String> car = new HashMap<>();
//        for (int j = 0; j < cars.size(); j++) {
//            car.put(j + 1, cars.get(j));
//        }
//
//        for (Map.Entry<Integer, String> entry : car.entrySet()) {
//            Integer key = entry.getKey();
//            String value = entry.getValue();
//
//
//            System.out.println("Key: " + key + ", Value: " + value);
//            System.out.println(String.format("Key: %s, Value: %s", key, value));
//        }
//    }
//@Test
//    public void mj() {
//    List<String> car = new ArrayList<>();
//
//    car.add("renault");
//    car.add("mazda");
//    car.add("opel");
//    car.add("jeep");
//    car.add("заз");
//    car.add("ford");
//    car.add("audi");
//    car.add("wv");
//    car.add("ferrari");
//
//    Map<Integer, String> cars = new HashMap<>();
//    IntStream.range(0, car.size() - 1).forEach(i -> cars.put(i + 1, car.get(i)));
//    {
//        System.out.println(cars);
//    }
//}
//@Test
//    public void m() {
//        List<String> car = new ArrayList<>();
//
//        car.add("renault");
//        car.add("mazda");
//        car.add("opel");
//        car.add("jeep");
//        car.add("заз");
//        car.add("ford");
//        car.add("audi");
//        car.add("wv");
//        car.add("ferrari");
//
//        char selectedLetter = 'a';
//
//        car.stream()
//                .filter(carName -> carName.contains(String.valueOf(selectedLetter)))
//                .forEach(System.out::println);}
//@Test
//    public void io() {
//    List<String> car = new ArrayList<>();
//
//    car.add("renault");
//    car.add("mazda");
//    car.add("opel");
//    car.add("jeep");
//    car.add("заз");
//    car.add("ford");
//    car.add("audi");
//    car.add("wv");
//    car.add("ferrari");
//
//
//
//}
    }
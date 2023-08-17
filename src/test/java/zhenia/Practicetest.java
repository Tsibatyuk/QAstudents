package zhenia;

import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;
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


        @Test
    public void streamLambdaMethod()
    {
        List<String> words = new ArrayList<>();
        words.add("Book");
        words.add("Sun");
        words.add("Bicycle");
        words.add("Ice Cream");
        words.add("Ocean");
        words.add("Coffee");
        words.add("Wind");
        words.add("Guitar");
        words.add("Basket");
        words.add("Medal");
        words.add("Park");
        words.add("Candle");
        words.add("Store");
        words.add("Koala");
        words.add("Park");
        words.add("Store");
        words.add("Rain");
        words.add("Lantern");
        words.add("Milk");
        words.add("Rocket");
        words.add("Theatre");
        words.add("Flamingo");
        words.add("Chocolate");
        words.add("Summer");
        words.add("Garland");
        words.add("Pizza");
        words.add("Cow");
        words.add("Pasta");
        words.add("Water");
        words.add("Computer");

//        List<String> sortedAlphabet = words.stream()
//                .sorted()
//                .collect(Collectors.toList());
//        System.out.println("In Alphabet: " + sortedAlphabet);
//
//        List<String> sortedLetter = words.stream()
//                .sorted(Comparator.comparingInt(String::length))
//                .collect(Collectors.toList());
//        System.out.println("For Symbol: "+ sortedLetter);
//
//        List<String> sortedReverseAlphabet = words.stream()
//                .sorted(Comparator.reverseOrder())
//                .collect(Collectors.toList());
//        System.out.println("In Reverse Alphabet: " + sortedReverseAlphabet);
//
//        List<String> sortedReverseLetter = words.stream()
//                .sorted(Comparator.comparingInt(String::length).reversed())
//                .collect(Collectors.toList());
//        System.out.println("In Reverse Letter: " + sortedReverseLetter);
//
//        Map<Integer, List<String>> groupedByLength = words.stream()
//                .collect(Collectors.groupingBy(String::length));
//        System.out.println("Grouped by length: " + groupedByLength);
//
//        List<String> shortWord = words.stream()
//                .filter(word -> word.length()<5)
//                .collect(Collectors.toList());
//        System.out.println("Word which < 5: "+ shortWord);

        Random random = new Random();
        String randomWord = words.stream()
                .skip(random.nextInt(words.size()))
                .findFirst()
                .orElse(" ");
        System.out.println("Your favorite word in the world is - " + randomWord);
    }
    public float has (){
      float sgs = 126.6f;
      return sgs;

    }
 @Test
    public  static void namely (){
        Sashaconstructor mali = new Sashaconstructor(37, (char) 7,23.7f,true);
     System.out.println(mali.calcolytor+" : "+ mali.calcolytor2 +" / "+mali.calcolytor3+" $ "+ mali.calcolytor4);
mali.setCalcolytor4(false);
     System.out.println(mali.calcolytor4);
    mali.setCalcolytor2((char)3);
     System.out.println(mali.getCalcolytor2());
    }

@Test
    public void Rosluna(){

        for  (int k1 = 0; k1 < 1;k1++){
        if (k1==0){
            for (k1 = 0; k1 < 1; k1++){
                System.out.println("             / ");
        for (int k = 0; k < 1;k++){
            if (k==0){
                for (k = 0; k < 1; k++){
                    System.out.println("            / ");

                    for (int e = 0; e < 1;e++){
                        if (e==0){
                            for (e = 0; e < 1; e++){
                                System.out.println("           / ");            }
            }
    }

                    for (int t = 0; t < 1;t++){
                        if (t==0){
                            for (t = 0; t < 1; t++){
                                System.out.println("          / ");}

}}}


                for (int l = 0; l < 1;l++){
                    if (l==0){
                        for (l = 0; l < 1; l++){
                            System.out.println("         / ");
            }
        }}

}
            for (int u = 0; u < 1;u++){
                if (u==0) {
                    for (u = 0; u < 1; u++) {
                        System.out.println("        /+ГЕЙ КЛАБ+ ");
                    }
                }}}}}}}
@Test
public void tree(){
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (i==j) {
                System.out.print("*");
            } else {

                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
}



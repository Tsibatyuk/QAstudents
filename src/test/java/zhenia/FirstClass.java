package zhenia;

import org.testng.annotations.Test;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class FirstClass {

    static int x = 1;

    @Test
    public void cold() {
        while (x < 10) {
            x++;
            System.out.println(x);

        }
        if (x==10){
            System.out.println("x дорівнює 10");
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(x);
        }


        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            for (int j = 0; j < 10; j++) {
                System.out.print(j);
            }
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("вибери цифру від '1', '2' або '3'");
        int number = sc.nextInt();

        if (number == 1) {
            System.out.println("Ви можете вибрати подарунок 10 або 11 доларів");
            number = sc.nextInt();
            if (number == 10) {
                System.out.println("ви вибрали 10");
            } else if  (number == 11) {
                System.out.println("ви вибрали 11");
            } else {
                System.out.println("ви вибрали не правильний бонус");
            }

        }

        if (number == 2) {
            System.out.println("Ви можете вибрати подарунок 20 або 22 доларів");

        }
        if (number == 3) {
            System.out.println("Ви можете вибрати подарунок 30 або 33 доларів");
        } else {
            System.out.println("ви вибрали не правильну цифру");
        }

    }

    Persona anna = new Persona("Anna", 25);
    Persona olenka = new Persona("Olena", 32, 172);
    Persona lida = new Persona("Lida", 18, 165, 120.102, 3.05);

    Examples vik = new Examples(75);


    @Test
    public void somePerson(){
        System.out.println(anna.getAge()+" " + anna.getName() +" "+ anna.getWeight());
        System.out.println(olenka.getName()+ " "+olenka.getAge()+ " "+olenka.getLanght());
        System.out.println(lida.getName()+" "+ lida.getAge()+" "+lida.getLanght()+" "+lida.getWeight());

        anna.setAge(48);
        anna.setLanght(12);

        System.out.println(anna.getName()+" "+anna.getAge()+" "+ anna.getLanght());
        System.out.println(lida.getName()+" "+lida.getLenghtOfTheDick());
        lida.setLenghtOfTheDick(11);
        System.out.println(lida.getName()+" "+lida.getLenghtOfTheDick());


        String kaka = "slovo";
        String nekaka = new String ("slovo");

        System.out.println(kaka == nekaka);
        System.out.println(kaka.equals(nekaka));
        System.out.println(kaka.hashCode());
        System.out.println(nekaka);
    }


}

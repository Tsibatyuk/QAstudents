package maksim;

import com.google.errorprone.annotations.Var;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

@Test
public class Shcool implements W,C,D {
    @Override
    public void hh(String[] args) {

        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
    }

    @Override
    public void hh() {
        for (int i = 0; i < 35; i++) {
            if (i < 33) ;
            System.out.println(i);

        }

    }

    @Override
    public void gg() {
        System.out.print(2);

    }

    @Override
    public void jj() {

        int f = 7;
        int a = 10;

        for (int g = 21; f + a <= g; )
            if (f + a == g) {
                System.out.print(g);
            }

    }

    @Override
    public void ff() {

        List<Integer> nb = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            nb.add(i);}
        List<Integer> odd = nb.stream()
                .filter(num -> num % 2 != 0)
                .sorted()
                .toList();

        System.out.println(odd);


    }





    @Override
    public void aa() {
        Scanner yy = new Scanner(System.in);


            List<String> fj = new ArrayList<>();


            fj.add("3");
            fj.add("Olenka");
            fj.add("55");
            fj.add("Vladik");
            fj.add("Zenya");
            fj.add("Sanya");


            while (true) {
                System.out.println("Оберіть цифру (0-5) для виведення елемента зі списку:");
                int input = yy.nextInt();

                if (input >= 0 && input < fj.size()) {
                    String element = fj.get(input);
                    System.out.println("Елемент списку: " + element);
                } else {
                    System.out.println("Невірний індекс. Спопробуйте знову.");

                    yy.close();
                }

            }

        }

    }
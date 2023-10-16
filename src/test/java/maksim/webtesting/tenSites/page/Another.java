package maksim.webtesting.tenSites.page;

import org.testng.annotations.Test;
import tests.BaseTest;

import static com.google.common.math.IntMath.factorial;

@Test
public class Another extends BaseTest {
    int x = 10;
    String res = (x > 5) ? "x >5" : "x<=5"; //тернарний оператор. якщо умова істина Х більше 5 шнакше Х менше або равно 5.

    int y = 2;
    String resalt = switch (y) { //Спрощений switch case.
        case 1 -> "one";
        case 2 -> "two";
        case 3 -> "three";
        default -> "another";
    };

    Runnable runnable = () -> System.out.println("Hi");


    public void voice() {
        System.out.println("voice");// Перевизначення метода:(оверрайд) перезаписуемо реалізацію метода у класі нащадку.
    }
}

class Cat extends Another {
    @Override
    public void voice() {
        System.out.println("miu");
    }

    class Dog extends Another {
        @Override
        public void voice() {
            System.out.println("uaf");
        }
    }

    public static void main(String[] args) {//метод викликає сам себе це є рекурсія!
        int n = factorial(6);
        System.out.println(n);
    }

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public void calcul() {           // перезавантаження метода: це використання  декільког методів з однаковим імь'м
        Calcul calc = new Calcul();                                         //но з різними параметрами в одному класі.
        calc.add(5, 5);
        calc.add(1, 2, 3);
        calc.add(2.0, 3.1);

    }

    class Calcul {
        int add(int a, int b) {
            return a + b;
        }

        int add(int a, int b, int c) {
            return a + b + c;
        }

        double add(double a, double b) {
            return a + b;
        }
    }
}




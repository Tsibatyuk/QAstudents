package maksim;

import java.util.Scanner;

public class Primitives  {

    public static void main(String[] args) {
        byte a = 127;
        short b = 256;
        int c = 512324;
        char  k;
        long d = 123456;
        float f = 2.6F;
        double h = 23.44;
        boolean j = true;
    }

    public static void fur(String[] args) {
        byte t = 12;
        short i = 23454;
        int c = 1463626546;
        char f = 5;
        long k = 231555345;
        float l = 33.3f;
        double r = 456.456;
        boolean u = false;
    }
    public static  void tt (){
        byte fg = 45;
        short gg = 3452;
        int rr= 325525553;
        char kk = 45;
        long ty = 76988888;
        float ee = 1.56f;
        double ww = 345.12;
        boolean i = true;
    }

public void cul(){

    System.out.println("введіть число:");
    Scanner bob = new Scanner(System.in);
    int a = bob.nextInt();

    int b = bob.nextInt();
    System.out.println("введыть число");

    char tod = bob.nextLine().charAt(0);

    int klark = 0;
    switch (tod){


        case '+':
             klark = a + b;
            System.out.println(klark);
            break;

        case '-':
             klark = a - b;
            System.out.println(klark);
            break;

        case '/':
             klark = a / b;
            System.out.println(klark);
            break;
        case '*':
             klark = a * b;
            System.out.println(klark);
            break;
        default:
            System.out.println("error");


    }
}
    }




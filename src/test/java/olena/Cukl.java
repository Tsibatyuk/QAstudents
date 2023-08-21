package olena;

public class Cukl {


    public static void main(String[] args) {
      int height =10;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <  i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*(height -i) -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    }


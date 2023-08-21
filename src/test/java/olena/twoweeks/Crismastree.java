package olena.twoweeks;

public class Crismastree {
    public static void main(String[] args) {
        int qqq = 12;
        for (int i = 0; i < qqq; i++) {
            for (int j = 0; j < qqq - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 *  i + 1 ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}

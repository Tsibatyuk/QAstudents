package pisun;


import org.testng.annotations.Test;

import java.util.Scanner;


public class Katana {
    @Test
    protected void User3() {
        for (int u = 0; u < 4; u++) {
            if (u == 0) {
                for (int m = 0; m < 4; m++) {
                    System.out.print(" $ ");
                }
            }

            if (u == 2) {
                System.out.println("");
                for (int m = 2; m < 4; m++) {
                    if (m == 1) {
                        System.out.print(" ");
                    } else System.out.print("   $ ");
                }
            }
            if (u == 3) {
                System.out.println("");
                for (int m = 3; m < 4; m++) {
                    if (m == 1) {
                        System.out.print(" ");
                    } else System.out.print("     $ ");
                }
            }
        }
    }




//    @Test
//    private void User2(){
//        for (int o = 0; o < 3; o++) {
//            if (o == 0) {
//                for (int p = 0; p < 3; p++) {
//                    System.out.print ("  *");
//                }
//
//            }
//            if (o == 1) {
//            System.out.println("");
//            for  (int p = 0; p < 3; p++) {
//                if (p == 0 ) {
//                    System.out.print(" ");
//                }else {
//                    System.out.print(" * ");
//                }
//            }
//        }
//
//            if (o == 1) {
//                System.out.println("");
//                for ( int p = 0; p < 3; p ++){
//                    if (p == 2) {
//                        System.out.print(" * ");
//                    }else {
//                        System.out.print(" ");
//                    }
//                }
//            }} }


    @Test
    public void User() {
        for (int k = 0; k < 3; k++) {
            if (k == 0) {
                for (int i = 0; i < 3; i++) {

                        System.out.print(" * ");
                    }
                } if (k == 1) {
                    System.out.println("");
                    for (int i = 0; i < 3; i++) {
                        if (i == 0) {
                            System.out.print(" ");
                        } else {
                            System.out.print(" * ");
                        }
                    }
                }
                if (k == 2) {
                    System.out.println("");
                    for (int i = 0; i < 3; i++) {
                        if (i == 2) {
                            System.out.print(" * ");
                        } else {
                            System.out.print(" ");
                        }

                    }
                }

            }
        }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Привіт , вибери число від 1 до 3");

        int number = sc.nextInt(); {

        if (number == 1) {
        System.out.println("Ти можеш вибрати бонус 10$ або 11$");
        } else if (number == 2) {
            System.out.println("якщо вибереш число 10 отримаєш 15");
        }}

}}

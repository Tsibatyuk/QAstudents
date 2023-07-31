package maksim;

import org.testng.annotations.Test;
import pisun.Studen;

import java.util.Scanner;

public class Myclass2 {

    double X = 2.5;

    @Test
    public void cv() {

        for (double X = 2.5; X <= 10; X++) {
            System.out.print(X);
        }

    }
    int SashunPisyun = 1;
    int y = 100;
        @Test
        public void nb() {

            if(SashunPisyun>1){
                System.out.println("у Санька здоровий писюн");
            }else {
                System.out.println("у Санька малий писюн");
            }
        }

  int F=3000;  @Test
          public void rm(){

              for (int z = 1; z < F; z++) {


                  if ( z < 200){
                  F = 3000;
                  System.out.println(z);
              }}
    }
    @Test
public void loop() {

        for (int j = 1; j < 10; j++) {
            System.out.print(j);
        }
    }@Test
    public void fg(){

      for (int g=40;g<120;g++){

          if (g==40);
          System.out.println(g);
        }}


    @Test
    public void gg() {

        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                    System.out.print("M");}
            if (i == 1)  {
                    System.out.print("a");}
            if (i == 2)
                   {System.out.print("k");}
            if (i == 3){
                    System.out.print("s");}
            if (i == 4){
                    System.out.print("i");}
            if (i == 5){
                    System.out.print("m");}
            if (i == 5){
                    System.out.print("-");}
            if (i == 6){
                    System.out.print("c");}
            if (i == 7){
                    System.out.print("o");}
            if (i == 8){
                    System.out.print("o");}
            if (i == 9){
                    System.out.print("l");}
        }
        }


            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.println("Виберіть цифру від 1 до 3 щоб отримати подарунок:");

                int number = sc.nextInt();

                if (number == 1) {
                    System.out.println("Ви можете вибрати подарунок 10 або 11 доларів");

                     number = sc.nextInt();

                if (number == 10) {
                    System.out.println("Ви обрали подарунок "+ number +" $");}
                else if (number == 11){
                    System.out.println("Ви обрали подарунок "+ number +" $");}
                   else {
                 System.out.println("Ви обрали невірний бонус"); }
                    }

                if (number == 2) {
                    System.out.println("Ви можете вибрати подарунок 20 або 22 доларів");

                    number = sc.nextInt();

                    if (number == 20) {
                        System.out.println("Ви обрали подарунок "+ number +" $");}
                    else if (number == 22){
                        System.out.println("Ви обрали подарунок "+ number +" $");}
                    else {
                        System.out.println("Ви обрали невірний бонус"); }
                }

                if (number == 3) {
                    System.out.println("Ви можете вибрати подарунок 30 або 33 доларів");

                    number = sc.nextInt();

                    if (number == 30) {
                        System.out.println("Ви обрали подарунок "+ number +" $");}
                    else if (number == 33){
                        System.out.println("Ви обрали подарунок "+ number +" $");}
                    else {
                        System.out.println("Ви обрали невірний бонус"); }
                }sc.close();



            }
        }

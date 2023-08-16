package olena;

import org.testng.annotations.Test;

@Test
public class Masuv {
    public void qqq() {
        int[] number = new int[6];  //створила масив в якому буде 6 обєктів

        number[0] = 10;
        number[1] = 20;
        number[2] = 30;
        number[3] = 40;
        number[4] = 50;
        number[5] = 60;


        for (int i = 0; i < number.length; i++)  //цим методом я викликаю довжину масиву


            System.out.println(number[i]);



    }
}
package maksim;

import org.testng.annotations.Test;

@Test
public class Zirochka {

    public void none() {
        int w =10;
        for (int i = 0; i < w; i++)
        {
            for (int j = 0; j < w - i - 1;j++)
            {
                System.out.print(" ");
            }
            System.out.println("*".repeat(2*i +1));
        }


    }}
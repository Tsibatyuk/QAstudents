package maksim;

import org.testng.annotations.Test;

public class Myclass2 {

    double X = 2.5;

    @Test
    public void cv() {

        for (double X = 2.5; X <= 10; X++) {
            System.out.print(X);
        }

    }
    int x = 50;
    int y = 100;
        @Test
        public void nb() {

            if(x>y){
                System.out.println("x>y");
            }else {
                System.out.println("y>x");
            }


        }
}





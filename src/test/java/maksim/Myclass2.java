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
    for (int i = 0; i < 7; i++) {
        System.out.println(i);
        for (int j = 0; j < 10; j++) {
            System.out.print(j);
        }
    }
}
}




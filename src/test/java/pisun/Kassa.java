package pisun;

import org.testng.annotations.Test;

public class Kassa {
@Test
    void Sisa() {
        for (int l = 0; l < 70; l++){

            if (l==1){
                System.out.println("l дорівнює 1");
                l=3;
            }if (l==2){
                System.out.println("l дорівнює 2");
            }if (l==3){
                System.out.println("l дорівнює 3");
            }else {
                System.out.print("1");
            }
        }
    }
}

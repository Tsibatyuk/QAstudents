package olena;

import org.testng.annotations.Test;

@Test
public class klass4 {
    public void klass4() {
        int[] qwerty = {1, 2, 3, 4, 5, 6, 7};
        for (int num : qwerty) {
            System.out.println(num);
        }

    }

    @Test
    public void klass5(){
        int x=4;
        if(x > 5) {
            System.out.println("x більше за 5");
        }
        else
        {
            System.out.println("x не більше за 5");
        }
    }
}




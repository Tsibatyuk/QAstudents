package olena.hotline.test;

import olena.hotline.pages2.Mainpage2;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Hotlin extends BaseTest {
@Test
    public void testHotline (){
        Mainpage2 te = new Mainpage2();
        te.openHotline()
                .goodLoginHotline()
                //.emptyField()
                .goodHotline();

    }
}

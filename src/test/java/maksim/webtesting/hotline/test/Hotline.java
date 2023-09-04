package maksim.webtesting.hotline.test;

import maksim.webtesting.hotline.pages.MainpageHot;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Hotline extends BaseTest {
    @Test
    public void openHotline(){
        MainpageHot ohl = new MainpageHot();
        ohl.openHotline()
                .SingUp()
                .pystePole()
                .singIn();
        sleep(5);
    }

}

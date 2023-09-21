package ilia.test;

import ilia.pages.rozetka.Mainpage;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Rozetkatest extends BaseTest {
    @Test
    public void rozetkaTests()
    {
        Mainpage mp = new Mainpage();
        mp.openRozetka()
                .checkCatalogList()
                .clickToMenuButton()
                .laptops()
                .price();
    }
}

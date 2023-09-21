package ilia.hotline.pages.test;

import ilia.hotline.pages.mainPage;
import org.testng.annotations.Test;
import pages.BasePage;

public class test extends BasePage {
    @Test
    public void hotlineTests()
    {
        mainPage mp = new mainPage();
        mp.openHotline();
    }
}

package ilia.Hotline1;

import org.testng.annotations.Test;
import tests.BaseTest;

public class testHotline extends BaseTest {
    @Test
    public void test()
    {
        Page p = new Page();
        p.openHotline();
    }

}

package ilia.Gmail.test;

import ilia.Gmail.Page.Page;
import org.testng.annotations.Test;
import tests.BaseTest;

public class testGmail extends BaseTest {
    @Test
    public void gmailTest()
    {
        Page p = new Page();
        p.openGmail()
        .clickToRegistration()
        .clickToNext()
        .insertPassword();
    }
}

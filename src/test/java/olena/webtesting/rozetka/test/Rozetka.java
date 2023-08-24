package olena.webtesting.rozetka.test;

import olena.webtesting.rozetka.pages.Mainpage;
import org.testng.annotations.Test;
import tests.BaseTest;


public class Rozetka extends BaseTest {
    @Test
    public void uklanguage() {
        Mainpage uk = new Mainpage();
        uk.openrozetka()
                .assertUrl()
                .cliktomenubutton()
                .printUniqueProductNames();
        sleep(4);
//        System.out.println("Ви обрали українську мову ");

    }
@Test
    public void qqq() {
            Mainpage ww = new Mainpage();
            ww.openrozetka()
                    .assertUrl()
                    .cliktomenubutton()
                            .cliksport();
    sleep(4);



    }
}

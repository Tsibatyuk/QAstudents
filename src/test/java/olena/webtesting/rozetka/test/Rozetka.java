package olena.webtesting.rozetka.test;

import olena.webtesting.rozetka.pages.Mainpage;
import org.testng.annotations.Test;
import tests.BaseTest;


public class Rozetka extends BaseTest {
    @Test
    public void uklanguage(){
        Mainpage uk = new Mainpage();
        uk.openrozetka()
                .assertUrl();
        System.out.println("Ви обрали українську мову ");

}
}

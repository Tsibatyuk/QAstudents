package olena.webtesting.rozetka.test;

import abstractpages.BaseTest;
import olena.webtesting.rozetka.pages.Mainpage;
import org.testng.annotations.Test;


public class Rozetka extends BaseTest {
    @Test
    public void uklanguage(){
        Mainpage uk = new Mainpage();
        uk.openrozetka()
                .assertUrl();
        System.out.println("Ви обрали українську мову ");

}
}

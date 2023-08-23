package venya.webtesting.rozetka;

import org.testng.annotations.Test;
import tests.BaseTest;
import venya.webtesting.rozetka.pages.rozetka.Mainpage;

public class Rozetka extends BaseTest {
    @Test
    public void ukrainian (){
        Mainpage ukr = new Mainpage();
        ukr.openrozetka()
        .assertUrl();
        System.out.println("мова на сайті - українська");





    }


}

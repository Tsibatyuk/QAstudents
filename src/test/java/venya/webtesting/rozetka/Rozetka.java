package venya.webtesting.rozetka;

import org.testng.annotations.Test;
import tests.BaseTest;
import venya.webtesting.rozetka.pages.rozetka.Mainpage;

public class Rozetka extends BaseTest {
    @Test
    public void ukrainian (){
        Mainpage ukr = new Mainpage();
        ukr.openrozetka()
        .assertUrl()
                .ClickToMenubutton()
                        .getTextfromList();
        sleep(4);
        System.out.println("мова на сайті - українська");


    }
@Test
    public void Experiment(){
     Mainpage roz = new Mainpage();
     roz.openrozetka()
             .checkTheLanguge()
//             .ClickToMenubutton()
             .clicksport();

sleep(15);

    }


}

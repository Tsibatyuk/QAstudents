package venya.webtesting.rozetka;

import org.testng.annotations.Test;
import tests.BaseTest;
import venya.webtesting.rozetka.pages.rozetka.Mainpage;

public class Rozetka extends BaseTest {
    @Test
    public void ukrainian() {
        Mainpage ukr = new Mainpage();
        ukr.openrozetka()
                .assertUrl()
                .ClickToMenubutton();
        sleep(4);
        System.out.println("мова на сайті - українська");


    }
    @Test
    public void menum(){
        Mainpage mp = new Mainpage();
        mp.openrozetka()
                .assertUrl()
                .ClickToMenubutton();


    }

    @Test
    public void laptopp() {
        Mainpage mp = new Mainpage();
        mp.openrozetka()
                .assertUrl()
                .ClickToMenubutton()
                .laptopcomp()
                .computer()
                .sort();
    }

    @Test
    public void Newmethod(){
        Mainpage mmp =new Mainpage();
        mmp.openrozetka();
    }
}
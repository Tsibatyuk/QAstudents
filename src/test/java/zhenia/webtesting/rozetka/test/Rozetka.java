package zhenia.webtesting.rozetka.test;

import org.testng.annotations.Test;
import tests.BaseTest;
import zhenia.webtesting.rozetka.pages.Mainpage;

public class Rozetka extends BaseTest {

    @Test
    public void rozetkaTest(){
        Mainpage mp = new Mainpage();
        mp.openRozetka()
                        .assertUrl();
        sleep(4);

    }
}

package zhenia.webtesting.rozetka.test;

import abstractpages.BaseTest;
import org.testng.annotations.Test;
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

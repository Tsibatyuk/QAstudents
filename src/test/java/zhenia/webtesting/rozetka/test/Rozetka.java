package zhenia.webtesting.rozetka.test;

import driver.DriverPoll;
import org.testng.annotations.Test;
import tests.BaseTest;
import zhenia.webtesting.rozetka.pages.Mainpage;

public class Rozetka extends BaseTest {

    @Test
    public void rozetkaTest(){
        Mainpage mp = new Mainpage();

        mp.openRozetka()
                .assertUrl()
                .checkTheLanguge()
                .getTextFromList();
        sleep(4);

    }


    @Test
    public static String solution(String str){
        String str2 = null;

        return str2;
    }
}

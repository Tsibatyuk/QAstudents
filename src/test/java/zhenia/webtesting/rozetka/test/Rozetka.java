package zhenia.webtesting.rozetka.test;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import driver.DriverPoll;
import org.testng.annotations.Test;
import tests.BaseTest;
import zhenia.webtesting.rozetka.pages.Mainpage;

public class Rozetka extends BaseTest {

    private  static final Logger logger = LogManager.getLogger(Rozetka.class);

    public void loggerMethod(){
        logger.error("Лог з рівнем еррор");
        logger.info("Лог з рівнем інфо");

    }
    @Test
    public void rozetkaTest(){

        Mainpage mp = new Mainpage();

        Rozetka rz = new Rozetka();

        mp.openRozetka()
                .assertUrl()
                .checkTheLanguge()
                .getTextFromList();
                rz.loggerMethod();

        sleep(4);

    }


    @Test
    public static String solution(String str){
        String str2 = null;

        return str2;
    }
}

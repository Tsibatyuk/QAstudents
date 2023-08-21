package zhenia.webtesting.rozetka.pages;

import abstractpages.BasePage;
import driver.DriverPoll;
import utiles.Config;

public class Mainpage extends BasePage {

public void openRozetka(){
    DriverPoll.getDriver().get("https://rozetka.com.ua/");
}
}

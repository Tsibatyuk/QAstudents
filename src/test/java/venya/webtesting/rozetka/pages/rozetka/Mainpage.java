package venya.webtesting.rozetka.pages.rozetka;

import driver.DriverPoll;
import org.openqa.selenium.firefox.Extension;
import org.testng.Assert;
import pages.BasePage;

public class Mainpage extends BasePage {
    public Mainpage openrozetka() {
        DriverPoll.getDriver().get("https://rozetka.com.ua");


        return this;
    }


    public Mainpage assertUrl(){

        Assert.assertEquals(DriverPoll.getDriver().getCurrentUrl(),"https://rozetka.com.ua/ua");



        return this;
    }







}

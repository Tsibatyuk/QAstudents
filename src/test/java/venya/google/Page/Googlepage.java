package venya.google.Page;

import driver.DriverPoll;
import pages.BasePage;

public class Googlepage extends BasePage {
    public Googlepage openGo() {
        DriverPoll.getDriver().get("https://www.google.com.ua/");
        sleep(5);
        return this;
    }
}

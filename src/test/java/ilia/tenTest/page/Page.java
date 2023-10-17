package ilia.tenTest.page;

import driver.DriverPoll;
import ilia.tenTest.stream.Stream1;
import org.testng.Assert;
import pages.BasePage;

public class Page extends BasePage {
    public Stream1 openMegogo()
    {
        DriverPoll.getDriver().get("https://megogo.net/en");
        return new Stream1();
    }
    public Page assertUrl()
    {
        Assert.assertEquals(DriverPoll.getDriver().getCurrentUrl(),"https://megogo.net/en");
        return this;
    }


}

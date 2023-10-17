package ilia.Hotline1;

import driver.DriverPoll;
import org.testng.Assert;
import pages.BasePage;

import java.sql.Driver;

public class Page extends BasePage
{
    public Page openHotline()
    {
        DriverPoll.getDriver().get("https://hotline.ua");
        return this;
    }
    public Page assertUrl()
    {
        Assert.assertEquals(DriverPoll.getDriver().getCurrentUrl(), "https://hotline.ua");
        return this;
    }
}

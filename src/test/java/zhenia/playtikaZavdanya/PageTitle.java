package zhenia.playtikaZavdanya;

import driver.DriverPoll;
import org.testng.Assert;

public class PageTitle {


    public static void main(String[] args) {
        String expected = "Welcome back,";
        String pageTitle = DriverPoll.getDriver().getTitle();
        Assert.assertEquals(pageTitle, expected, "the page title shold start whit '"+expected+"', but insteed we recieved '"+pageTitle+"'");
    }
//assert pageTitle.startsWith(expected) : "Page title does not start with expected string: " + pageTitle;
}

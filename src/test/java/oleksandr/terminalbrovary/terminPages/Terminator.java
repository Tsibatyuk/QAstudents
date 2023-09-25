package oleksandr.terminalbrovary.terminPages;

import driver.DriverPoll;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import tests.BaseTest;

import java.util.List;

public class Terminator extends BasePage
{
    @FindBy(xpath = "//a[@class='active']")
    private List<WebElement> batton;

    public Terminator openurly() {

        DriverPoll.getDriver().get("https://trc-terminal.com.ua/");
        return this;
    }
    @FindBy(xpath = "//a[@class='active']")
    private List<WebElement> contact;
    public Terminator clikcontakts(){
        sleep(3);
        click(contact.get(1));
        return new Terminator();
    }
}








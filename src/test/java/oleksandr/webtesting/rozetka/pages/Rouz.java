package oleksandr.webtesting.rozetka.pages;

import driver.DriverPoll;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.BasePage;

import java.util.List;

public class Rouz extends BasePage {
    public Rouz openrezka() {
        DriverPoll.getDriver().get("https://rezka.ag/");
        return this;
    }

   @FindBy(xpath = "//div[@class='b-content__inline_item']")
    private List<WebElement> films;



    public DyingScreaming clikfilms() {
        sleep(3);
        click(films.get(49));
        return new DyingScreaming();


    }}

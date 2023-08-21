package abstractpages;

import driver.DriverPoll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

abstract public class BasePage {

    protected WebDriverWait wait;
    private int BASE_WAIT = 5;

    public BasePage() {
        wait = new WebDriverWait(DriverPoll.getDriver(), Duration.ofSeconds(15));
        PageFactory.initElements(DriverPoll.getDriver(), this);
    }

    protected WebElement waitUntilElementToBeClickableByXpath(String locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }

    public void sleep(int millyseconds) {
        try {
            Thread.sleep(millyseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
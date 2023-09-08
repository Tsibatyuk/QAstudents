package olena.webtesting.hotline.pages2;

import driver.Browser;
import driver.DriverFactory;
import driver.DriverPoll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BasePage;
import tests.BaseTest;
import utiles.Config;
import utiles.PropertiesUtil;

import javax.print.DocFlavor;


public class Mainpage2 extends BasePage {

    public Mainpage2 openHotline(){
        DriverPoll.getDriver().get("https://hotline.ua/");
        sleep(2);
        return this;
    }
@FindBy(xpath = "//div[@class='user-button__image flex middle-xs center-xs']")
    private WebElement loginHotline;

    public Mainpage2 goodLoginHotline(){
        click(loginHotline);
        sleep(10);
        return this;
    }

    @FindBy(xpath = "//input[@class='field m_b-sm']")
    private WebElement usernameFieldHotline;

    @FindBy(xpath = "//input[@class='field']")
    private WebElement passwordFieldHotline;

    @FindBy(xpath = "//input[@class='btn-graphite btn-cell']")
    private WebElement enterButtonHotline;

    public Mainpage2 emptyField() {
        click(loginHotline);
        sleep(2);
        passwordFieldHotline.click();
        sleep(2);
        checkThatFieldIsEmpty(usernameFieldHotline);
        checkThatFieldIsEmpty(passwordFieldHotline);
        return this;
    }
    public Mainpage2 goodHotline(){
        click(usernameFieldHotline);
        sleep(9);
        passwordFieldHotline.sendKeys("Qwerty777");
        click(enterButtonHotline);
        sleep(9);
        usernameFieldHotline.sendKeys("njonja1309@gmail.com");
        click(passwordFieldHotline);
        sleep(9);

        return this;
    }

}

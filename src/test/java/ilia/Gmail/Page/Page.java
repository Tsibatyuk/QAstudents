package ilia.Gmail.Page;

import driver.DriverPoll;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class Page extends BasePage {
    public Page openGmail()
    {
        DriverPoll.getDriver().get("https://accounts.google.com/AccountChooser/identifier?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=AccountChooser&theme=glif");
        return this;
    }

    @FindBy(xpath = "//input[@class='whsOnd zHQkBf']")
    private List<WebElement> mail;
    public Page clickToRegistration()
    {
        click(mail.get(0));
        mail.get(0).sendKeys("iliakylymystyy@gmail.com");
        sleep(1);
        return this;
    }

    @FindBy(xpath = "//button[contains(@class,'XEXe-k')]")
    private List<WebElement> next;

    public Page clickToNext()
    {
        click(next.get(0));
        return this;
    }

    @FindBy(xpath = "//input[@class='whsOnd zHQkBf']")
    private List<WebElement> password;

    public Page insertPassword()
    {
        click(password.get(0));
        mail.get(0).sendKeys("0979725090Ilia_");
        sleep(1);
        return this;
    }

}

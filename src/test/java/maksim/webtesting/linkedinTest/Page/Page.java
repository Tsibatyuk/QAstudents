package maksim.webtesting.linkedinTest.Page;

import driver.DriverPoll;
import lombok.extern.log4j.Log4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

@Log4j
public class Page extends BasePage {


    public Page openLink() {
        log.info("open Linkidin");
        DriverPoll.getDriver().get("https://www.linkedin.com/");
        return this;
    }

    @FindBy(xpath = "//input[@id='session_key']")
    private WebElement mail;
    @FindBy(xpath = "//input[@id='session_password']")
    private WebElement pass;

    public Page sendPersonalData() {
        log.info("send Personal Data");
        click(mail);
        mail.sendKeys("maksim.tsybulko.work@gmail.com");
        click(pass);
        pass.sendKeys("481516nika");
        return this;
    }

    @FindBy(xpath = "//button[@data-id='sign-in-form__submit-btn']")
    private WebElement enter;

    public HomePage clickEnter() {
        click(enter);
        return new HomePage();
    }


}

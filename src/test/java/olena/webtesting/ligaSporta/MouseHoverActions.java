package olena.webtesting.ligaSporta;

import driver.DriverPoll;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.BasePage;

import java.util.List;

public class MouseHoverActions extends BasePage {
    @FindBy(xpath = "//div[@class='col-md-3 col-sm-4 col-xs-6']//div[@class='name']/span")
    private List<WebElement> sectionsInPneumaticWeapon;

    public MouseHoverActions mouseHoverActions() {

        for (WebElement section : sectionsInPneumaticWeapon) {

            String beforHoverCss = section.getCssValue("color");
            System.out.println(beforHoverCss);
            moveToElement(section);
            String afterHoveCss = section.getCssValue("color");
           System.out.println(afterHoveCss);
            Assert.assertNotEquals(beforHoverCss, afterHoveCss);
            System.out.println("Колір змінився");
        }
        return this;
    }
}

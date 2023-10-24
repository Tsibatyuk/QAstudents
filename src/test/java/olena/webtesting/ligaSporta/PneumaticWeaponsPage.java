package olena.webtesting.ligaSporta;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class PneumaticWeaponsPage extends BasePage {
    @FindBy(xpath = "//a[@class='dark_link']/*[text()='Пневматична зброя']")
    private WebElement btnPneumaticWeapon;
    public MouseHoverActions navigateToPneumaticWeapons(){
        click(btnPneumaticWeapon);
        return new MouseHoverActions();
    }
}

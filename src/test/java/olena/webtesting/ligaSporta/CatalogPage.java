package olena.webtesting.ligaSporta;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class CatalogPage extends BasePage {
    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    private WebElement catalog;

    public PneumaticWeaponsPage navigateToCatalog() {
        click(catalog);
        return new PneumaticWeaponsPage();
    }
}

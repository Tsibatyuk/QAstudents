package olena.webtesting.avtoRia;

import driver.DriverPoll;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import pages.BasePage;

public class ClickAdvancedSearch extends BasePage {
    @FindBy(xpath = "//a[@class='ext-end']")
    private WebElement advancedSearch;



    public ClickAdvancedSearch followTheLink() {
        DriverPoll.getDriver().get("https://auto.ria.com/uk/?utm_source=ria&utm_medium=text_link&utm_content=header&utm_campaign=main_page");
        return this;
    }

    public FillInAllSearchFields clickAdvancedSearch() {
        click(advancedSearch);
        return new FillInAllSearchFields();
    }


}

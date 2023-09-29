package olena.webtesting.dyson;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Basket extends BasePage {

    @FindBy(xpath = "//span[@class='btn-content'][text()='Оформити замовлення']")
    private WebElement makeOrderBtn;

    public CreateNewCustomer clickToOrderBtn() {
        click(makeOrderBtn);
        return new CreateNewCustomer();
    }
}

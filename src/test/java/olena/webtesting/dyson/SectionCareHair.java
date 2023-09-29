package olena.webtesting.dyson;

import driver.DriverPoll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

import java.util.List;

public class SectionCareHair extends BasePage {

    @FindBy(xpath = "//div[@class='catalogCard-info']")
    private List<WebElement> productCards;
    @FindBy(xpath = "//a[@class='btn __special j-buy-button-add']//span[text()='Купити']")
    private List<WebElement> buyBtnOfProductCard;

    public SectionCareHair moveToSecondProductCard() {
        moveToElement(productCards.get(1));
        return new SectionCareHair();
    }

    public Basket clickBuyBtnOfSecondProductCard() {
        click(buyBtnOfProductCard.get(1));
        sleep(3);
        return new Basket();
    }


}

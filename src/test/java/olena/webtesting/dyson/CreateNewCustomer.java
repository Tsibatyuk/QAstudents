package olena.webtesting.dyson;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class CreateNewCustomer extends BasePage {
    @FindBy(xpath = "//input[@name='Recipient[delivery_name]']")
    private WebElement name;
    @FindBy(xpath = "//input[@name='Recipient[delivery_phone]']")
    private WebElement phone;
    @FindBy(xpath = "//span[@class='checkbox']")
    private WebElement dontCallMe;
    @FindBy(xpath = "//input[@name='Recipient[delivery_city]']")
    private WebElement city;
    @FindBy(xpath = "//li[@class='ui-menu-item'][1]")
    private WebElement firstCity;
    @FindBy(xpath = "//input[@name='Recipient[delivery_email]']")
    private WebElement email;
    @FindBy(xpath = "//i[@class='selectboxit-arrow selectboxit-default-arrow']")
    private List<WebElement> selectPayment;
    @FindBy(xpath = "//a[@class='selectboxit-option-anchor']//*[contains(text(),'Післяплата')]")
    private WebElement cashOnDeliveruBtn;

    public CreateNewCustomer writeName() {
        setValue(name, "Жмудь Олена");
        return new CreateNewCustomer();
    }

    public CreateNewCustomer writePhone() {
        setValue(phone, "939816044");
        return new CreateNewCustomer();
    }

    public CreateNewCustomer clickDontCallMe() {
        click(dontCallMe);
        return this;
    }

    public CreateNewCustomer writeCity() {
        setValue(city, "Бровари");
        return this;
    }

    public CreateNewCustomer selectFirstCity() {
        click(firstCity);
        return this;
    }

    public CreateNewCustomer clickEmail() {
        click(email);
        return this;
    }

    public CreateNewCustomer writeEmail() {
        setValue(email, "njonja1309@gmail.com");
        sleep(2);
        return this;
    }

    public CreateNewCustomer clickSelectPayment() {
        click(selectPayment.get(2));
        return this;
    }

    public CreateNewCustomer clickCashOnDeliveru() {
        click(cashOnDeliveruBtn);
        return this;
    }


}
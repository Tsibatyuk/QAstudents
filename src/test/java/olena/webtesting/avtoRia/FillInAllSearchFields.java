package olena.webtesting.avtoRia;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class FillInAllSearchFields extends BasePage {
    @FindBy(xpath = "//label[@class='radio-btn'][text()='Вживані']")
    private WebElement usedButton;
    @FindBy(xpath = "//label[@for='fuelElectro']")
    private WebElement electroCar;
    @FindBy(xpath = "//label[@for='body.id[5]']")
    private WebElement crossover;
    @FindBy(xpath = "//select[@id='at_year-from']")
    private WebElement yearFrom;
    @FindBy(xpath = "//select[@id='at_year-from']//option[@value='2017']")
    private WebElement year2017;
    @FindBy(xpath = "//input[@id='at_price-from']")
    private WebElement priceFrom;
    @FindBy(xpath = "//input[@id='at_price-to']")
    private WebElement priceTo;
    @FindBy(xpath = "//label[@for='auction']")
    private WebElement possibleBargaining;

    public FillInAllSearchFields clickUsedButton() {
        click(usedButton);
        return this;
    }

    public FillInAllSearchFields clickElectroCar() {
        click(electroCar);
        return this;
    }

    public FillInAllSearchFields clickCrossover(){
        click(crossover);
        return this;
    }
    public FillInAllSearchFields clickYearFrom(){
        click(yearFrom);
        return this;
    }
    public FillInAllSearchFields choose2017year(){
        click(year2017);
        return this;
    }
    public FillInAllSearchFields choosePriceFrom(){
        scroll(600);
        setValue(priceFrom,"10000");
        return this;
    }
    public FillInAllSearchFields choosePriceTo(){
        setValue(priceTo,"25000");
        return this;
    }
    public FillInAllSearchFields clickPossibleBargaining(){
        click(possibleBargaining);
        return this;
    }



}
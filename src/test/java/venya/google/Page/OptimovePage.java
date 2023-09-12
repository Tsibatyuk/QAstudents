package venya.google.Page;

import driver.DriverPoll;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import venya.google.Test.Hotlinetest;
import venya.webtesting.rozetka.pages.rozetka.Mainpage;

import java.util.List;

public class OptimovePage extends BasePage{

    public OptimovePage openOptimove() {
            DriverPoll.getDriver().get("https://www.optimove.com");
            return this;
        }

        @FindBy(xpath = "//div[@class ='header-nav__item header-nav__item--has-children d-mobile d-desktop']")
        private List<WebElement> company;


    public void hoverElement(int index) {
        Actions actions = new Actions(DriverPoll.getDriver());

        if (index >= 0 && index < company.size()) ;
        WebElement elementToHover = company.get(index);
        actions.moveToElement(elementToHover).perform();

    }

    @FindBy(xpath ="//div[@class='header-nav__item header-nav__item--current header-nav__item--is-child d-mobile d-desktop']")
    private WebElement careers;

    public Hotlinetest testcareers() {
        click(careers);
        scroll(4200);
        sleep(2);
        return this.testcareers();
    }

    @FindBy(xpath = "//div[@class='selectric-hide-select']")
    private WebElement selectall;

    public OptimovePage select() {
        click(selectall);
        sleep(2);
        return this;

    }



}



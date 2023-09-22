package oleksandr.webtesting.rozetka.pages;

import driver.DriverPoll;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class DyingScreaming extends BasePage {
    @FindBy(xpath = "//*[text()='1964 года']")
    private WebElement killplanet;


    public DyingScreaming dataseptember(){
        String clousedata =killplanet.getText().replaceAll("[^0-9]","");
        int clousedate1 = Integer.parseInt(clousedata);
        System.out.println(clousedate1);


        return this;

    }
}

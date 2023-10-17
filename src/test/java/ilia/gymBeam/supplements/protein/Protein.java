package ilia.gymBeam.supplements.protein;

import driver.DriverPoll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class Protein extends BasePage {
//    @FindBy(xpath = "//li[@class='level1 nav-1-1 category-item first active parent']")
    @FindBy(xpath = "//*[text()='Протеїни']")
    private List<WebElement> toClick;

    public Wheyprotein openProtein()
    {
//        click(toClick.get(1));
//        DriverPoll.getDriver().findElements(By.xpath("//*[text()='Протеїни']")).get(3).click();
        DriverPoll.getDriver().findElement(By.xpath("(//li[@class='level1 nav-1-1 category-item first parent']/a/span[text()='Протеїни'])[2]")).click();
        sleep(2);
        return new Wheyprotein();
    }
}

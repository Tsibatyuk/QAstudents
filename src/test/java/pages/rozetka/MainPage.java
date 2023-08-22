package pages.rozetka;

import driver.DriverPoll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

import java.util.List;

public class MainPage extends BasePage {

    public MainPage openPage(){
        DriverPoll.getDriver().get("https://rozetka.com.ua/");
        return this;
    }
public MainPage getListOfElements() {
    List<WebElement> elements = DriverPoll.getDriver().findElements(By.xpath("//a[@class='menu__link']"));
    elements.stream().map(WebElement::getText).forEach(System.out::println);
    
//    elements.forEach(element -> {
//        String text = element.getText();
//        System.out.println(text);
//    });
    System.out.println(elements.size());
    System.out.println(elements.get(2).getText());
    elements.forEach(name -> System.out.println(name.hashCode()));
    return this;
}

    @FindBy(xpath = "//*[@id='fat-menu']")
    public WebElement menuBtn;

    public MainPage clickMenuBtn(){
        click(menuBtn);
        return this;
    }
}

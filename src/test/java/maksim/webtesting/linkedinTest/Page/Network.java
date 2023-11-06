package maksim.webtesting.linkedinTest.Page;

import lombok.extern.log4j.Log4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

@Log4j
public class Network extends BasePage {


    @FindBy(xpath = "//span[@class='artdeco-button__text'][text()='Встановити контакт']")
    private List<WebElement> friends;

    public Network forFriends() {
        log.info("click friends");
        friends.stream().forEach(friends -> friends.click());
        sleep(7);
        return this;
    }
}

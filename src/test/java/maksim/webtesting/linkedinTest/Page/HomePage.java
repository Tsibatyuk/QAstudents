package maksim.webtesting.linkedinTest.Page;

import lombok.extern.log4j.Log4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.awt.*;
import java.util.List;

@Log4j
public class HomePage extends BasePage {

    @FindBy(xpath = "//a[@ class='app-aware-link  global-nav__primary-link']")
    private List<WebElement> net;

    public Network network() {
        log.info("click network");
        click(net.get(0));
        return new Network();
    }
}

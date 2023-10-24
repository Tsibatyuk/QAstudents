package olena.webtesting.planetakino;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class ClickMovieSection extends BasePage {
    @FindBy(xpath = "//a[@class='h-m__item-link'][text()='Фільми']")
    private WebElement movieSection;

    public SortingMoviesByTitle clickMovieSection(){
        click(movieSection);

        return new SortingMoviesByTitle();
    }
}

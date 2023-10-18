package maksim.webtesting.testGoogleMap.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class SearchGoogleMap extends BasePage {

    @FindBy(xpath = "//h3[@class='LC20lb MBeuO DKV0Md'][text()='Google Maps']")
    private WebElement googleMaps;


    public GoogleMaps clicMaps(){
        click(googleMaps);
        return new  GoogleMaps();
    }
}

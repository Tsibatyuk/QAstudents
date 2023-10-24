package olena.webtesting.ligaSporta;

import driver.DriverPoll;
import pages.BasePage;

public class LigaSportaPage extends BasePage {
    public CatalogPage openSite(){
        DriverPoll.getDriver().get("https://ligasporta.com.ua/ua/");
        return new CatalogPage();
    }

}

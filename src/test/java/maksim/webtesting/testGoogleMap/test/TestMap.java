package maksim.webtesting.testGoogleMap.test;

import maksim.webtesting.testGoogleMap.page.PageMap;
import org.testng.annotations.Test;
import tests.BaseTest;

public class TestMap extends BaseTest {
@Test
    public void testGoogleMapsRoute(){
        PageMap map = new PageMap();
        map.openGoogle()
                .clicSearch()
                .sendkeyMap()
                .clicSearchGoodle()
                .clicMaps()
                .clicButtonRoute()
                .chooseCar()
                .clicWhere()
                .sendkeysWhere()
                .clicWhereWeGo()
                .sendKeysWhereWeGo()
                .clicFastRoute();
        sleep(5);
    }
}

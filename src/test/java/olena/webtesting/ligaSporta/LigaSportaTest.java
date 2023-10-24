package olena.webtesting.ligaSporta;

import org.testng.annotations.Test;
import tests.BaseTest;

public class LigaSportaTest extends BaseTest {
    @Test
    public void testLigaSporta() {
        new LigaSportaPage()
                .openSite()
                .navigateToCatalog()
                .navigateToPneumaticWeapons()
                .mouseHoverActions();

    }
}

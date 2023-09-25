package maksim.webtesting.tenSites.test;

import maksim.webtesting.tenSites.page.Page;
import org.testng.annotations.Test;
import tests.BaseTest;

public class PlanetaKino extends BaseTest {
    @Test
    public void testKino(){
        Page planeta = new Page();
        planeta.openKino()
                .upNum();
    }
}

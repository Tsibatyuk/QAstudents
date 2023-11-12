package olena.webtesting.optimove.test;

import olena.webtesting.optimove.maiven3.Manpage3;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Optimove extends BaseTest {
    @Test
    public void testOptimove() {
        Manpage3 te = new Manpage3();
        te.openOptimove()
                .hoverOverCompanyElement(3);
        sleep(3);
        te.clickCareers()

                .clickButton();

    }
}

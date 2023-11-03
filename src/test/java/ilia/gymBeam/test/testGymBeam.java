package ilia.gymBeam.test;

import ilia.gymBeam.page.Page;
import org.testng.annotations.Test;
import tests.BaseTest;

public class testGymBeam extends BaseTest {

    @Test
    public void GYM() {
        Page p = new Page();
        p.sport()
                .openSpotsSupplements()
                .openProtein()
                .openWheyProtein()
                .outPutListOfProtein()
                .outPutSortedListOfProtein()
                .outPutFilteredListOfProtein()
                .outPutMaxElementOfProtein()
                .outPutLimitlistofprotein()
                .outPutRandomProtein()
                .outPutMineElementOfProtein();
    }
}

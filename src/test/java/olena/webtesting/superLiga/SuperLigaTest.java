package olena.webtesting.superLiga;

import org.testng.annotations.Test;
import tests.BaseTest;

public class SuperLigaTest extends BaseTest {
    @Test
    public void testSuperLiga() {
        new MainPageSuperLiga()
                .openSuperLigaWebsite()
                .navigateToBallsSection()
                .selectFootballBalls();
//                .checkPricesAbove1500();
        sleep(3);
    }
}

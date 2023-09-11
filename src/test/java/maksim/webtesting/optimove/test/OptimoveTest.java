package maksim.webtesting.optimove.test;

import maksim.webtesting.optimove.page.MainPage;
import org.testng.annotations.Test;
import tests.BaseTest;

public class OptimoveTest extends BaseTest {
    @Test
    public void testZekaOptimove() {
        MainPage met = new MainPage();
        met.openOptimove()
                .cursor(3)
                .careers()
                .closeIframe();
        sleep(4);
    }
}

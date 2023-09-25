package maksim.webtesting.tenSites.test;

import maksim.webtesting.tenSites.page.Page;
import org.testng.annotations.Test;
import tests.BaseTest;

public class DateTest extends BaseTest {
    @Test
    public void dateTest(){
        Page data = new Page();
        data.openDate()
                .dateparseInt();
    }}



package maksim.webtesting.linkedinTest.Test;

import lombok.extern.log4j.Log4j;
import maksim.webtesting.linkedinTest.Page.Page;
import pages.BasePage;
import tests.BaseTest;

public class Test extends BaseTest {

    @org.testng.annotations.Test
    public void logInLinkidin() throws InterruptedException {
        Page log = new Page();
        log.openLink()
                .sendPersonalData()
                .clickEnter()
                .network()
                .forFriends();
        sleep(10);
    }


}

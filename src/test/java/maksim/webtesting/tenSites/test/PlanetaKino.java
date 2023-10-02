package maksim.webtesting.tenSites.test;

import maksim.webtesting.tenSites.page.LambdaInterface;
import maksim.webtesting.tenSites.page.LamdaPage;
import maksim.webtesting.tenSites.page.Page;
import maksim.webtesting.tenSites.page.StreamPage;
import org.testng.annotations.Test;
import tests.BaseTest;

public class PlanetaKino extends BaseTest {
    @Test
    public void testKino() {
        Page planeta = new Page();
        planeta.openKino()
                .upNum();
    }

    @Test
    public void testSomething() {
        Page some = new Page();
        some.openKino()
                .some();
    }

    public void iframe() {
        Page ifra = new Page();
        ifra.openKino()
                .closeIframe();
    }

    @Test
    public void listDesktop() {
        Page desk = new Page();
        desk.openKino()
                .listTop();
    }

    @Test
    public void listMovies() {
        StreamPage list = new StreamPage();
        list.openPlanetaKino()
                .movies();
    }

    @Test
    public void MoviesList() {
        StreamPage mov = new StreamPage();
        mov.openPlanetaKino()
                .clicRozdil()
                .listfilms();
    }

    @Test
    public void DXmovie() {
        StreamPage dx = new StreamPage();
        dx.openPlanetaKino()
                .enterDx()
                .DxFilms();
    }

    @Test
    public void other() {
        StreamPage oth = new StreamPage();
        oth.openPlanetaKino()
                .clicOther()
                .otherMethod();
    }

    @Test
    public void info() {
        StreamPage inf = new StreamPage();
        inf.openPlanetaKino()
                .clicContacts()
                .infoMethod();
    }

    @Test
    public void infoMax(){
        StreamPage info = new StreamPage();
        info.openPlanetaKino()
                .clicContacts()
                .informMax();

    }
    @Test
    public void loginRozetka(){
        StreamPage open = new StreamPage();
        LamdaPage log = new LamdaPage();
        open.openPlanetaKino();
        log.clicLogin()
                .clicEmail()
                .clicPass()
                .clicButtonEnter()
                .clicRozklad()
                .clicMavka()
                .clicTicket();
    }
}

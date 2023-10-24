package olena.webtesting.planetakino;

import org.testng.annotations.Test;
import tests.BaseTest;

public class Planetakino extends BaseTest {
    @Test
    public void cssPlanetakino() {
        MainpagePlanetakino css = new MainpagePlanetakino();
        css.openPlanetakino()
                .cssPlanetaKino();
    }

    @Test
    public void closeIFrame() {
        MainpagePlanetakino clo = new MainpagePlanetakino();
        clo.openPlanetakino()
                .desktopPlaneta()
                .clackLi();
    }

    @Test
    public void streamKino1() {
        MainpagePlanetakino str = new MainpagePlanetakino();
        str.openPlanetakino()
                .streamKino();
    }

    @Test
    public void fourDXKino() {
        MainpagePlanetakino fou = new MainpagePlanetakino();
        fou.openPlanetakino()
                .streamfourDX();
    }

    @Test
    public void clikFiltrKino() {
        MainpagePlanetakino cli = new MainpagePlanetakino();
        cli.openPlanetakino()
                .clikFiltr();
    }

    @Test
    public void reduceKino() {
        MainpagePlanetakino ret = new MainpagePlanetakino();
        ret.openPlanetakino()
                .reduce();
    }
@Test
    public void movieListGenreTest() {

        MainpagePlanetakino url = new MainpagePlanetakino();
        ClickMovieSection move = new ClickMovieSection();
        SortingMoviesByTitle list = new SortingMoviesByTitle();
        url.openPlanetakino();
        move.clickMovieSection();
        list.takingTheNamesOfTheFilmsIntoAList()
                .genresInTheMovieSection();
    }

}

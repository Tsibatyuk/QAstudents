package olena.webtesting.avtoRia;

import org.testng.annotations.Test;
import tests.BaseTest;

public class TestAvtoRia extends BaseTest {
    @Test
    public void filterMachineSelection() {
        new ClickAdvancedSearch()
                .followTheLink()
                .clickAdvancedSearch()
                .clickUsedButton()
                .clickElectroCar()
                .clickCrossover()
                .clickYearFrom()
                .choose2017year()
                .choosePriceFrom()
                .choosePriceTo()
                .clickPossibleBargaining()
                .clikKyiv()
                .clikParticipationInARoadAccident()
                .clickWasNotInAnAccident()
                .clickTechnicalCondition()
                .clickCompletelyIntact()
                .clickPaintCoating();
        sleep(5);
    }
}

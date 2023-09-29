package olena.webtesting.dyson;

import org.testng.annotations.Test;
import tests.BaseTest;

public class TestDyson extends BaseTest {

    @Test
    public void buyGoods(){
        new UrlDyson()
                .goToHomePage()
                .moveToSubMenu()
                .clickStyler()
                .moveToSecondProductCard()
                .clickBuyBtnOfSecondProductCard()
                .clickToOrderBtn()
                .writeName()
                .writePhone()
                .clickDontCallMe()
                .writeCity()
                .selectFirstCity()
                .clickEmail()
                .writeEmail()
                .clickSelectPayment()
                .clickCashOnDeliveru();
    }


}
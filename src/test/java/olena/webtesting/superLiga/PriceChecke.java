package olena.webtesting.superLiga;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PriceChecke extends BasePage {

    List<String> availableProducts;
    @FindBy(xpath = "//span[@class='price']")
    private List<WebElement> prise;
    @FindBy(xpath = "//li[@class='discounted-price']")
    private List<WebElement> discountedPrice;
    @FindBy(xpath = "//div[@class='products-quantity instock']")
    private List<WebElement> theProductIsAvailable;
    @FindBy(xpath = "//div[@class='products-quantity nostock']")
    private List<WebElement> notInAvailability;
    @FindBy(xpath = "//div[@class='products-txt-block']")
    private List<WebElement> allText;

    public static void main(String[] args) {

    }}

//    public PriceChecke listTheProductIsAvailable() {
//        List<String> productTexts = allText.stream()
//                .map(WebElement::getText)
//                .collect(Collectors.toList());
//
//        availableProducts = productTexts.stream()
//                .filter(text -> text.contains("В наявності"))
//                .collect(Collectors.toList());
//
////        System.out.println(availableProducts);
//        return this;
//
//    }
//
//    public PriceChecke checkPricesAbove1500() {
//        Map<String, Integer> productPrices = new HashMap<>();
//
//        for (String productText : availableProducts) {
//            // Виділяємо ціну з тексту
//            int price = extractPriceFromText(productText);
//            // Додаємо ціну до мапи
//            productPrices.put(productText, price);
//        }
////
//        // Фільтруємо товари з ціною вище 1500
//        Map<String, Integer> expensiveProducts = productPrices.entrySet().stream()
//                .filter(entry -> entry.getValue() > 1500)
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//
//        // Виводимо товари та їх ціни
//        for (Map.Entry<String, Integer> entry : expensiveProducts.entrySet()) {
//            System.out.println("Товар: " + entry.getKey());
//            System.out.println("Ціна: " + entry.getValue());
//        }
//        return this;
//    }
////
//    private int extractPriceFromText(String productText) {
//        int grnIndex = productText.indexOf("грн");
//
//        if (grnIndex != -1) {
//            String priceText = productText.substring(grnIndex - 5, grnIndex).trim();
//
//            try {
//                return Integer.parseInt(priceText);
//            } catch (NumberFormatException e) {
//                return 0;
//            }
//        }
//
//        return grnIndex;
//
//    }
//}
//

//        List<String> prices = new ArrayList<>();
//        List<String> discountedPrices = new ArrayList<>();
//        for (int i = 0; i < Math.min(prise.size(), discountedPrice.size()); i++) {
//            WebElement priceElement = prise.get(i);
//            WebElement discountedPriceElement = discountedPrice.get(i);
//            String priceText = priceElement.getText();
//            String discountedPriceText = discountedPriceElement.getText();
//
//            prices.add(priceText);
//            discountedPrices.add(discountedPriceText);
//        }
//
//        System.out.println("Ціни товарів:");
//        for (int i = 0; i < prices.size(); i++) {
//            System.out.println("Товар " + (i + 1) + " - Звичайна ціна: " + prices.get(i));
//            System.out.println("Товар " + (i + 1) + " - Знижена ціна: " + discountedPrices.get(i));
//        }
//
//        return this;
//    }








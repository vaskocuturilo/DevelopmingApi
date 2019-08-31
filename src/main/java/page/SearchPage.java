package page;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchPage {

    private static String SORT_BY_ICON = "select.field-input.field-input--primary";

    public static List<String> getProductNameForItemsRange(String number) {
        return $$(".product-title-link.line-clamp.line-clamp-2").texts().subList(0, Integer.parseInt(number));
    }

    public static String getProductPriceForItemsRange(String number) {
        return $$(".product-variant-price").texts().subList(0, Integer.parseInt(number)).toString().replace("$", "");
    }

    public SearchPage selectSortBy(SortValues sortType) {
        if (!sortType.equals(SortValues.NONE)) {
            selectSortByOptionByName(sortType);
        }
        return this;
    }

    @Step
    private void selectSortByOptionByName(SortValues sortType) {
        $(SORT_BY_ICON).waitUntil(Condition.visible, 1000).click();
        $(SORT_BY_ICON).selectOptionByValue(sortType.getValue());
    }
}

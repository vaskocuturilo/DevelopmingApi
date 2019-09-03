package page;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


/**
 * The type Search page.
 */
public class SearchPage {

    /**
     * Constant sortByIcon.
     */
    private static String sortByIcon = "select[class='field-input.field-input--primary']";

    /**
     * Constant DELAY.
     */
    private static final long DELAY = 5000;

    /**
     * Gets product name for items range.
     *
     * @param number the number
     * @return the product name for items range
     */
    public static List<String> getProductNameForItemsRange(final String number) {
        return $$(".product-title-link.line-clamp.line-clamp-2").texts().subList(0, Integer.parseInt(number));
    }

    /**
     * Gets product price for items range.
     *
     * @param number the number
     * @return the product price for items range
     */
    public static String getProductPriceForItemsRange(final String number) {
        return $$(".product-variant-price").texts().subList(0, Integer.parseInt(number)).toString().replace("$", "");
    }

    /**
     * Method select sort by search page.
     *
     * @param sortType the sort type.
     * @return the search page.
     */
    public SearchPage selectSortBy(final SortValues sortType) {
        if (!sortType.equals(SortValues.NONE)) {
            selectSortByOptionByName(sortType);
        }
        return this;
    }

    /**
     * Method select sort by option by name.
     *
     * @param sortType the sort type.
     */
    @Step
    private void selectSortByOptionByName(final SortValues sortType) {
        $(sortByIcon).waitUntil(Condition.visible, DELAY).click();
        $(sortByIcon).selectOptionContainingText(sortType.getValue());
    }
}

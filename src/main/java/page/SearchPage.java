package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * The type Search page.
 */
public class SearchPage {

    /**
     * Value sortByIcon.
     */
    private static String sortByIcon = "select[aria-label='Sort Filter']";

    /**
     * Value productsName.
     */
    private static ElementsCollection
            productsName = $$("a[class='product-title-link line-clamp line-clamp-2']"),
            productsPrice = $$("span[class='product-variant-price']");

    /**
     * Constant DELAY.
     */
    private static final long DELAY = 5000;

    /**
     * Default constructor.
     */
    public SearchPage() {
        super();
        //empty
        return;
    }

    /**
     * Gets product name for items range.
     *
     * @param number the number
     * @return the product name for items range
     */
    public static List<String> getProductNameForItemsRange(final String number) {
        return productsName.texts().subList(0, Integer.parseInt(number));
    }

    /**
     * Gets product price for items range.
     *
     * @param number the number
     * @return the product price for items range
     */
    public static String getProductPriceForItemsRange(final String number) {
        return productsPrice.texts().subList(0, Integer.parseInt(number)).toString().replace("$", "");
    }

    /**
     * Method select sort by search page.
     *
     * @param sortType the sort type.
     * @return the search page.
     */
    public SearchPage selectSortBy(final SortValues sortType) {
        if (!sortType.equals(SortValues.NEW)) {
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

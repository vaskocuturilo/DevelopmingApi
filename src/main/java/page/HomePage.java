package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;


/**
 * The type Home page.
 */
public class HomePage {

    /**
     * The private selenide element.
     */
    private SelenideElement
            headerSearchField = $("input[id='global-search-input']");

    /**
     * Enter text to search field search page.
     *
     * @param text the text
     * @return the search page
     */
    public SearchPage enterTextToSearchField(final String text) {
        headerSearchField.setValue(text).pressEnter();
        return new SearchPage();
    }
}

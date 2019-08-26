package base;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.ResourceBundle;

import static com.codeborne.selenide.Selenide.*;


/**
 * The type Base api.
 */
public class BaseAPI {

    /**
     * The Url string.
     */
    String urlString = ResourceBundle.getBundle("").getString("");

    /**
     * The Api key.
     */
    String apiKey = ResourceBundle.getBundle("").getString("");


    /**
     * Start method.
     */
    @BeforeTest
    public void startMethod() {

        open(urlString);
    }


    /**
     * Tear down.
     */
    @AfterTest
    public void tearDown() {
        clearBrowserCookies();
        close();
    }
}

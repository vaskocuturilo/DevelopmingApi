package base;

import io.github.bonigarcia.wdm.WebDriverManager;
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
    private final transient String urlString = ResourceBundle.getBundle("test").getString("URL");



    /**
     * Start method.
     */
    @BeforeTest
    public void startMethod() {
        WebDriverManager.chromedriver().version("76.0.3809.68").setup();
        open(urlString);
    }


    /**
     * Tear down.
     */
    @AfterTest
    public void stopMethod() {
        clearBrowserCookies();
        close();
    }
}

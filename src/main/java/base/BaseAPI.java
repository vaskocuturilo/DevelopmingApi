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
    private String urlString = ResourceBundle.getBundle("test").getString("URL");

    /**
     * The Api key.
     */
    private String apiKey = ResourceBundle.getBundle("api").getString("API_KEY");


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
    public void tearDown() {
        clearBrowserCookies();
        close();
    }
}

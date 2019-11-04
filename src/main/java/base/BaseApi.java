package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import listener.LogListener;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import java.util.ResourceBundle;

import static com.codeborne.selenide.Selenide.*;


/**
 * The type Base api.
 */

@Listeners(LogListener.class)
public class BaseApi {

    /**
     * The Url string.
     */
    private final transient String urlString = ResourceBundle.getBundle("test").getString("URL");

    /**
     * Default constructor.
     */
    public BaseApi() {
        super();
        //empty
        return;
    }

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

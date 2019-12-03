package com.walmart.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import com.walmart.listener.LogListener;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import java.util.ResourceBundle;

import static com.codeborne.selenide.Selenide.*;


/**
 * The class base api.
 */

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
        WebDriverManager.chromedriver().version("78").setup();
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

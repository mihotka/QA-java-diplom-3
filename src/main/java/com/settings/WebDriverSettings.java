package com.settings;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;

public class WebDriverSettings {

    public void setupChrome() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
        Configuration.screenshots = false;
        Configuration.timeout = 5000;
    }

    @Before
    public void init(){
        setupChrome();
    }

    @After
    public void tearDown(){
        Selenide.closeWebDriver();
    }
}

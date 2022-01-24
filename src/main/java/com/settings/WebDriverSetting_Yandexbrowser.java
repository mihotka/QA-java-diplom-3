package com.settings;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverSetting_Yandexbrowser {



    public void setupYandex() {
        System.setProperty("webdriver.chrome.driver",  "src/resources/yandexdriver.exe");

        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
        Configuration.screenshots = false;
        Configuration.timeout = 5000;

    }

    @Before
    public void init(){
        setupYandex();
    }

    @After
    public void tearDown(){
        Selenide.closeWebDriver();
    }
}

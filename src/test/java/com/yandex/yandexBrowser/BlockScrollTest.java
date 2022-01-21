package com.yandex.yandexBrowser;

import com.codeborne.selenide.Condition;
import com.pgae_object.MainPage;
import com.settings.WebDriverSetting_Yandexbrowser;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class BlockScrollTest extends WebDriverSetting_Yandexbrowser {
    MainPage mainPage = new MainPage();

    @Before
    public void openMainPage() {
        open("https://stellarburgers.nomoreparties.site/");
    }

    @Test
    @DisplayName("Тест скролла до раздела начинки по клику на дашборд")
    public void scrollToFillingTest() {
        mainPage.scrollToFilling();
        mainPage.fillingBlockText.should(Condition.visible);
    }

    @Test
    @DisplayName("Тест скролла до раздела булки по клику на дашборд")
    public void scrollToBreadTest() {
        mainPage.scrollToFilling();
        mainPage.scrollToBread();
        mainPage.breadBlockText.should(Condition.visible);
    }

    @Test
    @DisplayName("Тест скролла до раздела соусы по клику на дашборд")
    public void scrollToSauceTest() {
        mainPage.scrollToSauce();
        mainPage.sauceBlockText.should(Condition.visible);
    }

}

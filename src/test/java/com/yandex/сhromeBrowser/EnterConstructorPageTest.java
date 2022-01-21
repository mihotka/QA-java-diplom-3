package com.yandex;

import com.codeborne.selenide.Condition;
import com.pgae_object.MainPage;
import com.settings.WebDriverSettings;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class EnterConstructorPageTest extends WebDriverSettings {

    MainPage mainPage = new MainPage();

    @Before
    public void orderListPageOpen() {
        open("https://stellarburgers.nomoreparties.site/feed");
    }

    @Test
    @DisplayName("Переход на страницу конструктора по кнопке Конструктор")
    public void enterConstructorByItsButton() {
        mainPage.constructorButton.click();
        mainPage.mainBlockText.should(Condition.visible);
    }

    @Test
    @DisplayName("Переход на страницу конструктора по клику на логотип")
    public void enterConstructorByLogo() {
        mainPage.logo.click();
        mainPage.mainBlockText.should(Condition.visible);
    }
}

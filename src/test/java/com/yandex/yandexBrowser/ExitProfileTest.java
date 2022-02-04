package com.yandex.yandexBrowser;

import com.codeborne.selenide.Condition;
import com.pgae_object.LoginPage;
import com.pgae_object.MainPage;
import com.pgae_object.PrivateRoomPage;
import com.settings.WebDriverSettingYandexbrowser;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertEquals;

public class ExitProfileTest extends WebDriverSettingYandexbrowser {
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    PrivateRoomPage privateRoomPage = new PrivateRoomPage();


    @Test
    @DisplayName("Тестирование выхода из профиля по кнопке в личном кабинете")
    public void exitProfileByButtonTest() {
        open(loginPage.loginPageUrl);
        loginPage.loginByUser();
        mainPage.mainBlockText.should(Condition.visible);
        mainPage.privateRoomButton.click();
        privateRoomPage.exitProfileButton.click();
        loginPage.loginPageText.should(Condition.visible);
        assertEquals("Неверно отображается текст на кнопке Войти", "Войти", loginPage.loginButton.getText());
    }
}

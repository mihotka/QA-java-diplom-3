package com.yandex;

import com.codeborne.selenide.Condition;
import com.pgae_object.LoginPage;
import com.pgae_object.MainPage;
import com.pgae_object.PrivateRoomPage;
import com.settings.WebDriverSettings;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;


public class PrivateRoomEnterTest extends WebDriverSettings {

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    PrivateRoomPage privateRoomPage = new PrivateRoomPage();


    @Test
    @DisplayName("Переход в личный кабинет")
    public void privateRoomEnterByButtonTest() {
        open(loginPage.loginPageUrl);
        loginPage.loginByUser();
        mainPage.privateRoomButton.click();
        privateRoomPage.exitProfileButton.should(Condition.visible);
    }
}

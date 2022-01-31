package com.yandex.yandexBrowser;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import com.pgae_object.ForgotPasswordPage;
import com.pgae_object.LoginPage;
import com.pgae_object.MainPage;
import com.pgae_object.RegistrationPage;
import com.settings.WebDriverSettingYandexbrowser;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertEquals;

public class LoginTest extends WebDriverSettingYandexbrowser {

    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    RegistrationPage registrationPage = new RegistrationPage();
    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();

    @Test
    @DisplayName("Регистрация по кнопке Войти")
    public void mainPageLoginByEnterButtonTest() {
        open(mainPage.mainPageUrl);
        mainPage.clickOnLoginButton();
    }

    @Test
    @DisplayName("Регистрация по кнопке через личный кабинет")
    public void mainPageLoginByPrivateRoomButtonTest() {
        open(mainPage.mainPageUrl);
        mainPage.clickOnPrivateRoomButton();
    }

    @Test
    @DisplayName("Регистрация по кнопке через кнопку на странице регистрации")
    public void mainPageLoginByEnterButtonOnRegistrationPageTest() {
        open(registrationPage.registrationUrl);
        registrationPage.enterButtonForRegistratedUsers.click();
    }

    @Test
    @DisplayName("Регистрация по кнопке через страницу восстановления пароля")
    public void loginByForgotPasswordButtonTest() {
        open(loginPage.loginPageUrl);
        loginPage.forgotPasswordButton.click();
        forgotPasswordPage.enterButton.click();
    }

    @After
    public void login() {
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        assertEquals("URL не совпадает",mainPage.mainPageUrl + "login", currentUrl);
        loginPage.loginByUser();
        mainPage.mainBlockText.should(Condition.visible);
    }
}

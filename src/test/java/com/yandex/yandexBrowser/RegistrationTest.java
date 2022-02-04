package com.yandex.yandexBrowser;

import com.codeborne.selenide.Condition;
import com.pgae_object.RegistrationPage;
import com.settings.WebDriverSettingYandexbrowser;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertEquals;

public class RegistrationTest extends WebDriverSettingYandexbrowser {


    @Test
    @DisplayName("Успешная регистрация")
    public void successfulRegistrationTest() {
        RegistrationPage registrationPage = open("https://stellarburgers.nomoreparties.site/register", RegistrationPage.class);
        registrationPage.successfulRegistration();
        registrationPage.authorizationButton.should(Condition.visible);
    }

    @Test
    @DisplayName("Проверка уведомления об ошибке в поле пароля")
    public void errorMessageWithInvalidPasswordTest() {
        RegistrationPage registrationPage = open("https://stellarburgers.nomoreparties.site/register", RegistrationPage.class);
        registrationPage.failedRegistrationWithInvalidPassword();
        registrationPage.passwordError.should(Condition.visible);
        assertEquals("Не совпадает ошибка в инпуте пароля",registrationPage.passwordErrorMessage, registrationPage.passwordError.text());
    }

}

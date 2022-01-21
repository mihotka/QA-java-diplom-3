package com.yandex.yandexBrowser;

import com.pgae_object.RegistrationPage;
import com.settings.WebDriverSetting_Yandexbrowser;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class RegistrationTest extends WebDriverSetting_Yandexbrowser {


   @Test
   @DisplayName("Успешная регистрация")
   public void successfulRegistrationTest() {
       RegistrationPage registrationPage = open("https://stellarburgers.nomoreparties.site/register", RegistrationPage.class);
       registrationPage.successfulRegistration();
   }

    @Test
    @DisplayName ("Проверка уведомления об ошибке в поле пароля")
    public void errorMessageWithInvalidPasswordTest() {
        RegistrationPage registrationPage = open("https://stellarburgers.nomoreparties.site/register", RegistrationPage.class);
        registrationPage.failedRegistrationWithInvalidPassword();
    }

}

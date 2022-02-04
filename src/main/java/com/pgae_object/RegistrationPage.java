package com.pgae_object;

import com.codeborne.selenide.SelenideElement;
import com.settings.UserInfo;
import com.codeborne.selenide.*;
import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {

    UserInfo userInfo = new UserInfo();

    public String registrationUrl = "https://stellarburgers.nomoreparties.site/register";

    public SelenideElement registrationButton = $(byText("Зарегистрироваться"));
    public SelenideElement authorizationButton = $(byText("Войти"));
    public SelenideElement passwordError = $(byCssSelector(".input__error"));
    public String passwordErrorMessage = "Введите не менее 6 символов";

    public SelenideElement enterButtonForRegistratedUsers = $(byCssSelector(".Auth_link__1fOlj"));
    public ElementsCollection input = $$(byCssSelector(".input__textfield"));

    @Step
    @DisplayName("Успешная регистрация")
    public void successfulRegistration() {

        input.get(0).setValue(userInfo.login);
        input.get(1).setValue(userInfo.email);
        input.get(2).setValue(userInfo.password);
        registrationButton.click();
    }
    @Step
    @DisplayName("Неуспешная регистрация с невалидным паролем")
    public void failedRegistrationWithInvalidPassword() {

        input.get(0).setValue(userInfo.login);
        input.get(1).setValue(userInfo.email);
        input.get(2).setValue("1s");
        registrationButton.click();
    }
}

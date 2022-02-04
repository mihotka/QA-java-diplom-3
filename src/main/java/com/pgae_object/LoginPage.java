package com.pgae_object;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class LoginPage {

    public String authorizedMail = "mihotka@mail.ru";
    public String authorizedPassword = "1234Bb";
    public String loginPageUrl = "https://stellarburgers.nomoreparties.site/login";

    public ElementsCollection loginInputs = $$(byCssSelector(".input__textfield"));
    public SelenideElement loginButton = $(byCssSelector(".button_button__33qZ0"));
    public SelenideElement forgotPasswordButton = $(byText("Восстановить пароль"));
    public SelenideElement loginPageText = $(byText("Вы — новый пользователь?"));

    @Step
    @DisplayName("Успешная авторизация юзера")
    public void loginByUser() {
        loginInputs.get(0).setValue(authorizedMail);
        loginInputs.get(1).setValue(authorizedPassword);
        loginButton.click();
    }

}


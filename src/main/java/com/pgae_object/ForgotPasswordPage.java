package com.pgae_object;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ForgotPasswordPage {
    public SelenideElement enterButton = $(byText("Войти"));
}

package com.pgae_object;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {

    public String mainPageUrl = "https://stellarburgers.nomoreparties.site/";

    public SelenideElement constructorButton = $(byText("Конструктор"));
    public SelenideElement logo = $(byClassName("AppHeader_header__logo__2D0X2"));

    public SelenideElement loginButton = $(byCssSelector(".button_button__33qZ0"));
    public SelenideElement privateRoomButton = $(byText("Личный Кабинет"));
    public SelenideElement mainBlockText = $(byText("Соберите бургер"));

    public ElementsCollection scrollDashboard = $$(byCssSelector(".tab_tab__1SPyG"));

    public SelenideElement breadBlockText = $$(byCssSelector(".text_type_main-medium")).findBy(Condition.text("Булки"));
    public SelenideElement sauceBlockText = $$(byCssSelector(".text_type_main-medium")).findBy(Condition.text("Соусы"));
    public SelenideElement fillingBlockText = $$(byCssSelector(".text_type_main-medium")).findBy(Condition.text("Начинки"));

    @Step
    @DisplayName("Успешная регистрация")
    public void clickOnLoginButton() {
        loginButton.click();
    }

    @Step
    @DisplayName("Клик по кнопке личного кабинета")
    public void clickOnPrivateRoomButton() {
        privateRoomButton.click();
    }

    @Step
    @DisplayName("Скроллить до начинок")
    public void scrollToFilling() {
        scrollDashboard.get(2).click();
    }

    @Step
    @DisplayName("Скроллить до соусов")
    public void scrollToSauce() {
        scrollDashboard.get(1).click();
    }

    @Step
    @DisplayName("Скроллить до булок")
    public void scrollToBread() {
        scrollDashboard.get(0).click();
    }
}

package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class PageWithRegistration {

    private final SelenideElement
            CookieButton = $(".cookie-alert__btn"),
            pressEntry = $(".j-auth-open.username"),
            pressRegistration = $("[data-test-id=tab-registration]"),
            header = $(".form-tab_link.j-tab.active"),
            email = $("[data-test-id=registration-email]"),
            login = $("[data-test-id=registration-login]"),
            password = $("[data-test-id=registration-password]"),
            passwordConfirm = $("[data-test-id=registration-password-confirm]"),
            firstName = $("[data-test-id=registration-firstName]"),
            lastName = $("[data-test-id=registration-lastName]"),
            number = $("[data-test-id=registration-phone]"),
            agreement = $("span.check__label.static-content"),
            agreementClicked = $(byTagAndText("label", "Требуется согласие")),
            captcha = $("[data-test-id=registration-captcha]"),
            registerButton = $("[data-test-id=registration-register]"),
            errorEmailInput = $("[data-test-id=registration-email]").sibling(0),
            errorLoginInput = $("[data-test-id=registration-login]").sibling(0),
            errorPasswordInput = $("[data-test-id=registration-password]").sibling(0),
            errorPasswordConfirmInput = $("[data-test-id=registration-password-confirm]").sibling(0),
            errorFirstNameInput = $("[data-test-id=registration-firstName]").sibling(0),
            errorLastNameInput = $("[data-test-id=registration-lastName]").sibling(0),
            errorInvalidNumber = $("[data-test-id=registration-phone]").sibling(0),
            errorEmptyAgreement = $(byTagAndText("label", "Требуется согласие")),
            errorCaptcha = $("[data-test-id=registration-captcha]").sibling(0),
            errorRegisterMessage = $(byTagAndText("span", "В форме обнаружены ошибки"));


    public PageWithRegistration openPage() {
        open("");
        Selenide.sleep(1000);
        return this;
    }

    public PageWithRegistration closeCookie() {
        if (CookieButton.isDisplayed())
        {
            CookieButton.click();
        }
        return this;
    }

    public PageWithRegistration pressEntry() {
        pressEntry.click();
        return this;
    }

    public PageWithRegistration pressRegistration() {
        pressRegistration.click();
        return this;
    }

    public PageWithRegistration checkHeader (String value) {
        header.shouldHave(text(value));
        header.shouldBe(cssValue("color", "rgba(226, 26, 26, 1)"));;
        return this;
    }

    public PageWithRegistration emailInput(String value) {
        email.setValue(value);
        return this;
    }

    public PageWithRegistration loginInput(String value) {
        login.setValue(value);
        return this;
    }

    public PageWithRegistration passwordInput(String value) {
        password.setValue(value);
        return this;
    }

    public PageWithRegistration passwordConfirmInput(String value) {
        passwordConfirm.setValue(value);
        return this;
    }

    public PageWithRegistration firstNameInput(String value) {
        firstName.setValue(value);
        return this;
    }

    public PageWithRegistration lastNameInput(String value) {
        lastName.setValue(value);
        return this;
    }

    public PageWithRegistration numberInput(String value) {
        number.setValue(value);
        return this;
    }

    public PageWithRegistration agreementClick() {
        agreement.click();
        return this;
    }

    public PageWithRegistration captchaInput(String value) {
        captcha.setValue(value);
        return this;
    }

    public PageWithRegistration checkEmailBorderColor () {
        email.shouldBe(cssValue("border-color", "rgb(217, 219, 223)"));
        return this;
    }

    public PageWithRegistration checkLoginBorderColor () {
        login.shouldBe(cssValue("border-color", "rgb(217, 219, 223)"));
        return this;
    }

    public PageWithRegistration checkPasswordBorderColor () {
        password.shouldBe(cssValue("border-color", "rgb(217, 219, 223)"));
        return this;
    }

    public PageWithRegistration checkPasswordConfirmBorderColor () {
        passwordConfirm.shouldBe(cssValue("border-color", "rgb(217, 219, 223)"));
        return this;
    }

    public PageWithRegistration checkFirstNameBorderColor () {
        firstName.shouldBe(cssValue("border-color", "rgb(217, 219, 223)"));
        return this;
    }

    public PageWithRegistration checkLastNameBorderColor () {
        lastName.shouldBe(cssValue("border-color", "rgb(217, 219, 223)"));
        return this;
    }

    public PageWithRegistration checkNumberBorderColor () {
        number.shouldBe(cssValue("border-color", "rgb(217, 219, 223)"));
        return this;
    }

    public PageWithRegistration checkClickedAgreement () {
        boolean IsHidden = !(errorEmptyAgreement.isDisplayed());
        return this;
    }

    public PageWithRegistration registerButtonClick() {
        registerButton.click();
        return this;
    }

    public PageWithRegistration checkErrorEmail(String value) {
        errorEmailInput.shouldHave(text(value));
        errorEmailInput.shouldHave(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    public PageWithRegistration checkErrorLogin(String value) {
        errorLoginInput.shouldHave(text(value));
        errorLoginInput.shouldHave(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    public PageWithRegistration checkErrorPassword(String value) {
        errorPasswordInput.shouldHave(text(value));
        errorPasswordInput.shouldHave(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    public PageWithRegistration checkErrorPasswordConfirm(String value) {
        errorPasswordConfirmInput.shouldHave(text(value));
        errorPasswordConfirmInput.shouldHave(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    public PageWithRegistration checkErrorFirstName(String value) {
        errorFirstNameInput.shouldHave(text(value));
        errorFirstNameInput.shouldHave(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    public PageWithRegistration checkErrorLastName(String value) {
        errorLastNameInput.shouldHave(text(value));
        errorLastNameInput.shouldHave(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    public PageWithRegistration checkErrorEmptyAgreement(String value) {
        errorEmptyAgreement.shouldHave(text(value));
        errorEmptyAgreement.shouldHave(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    public PageWithRegistration checkErrorEmptyCaptcha(String value) {
        errorCaptcha.shouldHave(text(value));
        errorCaptcha.shouldHave(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    public PageWithRegistration checkErrorInvalidNumber(String value) {
        errorInvalidNumber.shouldHave(text(value));
        errorInvalidNumber.shouldHave(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    public PageWithRegistration checkErrorEntryMessage (String value) {
        errorRegisterMessage.find(byText(value));
        errorRegisterMessage.shouldHave(text(value));
        errorRegisterMessage.parent().shouldBe(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }
}
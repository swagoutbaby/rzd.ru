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
            сookieButton = $(".cookie-alert__btn"),
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
        if (сookieButton.isDisplayed())
        {
            сookieButton.click();
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

    public PageWithRegistration checkHeader (String headerText) {
        header.shouldHave(text(headerText));
        header.shouldBe(cssValue("color", "rgba(226, 26, 26, 1)"));;
        return this;
    }

    public PageWithRegistration emailInput(String Email) {
        email.setValue(Email);
        return this;
    }

    public PageWithRegistration loginInput(String Login) {
        login.setValue(Login);
        return this;
    }

    public PageWithRegistration passwordInput(String Password) {
        password.setValue(Password);
        return this;
    }

    public PageWithRegistration passwordConfirmInput(String PasswordConfirm) {
        passwordConfirm.setValue(PasswordConfirm);
        return this;
    }

    public PageWithRegistration firstNameInput(String FirstName) {
        firstName.setValue(FirstName);
        return this;
    }

    public PageWithRegistration lastNameInput(String LastName) {
        lastName.setValue(LastName);
        return this;
    }

    public PageWithRegistration numberInput(String Number) {
        number.setValue(Number);
        return this;
    }

    public PageWithRegistration agreementClick() {
        agreement.click();
        return this;
    }

    public PageWithRegistration captchaInput(String Captcha) {
        captcha.setValue(Captcha);
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

    public PageWithRegistration checkErrorEmail(String ErrorText) {
        errorEmailInput.shouldHave(text(ErrorText));
        errorEmailInput.shouldHave(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    public PageWithRegistration checkErrorLogin(String ErrorText) {
        errorLoginInput.shouldHave(text(ErrorText));
        errorLoginInput.shouldHave(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    public PageWithRegistration checkErrorPassword(String ErrorText) {
        errorPasswordInput.shouldHave(text(ErrorText));
        errorPasswordInput.shouldHave(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    public PageWithRegistration checkErrorPasswordConfirm(String ErrorText) {
        errorPasswordConfirmInput.shouldHave(text(ErrorText));
        errorPasswordConfirmInput.shouldHave(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    public PageWithRegistration checkErrorFirstName(String ErrorText) {
        errorFirstNameInput.shouldHave(text(ErrorText));
        errorFirstNameInput.shouldHave(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    public PageWithRegistration checkErrorLastName(String ErrorText) {
        errorLastNameInput.shouldHave(text(ErrorText));
        errorLastNameInput.shouldHave(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    public PageWithRegistration checkErrorEmptyAgreement(String ErrorText) {
        errorEmptyAgreement.shouldHave(text(ErrorText));
        errorEmptyAgreement.shouldHave(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    public PageWithRegistration checkErrorEmptyCaptcha(String ErrorText) {
        errorCaptcha.shouldHave(text(ErrorText));
        errorCaptcha.shouldHave(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    public PageWithRegistration checkErrorInvalidNumber(String ErrorText) {
        errorInvalidNumber.shouldHave(text(ErrorText));
        errorInvalidNumber.shouldHave(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    public PageWithRegistration checkErrorEntryMessage (String ErrorText) {
        errorRegisterMessage.find(byText(ErrorText));
        errorRegisterMessage.shouldHave(text(ErrorText));
        errorRegisterMessage.parent().shouldBe(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }
}
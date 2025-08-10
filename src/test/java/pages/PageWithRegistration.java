package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.fail;


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

    @Step("Открыть основную страницу")
    public PageWithRegistration openPage() {
        open("");
        Selenide.sleep(1000);
        return this;
    }

    @Step("Закрыть уведомление о Cookie")
    public PageWithRegistration closeCookie() {
        if (сookieButton.isDisplayed())
        {
            сookieButton.click();
        }
        return this;
    }

    @Step("Открыть окно входа в аккаунт")
    public PageWithRegistration pressEntry() {
        pressEntry.click();
        return this;
    }

    @Step("Выбрать регистрацию")
    public PageWithRegistration pressRegistration() {
        pressRegistration.click();
        return this;
    }

    @Step("Проверить выбор окна регистрации")
    public PageWithRegistration checkHeader(String headerText) {
        header.shouldHave(text(headerText));
        header.shouldBe(cssValue("color", "rgba(226, 26, 26, 1)"));;
        return this;
    }

    @Step("Ввести электронную почту")
    public PageWithRegistration inputEmail(String Email) {
        email.setValue(Email);
        return this;
    }

    @Step("Ввести логин")
    public PageWithRegistration inputLogin(String Login) {
        login.setValue(Login);
        return this;
    }

    @Step("Ввести пароль")
    public PageWithRegistration inputPassword(String Password) {
        password.setValue(Password);
        return this;
    }

    @Step("Ввести подтверждение пароля")
    public PageWithRegistration inputPasswordConfirm(String PasswordConfirm) {
        passwordConfirm.setValue(PasswordConfirm);
        return this;
    }

    @Step("Ввести имя")
    public PageWithRegistration inputFirstName(String FirstName) {
        firstName.setValue(FirstName);
        return this;
    }

    @Step("Ввести фамилию")
    public PageWithRegistration inputLastName(String LastName) {
        lastName.setValue(LastName);
        return this;
    }

    @Step("Ввести номер телефона")
    public PageWithRegistration inputNumber(String Number) {
        number.setValue(Number);
        return this;
    }

    @Step("Дать согласие")
    public PageWithRegistration clickAgreement() {
        agreement.click();
        return this;
    }

    @Step("Ввести капчу")
    public PageWithRegistration inputCaptcha(String Captcha) {
        captcha.setValue(Captcha);
        return this;
    }

    @Step("Проверить цвет границ поля электронной почты")
    public PageWithRegistration checkEmailBorderColor() {
        email.shouldBe(cssValue("border-color", "rgb(217, 219, 223)"));
        return this;
    }

    @Step("Проверить цвет границ поля логина")
    public PageWithRegistration checkLoginBorderColor() {
        login.shouldBe(cssValue("border-color", "rgb(217, 219, 223)"));
        return this;
    }

    @Step("Проверить цвет границ поля пароля")
    public PageWithRegistration checkPasswordBorderColor() {
        password.shouldBe(cssValue("border-color", "rgb(217, 219, 223)"));
        return this;
    }

    @Step("Проверить цвет границ поля подтверждения пароля")
    public PageWithRegistration checkPasswordConfirmBorderColor() {
        passwordConfirm.shouldBe(cssValue("border-color", "rgb(217, 219, 223)"));
        return this;
    }

    @Step("Проверить цвет границ поля имени")
    public PageWithRegistration checkFirstNameBorderColor() {
        firstName.shouldBe(cssValue("border-color", "rgb(217, 219, 223)"));
        return this;
    }

    @Step("Проверить цвет границ поля фамилии")
    public PageWithRegistration checkLastNameBorderColor() {
        lastName.shouldBe(cssValue("border-color", "rgb(217, 219, 223)"));
        return this;
    }

    @Step("Проверить цвет границ поля телефона")
    public PageWithRegistration checkNumberBorderColor() {
        number.shouldBe(cssValue("border-color", "rgb(217, 219, 223)"));
        return this;
    }

    @Step("Проверить нажатие выбора согласия")
    public PageWithRegistration checkClickedAgreement() {
        boolean IsHidden = (errorEmptyAgreement.isDisplayed());
        if (IsHidden) {
            fail();
        }
        return this;
    }

    @Step("Нажать кнопку 'Зарегистрироваться'")
    public PageWithRegistration clickRegisterButton() {
        registerButton.click();
        return this;
    }

    @Step("Проверить ошибку в поле электронной почты")
    public PageWithRegistration checkErrorEmail(String ErrorText) {
        errorEmailInput.shouldHave(text(ErrorText));
        errorEmailInput.shouldHave(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    @Step("Проверить ошибку в поле логина")
    public PageWithRegistration checkErrorLogin(String ErrorText) {
        errorLoginInput.shouldHave(text(ErrorText));
        errorLoginInput.shouldHave(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    @Step("Проверить ошибку в поле пароля")
    public PageWithRegistration checkErrorPassword(String ErrorText) {
        errorPasswordInput.shouldHave(text(ErrorText));
        errorPasswordInput.shouldHave(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    @Step("Проверить ошибку в поле подтверждения пароля")
    public PageWithRegistration checkErrorPasswordConfirm(String ErrorText) {
        errorPasswordConfirmInput.shouldHave(text(ErrorText));
        errorPasswordConfirmInput.shouldHave(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    @Step("Проверить ошибку в поле имени")
    public PageWithRegistration checkErrorFirstName(String ErrorText) {
        errorFirstNameInput.shouldHave(text(ErrorText));
        errorFirstNameInput.shouldHave(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    @Step("Проверить ошибку в поле фамилии")
    public PageWithRegistration checkErrorLastName(String ErrorText) {
        errorLastNameInput.shouldHave(text(ErrorText));
        errorLastNameInput.shouldHave(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    @Step("Проверить ошибку неданного согласия")
    public PageWithRegistration checkErrorEmptyAgreement(String ErrorText) {
        errorEmptyAgreement.shouldHave(text(ErrorText));
        errorEmptyAgreement.shouldHave(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    @Step("Проверить ошибку в поле капчи")
    public PageWithRegistration checkErrorCaptcha(String ErrorText) {
        errorCaptcha.shouldHave(text(ErrorText));
        errorCaptcha.shouldHave(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    @Step("Проверить ошибку в поле телефона")
    public PageWithRegistration checkErrorInvalidNumber(String ErrorText) {
        errorInvalidNumber.shouldHave(text(ErrorText));
        errorInvalidNumber.shouldHave(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    @Step("Проверить отображение сообщения-ошибки регистрации")
    public PageWithRegistration checkErrorEntryMessage(String ErrorText) {
        errorRegisterMessage.shouldHave(text(ErrorText));
        errorRegisterMessage.parent().shouldBe(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }
}

package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.cssValue;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class PageWithEntry {

    private final SelenideElement
    pressEntry = $(".j-auth-open.username"),
    cookieButton = $(".cookie-alert__btn"),
    login = $("[placeholder=Логин]"),
    password = $("[placeholder=Пароль]"),
    forgotPassword = $(".j-forgot-password"),
    forgotPasswordLogin = $("[name='LOGIN']"),
    forgotPasswordEmail = $("[data-test-id=recovery-email]"),
    forgotPasswordCaptcha = $("[data-test-id=recovery-captcha]"),
    errorCaptchaForgotPassword = $("[data-test-id=recovery-captcha]").sibling(0),
    errorEmailForgotPassword = $("[data-test-id=recovery-email]").sibling(0),
    errorMessageForgotPassword = $("[data-test-id=recovery-error]"),
    recoverPasswordButton = $("[data-test-id=recovery-submit]"),
    entryButton = $(byTagAndText("button", "Войти")),
    errorEmptyLogin = $("[placeholder=Логин]").sibling(0),
    errorEmptyPassword = $("[placeholder=Пароль]").sibling(0),
    errorEntryMessage = $(".auth-error"),
    profileButton = $(".j-profile-username"),
    myProfile = $(".body-page-5312"),
    logout = $(".j-profile-logout");

    @Step("Открыть главную страницу")
    public PageWithEntry openPage() {
        open("");
        Selenide.sleep(3000);
        return this;
    }

    @Step("Закрыть уведомление о Cookie")
    public PageWithEntry closeCookie() {
        cookieButton.click();
        return this;
    }

    @Step("Открыть окно входа в аккаунт")
    public PageWithEntry pressEntry() {
        pressEntry.click();
        return this;
    }

    @Step("Ввести логин")
    public PageWithEntry inputLogin(String Login) {
        login.setValue(Login);
        return this;
    }

    @Step("Ввести пароль")
    public PageWithEntry inputPassword(String Password) {
        password.setValue(Password);
        return this;
    }

    @Step("Открыть окно 'Забыли пароль?'")
    public PageWithEntry clickForgotPassword() {
        forgotPassword.click();
        return this;
    }

    @Step("Ввести логин в окне 'Забыли пароль?'")
    public PageWithEntry inputLoginForgotPassword(String text) {
        forgotPasswordLogin.setValue(text);
        return this;
    }

    @Step("Ввести емеил в окне 'Забыли пароль?'")
    public PageWithEntry inputEmailForgotPassword(String text) {
        forgotPasswordEmail.setValue(text);
        return this;
    }

    @Step("Ввести капчу в окне 'Забыли пароль?'")
    public PageWithEntry inputCaptchaForgotPassword(String text) {
        forgotPasswordCaptcha.setValue(text);
        return this;
    }

    @Step("Проверка отображения ошибки в поле емеила")
    public PageWithEntry checkErrorEmailForgotPassword(String errorText) {
        errorEmailForgotPassword.shouldHave(text(errorText));
        return this;
    }

    @Step("Проверка отображения ошибки в поле капчи")
    public PageWithEntry checkErrorCaptchaForgotPassword(String errorText) {
        errorCaptchaForgotPassword.shouldHave(text(errorText));
        return this;
    }

    @Step("Проверка отображения сообщения-ошибки восстановления пароля ")
    public PageWithEntry checkErrorMessageForgotPassword(String errorText) {
        errorMessageForgotPassword.shouldHave(text(errorText));
        return this;
    }

    @Step("Нажать кнопку восстановить пароль")
    public PageWithEntry clickRecoverPasswordButton() {
        recoverPasswordButton.click();
        return this;
    }

    @Step("Нажать кнопку войти")
    public PageWithEntry entryButtonClick() {
        entryButton.click();
        return this;
    }

    @Step("Проверка отображения ошибки пустого поля логина")
    public PageWithEntry checkErrorEmptyLogin(String ErrorText) {
        errorEmptyLogin.shouldHave(text(ErrorText));
        errorEmptyLogin.shouldHave(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    @Step("Проверка отображения ошибки пустого поля пароля")
    public PageWithEntry checkErrorEmptyPassword(String ErrorText) {
        errorEmptyPassword.shouldHave(text(ErrorText));
        errorEmptyPassword.shouldHave(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    @Step("Проверка отображения сообщения-ошибки входа")
    public PageWithEntry checkErrorEntryMessage(String ErrorText) {
        errorEntryMessage.shouldHave(text(ErrorText));
        errorEntryMessage.shouldBe(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    @Step("Открыть профиль")
    public PageWithEntry clickProfileButton() {
        profileButton.click();
        return this;
    }

    @Step("Проверка отображения элементов профиля")
    public PageWithEntry checkMyProfile(String text) {
        myProfile.shouldHave(text(text));
        return this;
    }

    @Step("Выйти из аккаунта")
    public PageWithEntry clickLogout() {
        logout.click();
        return this;
    }
}

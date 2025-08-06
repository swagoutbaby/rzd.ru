package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.cssValue;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class PageWithEntry {

    private final SelenideElement
    pressEntry = $(".j-auth-open.username"),
    cookieButton = $(".cookie-alert__btn"),
    header = $(".j-tab.form-tab_link.active"),
    login = $("[placeholder=Логин]"),
    password = $("[placeholder=Пароль]"),
    forgotPassword = $(".j-forgot-password"),
    forgotPasswordForm = $(".j-pwd-reminder"),
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
    nameInHeader = $(".j-acc-name"),
    myProfileList = $(".page-menu__list"),
    myData = $("[data-test-id=accountTabDataForm]"),
    myProfile = $(".page-menu__title"),
    logout = $(".j-profile-logout");


    public PageWithEntry openPage () {
        open("");
        return this;
    }

    public PageWithEntry closeCookie() {
        if (cookieButton.isDisplayed())
        {
            cookieButton.click();
        }
        return this;
    }

    public PageWithEntry pressEntry () {
        pressEntry.click();
        return this;
    }

    public PageWithEntry checkHeader (String HeaderText) {
        header.shouldHave(text(HeaderText));
        header.shouldBe(cssValue("color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    public PageWithEntry loginInput (String Login) {
        login.setValue(Login);
        return this;
    }

    public PageWithEntry passwordInput (String Password) {
        password.setValue(Password);
        return this;
    }

    public PageWithEntry clickForgotPassword () {
        forgotPassword.click();
        return this;
    }

    public PageWithEntry checkForgotPasswordForm (String text) {
        forgotPasswordForm.shouldHave(text(text));
        return this;
    }

    public PageWithEntry inputLoginForgotPassword (String text) {
        forgotPasswordLogin.setValue(text);
        return this;
    }

    public PageWithEntry inputEmailForgotPassword (String text) {
        forgotPasswordEmail.setValue(text);
        return this;
    }

    public PageWithEntry inputCaptchaForgotPassword (String text) {
        forgotPasswordCaptcha.setValue(text);
        return this;
    }

    public PageWithEntry checkErrorEmailForgotPassword (String errorText) {
        errorEmailForgotPassword.shouldHave(text(errorText));
        return this;
    }

    public PageWithEntry checkErrorCaptchaForgotPassword (String errorText) {
        errorCaptchaForgotPassword.shouldHave(text(errorText));
        return this;
    }

    public PageWithEntry checkErrorMessageForgotPassword (String errorText) {
        errorMessageForgotPassword.shouldHave(text(errorText));
        return this;
    }

    public PageWithEntry clickRecoverPasswordButton () {
        recoverPasswordButton.click();
        return this;
    }

    public PageWithEntry entryButtonClick () {
        entryButton.click();
        return this;
    }

    public PageWithEntry checkErrorEmptyLogin (String ErrorText) {
        errorEmptyLogin.shouldHave(text(ErrorText));
        errorEmptyLogin.shouldHave(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    public PageWithEntry checkErrorEmptyPassword(String ErrorText) {
        errorEmptyPassword.shouldHave(text(ErrorText));
        errorEmptyPassword.shouldHave(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    public PageWithEntry checkErrorEntryMessage (String ErrorText) {
        errorEntryMessage.shouldHave(text(ErrorText));
        errorEntryMessage.shouldBe(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    public PageWithEntry profileButtonClick () {
        profileButton.click();
        return this;
    }

    public PageWithEntry checkMyProfileList (String text) {
        myProfileList.shouldHave(text(text));
        return this;
    }

    public PageWithEntry checkMyData (String text) {
        myData.shouldHave(text(text));
        return this;
    }

    public PageWithEntry checkNameInHeader (String text) {
        nameInHeader.shouldHave(text(text));
        return this;
    }

    public PageWithEntry checkAutorization (String text) {
        myProfile.shouldHave(text(text));
        return this;
    }

    public PageWithEntry logoutClick () {
        logout.click();
        return this;
    }
}

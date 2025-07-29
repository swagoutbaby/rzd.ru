package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.cssValue;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class PageWithEntry {

    private final SelenideElement
    pressEntry = $(".j-auth-open.username"), CookieButton = $(".cookie-alert__btn"),
    header = $(".j-tab.form-tab_link.active"),
    login = $("[placeholder=Логин]"),
    password = $("[placeholder=Пароль]"),
    entryButton = $(byTagAndText("button", "Войти")),
    errorEmptyLogin = $("[placeholder=Логин]").sibling(0),
    errorEmptyPassword = $("[placeholder=Пароль]").sibling(0),
    errorEntryMessage = $(".auth-error"),
    profileButton = $(".j-profile-username"),
    myProfile = $(".page-menu__title"),
    logout = $(".j-profile-logout");


    public PageWithEntry openPage () {
        open("");
        return this;
    }

    public PageWithEntry closeCookie() {
        if (CookieButton.isDisplayed())
        {
            CookieButton.click();
        }
        return this;
    }

    public PageWithEntry pressEntry () {
        pressEntry.click();
        return this;
    }

    public PageWithEntry checkHeader (String value) {
        header.shouldHave(text(value));
        header.shouldBe(cssValue("color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    public PageWithEntry loginInput (String value) {
        login.setValue(value);
        return this;
    }

    public PageWithEntry passwordInput (String value) {
        password.setValue(value);
        return this;
    }

    public PageWithEntry entryButtonClick () {
        entryButton.click();
        return this;
    }

    public PageWithEntry checkErrorEmptyLogin (String value) {
        errorEmptyLogin.shouldHave(text(value));
        errorEmptyLogin.shouldHave(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    public PageWithEntry checkErrorEmptyPassword(String value) {
        errorEmptyPassword.shouldHave(text(value));
        errorEmptyPassword.shouldHave(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    public PageWithEntry checkErrorEntryMessage (String value) {
        errorEntryMessage.find(byText(value));
        errorEntryMessage.shouldHave(text(value));
        errorEntryMessage.shouldBe(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    public PageWithEntry profileButtonClick () {
        profileButton.click();
        return this;
    }

    public PageWithEntry checkAutorization (String value) {
        myProfile.shouldHave(text(value));
        return this;
    }
    public PageWithEntry logoutClick () {
        logout.click();
        return this;
    }
}

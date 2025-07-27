package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.cssValue;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class PageWithEntry {

    private final SelenideElement
    pressEntry = $(".j-auth-open.username"),
    header = $(".j-tab.form-tab_link.active"),
    login = $("[placeholder=Логин]"),
    password = $("[placeholder=Пароль]"),
    entryButton = $(byTagAndText("button", "Войти")),
    errorEmptyLoginInput = $("[placeholder=Логин]").sibling(0),
    errorEmptyPasswordInput = $("[placeholder=Пароль]").sibling(0),
    errorEntryMessage = $(".auth-error"),
    profileButton = $(".j-profile-username"),
    myProfile = $(".page-menu__title");


    public PageWithEntry openPage () {
        open("");
        Selenide.sleep(3000);
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

    public PageWithEntry checkErrorLogin (String value) {
        errorEmptyLoginInput.shouldHave(text(value));
        errorEmptyLoginInput.shouldHave(cssValue("background-color", "rgba(226, 26, 26, 1)"));
        return this;
    }

    public PageWithEntry checkErrorPassword (String value) {
        errorEmptyPasswordInput.shouldHave(text(value));
        errorEmptyPasswordInput.shouldHave(cssValue("background-color", "rgba(226, 26, 26, 1)"));
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
}

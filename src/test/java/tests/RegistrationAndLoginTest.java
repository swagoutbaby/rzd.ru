package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.PageWithEntry;
import pages.PageWithRegistration;
import utils.FakerUtil;

import static com.codeborne.selenide.Selenide.$;

@Tag("regression")

public class RegistrationAndLoginTest extends TestBase {

    PageWithEntry pageWithEntry = new PageWithEntry();
    PageWithRegistration pageWithRegistration = new PageWithRegistration();

    //Тестирование формы входа в аккаунт

    @Test
    @DisplayName("Вход. Успешный вход по логину и паролю")
    @Tag("smoke")
    void LoginSuccessTest() {
        pageWithEntry
                .openPage()
                .pressEntry()
                .checkHeader("Вход")
                .loginInput("swagoutbaby")
                .passwordInput("dubZgePMCKb5qvx")
                .entryButtonClick()
                .profileButtonClick()
                .checkAutorization("Мой профиль");
                $(".j-profile-logout").click();
    }

    @Test
    @DisplayName("Вход. Некорректные данные")
    @Tag("smoke")
    void LoginInvalidValuesTest() {
        pageWithEntry
                .openPage()
                .pressEntry()
                .checkHeader("Вход")
                .loginInput(FakerUtil.generateLogin())
                .passwordInput(FakerUtil.generatePassword())
                .entryButtonClick()
                .checkErrorEntryMessage("Ошибка: Неверное имя пользователя или пароль");
    }

    @Test
    @DisplayName("Вход. Пустое поле ввода логина и пароля")
    @Tag("smoke")
    void LoginEmptyValuesTest() {
        pageWithEntry
                .openPage()
                .pressEntry()
                .checkHeader("Вход")
                .loginInput("")
                .passwordInput("")
                .entryButtonClick()
                .checkErrorLogin("Это поле необходимо заполнить")
                .checkErrorPassword("Это поле необходимо заполнить");
    }

    // Тестирование формы регистрации

}

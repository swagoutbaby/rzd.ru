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
                .checkErrorEmptyLogin("Это поле необходимо заполнить")
                .checkErrorEmptyPassword("Это поле необходимо заполнить");
    }

    // Тестирование формы регистрации

    @Test
    @DisplayName("Регистрация. Корректные значения")
    @Tag("smoke")
    void RegisterSuccessfulTest() {
        pageWithRegistration
                .openPage()
                .closeCookie()
                .pressEntry()
                .pressRegistration()
                .checkHeader("Регистрация")
                .emailInput(FakerUtil.generateEmail())
                .loginInput(FakerUtil.generateLogin())
                .passwordInput("12345-Gg")
                .passwordConfirmInput("12345-Gg")
                .firstNameInput(FakerUtil.generateFirstName())
                .lastNameInput(FakerUtil.generateLastName())
                .numberInput(FakerUtil.generatePhoneNumber())
                .agreementClick()
                .checkEmailBorderColor()
                .checkLoginBorderColor()
                .checkPasswordBorderColor()
                .checkPasswordConfirmBorderColor()
                .checkFirstNameBorderColor()
                .checkLastNameBorderColor()
                .checkNumberBorderColor()
                .checkClickedAgreement();
    }

    @Test
    @DisplayName("Регистрация. Пустые значения")
    @Tag("smoke")
    void RegisterEmptyValuesTest() {
        pageWithRegistration
                .openPage()
                .closeCookie()
                .pressEntry()
                .pressRegistration()
                .checkHeader("Регистрация")
                .registerButtonClick()
                .checkErrorEmail("Поле обязательное")
                .checkErrorLogin("Поле обязательное")
                .checkErrorPassword("Поле обязательное")
                .checkErrorPasswordConfirm("Поле обязательное")
                .checkErrorFirstName("Поле обязательное")
                .checkErrorLastName("Поле обязательное")
                .checkErrorEmptyAgreement("Требуется согласие")
                .checkErrorEmptyCaptcha("Требуется указать код подтверждения")
                .checkErrorEntryMessage("В форме обнаружены ошибки");
    }

    @Test
    @DisplayName("Регистрация. Некорректные значения")
    @Tag("smoke")
    void RegisterInvalidValuesTest() {
        pageWithRegistration
                .openPage()
                .closeCookie()
                .pressEntry()
                .pressRegistration()
                .checkHeader("Регистрация")
                .registerButtonClick()
                .emailInput(FakerUtil.generateInvalidEmail())
                .loginInput(FakerUtil.generateInvalidLogin())
                .passwordInput(FakerUtil.generateInvalidPassword())
                .passwordConfirmInput(FakerUtil.generateInvalidPassword())
                .firstNameInput(FakerUtil.generateInvalidFirstName())
                .lastNameInput(FakerUtil.generateInvalidLastName())
                .numberInput(FakerUtil.generateInvalidPhoneNumber())
                .captchaInput("123")
                .checkErrorEmail("Неверный формат Email")
                .checkErrorLogin("Недопустимый формат логина")
                .checkErrorPassword("Не соответствует требованиям безопасности")
                .checkErrorPasswordConfirm("Пароли не совпадают")
                .checkErrorFirstName("Имя указано неверно")
                .checkErrorLastName("Фамилия указана неверно")
                .checkErrorInvalidNumber("Формат телефона +79xxxxxxxxx")
                .checkErrorEmptyCaptcha("Указан неверный код подтверждения")
                .checkErrorEntryMessage("В форме обнаружены ошибки");
    }

    @Test
    @DisplayName("Регистрация. Не уникальные значения")
    @Tag("smoke")
    void RegisterNonUniqueValuesTest() {
        pageWithRegistration
                .openPage()
                .closeCookie()
                .pressEntry()
                .pressRegistration()
                .checkHeader("Регистрация")
                .registerButtonClick()
                .emailInput("mister.dim2017111@gmail.com")
                .loginInput("swagoutbaby")
                .checkErrorEmail("Email не уникален")
                .checkErrorLogin("Логин уже занят")
                .checkErrorEntryMessage("В форме обнаружены ошибки");
    }
}

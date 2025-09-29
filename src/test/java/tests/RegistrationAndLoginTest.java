package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.PageWithEntry;
import pages.PageWithRegistration;
import utils.FakerUtil;

@Tag("regression")

public class RegistrationAndLoginTest extends TestBase {

    private final String loginRZD = ""; // Нужно ввести валидный логин для входа в аккаунт РЖД
    private final String passwordRZD = ""; // Нужно ввести валидный пароль для входа в аккаунт РЖД

    PageWithEntry pageWithEntry = new PageWithEntry();
    PageWithRegistration pageWithRegistration = new PageWithRegistration();

    //Тестирование формы входа в аккаунт

    @Test
    @DisplayName("Вход. Успешный вход по логину и паролю")
    @Tag("smoke")
    @Owner("ChurinDmitiy")
    void LoginSuccessTest() {
        pageWithEntry
                .openPage()
                .pressEntry()
                .inputLogin(loginRZD) // Нужно ввести валидный логин для корректного проведения тестирования
                .inputPassword(passwordRZD) // Нужно ввести валидный пароль для корректного проведения тестирования
                .entryButtonClick()
                .clickProfileButton()
                .checkMyProfile("Мой профиль")
                .clickLogout();
    }

    @Test
    @DisplayName("Вход. Некорректные данные")
    @Tag("smoke")
    @Owner("ChurinDmitiy")
    void LoginInvalidValuesTest() {
        pageWithEntry
                .openPage()
                .pressEntry()
                .inputLogin(FakerUtil.generateLogin())
                .inputPassword(FakerUtil.generatePassword())
                .entryButtonClick()
                .checkErrorEntryMessage("Ошибка: Неверное имя пользователя или пароль");
    }

    @Test
    @DisplayName("Вход. Пустое поле ввода логина и пароля")
    @Tag("smoke")
    @Owner("ChurinDmitiy")
    void LoginEmptyValuesTest() {
        pageWithEntry
                .openPage()
                .pressEntry()
                .inputLogin("")
                .inputPassword("")
                .entryButtonClick()
                .checkErrorEmptyLogin("Это поле необходимо заполнить")
                .checkErrorEmptyPassword("Это поле необходимо заполнить");
    }

    @Test
    @DisplayName("Проверка функции 'Забыли пароль'")
    @Tag("smoke")
    @Owner("ChurinDmitiy")
    void forgotPasswordTest() {
        pageWithEntry
                .openPage()
                .pressEntry()

                .clickForgotPassword()

                .inputLoginForgotPassword("$$$$")
                .clickRecoverPasswordButton()
                .clickRecoverPasswordButton() //Два раза для появления всех ошибок
                .checkErrorEmailForgotPassword("Это поле необходимо заполнить")
                .checkErrorCaptchaForgotPassword("Это поле необходимо заполнить")
                .checkErrorMessageForgotPassword("Учетная запись не найдена")

                .inputEmailForgotPassword("$$$$")
                .inputCaptchaForgotPassword("444")
                .checkErrorEmailForgotPassword("Неверный формат Email")
                .checkErrorCaptchaForgotPassword("Указан неверный код подтверждения");
    }

    // Тестирование формы регистрации

    @Test
    @DisplayName("Регистрация. Корректные значения")
    @Tag("smoke")
    @Owner("ChurinDmitiy")
    void RegisterSuccessfulTest() {
        pageWithRegistration
                .openPage()
                .closeCookie()
                .pressEntry()
                .pressRegistration()
                .checkHeader("Регистрация")
                .inputEmail(FakerUtil.generateEmail())
                .inputLogin(FakerUtil.generateLogin())
                .inputPassword("12345-Gg")
                .inputPasswordConfirm("12345-Gg")
                .inputFirstName(FakerUtil.generateFirstName())
                .inputLastName(FakerUtil.generateLastName())
                .inputNumber(FakerUtil.generatePhoneNumber())
                .clickAgreement()
                .clickAgreement()
                .clickAgreement()
                // Три клика т.к для проверки того, что ошибка пропала, надо чтобы она появилась, после второго клика она появляется
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
    @Owner("ChurinDmitiy")
    void RegisterEmptyValuesTest() {
        pageWithRegistration
                .openPage()
                .closeCookie()
                .pressEntry()
                .pressRegistration()
                .checkHeader("Регистрация")
                .clickRegisterButton()
                .checkErrorEmail("Поле обязательное")
                .checkErrorLogin("Поле обязательное")
                .checkErrorPassword("Поле обязательное")
                .checkErrorPasswordConfirm("Поле обязательное")
                .checkErrorFirstName("Поле обязательное")
                .checkErrorLastName("Поле обязательное")
                .checkErrorEmptyAgreement("Требуется согласие")
                .checkErrorCaptcha("Требуется указать код подтверждения")
                .checkErrorEntryMessage("В форме обнаружены ошибки");
    }

    @Test
    @DisplayName("Регистрация. Некорректные значения")
    @Tag("smoke")
    @Owner("ChurinDmitiy")
    void RegisterInvalidValuesTest() {
        pageWithRegistration
                .openPage()
                .closeCookie()
                .pressEntry()
                .pressRegistration()
                .checkHeader("Регистрация")
                .clickRegisterButton()
                .inputEmail(FakerUtil.generateInvalidEmail())
                .inputLogin(FakerUtil.generateInvalidLogin())
                .inputPassword(FakerUtil.generateInvalidPassword())
                .inputPasswordConfirm(FakerUtil.generateInvalidPassword())
                .inputFirstName(FakerUtil.generateInvalidFirstName())
                .inputLastName(FakerUtil.generateInvalidLastName())
                .inputNumber(FakerUtil.generateInvalidPhoneNumber())
                .inputCaptcha("123")
                .checkErrorEmail("Неверный формат Email")
                .checkErrorLogin("Недопустимый формат логина")
                .checkErrorPassword("Не соответствует требованиям безопасности")
                .checkErrorPasswordConfirm("Пароли не совпадают")
                .checkErrorFirstName("Имя указано неверно")
                .checkErrorLastName("Фамилия указана неверно")
                .checkErrorInvalidNumber("Формат телефона +79xxxxxxxxx")
                .checkErrorCaptcha("Указан неверный код подтверждения")
                .checkErrorEntryMessage("В форме обнаружены ошибки");
    }

    @Test
    @DisplayName("Регистрация. Не уникальные значения")
    @Tag("smoke")
    @Owner("ChurinDmitiy")
    void RegisterNonUniqueValuesTest() {
        pageWithRegistration
                .openPage()
                .closeCookie()
                .pressEntry()
                .pressRegistration()
                .checkHeader("Регистрация")
                .clickRegisterButton()
                .inputEmail("mister.dim2017111@gmail.com")
                .inputLogin("swagoutbaby")
                .checkErrorEmail("Email не уникален")
                .checkErrorLogin("Логин уже занят")
                .checkErrorEntryMessage("В форме обнаружены ошибки");
    }

    @Test
    @DisplayName("Проверка профиля")
    @Tag("smoke")
    @Owner("ChurinDmitiy")
    void profileTest() {
        pageWithEntry
                .openPage()
                .pressEntry()
                .inputLogin(loginRZD)
                .inputPassword(passwordRZD) // Нужно ввести валидный пароль для корректного проведения тестирования
                .entryButtonClick()
                .clickProfileButton()
                .checkMyProfile("Чурин Дмитрий")
                .checkMyProfile("Мои данные")
                .checkMyProfile("Смена пароля")

                .clickLogout();
    }

    @Test
    @Tag("test")
    void fakeTest() {
        pageWithEntry
                .openPage();
    }
}

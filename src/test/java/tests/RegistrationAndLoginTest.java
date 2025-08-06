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
                .loginInput("swagoutbaby") // Нужно ввести валидный логин для корректного проведения тестирования
                .passwordInput("password") // Нужно ввести валидный пароль для корректного проведения тестирования
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

    @Test
    @DisplayName("Проверка функции 'Забыли пароль'")
    @Tag("smoke")
    void forgotPasswordTest() {
        pageWithEntry
                .openPage()
                .pressEntry()

                .clickForgotPassword()

                .checkForgotPasswordForm("Восстановление регистрационных данных")
                .checkForgotPasswordForm("Если Вы забыли пароль, но помните логин: введите логин и адрес e-mail," +
                        " указанные при регистрации.")
                .checkForgotPasswordForm("Если Вы забыли логин: введите адрес e-mail, указанный при регистрации.")
                .checkForgotPasswordForm("Если введенные Вами данные верны, Вы получите на e-mail письмо с дальнейшими инструкциями.")
                .checkForgotPasswordForm("Логин")
                .checkForgotPasswordForm("Email")
                .checkForgotPasswordForm("Защитный код")
                .checkForgotPasswordForm("Прослушать")
                .checkForgotPasswordForm("Отмена")
                .checkForgotPasswordForm("Восстановить")

                .inputLoginForgotPassword("$$$$")
                .clickRecoverPasswordButton()
                .clickRecoverPasswordButton()
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

    @Test
    @DisplayName("Проверка профиля")
    @Tag("smoke")
    void profileTest() {
        pageWithEntry
                .openPage()
                .pressEntry()
                .checkHeader("Вход")
                .loginInput("swagoutbaby")
                .passwordInput("") // Нужно ввести валидный пароль для корректного проведения тестирования
                .entryButtonClick()
                .profileButtonClick()
                .checkNameInHeader("Чурин Дмитрий")
                .checkAutorization("Мой профиль")
                .checkMyProfileList("Мои данные")
                .checkMyProfileList("Смена пароля")
                .checkMyProfileList("Мои фото/видео")
                .checkMyProfileList("Подписки")
                .checkMyProfileList("Подарочные карты ДОСС")

                .checkMyData("Мои данные")
                .checkMyData("Мой логин")
                .checkMyData("Фамилия")
                .checkMyData("Имя")
                .checkMyData("Отчество")
                .checkMyData("E-mail")
                .checkMyData("Телефон")
                .checkMyData("Дата рождения")
                .checkMyData("Пол")
                .checkMyData("согласие")
                .checkMyData("Сохранить");

                $(".j-profile-logout").click();
    }
}

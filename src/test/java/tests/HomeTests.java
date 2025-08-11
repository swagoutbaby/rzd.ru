package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.PageWithHome;

@Tag("regression")

public class HomeTests extends TestBase {

    String loginRZD = "swagoutbaby"; // Нужно ввести валидный логин для входа в аккаунт РЖД
    String passwordRZD = "dubZgePMCKb5qvx"; // Нужно ввести валидный пароль для входа в аккаунт РЖД
    String fioRZD = "Чурин Дмитрий Владимирович"; // Нужно ввести валидные данные для выбора пассажира
    String departureDateRZD = "8/25/2025";
    String returnDateRZD = "8/30/2025";
    String cityFromRZD = "Москва";
    String cityToRZD = "Адлер";

    PageWithHome pageWithHome = new PageWithHome();

    @Test
    @DisplayName("Проверка главной страницы")
    @Tag("smoke")
    @Owner("ChurinDmitiy")
    void homeTest() {
        pageWithHome
                .openPage()
                .closeCookie()

                .checkLogoHeader("Пассажирам")
                .checkLogoHeader("Грузовые перевозки")
                .checkLogoHeader("Компания")
                .checkLogoHeader("Работа в РЖД")
                .checkLogoHeader("Контакты")
                .checkLogoHeader("Версия для слабовидящих")
                .checkLogoHeader("Вход")
                .checkLogoHeader("Rus")

                .checkActionsHeader("Купить билет")
                .checkActionsHeader("Поезда и маршруты")
                .checkActionsHeader("Вокзалы")
                .checkActionsHeader("Тарифы и акции")
                .checkActionsHeader("Услуги и сервисы")
                .checkActionsHeader("РЖД Бонус")
                .checkActionsHeader("Правила")
                .checkActionsHeader("Информация")
                .checkActionsHeader("Карта сайта")

                .checkTopBlock("КУПИТЬ БИЛЕТ ")
                .checkTopBlock("Откуда")
                .checkTopBlock("Куда")
                .checkTopBlock("Туда")
                .checkTopBlock("Обратно")
                .checkTopBlock(" 1 пассажир ")
                .checkTopBlock(" Найти ")
                .checkTopBlock(" Найти отель на ")

                .checkMainBlock("Мои билеты")
                .checkMainBlock("Служба поддержки")
                .checkMainBlock("Маломобильные пассажиры")
                .checkMainBlock("Путешествуй с РЖД")
                .checkMainBlock("Проездные и подарочные карты ")
                .checkMainBlock("Акции и скидки")
                .checkMainBlock("Перед поездкой")
                .checkMainBlock("В поезде")
                .checkMainBlock("После поездки")
                .checkMainBlock("Скоростные поезда")
                .checkMainBlock("Отели, экскурсии, туры")
                .checkMainBlock("Перевозка автомобилей ")
                .checkMainBlock("Музеи железных дорог")
                .checkMainBlock("Детские железные дороги")
                .checkMainBlock("Мультимодальные перевозки (поезд+автобус, поезд+самолет, поезд+теплоход)")
                .checkMainBlock("Мобильное приложение для пассажиров")
                .checkMainBlock("Новости")

                .checkContactsBlock("8 800 775-00-00")
                .checkContactsBlock("звонок бесплатный для всех регионов РФ")
                .checkContactsBlock("+7 (499) 605-20-00")
                .checkContactsBlock("по всему миру, оплата в соответствии с тарифами вашего оператора связи")
                .checkContactsBlock("ticket@rzd.ru")
                .checkContactsBlock("для вопросов, связанных с электронными билетами")

                .checkMobileBlock("Железные дороги в вашем телефоне")

                .checkLowerBlock("Пассажирам")
                .checkLowerBlock("Купить билет")
                .checkLowerBlock("РЖД Бонус")
                .checkLowerBlock("Специальные акции")
                .checkLowerBlock("Мобильные приложения")
                .checkLowerBlock("Маломобильные пассажиры")

                .checkLowerBlock("Грузовые перевозки")
                .checkLowerBlock("Услуги")
                .checkLowerBlock("Сервисы")
                .checkLowerBlock("География присутствия")
                .checkLowerBlock("Документы")
                .checkLowerBlock("Справочники")
                .checkLowerBlock("Грузы в цифрах")

                .checkLowerBlock("О компании")
                .checkLowerBlock("Деятельность")
                .checkLowerBlock("Структура")
                .checkLowerBlock("Противодействие коррупции")
                .checkLowerBlock("Раскрытие информации")
                .checkLowerBlock("Раскрытие информации «Трансэнерго»")
                .checkLowerBlock("Инвесторам")
                .checkLowerBlock("Тендеры")
                .checkLowerBlock("Работа в РЖД")

                .checkLowerBlock("Контакты компании")
                .checkLowerBlock("RSS каналы")
                .checkLowerBlock("Подписка")
                .checkLowerBlock("Виртуальная приемная")
                .checkLowerBlock("Опросы")
                .checkLowerBlock("Сообщить об ошибке")
                .checkLowerBlock("О сайте")
                .checkLowerBlock("О противодействии мошенничеству")
                .checkLowerBlock("Все сайты портала РЖД")
                .checkLowerBlock("Политика обработки персональных данных в ОАО «РЖД»")
                .checkLowerBlock("Политика использования cookie-файлов")

                .checkLowestBlockLicenses("© ОАО «РЖД», 2003 - 2025")
                .checkLowestBlockLicenses("Свидетельство о регистрации СМИ Эл.№ФС77-25927")
                .checkLowestBlockLicenses("При использовании любых материалов ссылка на rzd.ru обязательна");
    }

    @Test
    @DisplayName("Проверка работы кнопок верхней строки ")
    @Tag("smoke")
    @Owner("ChurinDmitiy")
    void logoHeaderTest() {
        pageWithHome
                .openPage()
                .closeCookie()

                .clickFreightTransportation()
                .checkPageFreightTransportation("Рассчитать перевозку")

                .clickCompany()
                .checkPageCompany("Структура")

                .clickWorkInRZD()
                .checkPageWorkInRZD("ВАКАНСИИ ДНЯ")
                .openPage()

                .clickContacts()
                .checkPageContacts("Контакты")

                .clickVisuallyImpaired()
                .checkVisuallyImpaired()
                .clickRegularSite()

                .clickEntry()
                .checkEntryHeader()
                .clickCancelEntry()

                .switchLanguage()
                .checkEngLanguage()
                .switchLanguage()
                .checkRusLanguage()

                .clickSearch()
                .checkOpenSearch()
                .closeSearch()

                .clickPassengers()
                .checkHomePage();
    }

    @Test
    @DisplayName("Проверка работы кнопок верхней подстроки")
    @Tag("smoke")
    @Owner("ChurinDmitiy")
    void actionsHeaderTest() {
        pageWithHome
                .openPage()
                .closeCookie()

                .clickBuyTicket()
                .checkHomePage()

                .clickTrainsAndRoutes()
                .checkTrainsAndRoutes()
                .clickTrainAndRoutesDropList()
                .checkTrainAndRoutesDropList("Двухэтажные поезда")

                .clickTrainStations()
                .checkTrainStations()

                .clickTariffsAndAction()
                .checkTariffsAndActionPage()
                .clickTariffsAndActionDropList()
                .checkTariffsAndActionDropList("Льготы")

                .clickUslugsAndServices()
                .checkUslugsAndServicesPage()
                .clickUslugsAndServicesDropList()
                .checkUslugsAndServicesDropList("Маломобильным пассажирам")

                .clickRzdBonus()
                .checkRzdBonusPage()
                .openPage()
                .clickRzdBonusDropList()
                .checkRzdBonusDropList("Клуб путешественников")

                .clickRules()
                .checkRulesPage()
                .clickRulesDropList()
                .checkRulesDropList("Правила")

                .clickInfo()
                .checkInfoPage()
                .clickInfoDropList()
                .checkInfoDropList("Информация")

                .clickSiteMap()
                .checkSiteMap();
    }

    @Test
    @DisplayName("Проверка работы выбора пассажиров")
    @Tag("smoke")
    @Owner("ChurinDmitiy")
    void passengerOptionsTest() {
        pageWithHome
                .openPage()
                .closeCookie()

                .clickCountOfPassengers()

                .clickForDisabledPersonCheckbox()
                .checkIconForDisabledPerson()
                .clickForDisabledPersonCheckbox()

                .clickForLargeFamiliesCheckbox()
                .checkIconForLargeFamilies()
                .clickForLargeFamiliesCheckbox()

                .clickAnimalCheckbox()
                .checkIconAnimals()
                .clickAnimalCheckbox()

                .clickCarCheckbox()
                .checkIconCar()
                .clickCarCheckbox()

                .clickMotorcycleCheckbox()
                .checkIconMotorcycle()
                .clickMotorcycleCheckbox()


                .clickForDisabledPersonCheckbox()
                .clickForLargeFamiliesCheckbox()
                .clickAnimalCheckbox()

                .checkIconForDisabledPerson()
                .checkIconForLargeFamilies()
                .checkIconAnimals()

                .clickForLargeFamiliesCheckbox()
                .clickForDisabledPersonCheckbox()
                .clickAnimalCheckbox()

                .plusCountAdult(1)
                .minusCountAdult(1)

                .plusCountBabyWithPlace(1)
                .minusCountBabyWithPlace(1)

                .plusCountBabyWithoutPlace(1)
                .minusCountBabyWithoutPlace(1)

                .plusCountBabyWithoutPlace(2)
                .checkErrorNotice("Извините, количество детей без места в заказе не может быть больше количества пассажиров с местом.")
                .minusCountBabyWithoutPlace(2)

                .plusCountAdult(9)
                .checkErrorNotice("Извините, в одном заказе может быть не более 9 пассажиров с местом.")
                .minusCountAdult(8)

                .clickForDisabledPersonCheckbox()
                .plusCountAdult(4)
                .checkErrorNotice("Извините, в одном заказе с маломобильным пассажиром может быть не более трёх сопровождающих пассажиров с местами.")
                .minusCountAdult(4);

    }

    @Test
    @DisplayName("Проверка работы поиска маршрута. Валидные значения")
    @Tag("smoke")
    @Owner("ChurinDmitiy")
    void routeValidSearchTest() {
        pageWithHome
                .openPage()
                .closeCookie()

                .cityFromInput(cityFromRZD)
                .cityToInput(cityToRZD)
                .chooseDepartureDate(departureDateRZD)
                .chooseReturnDate(returnDateRZD)
                .clickFindRoute()
                .checkRoutePageCityFrom(cityFromRZD)
                .checkRoutePageCityTo(cityToRZD);

    }

    @Test
    @DisplayName("Проверка работы поиска маршрута. В один и тот же город")
    @Tag("smoke")
    @Owner("ChurinDmitiy")
    void routeInvalidSearchTest() {
        pageWithHome
                .openPage()
                .closeCookie()

                .cityFromInput("Москва")
                .cityToInput("Москва")
                .chooseDepartureDate("8/15/2025")
                .chooseReturnDate("8/30/2025")
                .clickFindRoute()
                .checkInvalidRoutePage("Прямых железнодорожных рейсов по маршруту Москва", "— Москва на", "15 августа не найдено.");
    }

    @Test
    @DisplayName("Проверка работы смены направления")
    @Tag("smoke")
    @Owner("ChurinDmitiy")
    void swapCityTest() {
        pageWithHome
                .openPage()
                .closeCookie()

                .cityFromInput(cityFromRZD)
                .cityToInput(cityToRZD)
                .chooseDepartureDate(departureDateRZD)
                .clickNotNeedReturnTicket()
                .clickSwapCity()
                .clickFindRoute()
                .checkRoutePageCityFrom(cityToRZD) // Т.к мы поменяли города местами,
                .checkRoutePageCityTo(cityFromRZD); // в проверке города отправления, должен быть город назначения
    }

    @Test
    @DisplayName("Проверка перехода на travel.RZD")
    @Tag("smoke")
    @Owner("ChurinDmitiy")
    void findHotelTravelRZDTest() {
        pageWithHome
                .openPage()
                .closeCookie()

                .clickFindHotel()
                .checkCheckboxFindHotel()
                .clickTravelRZD()
                .checkTravelRZDPage("https://travel.rzd.ru/?utm_source=rzd_checkbox_all&utm_medium=referral&utm_campaign=hotels");
    }

    @Test
    @DisplayName("Проверка работы поиска")
    @Tag("smoke")
    @Owner("ChurinDmitiy")
    void searchTest() {
        pageWithHome
                .openPage()
                .closeCookie()

                .clickSearch()
                .searchInput(cityFromRZD)
                .clickSearchButton()
                .checkKeywords(cityFromRZD)
                .checkSearchResults(cityFromRZD);
    }

    @Test
    @DisplayName("Проверка работы виртуального помощника")
    @Tag("smoke")
    @Owner("ChurinDmitiy")
    void virtualAssistantTest() {
        pageWithHome
                .openPage()
                .closeCookie()

                .clickOnlineChat()
                .checkOnlineChat("Здравствуйте! Напишите Ваш вопрос или выберите тему:")
                .chooseThemeOnlineChat("Возврат электронных билетов")
                .checkOnlineChat("Ответы на самые популярные вопросы," +
                        " связанные с возвратом электронных билетов доступны на этой странице.")

                .clickOnlineChat()
                .checkOnlineChat("Здравствуйте! Напишите Ваш вопрос или выберите тему:")
                .sendMessageOnlineChat("Возврат электронных билетов")
                .checkOnlineChat("Автоматическое сообщение")
                .checkOnlineChat("Обращаем Ваше внимание! Продолжая использование этого сервиса," +
                        " Вы даете своё согласие на обработку Ваших персональных данных в соответствии со ст. 6 ФЗ № 152.")
                .checkOnlineChat("Виртуальный помощник")
                .checkOnlineChat("Здравствуйте, я буду помогать в решении Вашего вопроса.")
                .checkOnlineChat("Билеты бывают возвратными и невозвратными. Уточните, какой у Вас билет?\n" +
                        "Или у Вас билет на электричку?");
    }

    @Test
    @DisplayName("Проверка тестового сценария c перевозкой автомобиля")
    @Tag("E2E")
    @Owner("ChurinDmitiy")
    void carTransportationTest() {
        pageWithHome
                .openPage()
                .closeCookie()

                .cityFromInput(cityFromRZD)
                .cityToInput(cityToRZD)
                .chooseDepartureDate(departureDateRZD)
                .clickNotNeedReturnTicket()
                .minusCountAdult(1)
                .clickCarCheckbox()
                .clickFindRoute()
                .clickEntryTicketPage()
                .loginInputTicketPage(loginRZD)
                .passwordInputTicketPage(passwordRZD) // Нужно ввести валидный пароль для корректного проведения тестирования
                .clickEntryButtonTicketPage()
                .chooseTypeSeat("Перевозка автомобиля (мототехники)")
                .chooseTypeSeat("Перевозка автомобиля (мототехники)") // Надо кликнуть два раза
                .checkCarTransportationPage()
                .clickEntryTicketPage()
                .clickLogoutTicketPage();
    }

    @Test
    @DisplayName("Проверка тестового сценария c перевозкой животного без сопровождающего")
    @Tag("E2E")
    @Owner("ChurinDmitiy")
    void animalsTransportationTest() {
        pageWithHome
                .openPage()
                .closeCookie()

                .cityFromInput(cityFromRZD)
                .cityToInput(cityToRZD)
                .chooseDepartureDate(departureDateRZD)
                .clickNotNeedReturnTicket()
                .minusCountAdult(1)
                .clickAnimalCheckbox()
                .clickFindRoute()
                .clickEntryTicketPage()
                .loginInputTicketPage(loginRZD)
                .passwordInputTicketPage(passwordRZD) // Нужно ввести валидный пароль для корректного проведения тестирования
                .clickEntryButtonTicketPage()
                .chooseTypeSeat("Перевозка животных без сопровождающего")
                .chooseTypeSeat("Перевозка животных без сопровождающего") // Надо кликнуть два раза
                .checkAnimalsTransportationPage()
                .clickEntryTicketPage()
                .clickLogoutTicketPage();
    }

    @Test
    @DisplayName("Проверка тестового сценария c 1 пассажиром")
    @Tag("E2E")
    @Owner("ChurinDmitiy")
    void onePerson_e2eTest() {
        pageWithHome
                .openPage()
                .closeCookie()

                .cityFromInput(cityFromRZD)
                .cityToInput(cityToRZD)
                .chooseDepartureDate(departureDateRZD)
                .clickNotNeedReturnTicket()
                .clickSwapCity()
                .clickFindRoute()
                .clickEntryTicketPage()
                .loginInputTicketPage(loginRZD) // Нужно ввести валидный логин для корректного проведения тестирования
                .passwordInputTicketPage(passwordRZD) // Нужно ввести валидный пароль для корректного проведения тестирования
                .clickEntryButtonTicketPage()
                .chooseTypeSeat("Плацкартный")
                .chooseAvailableSeat()
                .clickContinue()
                .clickChoosePassengerButton()
                .choosePassenger(fioRZD) // Нужно ввести валидное ФИО для корректного проведения тестирования
                .clickEntryTicketPage()
                .clickLogoutTicketPage();
//                .clickMakeOrderButton() // Закомментил чтобы не заказывать билеты постоянно, для полноценной проверки раскосматить
//                .checkOrderPage();
    }

    @Test
    @DisplayName("Проверка тестового сценария c 1 пассажиром инвалидом")
    @Tag("E2E")
    @Owner("ChurinDmitiy")
    void oneDisabledPerson_e2eTest() {
        pageWithHome
                .openPage()
                .closeCookie()

                .cityFromInput(cityFromRZD)
                .cityToInput(cityToRZD)
                .chooseDepartureDate(departureDateRZD)
                .clickNotNeedReturnTicket()
                .clickForDisabledPersonCheckbox()
                .clickFindRoute()
                .clickEntryTicketPage()
                .loginInputTicketPage(loginRZD) // Нужно ввести валидный логин для корректного проведения тестирования
                .passwordInputTicketPage(passwordRZD) // Нужно ввести валидный пароль для корректного проведения тестирования
                .clickEntryButtonTicketPage()
                .chooseTypeSeat("Купе (для инвалидов)")
                .chooseAvailableSeat()
                .clickContinue()
                .clickChoosePassengerButton()
                .choosePassenger(fioRZD) // Нужно ввести валидное ФИО для корректного проведения тестирования
                .checkSnils()
                .clickEntryTicketPage()
                .clickLogoutTicketPage();
//                .inputSnils("") // Нужно ввести корректные значения в таком формате: "xxx-xxx-xxx xx" x - цифра
//                .clickMakeOrderButton();
//                .checkOrderPage(); // Если есть корректные значения, то можно раскомментить
    }
}
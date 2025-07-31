package tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.PageWithHome;
import utils.FakerUtil;

@Tag("regression")

public class HomeTests extends TestBase {

    PageWithHome pageWithHome = new PageWithHome();

    @Test
    @DisplayName("Проверка главной страницы")
    @Tag("smoke")
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
    void actionsHeaderTest() {
        pageWithHome
                .openPage()
                .closeCookie()

                .buyTicketClick()
                .checkHomePage()

                .trainsAndRoutesClick()
                .checkTrainsAndRoutes()
                .trainAndRoutesDropListClick()
                .checkTrainAndRoutesDropList("Двухэтажные поезда")

                .trainStationsClick()
                .checkTrainStations()

                .tariffsAndActionClick()
                .checkTariffsAndActionPage()
                .tariffsAndActionDropListClick()
                .checkTariffsAndActionDropList("Льготы")

                .uslugsAndServicesClick()
                .checkUslugsAndServicesPage()
                .uslugsAndServicesDropListClick()
                .checkUslugsAndServicesDropList("Маломобильным пассажирам")

                .rzdBonusClick()
                .checkRzdBonusPage()
                .openPage()
                .rzdBonusDropListClick()
                .checkRzdBonusDropList("Клуб путешественников")

                .rulesClick()
                .checkRulesPage()
                .rulesDropListClick()
                .checkRulesDropList("Правила")

                .infoClick()
                .checkInfoPage()
                .infoDropListClick()
                .checkInfoDropList("Информация")

                .siteMapClick()
                .checkSiteMap();
    }

    @Test
    @DisplayName("Проверка работы поиска маршрута")
    @Tag("smoke")
    void routeSearchTest() {
        pageWithHome
                .openPage()
                .closeCookie()

                .cityFromInput("Москва")
                .cityWhereInput("Казань")
                .chooseDepartureDate("8/15/2025")
                .chooseReturnDate("8/30/2025")
//                .plusCountAdult(1) // Один взрослый по умолчанию, +1 Итого: 2 взрослых
//                .minusCountAdult(1)
//                .plusCountBabyWithPlace(2)
//                .plusCountBabyWithPlace(2)
//                .minusCountBabyWithPlace(1)
//                .plusCountBabyWithoutPlace(2)
//                .minusCountBabyWithoutPlace(1)
                .clickFindRoute()
                .checkRoutePage("Москва", "Казань", " 15 авг., пт ");
    }

    @Test
    @DisplayName("Проверка работы поиска маршрута. Валидные значения")
    @Tag("smoke")
    void routeValidSearchTest() {
        pageWithHome
                .openPage()
                .closeCookie()

                .cityFromInput("Москва")
                .cityWhereInput("Казань")
                .chooseDepartureDate("8/15/2025")
                .chooseReturnDate("8/30/2025")
//                .plusCountAdult(1) // Один взрослый по умолчанию, +1 Итого: 2 взрослых
//                .minusCountAdult(1)
//                .plusCountBabyWithPlace(2)
//                .plusCountBabyWithPlace(2)
//                .minusCountBabyWithPlace(1)
//                .plusCountBabyWithoutPlace(2)
//                .minusCountBabyWithoutPlace(1)
                .clickFindRoute()
                .checkRoutePage("Москва", "Казань", " 15 авг., пт ");
    }

    @Test
    @DisplayName("Проверка работы поиска маршрута. В один и тот же город")
    @Tag("smoke")
    void routeInvalidSearchTest() {
        pageWithHome
                .openPage()
                .closeCookie()

                .cityFromInput("Москва")
                .cityWhereInput("Москва")
                .chooseDepartureDate("8/15/2025")
                .chooseReturnDate("8/30/2025")
//                .plusCountAdult(1) // Один взрослый по умолчанию, +1 Итого: 2 взрослых
//                .minusCountAdult(1)
//                .plusCountBabyWithPlace(2)
//                .plusCountBabyWithPlace(2)
//                .minusCountBabyWithPlace(1)
//                .plusCountBabyWithoutPlace(2)
//                .minusCountBabyWithoutPlace(1)
                .clickFindRoute()
                .checkInvalidRoutePage("Прямых железнодорожных рейсов по маршруту Москва", "— Москва на", "15 августа не найдено.");
    }

    @Test
    @DisplayName("Проверка перехода на travel.RZD")
    @Tag("smoke")
    void findHotelTravelRZDTest() {
        pageWithHome
                .openPage()
                .closeCookie()

                .checkFindHotel("https://travel.rzd.ru/?utm_source=rzd_checkbox_all&utm_medium=referral&utm_campaign=hotels");
    }

    @Test
    @DisplayName("Проверка работы виртуального помощника")
    @Tag("smoke")
    void virtualAssistantTest() {
        pageWithHome
                .openPage()
                .closeCookie()

                .onlineChatClick()
                .checkOnlineChat("Здравствуйте! Напишите Ваш вопрос или выберите тему:")
                .chooseThemeOnlineChat("Возврат электронных билетов")
                .checkOnlineChat("Ответы на самые популярные вопросы," +
                        " связанные с возвратом электронных билетов доступны на этой странице.")

                .onlineChatClick()
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


}
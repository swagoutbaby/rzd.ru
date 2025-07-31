package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverThreadLocalContainer;
import com.codeborne.selenide.selector.ByDeepShadowCss;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.shadowDeepCss;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.currentFrameUrl;
import static com.codeborne.selenide.WebDriverConditions.url;
import static org.junit.jupiter.api.Assertions.fail;



public class PageWithHome {

    private final SelenideElement
            CookieButton = $(".cookie-alert__btn"),

            // Первый хедер
            passengers = $(".header_site").$(byTagAndText("a", "Пассажирам")),
            freightTransportation = $(".header_site").$(byTagAndText("a", "Грузовые перевозки")),
            company = $(".header_site").$(byTagAndText("a", "Компания")),
            workInRZD = $(".header_site").$(byTagAndText("a", "Работа в РЖД")),
            contacts = $(".header_site").$(byTagAndText("a", "Контакты")),
            visuallyImpaired = $(".blind__text"),
            regularSite = $(".settings-wrap").$(byTagAndText("span", "Обычная версия сайта")),
            pressEntry = $(".j-auth-open.username"),
            cancelEntry = $(byTagAndText("a", "Отмена")),
            switchLanguageButton = $(".j-locale-select-open"),
            switchLanguage = $(".locale-switch__li"),
            search = $(".icon-search"),

            pageFreightTransportation = $(".body-page-92162"),
            pageCompany = $(".body-page-31560"),
            pageWorkInRZD = $(".bg-white"),
            pageContacts = $(".body-page-100162"),
            pageVisuallyImpaired = $(byTagAndText("span", "Обычная версия сайта")),
            header = $(".j-tab.form-tab_link.active"),
            openSearch = $(".menu-search-btn"),
            closeSearch = $(".menu-search-close"),

    // Второй хедер
            buyTicket = $("[data-test-id=block_4]").$(byTagAndText("a", "Купить билет")),

            trainsAndRoutes = $("[data-test-id=block_4]").$(byTagAndText("a", "Поезда и маршруты")),
            trainsAndRoutesDropListButton = $("[data-test-id=block_4]").$(byTagAndText("a", "Поезда и маршруты"))
                    .sibling(0).$(".j-menu-open"),
            trainsAndRoutesDropList = $("[data-test-id=block_4]").$(byTagAndText("a", "Поезда и маршруты"))
                    .sibling(0).$(".menu-list.j-menu"),
            trainsAndRoutesPage = $(".nav-header__title"),

            trainStations = $("[data-test-id=block_4]").$(byTagAndText("a", "Вокзалы")),
            trainStationsPage = $(".highlight"),

            tariffsAndAction = $("[data-test-id=block_4]").$(byTagAndText("a", "Тарифы и акции")),
            tariffsAndActionDropListButton = $("[data-test-id=block_4]").$(byTagAndText("a", "Тарифы и акции"))
                    .sibling(0).$(".j-menu-open"),
            tariffsAndActionDropList = $("[data-test-id=block_4]").$(byTagAndText("a", "Тарифы и акции"))
                    .sibling(0).$(".menu-list.j-menu"),
            TariffsAndActionPage = $(".nav-header__title"),

            uslugsAndServices = $("[data-test-id=block_4]").$(byTagAndText("a", "Услуги и сервисы")),
            uslugsAndServicesDropListButton = $("[data-test-id=block_4]").$(byTagAndText("a", "Услуги и сервисы"))
                    .sibling(0).$(".j-menu-open"),
            uslugsAndServicesDropList = $("[data-test-id=block_4]").$(byTagAndText("a", "Услуги и сервисы"))
                    .sibling(0).$(".menu-list.j-menu"),
            uslugsAndServicesPage = $(".nav-header__title"),

            rzdBonus = $("[data-test-id=block_4]").$(byTagAndText("a", "РЖД Бонус")),
            rzdBonusDropListButton = $("[data-test-id=block_4]").$(byTagAndText("a", "РЖД Бонус"))
                    .sibling(0).$(".j-menu-open"),
            rzdBonusDropList = $("[data-test-id=block_4]").$(byTagAndText("a", "РЖД Бонус"))
                    .sibling(0).$(".menu-list.j-menu"),
            rzdBonusPage = $(".fp-viewing-main"),

            rules = $("[data-test-id=block_4]").$(byTagAndText("a", "Правила")),
            rulesDroplistButton = $("[data-test-id=block_4]").$(byTagAndText("a", "Правила"))
                    .sibling(0).$(".j-menu-open"),
            rulesDropList = $("[data-test-id=block_4]").$(byTagAndText("a", "Правила"))
                    .sibling(0).$(".menu-list.j-menu"),
            rulesPage = $(".nav-header__title"),

            info = $("[data-test-id=block_4]").$(byTagAndText("a", "Информация")),
            infoDropListButton = $("[data-test-id=block_4]").$(byTagAndText("a", "Информация"))
                    .sibling(0).$(".j-menu-open"),
            infoDropList = $("[data-test-id=block_4]").$(byTagAndText("a", "Информация"))
                    .sibling(0).$(".menu-list.j-menu"),
            infoPage = $(".nav-header__title"),

            siteMap = $("[data-test-id=block_4]").$(byTagAndText("a", "Карта сайта")),
            siteMapPage = $(".nav-header__title"),

            // Форма поиска маршрутов
            cityFrom = $(shadowDeepCss("[formcontrolname=fromNode]")).$(byTagName("input")),
            swapCityButton = $(".route-search__swapper"),
            cityWhere = $(shadowDeepCss("[formcontrolname=toNode]")).$(byTagName("input")),
            departureDate = $(shadowDeepCss("[controlname=fromDate]")).$(byTagName("input")),
            returnDate = $(shadowDeepCss("[controlname=backDate]")).$(byTagName("input")),
            numberOfPassengers = $(shadowDeepCss(".search-panel-options.__dropdown-opened")),
            dropdownPassengersList = $(".search-panel-options__dropdown"),

            minusAdultPassenger = $(shadowDeepCss("[formcontrolname=adult]")).$(shadowDeepCss(".counter__button")),
            plusAdultPassenger = $(shadowDeepCss("[formcontrolname=adult]")).$(shadowDeepCss(".counter__button")).sibling(1),

//            plusBabyWithPlace = $(shadowDeepCss("[formcontrolname=babyWithPlace]")).$(shadowDeepCss(".counter__button")).sibling(1),
//            minusBabyWithPlace = $(shadowDeepCss("[formcontrolname=babyWithPlace]")).$(shadowDeepCss(".counter__button")),
//
//            plusBabyWithoutPlace =
//            minusBabyWithoutPlace =

            forInvalid = $("[formcontrolname=disabledPerson]"),

            findRoute = $(shadowDeepCss(".route-search__submit-button")),
            routePage = $(".searchresults__list"),
            invalidRoutePage = $(".searchresults__cards-wrapper"),


            // Поиск отеля на Travel.RZD
            findHotelClick = $(shadowDeepCss(".checkbox-text")),
            clickTravelRZD = $(shadowDeepCss(".checkbox-text")).$(byText("Travel.RZD")),
            findHotelCheckedCheckbox = $(shadowDeepCss(".checkbox__box.checkbox__box--checked")),

            // Хедеры и блоки которые охватывают большое количество элементов
            logoHeader = $("#logo-menu_wrap"),
            actionsHeader = $("[data-test-id=block_4]"),
            topBlock = $(".header.header_index"),
            mainBlock = $(".block-page__container"),
            contactsBlock = $(".contacts.section_item"),
            mobileBlock = $(".ekmp.section_item.text-white"),
            lowerBlock = $(".site-map.section_item"),
            lowestBlockLicenses = $(".media.section_item.media-line"),
    
            onlineChat = $(".chat__icon"), // Онлайн чат с виртуальным помощником
            mainChat = $(".main_chat"),
            inputMessage = $(".chat.chat__open").$("[name=text]"),
            sendMessageButton = $("[title=Отправить]");




    public PageWithHome openPage() {
        open("");
        return this;
    }

    public PageWithHome closeCookie() {
        if (CookieButton.isDisplayed())
        {
            CookieButton.click();
            Selenide.sleep(2000);
        }
        return this;
    }

    public PageWithHome clickPassengers() {
        passengers.click();
        return this;
    }

    public PageWithHome clickFreightTransportation() {
        freightTransportation.click();
        Selenide.sleep(3000);
        return this;
    }

    public PageWithHome clickCompany() {
        company.click();
        Selenide.sleep(3000);
        return this;
    }

    public PageWithHome clickWorkInRZD() {
        workInRZD.click();
        Selenide.sleep(3000);
        return this;
    }

    public PageWithHome clickContacts() {
        contacts.click();
        Selenide.sleep(3000);
        return this;
    }

    public PageWithHome clickVisuallyImpaired() {
        visuallyImpaired.click();
        Selenide.sleep(3000);
        return this;
    }

    public PageWithHome clickRegularSite() {
        regularSite.click();
        Selenide.sleep(3000);
        return this;
    }

    public PageWithHome clickEntry() {
        pressEntry.click();
        return this;
    }

    public PageWithHome clickCancelEntry() {
        cancelEntry.click();
        return this;
    }

    public PageWithHome clickSearch() {
        search.click();
        return this;
    }

    public PageWithHome switchLanguage() {
        switchLanguageButton.click();
        switchLanguage.click();
        return this;
    }

    public PageWithHome buyTicketClick() {
        buyTicket.click();
        return this;
    }

    public PageWithHome trainsAndRoutesClick() {
        trainsAndRoutes.click();
        return this;
    }

    public PageWithHome checkTrainsAndRoutes() {
        trainsAndRoutesPage.shouldHave(text("Поезда и маршруты"));
        return this;
    }

    public PageWithHome trainAndRoutesDropListClick() {
        trainsAndRoutesDropListButton.click();
        return this;
    }

    public PageWithHome checkTrainAndRoutesDropList(String value) {
        trainsAndRoutesDropList.shouldHave(text(value));
        return this;
    }

    public PageWithHome trainStationsClick() {
        trainStations.click();
        return this;
    }

    public PageWithHome checkTrainStations() {
        trainStationsPage.shouldHave(text("Вокзалы"));
        return this;
    }

    public PageWithHome tariffsAndActionClick() {
        tariffsAndAction.click();
        return this;
    }

    public PageWithHome tariffsAndActionDropListClick() {
        tariffsAndActionDropListButton.click();
        return this;
    }

    public PageWithHome checkTariffsAndActionDropList(String value) {
        tariffsAndActionDropList.shouldHave(text(value));
        return this;
    }

    public PageWithHome checkTariffsAndActionPage() {
        TariffsAndActionPage.shouldHave(text("Тарифы и акции"));
        return this;
    }


    public PageWithHome uslugsAndServicesClick() {
        uslugsAndServices.click();
        return this;
    }

    public PageWithHome uslugsAndServicesDropListClick() {
        uslugsAndServicesDropListButton.click();
        return this;
    }

    public PageWithHome checkUslugsAndServicesDropList(String value) {
        uslugsAndServicesDropList.shouldHave(text(value));
        return this;
    }

    public PageWithHome checkUslugsAndServicesPage() {
        uslugsAndServicesPage.shouldHave(text("Услуги и сервисы"));
        return this;
    }

    public PageWithHome rzdBonusClick() {
        rzdBonus.click();
        return this;
    }

    public PageWithHome rzdBonusDropListClick() {
        rzdBonusDropListButton.click();
        return this;
    }

    public PageWithHome checkRzdBonusDropList(String value) {
        rzdBonusDropList.shouldHave(text(value));
        return this;
    }

    public PageWithHome checkRzdBonusPage() {
        rzdBonusPage.shouldHave(text("РЖД Бонус"));
        return this;
    }

    public PageWithHome rulesClick() {
        rules.click();
        return this;
    }

    public PageWithHome rulesDropListClick() {
        rulesDroplistButton.click();
        return this;
    }

    public PageWithHome checkRulesDropList(String value) {
        rulesDropList.shouldHave(text(value));
        return this;
    }

    public PageWithHome checkRulesPage() {
        rulesPage.shouldHave(text("Правила"));
        return this;
    }

    public PageWithHome infoClick() {
        info.click();
        return this;
    }

    public PageWithHome infoDropListClick() {
        infoDropListButton.click();
        return this;
    }

    public PageWithHome checkInfoDropList(String value) {
        infoDropList.shouldHave(text(value));
        return this;
    }

    public PageWithHome checkInfoPage() {
        infoPage.shouldHave(text("Информация"));
        return this;
    }

    public PageWithHome siteMapClick() {
        siteMap.click();
        return this;
    }

    public PageWithHome checkSiteMap() {
        siteMapPage.shouldHave(text("Карта сайта"));
        return this;
    }

    public PageWithHome cityFromInput(String value) {
        cityFrom.setValue(value);
        Selenide.sleep(500);
        return this;
    }

    public PageWithHome swapCityClick() {
        swapCityButton.click();
        return this;
    }

    public PageWithHome cityWhereInput(String value) {
        cityWhere.setValue(value);
        Selenide.sleep(500);
        return this;
    }

    public PageWithHome chooseDepartureDate(String date) {
        departureDate.click();
        String day = date.substring(0, 1);
        String month = date.substring(2, 4);
        String year = date.substring(5, 9);
        $(shadowDeepCss(".ui-kit-datepicker")).$(shadowDeepCss("[data-testid='ui-kit-day_"
                + day + "\\/" + month + "\\/" + year + "']")).click();
        return this;
    }

    public PageWithHome chooseReturnDate(String date) {
        returnDate.click();
        String day = date.substring(0, 1);
        String month = date.substring(2, 4);
        String year = date.substring(5, 9);
        $(shadowDeepCss(".ui-kit-datepicker")).$(shadowDeepCss("[data-testid='ui-kit-day_"
                + day + "\\/" + month + "\\/" + year + "']")).click();
        return this;
    }

    public PageWithHome clickNumberOfPassengers() {
        numberOfPassengers.click();
        return this;
    }

    public PageWithHome clickFindRoute() {
        findRoute.click();
        Selenide.sleep(4000);
        return this;
    }

    public PageWithHome checkRoutePage(String from, String where, String date) {
        routePage.shouldHave(text(from));
        routePage.shouldHave(text(where));
        routePage.shouldHave(text(date));
        return this;
    }

    public PageWithHome checkInvalidRoutePage(String from, String where, String date) {
        invalidRoutePage.shouldHave(text(from));
        invalidRoutePage.shouldHave(text(where));
        invalidRoutePage.shouldHave(text(date));
        return this;
    }

    public PageWithHome checkFindHotel(String url) {
        findHotelClick.shouldBe(visible);
        findHotelClick.click();
        findHotelCheckedCheckbox.shouldBe(visible);
        clickTravelRZD.click();
        switchTo().window(1);
        webdriver().shouldHave(url(url));
        return this;
    }

    public PageWithHome checkPassengersDropList(String value) {
        dropdownPassengersList.shouldHave(text(value));
        return this;
    }

    public PageWithHome plusCountAdult(Integer value) {
        for (int i = 0; i < value; i++) {
            plusAdultPassenger.click();
        }
        return this;
    }

    public PageWithHome minusCountAdult(Integer value) {
        for (int i = 0; i < value; i++) {
            minusAdultPassenger.click();
        }
        return this;
    }

//    public PageWithHome plusCountBabyWithPlace(Integer value) {
//        for (int i = 0; i < value; i++) {
//            plusBabyWithPlace.click();
//        }
//        return this;
//    }
//
//    public PageWithHome minusCountBabyWithPlace(Integer value) {
//        for (int i = 0; i < value; i++) {
//            minusBabyWithPlace.click();
//        }
//        return this;
//    }

//    public PageWithHome plusCountBabyWithoutPlace(Integer value) {
//        for (int i = 0; i < value; i++) {
//            plusBabyWithoutPlace.click();
//        }
//        return this;
//    }

//    public PageWithHome minusCountBabyWithoutPlace(Integer value) {
//        for (int i = 0; i < value; i++) {
//            minusBabyWithoutPlace.click();
//        }
//        return this;
//    }

    public PageWithHome chooseInvalid() {
        forInvalid.click();
        return this;
    }

    public PageWithHome checkActionsHeader(String value) {
        actionsHeader.shouldHave(text(value));
        return this;
    }

    public PageWithHome checkLogoHeader(String value) {
        logoHeader.shouldHave(text(value));
        return this;
    }

    public PageWithHome checkTopBlock(String value) {
        topBlock.shouldHave(text(value));
        return this;
    }

    public PageWithHome checkMainBlock(String value) {
        mainBlock.shouldHave(text(value));
        return this;
    }

    public PageWithHome checkContactsBlock(String value) {
        contactsBlock.shouldHave(text(value));
        return this;
    }

    public PageWithHome checkMobileBlock(String value) {
        mobileBlock.shouldHave(text(value));
        return this;
    }

    public PageWithHome checkLowerBlock(String value) {
        lowerBlock.shouldHave(text(value));
        return this;
    }

    public PageWithHome checkLowestBlockLicenses(String value) {
        lowestBlockLicenses.shouldHave(text(value));
        return this;
    }

    public PageWithHome onlineChatClick() {
        onlineChat.click();
        return this;
    }

    public PageWithHome checkOnlineChat(String value) {
        mainChat.shouldHave(text(value));
        return this;
    }

    public PageWithHome sendMessageOnlineChat(String message) {
        inputMessage.setValue(message);
        sendMessageButton.click();
        Selenide.sleep(6000);
        return this;
    }

    public PageWithHome chooseThemeOnlineChat(String theme) {
        $(byTagAndText("button", theme)).click();
        return this;
    }

    public PageWithHome checkHomePage() {
        passengers.shouldHave(text("Пассажирам"));
        return this;
    }

    public PageWithHome checkPageFreightTransportation(String value) {
        pageFreightTransportation.shouldHave(text(value));
        return this;
    }

    public PageWithHome checkPageCompany(String value) {
        pageCompany.shouldHave(text(value));
        return this;
    }

    public PageWithHome checkPageWorkInRZD(String value) {
        pageWorkInRZD.shouldHave(text(value));
        return this;
    }

    public PageWithHome checkPageContacts(String value) {
        pageContacts.shouldHave(text(value));
        return this;
    }

    public PageWithHome checkVisuallyImpaired() {
        pageVisuallyImpaired.shouldHave(text("Обычная версия сайта"));
        return this;
    }

    public PageWithHome checkEntryHeader() {
        header.shouldHave(text("Вход"));
        return this;
    }

    public PageWithHome checkEngLanguage() {
        logoHeader.shouldHave(text("Passengers"));
        return this;
    }

    public PageWithHome checkRusLanguage() {
        passengers.shouldHave(text("Пассажирам"));
        return this;
    }

    public PageWithHome checkOpenSearch() {
        openSearch.shouldHave(text("Найти"));
        return this;
    }

    public PageWithHome closeSearch() {
        closeSearch.click();
        return this;
    }
}
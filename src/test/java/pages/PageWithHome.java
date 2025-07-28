package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class PageWithHome {

    private final SelenideElement
            CookieButton = $(".cookie-alert__btn"),

            // Первый хедер
            passengers = $("#logo-menu_wrap").$(byTagAndText("a", "Пассажирам")),
            freightTransportation = $("$(#logo-menu_wrap").$(byTagAndText("a", "Пассажирам")),
            company = $("$(#logo-menu_wrap").$(byTagAndText("a", "Компания")),
            workInRZD = $("$(#logo-menu_wrap").$(byTagAndText("a", "Работа в РЖД")),
            contacts = $("$(#logo-menu_wrap").$(byTagAndText("a", "контакты")),
            visuallyImpaired = $(".blind__text"),
            pressEntry = $(".j-auth-open.username"),
            languageSwitch = $(".j-locale-select-open"),
            engLanguage = $(".locale-switch-wrap.locate-switch"),
            search = $(".icon-search"),

            // Второй хедер
            buyTicket = $("[data-test-id=block_4]").$(byTagAndText("a", "Купить билет")),
            trainsAndRoutes = $("[data-test-id=block_4]").$(byTagAndText("a", "Поезда и маршруты")),
            TrainsAndRoutesDropList = $("[data-test-id=block_4]").$(byTagAndText("a", "Поезда и маршруты"))
                    .sibling(0).$(".j-menu-open"),
            trainStations = $("[data-test-id=block_4]").$(byTagAndText("a", "Вокзалы")),
            tariffsAndAction = $("[data-test-id=block_4]").$(byTagAndText("a", "Тарифы и акции")),
            tariffsAndActionDropList = $("[data-test-id=block_4]").$(byTagAndText("a", "Тарифы и акции"))
                    .sibling(0).$(".j-menu-open"),
            uslugsAndServices = $("[data-test-id=block_4]").$(byTagAndText("a", "Услуги и сервисы")),
            uslugsAndServicesDropList = $("[data-test-id=block_4]").$(byTagAndText("a", "Услуги и сервисы"))
                    .sibling(0).$(".j-menu-open"),
            rzdBonus = $("[data-test-id=block_4]").$(byTagAndText("a", "РЖД Бонус")),
            rzdBonusDropList = $("[data-test-id=block_4]").$(byTagAndText("a", "РЖД Бонус"))
                    .sibling(0).$(".j-menu-open"),
            rules = $("[data-test-id=block_4]").$(byTagAndText("a", "Правила")),
            rulesDroplist = $("[data-test-id=block_4]").$(byTagAndText("a", "Правила"))
                    .sibling(0).$(".j-menu-open"),
            info = $("[data-test-id=block_4]").$(byTagAndText("a", "Информация")),
            infoDropList = $("[data-test-id=block_4]").$(byTagAndText("a", "Информация"))
                    .sibling(0).$(".j-menu-open"),
            siteMap = $("[data-test-id=block_4]").$(byTagAndText("a", "Карта сайта")),

            // Форма поиска маршрутов
            cityFrom = $("[aria-label=Изменить станцию отправления.]"),
            swapCityButton = $(".route-search__swapper"),
            cityWhere = $("[aria-label=Изменить станцию назначения.]"),
            departureDate = $("[aria-label=Изменить дату отправления.]"),
            returnDate = $("[aria-label=Изменить дату обратного отправления.]"),
            numberOfPassengers = $(".search-panel-options __dropdown-opened"),
            findRoute = $(byTagAndText("div", " Найти ")),

            // Поиск отеля на Travel.RZD
            findHotel = $(byTagAndText("div", " Найти отель на ")),

            // Хедеры и блоки которые охватывают большое количество элементов
            logoHeader = $("#logo-menu_wrap"),
            actionsHeader = $("[data-test-id=block_4]"),
            topBlock = $(".header.header_index."),
            mainBlock = $(".block-page__container"),
            contactsBlock = $(".contacts.section_item"),
            mobileBlock = $(".ekmp.section_item.text-white"),
            lowerBlock = $(".site-map.section_item"),
    
            onlineChat = $("#online_chat"), // Онлайн чат с виртуальным помощником
            mainChat = $(".main_chat"),
            InputMessage = $("[placeholder=Введите сообщение]"),
            SendMessageButton = $("[title=Отправить]");


    public PageWithHome openPage() {
        open("");
        return this;
    }

    public PageWithHome closeCookie() {
        if (CookieButton.isDisplayed())
        {
            CookieButton.click();
        }
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

    public PageWithHome checkActionsHeader(String value) {
        actionsHeader.shouldHave(text(value));
        return this;
    }

    public PageWithHome checkLogoHeader(String value) {
        logoHeader.shouldHave(text(value));
        return this;
    }

    public PageWithHome checkOnlineChat(String preparedText, String message) {
        onlineChat.click();
        mainChat.shouldHave(text(preparedText));
        InputMessage.setValue(message);
        SendMessageButton.click();
        mainChat.shouldHave(text(message));
        return this;
    }

    public PageWithHome checkPassengers() {
        passengers.shouldBe(visible);
        return this;
    }

    public PageWithHome checkFreightTransportation() {
        freightTransportation.shouldBe(visible);
        return this;
    }

    public PageWithHome checkCompany() {
        company.shouldBe(visible);
        return this;
    }

    public PageWithHome checkWorkInRZD() {
        workInRZD.shouldBe(visible);
        return this;
    }

    public PageWithHome checkContacts() {
        contacts.shouldBe(visible);
        return this;
    }

    public PageWithHome checkVisuallyImpaired() {
        visuallyImpaired.shouldBe(visible);
        return this;
    }

    public PageWithHome checkEntry() {
        pressEntry.shouldBe(visible);
        return this;
    }

    public PageWithHome checkSearch() {
        search.shouldBe(visible);
        return this;
    }



    public PageWithHome SwitchLanguageToEng() {
        languageSwitch.click();
        engLanguage.click();
        return this;
    }
}
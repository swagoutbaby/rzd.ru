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
            switchLanguageButton = $(".j-locale-select-open"),
            switchLanguage = $(".locale-switch-wrap.locate-switch"),
            search = $(".icon-search"),

            // Второй хедер
            buyTicket = $("[data-test-id=block_4]").$(byTagAndText("a", "Купить билет")),
            trainsAndRoutes = $("[data-test-id=block_4]").$(byTagAndText("a", "Поезда и маршруты")),
            trainsAndRoutesDropListButton = $("[data-test-id=block_4]").$(byTagAndText("a", "Поезда и маршруты"))
                    .sibling(0).$(".j-menu-open"),
            trainsAndRoutesDropList = $("[data-test-id=block_4]").$(byTagAndText("a", "Поезда и маршруты"))
                    .sibling(0).$(".menu-list.j-menu"),
            trainStations = $("[data-test-id=block_4]").$(byTagAndText("a", "Вокзалы")),
            tariffsAndAction = $("[data-test-id=block_4]").$(byTagAndText("a", "Тарифы и акции")),
            tariffsAndActionDropListButton = $("[data-test-id=block_4]").$(byTagAndText("a", "Тарифы и акции"))
                    .sibling(0).$(".j-menu-open"),
            tariffsAndActionDropList = $("[data-test-id=block_4]").$(byTagAndText("a", "Тарифы и акции"))
                    .sibling(0).$(".menu-list.j-menu"),
            uslugsAndServices = $("[data-test-id=block_4]").$(byTagAndText("a", "Услуги и сервисы")),
            uslugsAndServicesDropListButton = $("[data-test-id=block_4]").$(byTagAndText("a", "Услуги и сервисы"))
                    .sibling(0).$(".j-menu-open"),
            uslugsAndServicesDropList = $("[data-test-id=block_4]").$(byTagAndText("a", "Услуги и сервисы"))
                    .sibling(0).$(".menu-list.j-menu"),
            rzdBonus = $("[data-test-id=block_4]").$(byTagAndText("a", "РЖД Бонус")),
            rzdBonusDropListButton = $("[data-test-id=block_4]").$(byTagAndText("a", "РЖД Бонус"))
                    .sibling(0).$(".j-menu-open"),
            rzdBonusDropList = $("[data-test-id=block_4]").$(byTagAndText("a", "РЖД Бонус"))
                    .sibling(0).$(".menu-list.j-menu"),
            rules = $("[data-test-id=block_4]").$(byTagAndText("a", "Правила")),
            rulesDroplistButton = $("[data-test-id=block_4]").$(byTagAndText("a", "Правила"))
                    .sibling(0).$(".j-menu-open"),
            rulesDropList = $("[data-test-id=block_4]").$(byTagAndText("a", "Правила"))
                    .sibling(0).$(".menu-list.j-menu"),
            info = $("[data-test-id=block_4]").$(byTagAndText("a", "Информация")),
            infoDropListButton = $("[data-test-id=block_4]").$(byTagAndText("a", "Информация"))
                    .sibling(0).$(".j-menu-open"),
            infoDropList = $("[data-test-id=block_4]").$(byTagAndText("a", "Информация"))
                    .sibling(0).$(".menu-list.j-menu"),
            siteMap = $("[data-test-id=block_4]").$(byTagAndText("a", "Карта сайта")),

            // Форма поиска маршрутов
            cityFrom = $("[aria-label=Изменить станцию отправления.]"),
            swapCityButton = $(".route-search__swapper"),
            cityWhere = $("[aria-label=Изменить станцию назначения.]"),
            departureDate = $("[aria-label=Изменить дату отправления.]"),
            returnDate = $("[aria-label=Изменить дату обратного отправления.]"),
            numberOfPassengers = $(".search-panel-options__dropdown-opened"),
            dropdownPassengersList = $(".search-panel-options__dropdown"),
            minusAdultPassenger = $("[formcontrolname=adult]").$(".counter__button"),
            plusAdultPassenger = $("[formcontrolname=adult]").$(".counter__button").sibling(1),
            minusBabyWithPlace = $("[formcontrolname=babyWithPlace]").$(".counter__button"),
            plusBabyWithPlace = $("[formcontrolname=babyWithPlace]").$(".counter__button").sibling(1),
            minusBabyWithoutPlace = $("[formcontrolname=babyWithoutPlace]").$(".counter__button"),
            plusBabyWithoutPlace = $("[formcontrolname=babyWithoutPlace]").$(".counter__button").sibling(1),
            forInvalid = $("[formcontrolname=disabledPerson]"),
            findRoute = $(byTagAndText("div", " Найти ")),


            // Поиск отеля на Travel.RZD
            findHotel = $(byTagAndText("div", " Найти отель на ")),
            findHotelCheckbox = $(".rzd-search-widget__hotels.checkbox__box-container"),
            findHotelCheckboxChecked = $(".rzd-search-widget__hotels.checkbox__box--checked"),

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

    public PageWithHome siteMapClick(String value) {
        siteMap.click();
        return this;
    }

    public PageWithHome cityFromInput(String value) {
        cityFrom.setValue(value);
        return this;
    }

    public PageWithHome swapCityClick() {
        swapCityButton.click();
        return this;
    }

    public PageWithHome cityWhereInput(String value) {
        cityWhere.setValue(value);
        return this;
    }

    public PageWithHome chooseDepartureDate(String value) {
        departureDate.click();
        $("[aria-label=" + value + "]").click();
        return this;
    }

    public PageWithHome chooseReturnDate(String value) {
        returnDate.click();
        $("[aria-label=" + value + "]").click();
        return this;
    }

    public PageWithHome checkNumberOfPassengers() {
        numberOfPassengers.click();
        return this;
    }

    public PageWithHome clickFindRoute() {
        findRoute.click();
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

    public PageWithHome plusCountBabyWithPlace(Integer value) {
        for (int i = 0; i < value; i++) {
            plusBabyWithPlace.click();
        }
        return this;
    }

    public PageWithHome minusCountBabyWithPlace(Integer value) {
        for (int i = 0; i < value; i++) {
            minusBabyWithPlace.click();
        }
        return this;
    }

    public PageWithHome plusCountBabyWithoutPlace(Integer value) {
        for (int i = 0; i < value; i++) {
            plusBabyWithoutPlace.click();
        }
        return this;
    }

    public PageWithHome minusCountBabyWithoutPlace(Integer value) {
        for (int i = 0; i < value; i++) {
            minusBabyWithoutPlace.click();
        }
        return this;
    }

    public PageWithHome chooseInvalid() {
        forInvalid.click();
        return this;
    }

    public PageWithHome checkFindHotel() {
        findHotel.shouldHave(visible);
        findHotelCheckbox.click();
        findHotelCheckboxChecked.shouldBe(visible);
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
}
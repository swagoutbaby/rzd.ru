package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.shadowDeepCss;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;



public class PageWithHome {

    private final SelenideElement
            CookieButton = $(".cookie-alert__btn"),

            // Первый хедер
            passengers = $(".header_site").$(byText("Пассажирам")),
            freightTransportation = $(".header_site").$(byText("Грузовые перевозки")),
            company = $(".header_site").$(byText("Компания")),
            workInRZD = $(".header_site").$(byText("Работа в РЖД")),
            contacts = $(".header_site").$(byText("Контакты")),
            visuallyImpaired = $(".blind__text"), // Версия для слабовидящих
            regularSite = $(".settings-wrap").$(byText("Обычная версия сайта")),
            entry = $(".j-auth-open.username"),
            login = $("[placeholder=Логин]"),
            password = $("[placeholder=Пароль]"),
            entryButton = $(byTagAndText("button", "Войти")),
            cancelEntry = $(".j-auth-close"),
            languageButton = $(".j-locale-select-open"),
            switchLanguage = $(".locale-switch__li"),
            search = $(".icon-search"),
            searchInput = $("[name=search_pattern]"),
            searchButton = $(".menu-search-btn"),
            closeSearch = $(".menu-search-close"),
            keywords = $("[data-test-id=keywords]"),
            searchResults = $(".j-search_container"),

            // Локаторы открываемых страниц для их проверки
            freightTransportationPage = $(".body-page-92162"),
            companyPage = $(".body-page-31560"),
            workInRZDPage = $(".bg-white"),
            contactsPage = $(".body-page-100162"),
            visuallyImpairedPage = $(byText("Обычная версия сайта")),
            headerEntryForm = $(".j-tab.form-tab_link.active"),


            // Второй хедер
            buyTicket = $("[data-test-id=block_4]").$(byText("Купить билет")),

            trainsAndRoutes = $("[data-test-id=block_4]").$(byText("Поезда и маршруты")),
            trainsAndRoutesDropListButton = $("[data-test-id=block_4]").$(byText("Поезда и маршруты"))
                    .sibling(0).$(".j-menu-open"),
            trainsAndRoutesDropList = $("[data-test-id=block_4]").$(byText("Поезда и маршруты"))
                    .sibling(0).$(".menu-list.j-menu"),
            trainsAndRoutesPage = $(".nav-header__title"),

            trainStations = $("[data-test-id=block_4]").$(byText("Вокзалы")),
            trainStationsPage = $(".highlight"),

            tariffsAndAction = $("[data-test-id=block_4]").$(byText("Тарифы и акции")),
            tariffsAndActionDropListButton = $("[data-test-id=block_4]").$(byText("Тарифы и акции"))
                    .sibling(0).$(".j-menu-open"),
            tariffsAndActionDropList = $("[data-test-id=block_4]").$(byText("Тарифы и акции"))
                    .sibling(0).$(".menu-list.j-menu"),
            tariffsAndActionPage = $(".nav-header__title"),

            uslugsAndServices = $("[data-test-id=block_4]").$(byText("Услуги и сервисы")),
            uslugsAndServicesDropListButton = $("[data-test-id=block_4]").$(byText("Услуги и сервисы"))
                    .sibling(0).$(".j-menu-open"),
            uslugsAndServicesDropList = $("[data-test-id=block_4]").$(byText("Услуги и сервисы"))
                    .sibling(0).$(".menu-list.j-menu"),
            uslugsAndServicesPage = $(".nav-header__title"),

            rzdBonus = $("[data-test-id=block_4]").$(byText("РЖД Бонус")),
            rzdBonusDropListButton = $("[data-test-id=block_4]").$(byText("РЖД Бонус"))
                    .sibling(0).$(".j-menu-open"),
            rzdBonusDropList = $("[data-test-id=block_4]").$(byText("РЖД Бонус"))
                    .sibling(0).$(".menu-list.j-menu"),
            rzdBonusPage = $(".fp-viewing-main"),

            rules = $("[data-test-id=block_4]").$(byText("Правила")),
            rulesDroplistButton = $("[data-test-id=block_4]").$(byText("Правила"))
                    .sibling(0).$(".j-menu-open"),
            rulesDropList = $("[data-test-id=block_4]").$(byText("Правила"))
                    .sibling(0).$(".menu-list.j-menu"),
            rulesPage = $(".nav-header__title"),

            info = $("[data-test-id=block_4]").$(byText("Информация")),
            infoDropListButton = $("[data-test-id=block_4]").$(byText("Информация"))
                    .sibling(0).$(".j-menu-open"),
            infoDropList = $("[data-test-id=block_4]").$(byText("Информация"))
                    .sibling(0).$(".menu-list.j-menu"),
            infoPage = $(".nav-header__title"),

            siteMap = $("[data-test-id=block_4]").$(byText( "Карта сайта")),
            siteMapPage = $(".nav-header__title"),

            // Форма поиска маршрутов
            cityFrom = $(shadowDeepCss("[formcontrolname=fromNode]")).$(byTagName("input")),
            swapCityButton = $(shadowDeepCss("[icon=change-2]")),
            cityTo = $(shadowDeepCss("[formcontrolname=toNode]")).$(byTagName("input")),
            departureDate = $(shadowDeepCss("[controlname=fromDate]")).$(byTagName("input")),
            returnDate = $(shadowDeepCss("[controlname=backDate]")).$(byTagName("input")),
            notNeedReturnTicket = $(shadowDeepCss("[data-testid=route-search-without-back-date-button]")),

            countOfPassengers = $(shadowDeepCss(".route-search__options")),

            minusAdult = $(shadowDeepCss("[formcontrolname='adult']")).$(".counter__button"),
            plusAdult = $(shadowDeepCss("[formcontrolname='adult']")).$(".counter__button").sibling(1),

            minusBabyWithPlace = $(shadowDeepCss("[formcontrolname='babyWithPlace']")).$(".counter__button"),
            plusBabyWithPlace = $(shadowDeepCss("[formcontrolname='babyWithPlace']")).$(".counter__button").sibling(1),

            minusBabyWithoutPlace = $(shadowDeepCss("[formcontrolname='babyWithoutPlace']")).$(".counter__button"),
            plusBabyWithoutPlace = $(shadowDeepCss("[formcontrolname='babyWithoutPlace']")).$(".counter__button").sibling(1),

            forDisabledPersonCheckbox = $(shadowDeepCss("[formcontrolname='disabledPerson']")),
            forLargeFamiliesCheckbox = $(shadowDeepCss("[formcontrolname='largeFamily']")),
            animalCheckbox = $(shadowDeepCss("[formcontrolname='animal']")),
            carCheckbox = $(shadowDeepCss("[formcontrolname='carTransportation']")),
            motorcycleCheckbox = $(shadowDeepCss("[formcontrolname='motorcycleTransportation']")),
            errorNotice = $(shadowDeepCss(".search-panel-container__section-notice")),
            iconDisabledPerson = $(shadowDeepCss(".route-search__options")).$("[icon=disabled-person]"),
            iconLargeFamilies = $(shadowDeepCss(".route-search__options")).$("[icon=large-family]"),
            iconAnimals = $(shadowDeepCss(".route-search__options")).$("[icon=animals-icon]"),
            iconCar = $(shadowDeepCss(".route-search__options")).$("[icon=car]"),
            iconMotorcycle = $(shadowDeepCss(".route-search__options")).$("[icon=motorcycle-transportation]"),

            findRoute = $(shadowDeepCss(".route-search__submit-button")),
            routePage = $(".searchresults__list"),
            routePageCityFrom = $(".card-route__station--from"),
            routePageCityTo = $(".card-route__station--to"),
            invalidRoutePage = $(".searchresults__cards-wrapper"),
            carTransportationPage = $(".step-info-title"),
            animalsTransportationPage = $(".step-info-title"),
            availableSeat = $(".seat--available"),
            continueButton = $(".seats-summary__terminal_btn"),
            entryTicketPage = $(".header__login-button"),
            loginInputTicketPage = $("[aria-label=Логин]"),
            passwordInputTicketPage = $("[aria-label=Пароль]"),
            entryButtonTicketPage = $(".login-form__button").$("[type=submit]"),
            logoutTicketPage = $("[data-testid=side-menu-logout]"),
            closeSideMenuButton = $(".side-menu-wrapper__close-btn"),
            choosePassengerButton = $(".select-cnt"),
            snils = $(".ui-kit-input-placeholder"),
            snilsInput = $(".ui-kit-input-text"),
            makeOrderButton = $("[data-testid=boarding-book-order-button]"),
            payButton = $("[data-testid=order-payment-button]"),


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

            // Онлайн чат с виртуальным помощником
            onlineChat = $(".chat__icon"),
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
            Selenide.sleep(1000);
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
        entry.click();
        return this;
    }

    public PageWithHome loginInput (String Login) {
        login.setValue(Login);
        return this;
    }

    public PageWithHome passwordInput (String Password) {
        password.setValue(Password);
        return this;
    }

    public PageWithHome clickEntryButton () {
        entryButton.click();
        Selenide.sleep(3000);
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

    public PageWithHome searchInput(String words) {
        searchInput.setValue(words);
        return this;
    }

    public PageWithHome clickSearchButton() {
        searchButton.click();
        return this;
    }

    public PageWithHome checkKeywords(String words) {
        keywords.getAttribute("value").equals(words);
        return this;
    }

    public PageWithHome checkSearchResults(String words) {
        searchResults.shouldHave(text(words));
        return this;
    }

    public PageWithHome switchLanguage() {
        languageButton.click();
        switchLanguage.click();
        return this;
    }

    public PageWithHome clickBuyTicket() {
        buyTicket.click();
        return this;
    }

    public PageWithHome clickTrainsAndRoutes() {
        trainsAndRoutes.click();
        return this;
    }

    public PageWithHome checkTrainsAndRoutes() {
        trainsAndRoutesPage.shouldHave(text("Поезда и маршруты"));
        return this;
    }

    public PageWithHome clickTrainAndRoutesDropList() {
        trainsAndRoutesDropListButton.click();
        return this;
    }

    public PageWithHome checkTrainAndRoutesDropList(String listItem) {
        trainsAndRoutesDropList.shouldHave(text(listItem));
        return this;
    }

    public PageWithHome clickTrainStations() {
        trainStations.click();
        return this;
    }

    public PageWithHome checkTrainStations() {
        trainStationsPage.shouldHave(text("Вокзалы"));
        return this;
    }

    public PageWithHome clickTariffsAndAction() {
        tariffsAndAction.click();
        return this;
    }

    public PageWithHome clickTariffsAndActionDropList() {
        tariffsAndActionDropListButton.click();
        return this;
    }

    public PageWithHome checkTariffsAndActionDropList(String listItem) {
        tariffsAndActionDropList.shouldHave(text(listItem));
        return this;
    }

    public PageWithHome checkTariffsAndActionPage() {
        tariffsAndActionPage.shouldHave(text("Тарифы и акции"));
        return this;
    }


    public PageWithHome clickUslugsAndServices() {
        uslugsAndServices.click();
        return this;
    }

    public PageWithHome clickUslugsAndServicesDropList() {
        uslugsAndServicesDropListButton.click();
        return this;
    }

    public PageWithHome checkUslugsAndServicesDropList(String listItem) {
        uslugsAndServicesDropList.shouldHave(text(listItem));
        return this;
    }

    public PageWithHome checkUslugsAndServicesPage() {
        uslugsAndServicesPage.shouldHave(text("Услуги и сервисы"));
        return this;
    }

    public PageWithHome clickRzdBonus() {
        rzdBonus.click();
        return this;
    }

    public PageWithHome clickRzdBonusDropList() {
        rzdBonusDropListButton.click();
        return this;
    }

    public PageWithHome checkRzdBonusDropList(String listItem) {
        rzdBonusDropList.shouldHave(text(listItem));
        return this;
    }

    public PageWithHome checkRzdBonusPage() {
        rzdBonusPage.shouldHave(text("РЖД Бонус"));
        return this;
    }

    public PageWithHome clickRules() {
        rules.click();
        return this;
    }

    public PageWithHome clickRulesDropList() {
        rulesDroplistButton.click();
        return this;
    }

    public PageWithHome checkRulesDropList(String listItem) {
        rulesDropList.shouldHave(text(listItem));
        return this;
    }

    public PageWithHome checkRulesPage() {
        rulesPage.shouldHave(text("Правила"));
        return this;
    }

    public PageWithHome clickInfo() {
        info.click();
        return this;
    }

    public PageWithHome clickInfoDropList() {
        infoDropListButton.click();
        return this;
    }

    public PageWithHome checkInfoDropList(String listItem) {
        infoDropList.shouldHave(text(listItem));
        return this;
    }

    public PageWithHome checkInfoPage() {
        infoPage.shouldHave(text("Информация"));
        return this;
    }

    public PageWithHome clickSiteMap() {
        siteMap.click();
        return this;
    }

    public PageWithHome checkSiteMap() {
        siteMapPage.shouldHave(text("Карта сайта"));
        return this;
    }

    public PageWithHome cityFromInput(String CityFrom) {
        cityFrom.setValue(CityFrom);
        Selenide.sleep(500);
        return this;
    }

    public PageWithHome clickSwapCity() {
        swapCityButton.click();
        Selenide.sleep(1000);
        return this;
    }

    public PageWithHome cityToInput(String CityTo) {
        cityTo.setValue(CityTo);
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
        Selenide.sleep(1000);
        return this;
    }

    public PageWithHome clickNotNeedReturnTicket() {
        notNeedReturnTicket.click();
        return this;
    }

    public PageWithHome clickCountOfPassengers() {
        countOfPassengers.click();
        return this;
    }

    public PageWithHome minusCountAdult(int value) {
        for (int i = 0; i < value; i++) {
            minusAdult.click();
        }
        Selenide.sleep(300);
        return this;
    }

    public PageWithHome plusCountAdult(int value) {
        for (int i = 0; i < value; i++) {
            plusAdult.click();
        }
        Selenide.sleep(300);
        return this;
    }

    public PageWithHome minusCountBabyWithPlace(int value) {
        for (int i = 0; i < value; i++) {
            minusBabyWithPlace.click();
        }
        Selenide.sleep(300);
        return this;
    }

    public PageWithHome plusCountBabyWithPlace(int value) {
        for (int i = 0; i < value; i++) {
            plusBabyWithPlace.click();
        }
        Selenide.sleep(300);
        return this;
    }

    public PageWithHome minusCountBabyWithoutPlace(int value) {
        for (int i = 0; i < value; i++) {
            minusBabyWithoutPlace.click();
        }
        Selenide.sleep(300);
        return this;
    }

    public PageWithHome plusCountBabyWithoutPlace(int value) {
        for (int i = 0; i < value; i++) {
            plusBabyWithoutPlace.click();
        }
        Selenide.sleep(300);
        return this;
    }

    public PageWithHome clickForDisabledPersonCheckbox() {
        forDisabledPersonCheckbox.click();
        return this;
    }

    public PageWithHome checkIconForDisabledPerson() {
        iconDisabledPerson.shouldBe(visible);
        return this;
    }

    public PageWithHome clickForLargeFamiliesCheckbox() {
        forLargeFamiliesCheckbox.click();
        return this;
    }

    public PageWithHome checkIconForLargeFamilies() {
        iconLargeFamilies.shouldBe(visible);
        return this;
    }

    public PageWithHome clickAnimalCheckbox() {
        animalCheckbox.click();
        return this;
    }

    public PageWithHome checkIconAnimals() {
        iconAnimals.shouldBe(visible);
        return this;
    }

    public PageWithHome clickCarCheckbox() {
        carCheckbox.click();
        return this;
    }

    public PageWithHome checkIconCar() {
        iconCar.shouldBe(visible);
        return this;
    }

    public PageWithHome clickMotorcycleCheckbox() {
        motorcycleCheckbox.click();
        return this;
    }

    public PageWithHome checkIconMotorcycle() {
        iconMotorcycle.shouldBe(visible);
        return this;
    }

    public PageWithHome checkErrorNotice(String error) {
        errorNotice.shouldHave(text(error));
        return this;
    }

    public PageWithHome clickFindRoute() {
        findRoute.click();
        Selenide.sleep(6000);
        return this;
    }

    public PageWithHome checkRoutePage(String from, String to) {
        routePage.shouldHave(text(from));
        routePage.shouldHave(text(to));
        return this;
    }

    public PageWithHome checkRoutePageCityFrom(String from) {
        routePageCityFrom.shouldHave(text(from));
        return this;
    }

    public PageWithHome checkRoutePageCityTo(String to) {
        routePageCityTo.shouldHave(text(to));
        return this;
    }

    public PageWithHome checkInvalidRoutePage(String from, String to, String date) {
        invalidRoutePage.shouldHave(text(from));
        invalidRoutePage.shouldHave(text(to));
        invalidRoutePage.shouldHave(text(date));
        return this;
    }

    public PageWithHome checkCarTransportationPage() {
        carTransportationPage.shouldHave(text("Укажите данные о транспортном средстве, об отправителе и получателе"));
        return this;
    }

    public PageWithHome checkAnimalsTransportationPage() {
        animalsTransportationPage.shouldHave(text("Заявление об оказании услуги перевозки животных"));
        return this;
    }

    public PageWithHome chooseTrainAndTypeSeat(String train, String typeSeat) {
        $("[aria-label=" + train + "]").$(byText(typeSeat)).click(); // train должен быть такого типа: "Поезд 111А"
        return this;
    }

    public PageWithHome chooseTypeSeat(String typeSeat) {
        $("[data-testid=search-result-railway-card]").$(byText(typeSeat)).click();
        Selenide.sleep(500);
        return this;
    }

    public PageWithHome chooseAvailableSeat() {
        availableSeat.click();
        return this;
    }

    public PageWithHome chooseSpecificSeat(String numberSeat) {
        $("#Seat" + numberSeat).click();
        return this;
    }

    public PageWithHome clickContinue() {
        Selenide.executeJavaScript("window.scrollBy(0,500);");
        Selenide.sleep(500);
        continueButton.click();
        return this;
    }

    public PageWithHome clickEntryTicketPage() {
        entryTicketPage.click();
        return this;
    }

    public PageWithHome loginInputTicketPage(String login) {
        loginInputTicketPage.setValue(login);
        return this;
    }

    public PageWithHome passwordInputTicketPage(String password) {
        passwordInputTicketPage.setValue(password);
        return this;
    }

    public PageWithHome clickEntryButtonTicketPage() {
        entryButtonTicketPage.click();
        Selenide.sleep(3000);
        return this;
    }

    public PageWithHome checkAutorisationTicketPage() {
        logoutTicketPage.shouldBe(visible);
        return this;
    }

    public PageWithHome clickLogoutTicketPage() {
        logoutTicketPage.click();
        return this;
    }

    public PageWithHome clickCloseSideMenuButton() {
        closeSideMenuButton.click();
        return this;
    }

    public PageWithHome clickChoosePassengerButton() {
        choosePassengerButton.click();
        return this;
    }

    public PageWithHome checkSnils() {
        snils.shouldHave(text("Введите СНИЛС *"));
        return this;
    }

    public PageWithHome inputSnils(String snilsNumbers) {
        snilsInput.setValue(snilsNumbers);
        return this;
    }

    public PageWithHome choosePassenger(String passenger) {
        $(".ui-kit-options").$(byText(passenger)).click();
        return this;
    }

    public PageWithHome clickMakeOrderButton() {
        makeOrderButton.click();
        return this;
    }

    public PageWithHome checkOrderPage() {
        payButton.shouldBe(visible);
        return this;
    }

    public PageWithHome clickFindHotel() {
        findHotelClick.click();
        return this;
    }

    public PageWithHome checkCheckboxFindHotel() {
        findHotelCheckedCheckbox.shouldBe(visible);;
        return this;
    }

    public PageWithHome clickTravelRZD() {
        clickTravelRZD.click();
        return this;
    }

    public PageWithHome checkTravelRZDPage(String url) {
        switchTo().window(1);
        webdriver().shouldHave(url(url));
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

    public PageWithHome clickOnlineChat() {
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

    public PageWithHome checkPageFreightTransportation(String words) {
        freightTransportationPage.shouldHave(text(words));
        return this;
    }

    public PageWithHome checkPageCompany(String words) {
        companyPage.shouldHave(text(words));
        return this;
    }

    public PageWithHome checkPageWorkInRZD(String words) {
        workInRZDPage.shouldHave(text(words));
        return this;
    }

    public PageWithHome checkPageContacts(String words) {
        contactsPage.shouldHave(text(words));
        return this;
    }

    public PageWithHome checkVisuallyImpaired() {
        visuallyImpairedPage.shouldHave(text("Обычная версия сайта"));
        return this;
    }

    public PageWithHome checkEntryHeader() {
        headerEntryForm.shouldHave(text("Вход"));
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
        searchButton.shouldHave(text("Найти"));
        return this;
    }

    public PageWithHome closeSearch() {
        closeSearch.click();
        return this;
    }
}
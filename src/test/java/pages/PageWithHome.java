package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

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
            countAdult = $(shadowDeepCss("[formcontrolname='adult']")).$(".counter__button").sibling(0),

            minusBabyWithPlace = $(shadowDeepCss("[formcontrolname='babyWithPlace']")).$(".counter__button"),
            plusBabyWithPlace = $(shadowDeepCss("[formcontrolname='babyWithPlace']")).$(".counter__button").sibling(1),
            countBabyWithPlace = $(shadowDeepCss("[formcontrolname='babyWithPlace']")).$(".counter__button").sibling(0),

            minusBabyWithoutPlace = $(shadowDeepCss("[formcontrolname='babyWithoutPlace']")).$(".counter__button"),
            plusBabyWithoutPlace = $(shadowDeepCss("[formcontrolname='babyWithoutPlace']")).$(".counter__button").sibling(1),
            countBabyWithoutPlace = $(shadowDeepCss("[formcontrolname='babyWithoutPlace']")).$(".counter__button").sibling(0),

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



    @Step("Открыть главную страницу")
    public PageWithHome openPage() {
        open("");
        return this;
    }

    @Step("Закрыть уведомление о Cookie")
    public PageWithHome closeCookie() {
        if (CookieButton.isDisplayed())
        {
            CookieButton.click();
            Selenide.sleep(1000);
        }
        return this;
    }

    @Step("Открыть страницу 'Пассажирам'")
    public PageWithHome clickPassengers() {
        passengers.click();
        return this;
    }

    @Step("Открыть страницу 'Грузовые перевозки'")
    public PageWithHome clickFreightTransportation() {
        freightTransportation.click();
        Selenide.sleep(3000);
        return this;
    }

    @Step("Открыть страницу 'Компания'")
    public PageWithHome clickCompany() {
        company.click();
        Selenide.sleep(3000);
        return this;
    }

    @Step("Открыть страницу 'Работа в РЖД'")
    public PageWithHome clickWorkInRZD() {
        workInRZD.click();
        Selenide.sleep(3000);
        return this;
    }

    @Step("Открыть страницу 'Контакты'")
    public PageWithHome clickContacts() {
        contacts.click();
        Selenide.sleep(3000);
        return this;
    }

    @Step("Открыть версию для слабовидящих")
    public PageWithHome clickVisuallyImpaired() {
        visuallyImpaired.click();
        Selenide.sleep(3000);
        return this;
    }

    @Step("Открыть обычную версию")
    public PageWithHome clickRegularSite() {
        regularSite.click();
        Selenide.sleep(3000);
        return this;
    }

    @Step("Открыть окно входа в аккаунт")
    public PageWithHome clickEntry() {
        entry.click();
        return this;
    }

    @Step("Закрыть окно входа в аккаунт")
    public PageWithHome clickCancelEntry() {
        cancelEntry.click();
        return this;
    }

    @Step("Открыть поиск")
    public PageWithHome clickSearch() {
        search.click();
        return this;
    }

    @Step("Ввести запрос в поиск")
    public PageWithHome searchInput(String words) {
        searchInput.setValue(words);
        return this;
    }

    @Step("Нажать кнопку поиска")
    public PageWithHome clickSearchButton() {
        searchButton.click();
        return this;
    }

    @Step("Проверить, что запрос передался в ключевые слова")
    public PageWithHome checkKeywords(String words) {
        keywords.shouldHave(value(words));
        return this;
    }

    @Step("Проверить результаты поиска")
    public PageWithHome checkSearchResults(String words) {
        searchResults.shouldHave(text(words));
        return this;
    }

    @Step("Поменять язык")
    public PageWithHome switchLanguage() {
        languageButton.click();
        switchLanguage.click();
        return this;
    }

    @Step("Открыть страницу покупки билета")
    public PageWithHome clickBuyTicket() {
        buyTicket.click();
        return this;
    }

    @Step("Открыть страницу 'Поезда и маршруты'")
    public PageWithHome clickTrainsAndRoutes() {
        trainsAndRoutes.click();
        return this;
    }

    @Step("Проверить страницу 'Поезда и маршруты'")
    public PageWithHome checkTrainsAndRoutes() {
        trainsAndRoutesPage.shouldHave(text("Поезда и маршруты"));
        return this;
    }

    @Step("Открыть выпадающий список 'Поезда и маршруты'")
    public PageWithHome clickTrainAndRoutesDropList() {
        trainsAndRoutesDropListButton.click();
        return this;
    }

    @Step("Проверить выпадающий список 'Поезда и маршруты'")
    public PageWithHome checkTrainAndRoutesDropList(String listItem) {
        trainsAndRoutesDropList.shouldHave(text(listItem));
        return this;
    }

    @Step("Открыть страницу 'Вокзалы'")
    public PageWithHome clickTrainStations() {
        trainStations.click();
        return this;
    }

    @Step("Проверить страницу 'Вокзалы'")
    public PageWithHome checkTrainStations() {
        trainStationsPage.shouldHave(text("Вокзалы"));
        return this;
    }

    @Step("Открыть страницу 'Тарифы и акции'")
    public PageWithHome clickTariffsAndAction() {
        tariffsAndAction.click();
        return this;
    }

    @Step("Проверить страницу 'Вокзалы'")
    public PageWithHome checkTariffsAndActionPage() {
        tariffsAndActionPage.shouldHave(text("Тарифы и акции"));
        return this;
    }

    @Step("Открыть выпадающий список 'Поезда и маршруты'")
    public PageWithHome clickTariffsAndActionDropList() {
        tariffsAndActionDropListButton.click();
        return this;
    }

    @Step("Проверить выпадающий список 'Поезда и маршруты'")
    public PageWithHome checkTariffsAndActionDropList(String listItem) {
        tariffsAndActionDropList.shouldHave(text(listItem));
        return this;
    }

    @Step("Открыть страницу 'Услуги и сервисы'")
    public PageWithHome clickUslugsAndServices() {
        uslugsAndServices.click();
        return this;
    }

    @Step("Проверить страницу 'Услуги и сервисы'")
    public PageWithHome checkUslugsAndServicesPage() {
        uslugsAndServicesPage.shouldHave(text("Услуги и сервисы"));
        return this;
    }

    @Step("Открыть выпадающий список 'Услуги и сервисы'")
    public PageWithHome clickUslugsAndServicesDropList() {
        uslugsAndServicesDropListButton.click();
        return this;
    }

    @Step("Проверить выпадающий список 'Услуги и сервисы'")
    public PageWithHome checkUslugsAndServicesDropList(String listItem) {
        uslugsAndServicesDropList.shouldHave(text(listItem));
        return this;
    }


    @Step("Открыть страницу 'РЖД Бонус'")
    public PageWithHome clickRzdBonus() {
        rzdBonus.click();
        return this;
    }

    @Step("Открыть выпадающий список 'РЖД Бонус'")
    public PageWithHome clickRzdBonusDropList() {
        rzdBonusDropListButton.click();
        return this;
    }

    @Step("Проверить выпадающий список 'РЖД Бонус'")
    public PageWithHome checkRzdBonusDropList(String listItem) {
        rzdBonusDropList.shouldHave(text(listItem));
        return this;
    }

    @Step("Проверить страницу 'РЖД Бонус'")
    public PageWithHome checkRzdBonusPage() {
        rzdBonusPage.shouldHave(text("РЖД Бонус"));
        return this;
    }

    @Step("Открыть страницу 'Правила'")
    public PageWithHome clickRules() {
        rules.click();
        return this;
    }

    @Step("Открыть выпадающий список 'Правила'")
    public PageWithHome clickRulesDropList() {
        rulesDroplistButton.click();
        return this;
    }

    @Step("Проверить выпадающий список 'Правила'")
    public PageWithHome checkRulesDropList(String listItem) {
        rulesDropList.shouldHave(text(listItem));
        return this;
    }

    @Step("Проверить страницу 'Правила'")
    public PageWithHome checkRulesPage() {
        rulesPage.shouldHave(text("Правила"));
        return this;
    }

    @Step("Открыть страницу 'Информация'")
    public PageWithHome clickInfo() {
        info.click();
        return this;
    }

    @Step("Открыть выпадающий список 'Информация'")
    public PageWithHome clickInfoDropList() {
        infoDropListButton.click();
        return this;
    }

    @Step("Проверить выпадающий список 'Информация'")
    public PageWithHome checkInfoDropList(String listItem) {
        infoDropList.shouldHave(text(listItem));
        return this;
    }

    @Step("Проверить страницу 'Информация'")
    public PageWithHome checkInfoPage() {
        infoPage.shouldHave(text("Информация"));
        return this;
    }

    @Step("Открыть страницу 'Карта сайта'")
    public PageWithHome clickSiteMap() {
        siteMap.click();
        return this;
    }

    @Step("Проверить страницу 'Карта сайта'")
    public PageWithHome checkSiteMap() {
        siteMapPage.shouldHave(text("Карта сайта"));
        return this;
    }

    @Step("Ввести город отправления")
    public PageWithHome cityFromInput(String CityFrom) {
        cityFrom.setValue(CityFrom);
        Selenide.sleep(800);
        return this;
    }

    @Step("Поменять города местами")
    public PageWithHome clickSwapCity() {
        swapCityButton.click();
        Selenide.sleep(1000);
        return this;
    }

    @Step("Ввести город назначения")
    public PageWithHome cityToInput(String CityTo) {
        cityTo.setValue(CityTo);
        Selenide.sleep(800);
        return this;
    }

    @Step("Выбрать дату отправления")
    public PageWithHome chooseDepartureDate(String date) {
        departureDate.click();
        String day = date.substring(0, 1);
        String month = date.substring(2, 4);
        String year = date.substring(5, 9);
        $(shadowDeepCss(".ui-kit-datepicker")).$(shadowDeepCss("[data-testid='ui-kit-day_"
                + day + "\\/" + month + "\\/" + year + "']")).click();
        return this;
    }

    @Step("Выбрать дату возвращения")
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

    @Step("Нажать 'Обратный билет не нужен'")
    public PageWithHome clickNotNeedReturnTicket() {
        notNeedReturnTicket.click();
        return this;
    }

    @Step("Нажать на меню выбора пассажиров")
    public PageWithHome clickCountOfPassengers() {
        countOfPassengers.click();
        return this;
    }

    @Step("Уменьшить количество взрослых пассажиров")
    public PageWithHome minusCountAdult(int value) {
        for (int i = 0; i < value; i++) {
            minusAdult.click();
        }
        Selenide.sleep(300);
        return this;
    }

    @Step("Увеличить количество взрослых пассажиров")
    public PageWithHome plusCountAdult(int value) {
        for (int i = 0; i < value; i++) {
            plusAdult.click();
        }
        Selenide.sleep(300);
        return this;
    }

    @Step("Проверить количество взрослых пассажиров")
    public PageWithHome checkCountAdult(String count) {
        countAdult.shouldHave(text(count));
        return this;
    }

    @Step("Уменьшить количество детей с местом")
    public PageWithHome minusCountBabyWithPlace(int value) {
        for (int i = 0; i < value; i++) {
            minusBabyWithPlace.click();
        }
        Selenide.sleep(300);
        return this;
    }

    @Step("Увеличить количество детей с местом")
    public PageWithHome plusCountBabyWithPlace(int value) {
        for (int i = 0; i < value; i++) {
            plusBabyWithPlace.click();
        }
        Selenide.sleep(300);
        return this;
    }

    @Step("Проверить количество детей с местом")
    public PageWithHome checkCountBabyWithPlace(String count) {
        countBabyWithPlace.shouldHave(text(count));
        return this;
    }

    @Step("Уменьшить количество детей без места")
    public PageWithHome minusCountBabyWithoutPlace(int value) {
        for (int i = 0; i < value; i++) {
            minusBabyWithoutPlace.click();
        }
        Selenide.sleep(300);
        return this;
    }

    @Step("Увеличить количество детей без места")
    public PageWithHome plusCountBabyWithoutPlace(int value) {
        for (int i = 0; i < value; i++) {
            plusBabyWithoutPlace.click();
        }
        Selenide.sleep(300);
        return this;
    }

    @Step("Проверить количество детей без места")
    public PageWithHome checkCountBabyWithoutPlace(String count) {
        countBabyWithoutPlace.shouldHave(text(count));
        return this;
    }

    @Step("Применить фильтр 'Для инвалида'")
    public PageWithHome clickForDisabledPersonCheckbox() {
        forDisabledPersonCheckbox.click();
        return this;
    }

    @Step("Проверить применение фильтра 'Для инвалидов'")
    public PageWithHome checkIconForDisabledPerson() {
        iconDisabledPerson.shouldBe(visible);
        return this;
    }

    @Step("Применить фильтр 'Для многодетных семей'")
    public PageWithHome clickForLargeFamiliesCheckbox() {
        forLargeFamiliesCheckbox.click();
        return this;
    }

    @Step("Проверить применение фильтра 'Для многодетных семей'")
    public PageWithHome checkIconForLargeFamilies() {
        iconLargeFamilies.shouldBe(visible);
        return this;
    }

    @Step("Применить фильтр 'Животное'")
    public PageWithHome clickAnimalCheckbox() {
        animalCheckbox.click();
        return this;
    }

    @Step("Проверить фильтр 'Животное'")
    public PageWithHome checkIconAnimals() {
        iconAnimals.shouldBe(visible);
        return this;
    }

    @Step("Применить фильтр 'Автомобиль'")
    public PageWithHome clickCarCheckbox() {
        carCheckbox.click();
        return this;
    }

    @Step("Проверить фильтр 'Автомобиль'")
    public PageWithHome checkIconCar() {
        iconCar.shouldBe(visible);
        return this;
    }

    @Step("Применить фильтр 'Мотоцикл'")
    public PageWithHome clickMotorcycleCheckbox() {
        motorcycleCheckbox.click();
        return this;
    }

    @Step("Проверить фильтр 'Мотоцикл'")
    public PageWithHome checkIconMotorcycle() {
        iconMotorcycle.shouldBe(visible);
        return this;
    }

    @Step("Проверить отображение ошибки выбора пассажиров")
    public PageWithHome checkErrorNotice(String error) {
        errorNotice.shouldHave(text(error));
        return this;
    }

    @Step("Найти маршрут")
    public PageWithHome clickFindRoute() {
        findRoute.click();
        Selenide.sleep(6000);
        return this;
    }

    @Step("Проверить, что город отправления в результате поиска совпадает с выбранным")
    public PageWithHome checkRoutePageCityFrom(String from) {
        routePageCityFrom.shouldHave(text(from));
        return this;
    }

    @Step("Проверить, что город назначения в результате поиска совпадает с выбранным")
    public PageWithHome checkRoutePageCityTo(String to) {
        routePageCityTo.shouldHave(text(to));
        return this;
    }

    @Step("Проверить корректность поиска неправильного маршрута")
    public PageWithHome checkInvalidRoutePage(String from, String to, String date) {
        invalidRoutePage.shouldHave(text(from));
        invalidRoutePage.shouldHave(text(to));
        invalidRoutePage.shouldHave(text(date));
        return this;
    }

    @Step("Проверка открытия страницы перевозки автомобилей")
    public PageWithHome checkCarTransportationPage() {
        carTransportationPage.shouldHave(text("Укажите данные о транспортном средстве, об отправителе и получателе"));
        return this;
    }

    @Step("Проверка открытия страницы перевозки животных")
    public PageWithHome checkAnimalsTransportationPage() {
        animalsTransportationPage.shouldHave(text("Заявление об оказании услуги перевозки животных"));
        return this;
    }

    @Step("Выбрать поезд и класс обслуживания")
    public PageWithHome chooseTrainAndTypeSeat(String train, String typeSeat) {
        $("[aria-label=" + train + "]").$(byText(typeSeat)).click(); // train должен быть такого типа: "Поезд 111А"
        return this;
    }

    @Step("Выбрать класс обслуживания")
    public PageWithHome chooseTypeSeat(String typeSeat) {
        $("[data-testid=search-result-railway-card]").$(byText(typeSeat)).click();
        Selenide.sleep(500);
        return this;
    }

    @Step("Выбрать свободное место")
    public PageWithHome chooseAvailableSeat() {
        availableSeat.click();
        return this;
    }

    @Step("Выбрать конкретное место")
    public PageWithHome chooseSpecificSeat(String numberSeat) {
        $("#Seat" + numberSeat).click();
        return this;
    }

    @Step("Нажать кнопку продолжить")
    public PageWithHome clickContinue() {
        Selenide.executeJavaScript("window.scrollBy(0,500);");
        Selenide.sleep(500);
        continueButton.click();
        return this;
    }

    @Step("Открыть окно входа в аккаунт на странице покупки билета")
    public PageWithHome clickEntryTicketPage() {
        entryTicketPage.click();
        return this;
    }

    @Step("Ввести логин в окне входа в аккаунт на странице покупки билета")
    public PageWithHome loginInputTicketPage(String login) {
        loginInputTicketPage.setValue(login);
        return this;
    }

    @Step("Ввести пароль в окне входа в аккаунт на странице покупки билета")
    public PageWithHome passwordInputTicketPage(String password) {
        passwordInputTicketPage.setValue(password);
        return this;
    }

    @Step("Войти в аккаунт на странице покупки билета")
    public PageWithHome clickEntryButtonTicketPage() {
        entryButtonTicketPage.click();
        Selenide.sleep(3000);
        return this;
    }

    @Step("Выйти из аккаунта на странице покупки билетов")
    public PageWithHome clickLogoutTicketPage() {
        logoutTicketPage.click();
        return this;
    }

    @Step("Закрыть окно входа в аккаунт на странице покупки билета")
    public PageWithHome clickCloseSideMenuButton() {
        closeSideMenuButton.click();
        return this;
    }

    @Step("Открыть список выбора пассажиров ")
    public PageWithHome clickChoosePassengerButton() {
        choosePassengerButton.click();
        return this;
    }

    @Step("Проверить открытие страницы покупки билета для инвалида")
    public PageWithHome checkSnils() {
        snils.shouldHave(text("Введите СНИЛС *"));
        return this;
    }

    @Step("Ввести снилс")
    public PageWithHome inputSnils(String snilsNumbers) {
        snilsInput.setValue(snilsNumbers);
        return this;
    }

    @Step("Выбрать пассажира")
    public PageWithHome choosePassenger(String passenger) {
        $(".ui-kit-options").$(byText(passenger)).click();
        return this;
    }

    @Step("Оформить заказ")
    public PageWithHome clickMakeOrderButton() {
        makeOrderButton.click();
        return this;
    }

    @Step("Проверить переход на страницу оплаты")
    public PageWithHome checkOrderPage() {
        payButton.shouldBe(visible);
        return this;
    }

    @Step("Нажать чекбокс 'Найти отель'")
    public PageWithHome clickFindHotel() {
        findHotelClick.click();
        return this;
    }

    @Step("Проверить нажатие чекбокса")
    public PageWithHome checkCheckboxFindHotel() {
        findHotelCheckedCheckbox.shouldBe(visible);;
        return this;
    }

    @Step("Перейти на сайт 'TravelRZD'")
    public PageWithHome clickTravelRZD() {
        clickTravelRZD.click();
        return this;
    }

    @Step("Проверить переход на сайт 'TravelRZD'")
    public PageWithHome checkTravelRZDPage(String url) {
        switchTo().window(1);
        webdriver().shouldHave(url(url));
        return this;
    }

    @Step("Проверить отображение элементов второго хедера")
    public PageWithHome checkActionsHeader(String value) {
        actionsHeader.shouldHave(text(value));
        return this;
    }

    @Step("Проверить отображение элементов верхнего хедера")
    public PageWithHome checkLogoHeader(String value) {
        logoHeader.shouldHave(text(value));
        return this;
    }

    @Step("Проверить отображение элементов верхнего блока")
    public PageWithHome checkTopBlock(String value) {
        topBlock.shouldHave(text(value));
        return this;
    }

    @Step("Проверить отображение элементов основного блока")
    public PageWithHome checkMainBlock(String value) {
        mainBlock.shouldHave(text(value));
        return this;
    }

    @Step("Проверить отображение элементов блока с контактами")
    public PageWithHome checkContactsBlock(String value) {
        contactsBlock.shouldHave(text(value));
        return this;
    }

    @Step("Проверить отображение элементов блока мобильного приложения")
    public PageWithHome checkMobileBlock(String value) {
        mobileBlock.shouldHave(text(value));
        return this;
    }

    @Step("Проверить отображение элементов нижнего блока")
    public PageWithHome checkLowerBlock(String value) {
        lowerBlock.shouldHave(text(value));
        return this;
    }

    @Step("Проверить отображение элементов блока лицензий")
    public PageWithHome checkLowestBlockLicenses(String value) {
        lowestBlockLicenses.shouldHave(text(value));
        return this;
    }

    @Step("Открыть виртуального помощника")
    public PageWithHome clickOnlineChat() {
        onlineChat.click();
        return this;
    }

    @Step("Проверить отображение сообщения в виртуальном помощнике")
    public PageWithHome checkOnlineChat(String value) {
        mainChat.shouldHave(text(value));
        return this;
    }

    @Step("Отправить сообщение виртуальному помощнику")
    public PageWithHome sendMessageOnlineChat(String message) {
        inputMessage.setValue(message);
        sendMessageButton.click();
        Selenide.sleep(6000);
        return this;
    }

    @Step("Выбрать тему")
    public PageWithHome chooseThemeOnlineChat(String theme) {
        $(byTagAndText("button", theme)).click();
        return this;
    }

    @Step("Проверить переход на основную страницу")
    public PageWithHome checkHomePage() {
        passengers.shouldHave(text("Пассажирам"));
        return this;
    }

    @Step("Проверить переход на страницу 'Грузовые перевозки'")
    public PageWithHome checkPageFreightTransportation(String words) {
        freightTransportationPage.shouldHave(text(words));
        return this;
    }

    @Step("Проверить переход на страницу 'Компания'")
    public PageWithHome checkPageCompany(String words) {
        companyPage.shouldHave(text(words));
        return this;
    }

    @Step("Проверить переход на страницу 'Работа в РЖД'")
    public PageWithHome checkPageWorkInRZD(String words) {
        workInRZDPage.shouldHave(text(words));
        return this;
    }

    @Step("Проверить переход на страницу 'Контакты'")
    public PageWithHome checkPageContacts(String words) {
        contactsPage.shouldHave(text(words));
        return this;
    }

    @Step("Проверить переход на версию для слабовидящих")
    public PageWithHome checkVisuallyImpaired() {
        visuallyImpairedPage.shouldHave(text("Обычная версия сайта"));
        return this;
    }

    @Step("Проверить хедер окна входа в аккаунт")
    public PageWithHome checkEntryHeader() {
        headerEntryForm.shouldHave(text("Вход"));
        return this;
    }

    @Step("Проверить выбор английского языка")
    public PageWithHome checkEngLanguage() {
        logoHeader.shouldHave(text("Passengers"));
        return this;
    }

    @Step("Проверить выбор русского языка")
    public PageWithHome checkRusLanguage() {
        passengers.shouldHave(text("Пассажирам"));
        return this;
    }

    @Step("Проверить открытие поиска")
    public PageWithHome checkOpenSearch() {
        searchButton.shouldHave(text("Найти"));
        return this;
    }

    @Step("Проверить закрытие поиска")
    public PageWithHome closeSearch() {
        closeSearch.click();
        return this;
    }
}
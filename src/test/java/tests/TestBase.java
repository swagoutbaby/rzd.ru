package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {
    @BeforeAll
    //эта аннотация выполняет НАСТРОЙКИ которые в ней заданы ПЕРЕД ВСЕМИ тестами один раз, например настройка определенного размера браузера
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager"; //стратегия загрузки, если страница долго грузится, с ее помощью мы не будем дожидаться полной загрузки страницы
        Configuration.baseUrl = "https://www.rzd.ru/"; //выносим основной сайт, а в тестах уже оставляем только конкретный путь к сайту
        //Configuration.holdBrowserOpen = true; //делает браузер закрытым после теста (true оставляет открытым)
    }

    @BeforeEach
        //метод выполняется перед каждым тестом
    void setUpBeforeEach() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()); //включение слушателя Аллюр
    }

    @AfterEach
        //выполняется после каждого теста
    void addAttachments() {
        Attach.screenshotAs("Last screenshot"); //Скриншот последнего состояния браузера.
        Attach.pageSource(); //Исходный код страницы.
        Attach.browserConsoleLogs(); //Логи консоли браузера.
        Attach.addVideo(); // Видео записи теста.
        Selenide.closeWebDriver(); //Закрывает браузер.
    }
}

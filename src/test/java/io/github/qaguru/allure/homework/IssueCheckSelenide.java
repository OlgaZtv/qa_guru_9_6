package io.github.qaguru.allure.homework;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class IssueCheckSelenide {

    @Test
    @Owner("OlgaZtv")
    @Feature("Ищем Issue на странице")
    @Severity(SeverityLevel.MINOR)
    @DisplayName("Тест для поиска Issue")
    public void testIssueCheck() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        //open repository page
        open("https://github.com/OlgaZtv/");
        //go to repository
        $(".repo").click();
        //search Issue tab
        $("#issues-tab").shouldHave(text("Issues"));
    }
}

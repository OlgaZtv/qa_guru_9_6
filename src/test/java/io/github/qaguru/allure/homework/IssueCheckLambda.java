package io.github.qaguru.allure.homework;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class IssueCheckLambda {

    private static final String LINK = "https://github.com/OlgaZtv/";
    @Test
    public void testIssueCheck() {
        step("Открываем страницу пользователя", () -> {
        open(LINK);
        });
        step("Переходим в репозиторий", () -> {
        $(".repo").click();
        });
        step("Убеждаемся, что текст Issues есть в репозитории", () -> {
        $("#issues-tab").shouldHave(text("Issues"));
        });
    }
}

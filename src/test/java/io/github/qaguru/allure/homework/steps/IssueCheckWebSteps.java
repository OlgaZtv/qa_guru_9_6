package io.github.qaguru.allure.homework.steps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class IssueCheckWebSteps {

    @Step("Открываем страницу пользователя")
    public void openOwnerPage() {
        open("https://github.com/OlgaZtv/");
    }

    @Step("Переходим в репозиторий")
    public void goToRepository() {
        $(".repo").click();
    }

    @Step("Убеждаемся, что текст Issues есть в репозитории")
    public void shouldSeeIssue() {
        $("#issues-tab").shouldHave(text("Issues"));
    }

}


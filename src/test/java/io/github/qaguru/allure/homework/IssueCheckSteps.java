package io.github.qaguru.allure;

import io.github.qaguru.allure.homework.steps.IssueCheckWebSteps;
import org.junit.jupiter.api.Test;

public class IssueCheckSteps {

    private IssueCheckWebSteps steps = new IssueCheckWebSteps();

    @Test
    public void testGithub() {
        steps.openOwnerPage();
        steps.goToRepository();
        steps.shouldSeeIssue();
    }
}
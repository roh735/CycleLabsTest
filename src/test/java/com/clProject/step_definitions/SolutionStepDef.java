package com.clProject.step_definitions;

import com.clProject.pages.MainMenu;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class SolutionStepDef extends MainMenu {

    @Then("User hover solution menu and click following:")
    public void userHoverSolutionMenuAndClickFollowing(List<String> pageList) {
        notUseless.pagesTest(pageList, sMenu);
    }

    @When("User at solution page")
    public void userAtSolutionPage() {
        sMenu.click();//its no such a page as solutions -> "#" <- url is.
        notUseless.currentPageTest("https://cyclelabs.io/platform/blue-yonder-test-library/#");
    }
}

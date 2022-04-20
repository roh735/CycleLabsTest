package com.clProject.step_definitions;

import com.clProject.pages.MainMenu;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class ResourcesStepDef extends MainMenu {

    @Then("User hover resources menu and click following:")
    public void userHoverResourcesMenuAndClickFollowing(List<String> pageList) {
        notUseless.pagesTest(pageList,rMenu);
    }

    @When("User at resources page")
    public void userAtResourcesPage() {
        rMenu.click();
        notUseless.currentPageTest("https://cyclelabs.io/resources-2/");
    }
}

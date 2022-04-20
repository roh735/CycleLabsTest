package com.clProject.step_definitions;

import com.clProject.pages.MainMenu;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class CompanyStepDef extends MainMenu {

    @Then("User hover company menu and click following:")
    public void userHoverCompanyMenuAndClickFollowing(List<String> pageList) {
        notUseless.pagesTest(pageList, comMenu);
    }

    @When("User at company page")
    public void userAtCompanyPage() {
        conMenu.click();
        notUseless.currentPageTest("https://cyclelabs.io/contact-us/");
    }
}

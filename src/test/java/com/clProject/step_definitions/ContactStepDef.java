package com.clProject.step_definitions;

import com.clProject.pages.MainMenu;
import io.cucumber.java.en.When;

public class ContactStepDef extends MainMenu {

    @When("User at contact page")
    public void userAtCompanyPage() {
        comMenu.click();
        notUseless.currentPageTest("https://cyclelabs.io/company/");
    }

}

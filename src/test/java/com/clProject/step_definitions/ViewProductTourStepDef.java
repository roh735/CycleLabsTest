package com.clProject.step_definitions;

import com.clProject.pages.MainMenu;
import io.cucumber.java.en.When;

public class ViewProductTourStepDef extends MainMenu{


    @When("User at viewProductTourPage page")
    public void userAtCompanyPage() {
        vMenu.click();
        notUseless.currentPageTest("https://cyclelabs.io/demo/");
    }


}

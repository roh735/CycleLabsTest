package com.clProject.step_definitions;

import com.clProject.pages.MainMenu;
import com.clProject.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.List;

public class ProductStepDef extends MainMenu {


    @Given("User at home page")
    public void userTestingPages() {
        Driver.getDriver().get("https://cyclelabs.io/");
    }


    @Then("User hover product menu and click following:")
    public void userHoverProductMenuAndClickFollowing(List<String> pageList) {
        notUseless.pagesTest(pageList,pMenu);
        Driver.getDriver().findElement(By.id("wistia-erthofl1eu-1_popover_popover_close_button")).click();
    }

    @When("User at product page")
    public void userAtProductPage() {
        pMenu.click();
        notUseless.currentPageTest("https://cyclelabs.io/platform/");
    }
}

package com.clProject.step_definitions;

import com.clProject.pages.MainMenu;
import com.clProject.utilities.BrowserUtils;
import com.clProject.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ClientLogInStepDef extends MainMenu {

    String expectedUrlCC = "https://cyclelabsproduction.b2clogin.com/cyclelabsproduction.onmicrosoft.com/b2c_1_sign_up_sign_in/oauth2/v2.0/authorize?response_type=id_token&scope=openid%20profile&client_id=e59a5c0f-5829-4d00-a44d-f08531a0991f&redirect_uri=https%3A%2F%2Fapp.cyclelabs.io&state=eyJpZCI6IjNhZGIxOGQ2LWZmNTItNGQ1My04MjY5LTZkMWNkYmVkMjg0NyIsInRzIjoxNjQ3Njc0NDkwLCJtZXRob2QiOiJyZWRpcmVjdEludGVyYWN0aW9uIn0%3D&nonce=3f3af769-dfde-434d-9823-c9f37798a4bf&client_info=1&x-client-SKU=MSAL.JS&x-client-Ver=1.4.0&client-request-id=1d5a62bc-0b47-49b9-bdf7-871ec7949b24&response_mode=fragment";
    String expectedUrlTS = "https://help.cyclelabs.io/portal/en/home";
    String currentUrl;

    @Then("User should be able to click on following:")
    public void userShouldBeAbleToClickOnFollowing(String pageList) {

            switch (pageList){
                case "cycleCloud":
                    BrowserUtils.hover(loginSelectOption);
                    cycleCloud.click();
                    currentUrl = Driver.getDriver().getCurrentUrl();
                    Assert.assertEquals(expectedUrlCC,currentUrl);
                    Driver.getDriver().navigate().to("https://cyclelabs.io/");
                    break;
                case "technicalSupport":
                    BrowserUtils.hover(loginSelectOption);
                    technicalSupport.click();
                    currentUrl = Driver.getDriver().getCurrentUrl();
                    Assert.assertEquals(expectedUrlTS,currentUrl);
                    Driver.getDriver().navigate().to("https://cyclelabs.io/");
                    break;
            }

    }

}

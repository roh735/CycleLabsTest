package com.clProject.utilities;

import com.clProject.pages.MainMenu;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotUseless extends MainMenu {


    Map<String,String> urlMap = new HashMap<>();

    public Map<String,String> mapUrlLoader(){
        urlMap.put("pTest","https://cyclelabs.io/platform/cycle-test-automation/");
        urlMap.put("pPerformance","https://cyclelabs.io/platform/cycle-appliance/");
        urlMap.put("pWeb","https://cyclelabs.io/platform/cycle-cloud/");
        urlMap.put("pMegaVideo","https://cyclelabs.io/platform/cycle-cloud/");
        urlMap.put("sEnterprise","https://cyclelabs.io/solutions/test-automation-for-enterprise-software/");
        urlMap.put("sWarehouse","https://cyclelabs.io/solutions/warehouse-management-systems/");
        urlMap.put("sBlueYonder","https://cyclelabs.io/platform/blue-yonder-test-library/");
        urlMap.put("rTestAutomationServices","https://cyclelabs.io/services/");
        urlMap.put("rSupport","https://cyclelabs.io/support/");
        urlMap.put("rSupport2","https://cyclelabs.io/support/");
        urlMap.put("rBehaviorDrivenVsModelBasedTesting","https://cyclelabs.io/resources/behavior-driven-model-based-software-test-automation-comparison/");
        urlMap.put("rBlog","https://cyclelabs.io/blog/");
        urlMap.put("rProductTour","https://cyclelabs.io/demo/");
        urlMap.put("rUnderMenuVideo","https://cyclelabs.io/webinars/accelerate-transformation-with-test-automation-webinar/");
        urlMap.put("comAboutCycleLabs","https://cyclelabs.io/company/about/");
        urlMap.put("comMissionValues","https://cyclelabs.io/company/mission-values/");
        urlMap.put("comNewsRelease","https://cyclelabs.io/company-news/");
        urlMap.put("comPartners","https://cyclelabs.io/company/partners/");
        urlMap.put("comCareers","https://cyclelabs.io/company/careers/");
        urlMap.put("comEvents","https://cyclelabs.io/company/events/");
        urlMap.put("comModex","https://cyclelabs.io/company/events/modex2022/");
        urlMap.put("cLSecuresFunding","https://cyclelabs.io/news/cycle-labs-secures-funding/");
        return urlMap;
    }

//--PageOpenerMethod----------------------------------------------------------------------------------------------------
    public void pagesTest(List<String> pageList, WebElement optionMenu){
        for (String currentPage: pageList) {
            BrowserUtils.hover(optionMenu);
            getuMenuList().get(currentPage).click();
            currentPageTest(mapUrlLoader().get(currentPage));
        }
    }
//--CurrentPageCheckerMethod--------------------------------------------------------------------------------------------
    public void currentPageTest(String expectedUrl){
        String currentUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,currentUrl);
    }
}

package com.clProject.pages;

import com.clProject.utilities.Driver;
import com.clProject.utilities.NotUseless;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.Map;

public abstract class MainMenu {
//--PageFactoryMainMenus------------------------------------------------------------------------------------------------
    public MainMenu(){PageFactory.initElements(Driver.getDriver(),this);}

//--Declaring things----------------------------------------------------------------------------------------------------
    public static Map<String,WebElement> uMenuList = new HashMap<>();
    public static NotUseless notUseless = new NotUseless();

//__
//  \__Find Elements MainMenu___________________________________________________________________________________________

//--MainMenus-----------------------------------------------------------------------------------------------------------
    @FindBy(id = "mega-menu-item-97")                               //==============================//
    public WebElement pMenu;                                        //  Product Element             //
    @FindBy(id = "mega-menu-item-1478")                             //                              //
    public WebElement sMenu;                                        //  Solution Element            //
    @FindBy(id = "mega-menu-item-871")                              //                              //
    public WebElement rMenu;                                        //  Resources Element           //
    @FindBy(id = "mega-menu-item-100")                              //                              //
    public WebElement comMenu;                                      //  Company Element             //
    @FindBy(id = "mega-menu-item-1705")                             //                              //
    public WebElement conMenu;                                      //  Contact Element             //
    @FindBy(id = "mega-menu-item-1855")                             //                              //
    public WebElement vMenu;                                        //  ViewProductTour Element     //
                                                                    //==============================//
//--ProductUnderMenu's--------------------------------------------------------------------------------------------------
    @FindBy(id = "mega-menu-item-398")                              //==============================//
    public static WebElement pTestAutomation;                       //  ProductTestAutomation       //
    @FindBy(id = "mega-menu-item-1231")                             //                              //
    public static WebElement pCycleCloud;                           //  ProductCycleCloud           //
    @FindBy(id = "mega-menu-item-375")                              //                              //
    public static WebElement pCycleAppliance;                       //  ProductCycleAppliance       //
    @FindBy(id = "mega-menu-item-custom_html-2")                    //                              //
    public static WebElement pUnderMenuVideo;                       //  ProductMegaVideo            //
                                                                    //==============================//
//--SolutionsUnderMenu's------------------------------------------------------------------------------------------------
    @FindBy(id = "mega-menu-item-1793")                             //======================================//
    public static WebElement sEnterpriseSoftware;                   //  SolutionsEnterpriseSoftware         //
    @FindBy(id = "mega-menu-item-1498")                             //                                      //
    public static WebElement sWarehouseManagementSystem;            //  SolutionWarehouseManagementSystem   //
    @FindBy(id = "mega-menu-item-377")                              //                                      //
    public static WebElement sBlueYonderTestLibrary;                //  SolutionBlueYonderTestLibrary       //
                                                                    //======================================//
//--ResourcesUnderMenu's------------------------------------------------------------------------------------------------
    @FindBy(id = "mega-menu-item-98")                               //==============================================//
    public static WebElement rTestAutomationServices;               //  ResourcesTestAutomationServices             //
    @FindBy(id = "mega-menu-item-102")                              //                                              //
    public static WebElement rSupport;                              //  ResourcesSupport                            //
    @FindBy(id = "mega-menu-item-1504")                             //                                              //
    public WebElement rCommunity;                                   //  ResourcesCommunity                          //
    @FindBy(id = "mega-menu-item-1795")                             //                                              //
    public static WebElement rBehaviorDrivenVsModelBasedTesting;    //  ResourcesBehaviorDrivenVsModelBasedTesting  //
    @FindBy(id = "mega-menu-item-872")                              //                                              //
    public static WebElement rBlog;                                 //  ResourcesBlog                               //
    @FindBy(id = "mega-menu-item-1856")                             //                                              //
    public static WebElement rProductTour;                          //  ResourcesProductTour                        //
    @FindBy(id = "mega-menu-item-media_image-2")                    //                                              //
    public static WebElement rUnderMenuVideo;                       //  ResourcesMegaVideo                          //
                                                                    //==============================================//
//--CompanyUnderMenu's--------------------------------------------------------------------------------------------------
    @FindBy(id = "mega-menu-item-435")                              //========================================//
    public static WebElement comAboutCycleLabs;                     //  CompanyAboutCycleLabs                 //
    @FindBy(id = "mega-menu-item-437")                              //                                        //
    public static WebElement comMissionValues;                      //  CompanyMissionValues                  //
    @FindBy(id = "mega-menu-item-903")                              //                                        //
    public static WebElement comNewsRelease;                        //  CompanyNewsRelease                    //
    @FindBy(id = "mega-menu-item-438")                              //                                        //
    public static WebElement comPartners;                           //  CompanyPartners                       //
    @FindBy(id = "mega-menu-item-436")                              //                                        //
    public static WebElement comCareers;                            //  CompanyCareers                        //
    @FindBy(id = "mega-menu-item-1713")                             //                                        //
    public static WebElement comEvents;                             //  CompanyEvents                         //
    @FindBy(id = "mega-menu-item-1712")                             //                                        //
    public static WebElement comModex;                              //  CompanyModex                          //
    @FindBy(id = "mega-menu-item-1866")                             //                                        //
    public static WebElement cLSecuresFunding;                      //  CompanyCLSecuresFunding               //
                                                                    //========================================//
//--ClientLogInMenu-----------------------------------------------------------------------------------------------------
    @FindBy(linkText = "Client Log In")                             //========================================//
    public WebElement loginSelectOption;                            //  LoginSelectionOption                  //
    @FindBy(linkText = "Cycle Cloud")                               //                                        //
    public WebElement cycleCloud;                                   //  CycleCloud                            //
    @FindBy(linkText = "Technical Support")                         //                                        //
    public WebElement technicalSupport;                             //  TechnicalSupport                      //
                                                                    //========================================//
//  __End Find Elements MainMenu________________________________________________________________________________________
//_/
//__
//  \__Map for underMenusOptions________________________________________________________________________________________

    public static Map<String,WebElement> getuMenuList(){

//--------------------ProductUnderMenus---------------------------------------------------------------------------------
        uMenuList.put("pTest", pTestAutomation);
        uMenuList.put("pPerformance", pCycleAppliance);
        uMenuList.put("pMegaVideo",pUnderMenuVideo);
        uMenuList.put("pWeb", pCycleCloud);

//--------------------SolutionsUnderMenus-------------------------------------------------------------------------------
        uMenuList.put("sEnterprise", sEnterpriseSoftware);
        uMenuList.put("sWarehouse", sWarehouseManagementSystem);
        uMenuList.put("sBlueYonder", sBlueYonderTestLibrary);

//--------------------ResourcesUnderMenus-------------------------------------------------------------------------------
        uMenuList.put("rTestAutomationServices", rTestAutomationServices);
        uMenuList.put("rSupport", rSupport);
        uMenuList.put("rSupport2", rSupport); // different page
        uMenuList.put("rBehaviorDrivenVsModelBasedTesting", rBehaviorDrivenVsModelBasedTesting);
        uMenuList.put("rBlog", rBlog);
        uMenuList.put("rProductTour", rProductTour);
        uMenuList.put("rUnderMenuVideo", rUnderMenuVideo);


//--------------------CompanyUnderMenus---------------------------------------------------------------------------------
        uMenuList.put("comAboutCycleLabs", comAboutCycleLabs);
        uMenuList.put("comMissionValues", comMissionValues);
        uMenuList.put("comNewsRelease", comNewsRelease);
        uMenuList.put("comPartners", comPartners);
        uMenuList.put("comCareers", comCareers);
        uMenuList.put("comEvents", comEvents);
        uMenuList.put("comModex", comModex);
        uMenuList.put("cLSecuresFunding", cLSecuresFunding);

        return uMenuList;
    }
//  ___END underMenusOptions________________________________________________________________________________
//_/





}

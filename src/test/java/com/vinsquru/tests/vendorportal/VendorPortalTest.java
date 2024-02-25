package com.vinsquru.tests.vendorportal;

import com.vinsguru.page.vendorportal.DashboardPage;
import com.vinsguru.page.vendorportal.LoginPage;
import com.vinsquru.tests.AbstractTest;
import com.vinsquru.tests.vendorportal.model.VendorPortalTestData;
import com.vinsquru.util.JsonUtil;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VendorPortalTest extends AbstractTest {
    private LoginPage loginPage;
    private DashboardPage dashboardPage;
    private VendorPortalTestData testData;

    @BeforeTest
    @Parameters("testDataPath")
    public void setPageObject(String testDataPath) {
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        this.testData = JsonUtil.getTestData(testDataPath, VendorPortalTestData.class);
    }
    @Test
    public void logintest(){
        loginPage.goTo("http://d1uh9e7cu07ukd.cloudfront.net/selenium-docker/vendor-app/index.html");
        Assert.assertTrue(loginPage.isAt());
        loginPage.login(testData.getUsername(),testData.getPassword());
    }
//    @Test
//    public void forgotPassword(){
//        ForgotPassword forgotPassword = new ForgotPassword(driver);
//        Assert.assertTrue(forgotPassword.isAt());
//        forgotPassword.forgotPassword("huent995@gmail.com");
//    }

//    @Test
//    public void logintestagain(){
//        LoginPage loginPage = new LoginPage(driver);
////        loginPage.goTo("http://d1uh9e7cu07ukd.cloudfront.net/selenium-docker/vendor-app/index.html");
////        Assert.assertTrue(loginPage.isAt());
//        loginPage.login("sam","sam ");
//    }

    @Test(dependsOnMethods = "logintest")
    public void dashboard(){

        Assert.assertTrue(dashboardPage.isAt());
        Assert.assertEquals(dashboardPage.getMonthlyEarning(), testData.getMonthlyEarning());
        Assert.assertEquals(dashboardPage.getAnnualEarning(), testData.getAnnualEarning());
        Assert.assertEquals(dashboardPage.getProfitMargin(), testData.getProfitMargin());
        Assert.assertEquals(dashboardPage.getAvailableInventory(), testData.getAvailableInventory());

        dashboardPage.searchOrderHistory(testData.getSearchKeyword());

        Assert.assertEquals(dashboardPage.getSearchResults(), testData.getSearchResultsCount());

    }
    @Test(dependsOnMethods = "dashboard")
    public void logOut(){
        dashboardPage.logout();
        Assert.assertTrue(loginPage.isAt());
    }

}

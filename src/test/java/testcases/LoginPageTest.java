package testcases;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage1;
import pages.LoginPage2;
import utilities.DataSet;
import utilities.DriverSetup;

public class LoginPageTest extends DriverSetup {

    LoginPage1 loginPage1 = new LoginPage1();
    LoginPage2 loginPage2 = new LoginPage2();

    @Test(dataProvider = "InvalidUsername",dataProviderClass = DataSet.class, priority = 1)
    @Description("Verify login with a invalid username.")
    public void loginWithInValidUsername(String username){
        getDriver().get(loginPage1.loginPageUrl);
        loginPage1.writeOnElement(loginPage1.Username,username);
        loginPage1.clickOnElement(loginPage1.loginButton);
        loginPage1.addScreenShot("After logging in with invalid username");
    }
    @Test(dataProvider = "validUsername",dataProviderClass = DataSet.class, priority = 2)
    @Description("Verify login with a valid username.")
    public void loginWithValidUsername(String username){
        getDriver().get(loginPage1.loginPageUrl);
        loginPage1.writeOnElement(loginPage1.Username,username);
        loginPage1.clickOnElement(loginPage1.loginButton);
        loginPage1.addScreenShot("After logging in with correct username");
        Assert.assertEquals(loginPage1.getElementText(loginPage1.passwordPage),"Password");
    }

    @Test(dataProvider = "InvalidPassword",dataProviderClass = DataSet.class, priority = 3)
    @Description("Verify login with a invalid password.")
    public void loginWithInValidPassword(String password) throws InterruptedException {
        getDriver().get(loginPage2.loginPageUrl);
        loginPage2.writeOnElement(loginPage2.Password,password);
        loginPage2.clickOnElement(loginPage2.loginButton);
        Thread.sleep(2000);
        loginPage2.addScreenShot("After logging in with invalid credentials");
    }
    @Test(dataProvider = "validPassword",dataProviderClass = DataSet.class, priority = 4)
    @Description("Verify login with a valid password.")
    public void loginWithValidPassword(String password) throws InterruptedException {
        getDriver().get(loginPage2.loginPageUrl);
        loginPage2.writeOnElement(loginPage2.Password,password);
        loginPage2.clickOnElement(loginPage2.loginButton);
        Thread.sleep(2000);
        loginPage2.addScreenShot("After logging in with correct credentials");
    }
}
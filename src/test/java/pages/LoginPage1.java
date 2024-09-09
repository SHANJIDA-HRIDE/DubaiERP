package pages;

import org.openqa.selenium.By;

public class LoginPage1 extends basePage{
    public String loginPageUrl = "https://erp.threearrowplastic.com/Three-arrows-dubai-test/sAdmin/index.php";

    public By Username = By.id("username");
    public By loginButton = By.id("loginBtn");
    public By confirmationMessageElement = By.xpath("//h3[@class='page-title']");
    public By logOutButton = By.linkText("Logout");
    public By warningMessage = By.xpath("//div[contains(@class, 'alert') and contains(@class, 'alert-danger') and contains(@class, 'alert-dismissible') and contains(@class, 'fade') and contains(@class, 'show')]");

}

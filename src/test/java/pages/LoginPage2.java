package pages;

import org.openqa.selenium.By;

public class LoginPage2 extends basePage{
    public String loginPageUrl = "https://erp.threearrowplastic.com/Three-arrows-dubai-test/sAdmin/nindex.php";

    public By Password = By.name("password");
    public By loginButton = By.id("loginBtn");
    public By confirmationMessageElement = By.xpath("//h3[@class='page-title']");
    public By logOutButton = By.linkText("Logout");
    public By dashBoard = By.xpath("//td[contains(text(), 'Total Product')]");

}

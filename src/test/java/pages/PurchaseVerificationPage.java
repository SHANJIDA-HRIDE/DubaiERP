package pages;

import org.openqa.selenium.By;

import java.util.Set;

import static utilities.DriverSetup.getDriver;


public class PurchaseVerificationPage extends basePage{
    public String PurchaseVerificationUrl = "https://erp.threearrowplastic.com/Three-arrows-dubai-test/sAdmin/site/Inventory/purchase/verifications/PurchaseVerification.php";

    public By ClickOnPurchaseDetails= By.xpath("//button[contains(text(),'Details') and contains(@onclick, 'PUR-0000000000000000006')]");
    public By ClickOnReceiveMaterialButton = By.id("StateChange");
    public By ClickOnBillEntryButton= By.xpath("//input[@type='submit' and @value='Bill Entry' and @onclick='gochallan()']");
    public By EnterBillNo = By.id("bill_no");
    public By EnterBillDate = By.id("bill_received_date");
    public By ClickOnBillEntryButton2 = By.id("bill");
    public By ClickOnDeleteBill = By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr[1]/td[6]/u[1]");


}



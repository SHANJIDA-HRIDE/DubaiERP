package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class SalesDeliveryPage extends basePage{
    public String SalesDeliveryUrl = "https://erp.threearrowplastic.com/Three-arrows-dubai-test/sAdmin/site/Inventory/sales/verifications/sales_deliver_verification.php";
    public By  ClickOnDeliveryDetails= By.xpath("//tbody/tr[1]/td[10]/button[1]");
    public By  ClickOnDeliveryButton= By.id("DELIVERED");
}



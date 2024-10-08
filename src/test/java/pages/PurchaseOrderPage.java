package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class PurchaseOrderPage extends basePage{
    public String purchaseOrderUrl = "https://erp.threearrowplastic.com/Three-arrows-dubai-test/sAdmin/site/Inventory/purchase/purchaseInfo.php";

    public By ProductUnit = By.id("product_unit");
    public By PurchaseType = By.id("purchase_type");
    public By  ItemName= By.id("product_name");
    public By  ItemQuantity= By.id("product_quantity");
    public By  ClickOnAddProductButton= By.id("btnAdd");
    public By  ClickASaveProductButton= By.id("btnSave");
    public By  ClickDeleteProductButton= By.id("btnDelete");

    public void enterItemNameAndSelectWithKeyboard(String itemName) throws InterruptedException {
        WebElement itemNameField = getElement(ItemName);
        itemNameField.sendKeys(itemName);
        waitforElementPresence(ItemName);
        Thread.sleep(5000);

        // Simulate key down to select from the dropdown
        itemNameField.sendKeys(Keys.ARROW_DOWN);
        itemNameField.sendKeys(Keys.ENTER);
    }
}



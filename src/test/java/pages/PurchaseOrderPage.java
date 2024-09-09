package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static utilities.DriverSetup.getDriver;

public class PurchaseOrderPage extends basePage{
    public String purchaseOrderUrl = "https://erp.threearrowplastic.com/Three-arrows-dubai-test/sAdmin/site/Inventory/purchase/purchaseInfo.php";

    public By ProductUnit = By.id("product_unit");
    public By PurchaseType = By.id("purchase_type");
    public By  ItemName= By.id("product_name");
    public By  ItemQuantity= By.id("product_quantity");
    public By  ClickOnAddProductButton= By.id("btnAdd");
    public By  lickASaveProductButton= By.id("btnSave");
    public void searchAndSelectItemWithKeyboard(String searchTerm) {
        searchAndSelectWithKeyboard(ItemName, searchTerm);
    }
    public void enterItemNameAndSelectWithMouse(String itemName) {
        WebElement itemNameField = getElement(ItemName);
        itemNameField.sendKeys(itemName);

        // Wait for the dropdown options to appear
        //waitforElementPresence(By.xpath("//div[@class='autocomplete-suggestions']"));

        // Hover and click the first suggestion
        WebElement firstOption = getDriver().findElement(By.id("ui-id-412"));
        hoverOverElement(firstOption);
        firstOption.click();
    }
}



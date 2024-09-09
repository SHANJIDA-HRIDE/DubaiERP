package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class NewProductEntryPage extends basePage{
    public String newProductEntryPageUrl = "https://erp.threearrowplastic.com/Three-arrows-dubai-test/sAdmin/site/Inventory/product/productInfo.php";

    public By  ProductCategory= By.id("prd_categoty");
    public By  ProductUnitType= By.id("unit_type");
    public By  RetailPrice= By.id("retail_price");
    public By  WholesalePrice= By.id("prd_price");
    public By ProductName = By.id("product_name");
    public By  ProductCode= By.id("product_code");
    public By  Currency= By.id("currency");
    public By  CostPrice= By.id("cost_price");
    public By  ClickASaveNewProductButton= By.id("btnSaveEX");

    public void enterItemNameAndSelectWithKeyboard(String productCategory) throws InterruptedException {
        WebElement itemNameField = getElement(ProductCategory);
        itemNameField.sendKeys(productCategory);
        waitforElementPresence(ProductCategory);
        Thread.sleep(5000);

        // Simulate key down to select from the dropdown
        itemNameField.sendKeys(Keys.ARROW_DOWN);
        itemNameField.sendKeys(Keys.ENTER);
    }
}



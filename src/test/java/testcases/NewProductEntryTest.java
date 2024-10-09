package testcases;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.NewProductEntryPage;
import utilities.DataSet;
import utilities.DriverSetup;

public class NewProductEntryTest extends DriverSetup {

    NewProductEntryPage newProductEntry = new NewProductEntryPage();

    @Test(dataProvider = "newProductEntry",dataProviderClass = DataSet.class, priority = 1)
    @Description("Validate New Product Entry with Valid Info, EDit & Delete.")
    public void newProductEntry(String productUnitType,String retailPrice,String WholesalePrice,String productName,String productCode,String currency,String costPrice) throws InterruptedException {
        getDriver().get(newProductEntry.newProductEntryPageUrl);
        newProductEntry.enterItemNameAndSelectWithKeyboard("AC DEFLECTOR");
        Thread.sleep(6000);
        newProductEntry.selectWithVisibleText(newProductEntry.ProductUnitType,productUnitType);
        newProductEntry.writeOnElement(newProductEntry.RetailPrice,retailPrice);
        newProductEntry.writeOnElement(newProductEntry.WholesalePrice,WholesalePrice);
        newProductEntry.writeOnElement(newProductEntry.ProductName,productName);
        newProductEntry.writeOnElement(newProductEntry.ProductCode,productCode);
        newProductEntry.selectWithVisibleText(newProductEntry.Currency,currency);
        newProductEntry.writeOnElement(newProductEntry.CostPrice,costPrice);
        newProductEntry.clickOnElement(newProductEntry.ClickASaveNewProductButton);
        newProductEntry.acceptAlert();
        Thread.sleep(5000);
        newProductEntry.addScreenShot("After successful product entry");
        newProductEntry.clickOnElement(newProductEntry.ClickASaveNewProductButton);
        newProductEntry.acceptAlert();
        Thread.sleep(5000);
        newProductEntry.addScreenShot("After successful product update");
        newProductEntry.clickOnElement(newProductEntry.ClickDeleteProductButton);
        newProductEntry.acceptAlert();
        Thread.sleep(5000);
        newProductEntry.addScreenShot("After successful product delete");
    }
}
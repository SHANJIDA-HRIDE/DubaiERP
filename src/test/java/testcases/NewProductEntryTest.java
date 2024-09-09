package testcases;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.NewProductEntryPage;
import utilities.DataSet;
import utilities.DriverSetup;

public class NewProductEntryTest extends DriverSetup {

    NewProductEntryPage newProductEntry = new NewProductEntryPage();

    @Test(dataProvider = "newProductEntry",dataProviderClass = DataSet.class, priority = 1)
    @Description("Validate New Product Entry with Valid Info.")
    public void newProductEntry(String productUnitType,String retailPrice,String WholesalePrice,String productName,String productCode,String currency,String costPrice) throws InterruptedException {
        getDriver().get(newProductEntry.newProductEntryPageUrl);
        newProductEntry.enterItemNameAndSelectWithKeyboard("AC DEFLECTOR");
        Thread.sleep(5000);
        newProductEntry.selectWithVisibleText(newProductEntry.ProductUnitType,productUnitType);
        Thread.sleep(5000);
        newProductEntry.writeOnElement(newProductEntry.RetailPrice,retailPrice);
        Thread.sleep(5000);
        newProductEntry.writeOnElement(newProductEntry.WholesalePrice,WholesalePrice);
        Thread.sleep(5000);
        newProductEntry.writeOnElement(newProductEntry.ProductName,productName);
        Thread.sleep(5000);
        newProductEntry.writeOnElement(newProductEntry.ProductCode,productCode);
        Thread.sleep(5000);
        newProductEntry.selectWithVisibleText(newProductEntry.Currency,currency);
        Thread.sleep(5000);
        newProductEntry.writeOnElement(newProductEntry.CostPrice,costPrice);
        Thread.sleep(5000);
        newProductEntry.clickOnElement(newProductEntry.ClickASaveNewProductButton);
        Thread.sleep(5000);
        newProductEntry.acceptAlert();
    }

}

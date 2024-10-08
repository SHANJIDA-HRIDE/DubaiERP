package testcases;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.PurchaseOrderPage;
import utilities.DataSet;
import utilities.DriverSetup;

import org.openqa.selenium.Keys;

public class PurchaseOrderTest extends DriverSetup {

    PurchaseOrderPage purchaseOrder = new PurchaseOrderPage();

    @Test(dataProvider = "newPurchaseOrder",dataProviderClass = DataSet.class, priority = 1)
    @Description("Validate Purchase Order with Valid Info.")
    public void newPurchaseOrder(String productUnit,String purchaseType,String itemQuantity) throws InterruptedException {
        getDriver().get(purchaseOrder.purchaseOrderUrl);
        purchaseOrder.selectWithVisibleText(purchaseOrder.ProductUnit,productUnit);
        purchaseOrder.selectWithVisibleText(purchaseOrder.PurchaseType,purchaseType);
        purchaseOrder.clickOnElement(purchaseOrder.ItemName);
        purchaseOrder.enterItemNameAndSelectWithKeyboard("AC COMB FIN");
        Thread.sleep(5000);
        purchaseOrder.writeOnElement(purchaseOrder.ItemQuantity,itemQuantity);
        purchaseOrder.clickOnElement(purchaseOrder.ClickOnAddProductButton);
        purchaseOrder.clickOnElement(purchaseOrder.ClickASaveProductButton);
        purchaseOrder.acceptAlert();
        Thread.sleep(2000);
        purchaseOrder.addScreenShot("After successful purchase order");
        purchaseOrder.writeOnElement(purchaseOrder.ItemQuantity,"5");
        purchaseOrder.clickOnElement(purchaseOrder.ClickASaveProductButton);
        purchaseOrder.acceptAlert();
        Thread.sleep(2000);
        purchaseOrder.addScreenShot("After successful edit purchase order");
        purchaseOrder.clickOnElement(purchaseOrder.ClickDeleteProductButton);
        purchaseOrder.acceptAlert();
        Thread.sleep(2000);
        purchaseOrder.addScreenShot("After successful delete purchase order");
    }

}

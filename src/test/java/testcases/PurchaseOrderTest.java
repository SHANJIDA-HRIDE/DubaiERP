package testcases;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.PurchaseOrderPage;
import utilities.DataSet;
import utilities.DriverSetup;

import org.openqa.selenium.Keys;

public class PurchaseOrderTest extends DriverSetup {

    PurchaseOrderPage purchaseOrder = new PurchaseOrderPage();

    @Test(dataProvider = "newProductEntry",dataProviderClass = DataSet.class, priority = 1)
    @Description("Validate Purchase Order with Valid Info.")
    public void newProductEntry(String productUnit,String purchaseType,String itemQuantity) throws InterruptedException {
        getDriver().get(purchaseOrder.purchaseOrderUrl);
        purchaseOrder.selectWithVisibleText(purchaseOrder.ProductUnit,productUnit);
        Thread.sleep(5000);
        purchaseOrder.selectWithVisibleText(purchaseOrder.PurchaseType,purchaseType);
        purchaseOrder.clickOnElement(purchaseOrder.ItemName);
        purchaseOrder.enterItemNameAndSelectWithMouse("AC COMB FIN");
        Thread.sleep(5000);
        purchaseOrder.writeOnElement(purchaseOrder.ItemQuantity,itemQuantity);
        Thread.sleep(5000);
        purchaseOrder.clickOnElement(purchaseOrder.ClickOnAddProductButton);
        Thread.sleep(5000);
        purchaseOrder.clickOnElement(purchaseOrder.lickASaveProductButton);
        Thread.sleep(5000);
        purchaseOrder.acceptAlert();

        //loginPage1.addScreenShot("After logging in with correct username");
        //Assert.assertEquals(loginPage1.getElementText(loginPage1.confirmationMessageElement),"PasswordField");
       // Thread.sleep(2000);
        //loginPage.clickOnElement(loginPage.logOutButton);
    }

}

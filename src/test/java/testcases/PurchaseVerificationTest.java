package testcases;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.PurchaseVerificationPage;
import utilities.DataSet;
import utilities.DriverSetup;

public class PurchaseVerificationTest extends DriverSetup {

    PurchaseVerificationPage purchaseVerification = new PurchaseVerificationPage();

    @Test(dataProvider = "PurchaseVerification",dataProviderClass = DataSet.class, priority = 1)
    @Description("Validate PurchaseVerification & Bill Entry & Bile Delete")
    public void PurchaseVerification(String billNo,String billDate) throws InterruptedException {
        getDriver().get(purchaseVerification.PurchaseVerificationUrl);
        purchaseVerification.clickOnElement(purchaseVerification.ClickOnPurchaseDetails);
        for (String winHandle : DriverSetup.getDriver().getWindowHandles()) {
            DriverSetup.getDriver().switchTo().window(winHandle);
        }
        purchaseVerification.clickOnElement(purchaseVerification.ClickOnReceiveMaterialButton);
        Thread.sleep(2000);
        purchaseVerification.acceptAlert();
        Thread.sleep(2000);
        purchaseVerification.addScreenShot("After Material receive");

        purchaseVerification.clickOnElement(purchaseVerification.ClickOnBillEntryButton);
        for (String winHandle : DriverSetup.getDriver().getWindowHandles()) {
            DriverSetup.getDriver().switchTo().window(winHandle);
        }
        purchaseVerification.writeOnElement(purchaseVerification.EnterBillNo,billNo);
        purchaseVerification.writeOnElement(purchaseVerification.EnterBillDate,billDate);
        purchaseVerification.clickOnElement(purchaseVerification.ClickOnBillEntryButton2);
        purchaseVerification.acceptAlert();
        purchaseVerification.addScreenShot("After Bill Receive");
        DriverSetup.getDriver().close();
        DriverSetup.getDriver().close();

    }
}

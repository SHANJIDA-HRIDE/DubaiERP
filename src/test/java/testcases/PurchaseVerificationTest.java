package testcases;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.PurchaseVerificationPage;
import utilities.DataSet;
import utilities.DriverSetup;

public class PurchaseVerificationTest extends DriverSetup {

    PurchaseVerificationPage purchaseVerification = new PurchaseVerificationPage();

    @Test(dataProvider = "PurchaseVerification",dataProviderClass = DataSet.class, priority = 1)
    @Description("Validate PurchaseVerification & Bill Entry")
    public void PurchaseVerification(String billNo,String billDate) throws InterruptedException {
        getDriver().get(purchaseVerification.PurchaseVerificationUrl);
        purchaseVerification.clickOnElement(purchaseVerification.ClickOnPurchaseDetails);
        String mainWindowHandle = DriverSetup.getDriver().getWindowHandle();

        // Step 4: Switch to the Material Receive window
        for (String winHandle : DriverSetup.getDriver().getWindowHandles()) {
            if (!winHandle.equals(mainWindowHandle)) {
                DriverSetup.getDriver().switchTo().window(winHandle);
                break;
            }
        }

        // Step 5: Perform actions in the Material Receive window
        purchaseVerification.clickOnElement(purchaseVerification.ClickOnReceiveMaterialButton);
        Thread.sleep(2000);
        purchaseVerification.acceptAlert();
        Thread.sleep(5000);
        purchaseVerification.addScreenShot("After Material Receive");

        // Step 6: Click on Bill Entry button (opens the Bill Receive window)
        purchaseVerification.clickOnElement(purchaseVerification.ClickOnBillEntryButton);

        // Step 7: Switch to the Bill Receive window
        String materialWindowHandle = DriverSetup.getDriver().getWindowHandle(); // Store Material Receive window handle
        for (String winHandle : DriverSetup.getDriver().getWindowHandles()) {
            if (!winHandle.equals(mainWindowHandle) && !winHandle.equals(materialWindowHandle)) {
                DriverSetup.getDriver().switchTo().window(winHandle);
                break;
            }
        }

        // Step 8: Perform actions in the Bill Receive window
        purchaseVerification.writeOnElement(purchaseVerification.EnterBillNo, billNo);
        purchaseVerification.writeOnElement(purchaseVerification.EnterBillDate, billDate);
        purchaseVerification.clickOnElement(purchaseVerification.ClickOnBillEntryButton2);
        purchaseVerification.acceptAlert();
        Thread.sleep(5000);
        purchaseVerification.addScreenShot("After Bill Receive");

        // Step 9: Close the Bill Receive window
        DriverSetup.getDriver().close();

        // Step 10: Switch back to the Material Receive window
        DriverSetup.getDriver().switchTo().window(materialWindowHandle);

        // Step 11: Close the Material Receive window
        DriverSetup.getDriver().close();

        // Step 12: Switch back to the main window
        DriverSetup.getDriver().switchTo().window(mainWindowHandle);

    }
}

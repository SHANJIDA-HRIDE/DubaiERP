package testcases;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.SalesDeliveryPage;
import utilities.DriverSetup;

public class SalesDeliveryVerificationTest extends DriverSetup {

    SalesDeliveryPage salesDelivery = new SalesDeliveryPage();

    @Test
    @Description("Validate Sales Delivery Verification with Full Quantity")
    public void SalesDeliveryVerification() throws InterruptedException {
        getDriver().get(salesDelivery.SalesDeliveryUrl);
        Thread.sleep(5000);
        salesDelivery.clickOnElement(salesDelivery.ClickOnDeliveryDetails);
        for (String winHandle : DriverSetup.getDriver().getWindowHandles()) {
            DriverSetup.getDriver().switchTo().window(winHandle);
        }
        salesDelivery.clickOnElement(salesDelivery.ClickOnDeliveryButton);
        Thread.sleep(5000);
        salesDelivery.acceptAlert();
    }
}

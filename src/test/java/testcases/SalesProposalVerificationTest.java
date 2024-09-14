package testcases;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.SalesProposalVerificationPage;
import utilities.DataSet;
import utilities.DriverSetup;

public class SalesProposalVerificationTest extends DriverSetup {

    SalesProposalVerificationPage salesProposalVerification = new SalesProposalVerificationPage();

    @Test
    @Description("Validate Sales Proposal Verification")
    public void SalesProposalVerification() throws InterruptedException {
        getDriver().get(salesProposalVerification.SalesProposalVerificationUrl);
        Thread.sleep(5000);
        salesProposalVerification.clickOnElement(salesProposalVerification.ClickOnSalesApproveButton);
        for (String winHandle : DriverSetup.getDriver().getWindowHandles()) {
            DriverSetup.getDriver().switchTo().window(winHandle);
        }
        salesProposalVerification.clickOnElement(salesProposalVerification.ClickOnSalesApproveButton2);
        Thread.sleep(5000);
        salesProposalVerification.acceptAlert();
        Thread.sleep(5000);

}}

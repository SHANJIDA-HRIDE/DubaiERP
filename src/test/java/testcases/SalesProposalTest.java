package testcases;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.SalesProposalPage;
import utilities.DataSet;
import utilities.DriverSetup;

public class SalesProposalTest extends DriverSetup {

    SalesProposalPage salesProposal = new SalesProposalPage();

    @Test(dataProvider = "salesProposal",dataProviderClass = DataSet.class, priority = 1)
    @Description("Validate SalesP proposal with Valid Info.")
    public void SalesProposal(String itemQuantity) throws InterruptedException {
        getDriver().get(salesProposal.SalesProposalUrl);
        salesProposal.clickOnElement(salesProposal.ItemName);
        salesProposal.EnterItemNameAndSelectWithKeyboard("AC COMB FIN");
        Thread.sleep(5000);
        salesProposal.writeOnElement(salesProposal.ItemQuantity,itemQuantity);
        Thread.sleep(5000);
        salesProposal.clickOnElement(salesProposal.ClickOnAddProductButton);
        Thread.sleep(5000);
        salesProposal.clickOnElement(salesProposal.lickASaveProductButton);
        Thread.sleep(5000);
        salesProposal.acceptAlert();
        Thread.sleep(5000);
        salesProposal.addScreenShot("After successful Sales Proposal");

    }

}

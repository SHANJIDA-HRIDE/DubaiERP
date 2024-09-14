package pages;

import org.openqa.selenium.By;


public class SalesProposalVerificationPage extends basePage{
    public String SalesProposalVerificationUrl = "https://erp.threearrowplastic.com/Three-arrows-dubai-test/sAdmin/site/Inventory/sales/verifications/proposal_verification.php";

    public By ClickOnSalesApproveButton= By.xpath("//tbody/tr[1]/td[9]/button[1]");
    public By ClickOnSalesApproveButton2 = By.id("StateChange");

}



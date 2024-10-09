package testcases;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.JournalEntryPage;
import utilities.DataSet;
import utilities.DriverSetup;

public class JournalEntryTest extends DriverSetup {

    JournalEntryPage journalEntry = new JournalEntryPage();

    @Test(dataProvider = "journalEntry",dataProviderClass = DataSet.class, priority = 1)
    @Description("Validate Journal Entry Page with Valid Info.")
    public void JournalEntry(String amountCredit) throws InterruptedException {
        getDriver().get(journalEntry.JournalEntryUrl);
        journalEntry.clickOnElement(journalEntry.AccountHead);
        journalEntry.EnterItemNameAndSelectWithKeyboard("Cash");
        Thread.sleep(5000);
        journalEntry.writeOnElement(journalEntry.AmountCredit,amountCredit);
        journalEntry.clickOnElement(journalEntry.ClickOnAddButton);
        Thread.sleep(5000);
        journalEntry.clickOnElement(journalEntry.AccountHead);
        journalEntry.EnterItemNameAndSelectWithKeyboard("SALARY EXPENSE");
        Thread.sleep(5000);
        journalEntry.clickOnElement(journalEntry.ClickOnAddButton);
        Thread.sleep(3000);
        journalEntry.clickOnElement(journalEntry.ClickASaveButton);
        Thread.sleep(5000);
        journalEntry.acceptAlert();
        Thread.sleep(5000);
        journalEntry.addScreenShot("After successful Valid Journal Entry");

    }

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class JournalEntryPage extends basePage{
    public String JournalEntryUrl = "https://erp.threearrowplastic.com/Three-arrows-dubai-test/sAdmin/site/Account/Voucher/voucherEntry.php";
    public By  AccountHead= By.id("account_head");
    public By  AmountCredit= By.id("credit");
    public By  ClickOnAddButton= By.xpath("//body/div[2]/form[1]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[2]/button[1]");
    public By  ClickASaveButton= By.id("btnSave");

    public void EnterItemNameAndSelectWithKeyboard(String accountHead) throws InterruptedException {
        WebElement accountHeadField = getElement(AccountHead);
        accountHeadField.sendKeys(accountHead);
        waitforElementPresence(AccountHead);
        Thread.sleep(5000);

        // Simulate key down to select from the dropdown
        accountHeadField.sendKeys(Keys.ARROW_DOWN);
        accountHeadField.sendKeys(Keys.ENTER);
    }

}



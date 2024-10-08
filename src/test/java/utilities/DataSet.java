package utilities;

import org.testng.annotations.DataProvider;

public class DataSet {


    @DataProvider(name = "validUsername")
    public static Object validUsername(){
        Object[][] dataset = {
                {"useradmin"}
        };


        return dataset;
    }
    @DataProvider(name = "validPassword")
    public static Object validPassword(){
        Object[][] dataset = {
                {"Guru1234"}
        };


        return dataset;
    }
    @DataProvider(name = "newProductEntry")
    public static Object newProductEntry(){
        Object[][] dataset = {
                {"KG ","100","90","Test Product","TPP","AED ","100"}
        };

        return dataset;
    }
    @DataProvider(name = "newPurchaseOrder")
    public static Object newPurchaseOrder(){
        Object[][] dataset = {
                {"Sharjah Warehouse ","Domestic","10"}
        };

        return dataset;
    }
    @DataProvider(name = "PurchaseVerification")
    public static Object PurchaseVerification(){
        Object[][] dataset = {
                {"test11","08-Sep-2024"}
        };

        return dataset;
    }
    @DataProvider(name = "salesProposal")
    public static Object salesProposal(){
        Object[][] dataset = {
                {"10"}
        };

        return dataset;
    }
    @DataProvider(name = "journalEntry")
    public static Object journalEntry(){
        Object[][] dataset = {
                {"10"}
        };

        return dataset;
    }

}

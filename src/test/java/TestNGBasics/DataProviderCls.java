package TestNGBasics;

import org.testng.annotations.DataProvider;

public class DataProviderCls {
    @DataProvider(name="LoginDataProvider")
    public Object[][] getdata(){
        Object[][] data={  {"test1@gmail.com","test1"},{"test2@gmail.com","test2"},{"test3@gmail.com","test3"} };
        return data;
    }
}

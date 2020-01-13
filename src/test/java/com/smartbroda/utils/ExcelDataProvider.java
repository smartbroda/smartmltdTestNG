package com.smartbroda.utils;

import org.testng.annotations.DataProvider;

public class ExcelDataProvider {
    @DataProvider(name = "testUsersExcel")
    public static Object[][] Authentication() throws Exception{
// This is where you state the name of the Excel file
// and the name of the worksheet that contains the test data
        Object[][] testObjArray = ExcelUtils.getTableArray
                ("src/test/resources/users.xls","Sheet1");
        return (testObjArray);
    }
}

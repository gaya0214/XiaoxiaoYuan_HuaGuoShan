package utils;

import org.testng.annotations.DataProvider;

import java.io.IOException;

public class NSDataProvider {
    @DataProvider(name="txt")
    public  Object[][] getTxtData() throws IOException {
        return new  TxtDataProvider().getTxtUser("data/user.txt");
    }

    @DataProvider(name="excel")
    public Object[][] getExcelDada() throws IOException{
        return new ExcelDataProvider().getTestDataByExcel("C:\\Users\\fanlimei\\Desktop\\movie.xlsx","Sheet1");
    }
}


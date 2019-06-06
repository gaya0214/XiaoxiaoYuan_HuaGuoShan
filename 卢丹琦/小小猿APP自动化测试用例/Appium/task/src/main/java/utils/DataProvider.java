package utils;

public class DataProvider {

    @DataProvider
    public static Object[][] DataMethodNoName(){
        return new Object[][]{
                {"data with no name 1"},
                {"data with no name 2"},
                {"data with no name 3"}
        };
    }


    @DataProvider(name = "datamethodwithname")
    public static Object[][] DataMethodWithName(){
        return new Object[][]{
                {"data with  name 1"},
                {"data with  name 2"},
                {"data with  name 3"}
        };
    }

}

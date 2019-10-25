package testCases;

import Listener.Listener;
import Utils.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testCaseFunction.SearchTestFunction;


@Listeners({Listener.class})
public class SearchTestCase extends BaseTest {
    @Test
    public void SearchTest(){
        SearchTestFunction searchTestFunction = new SearchTestFunction(driver);
        searchTestFunction.Arama();
    }
}

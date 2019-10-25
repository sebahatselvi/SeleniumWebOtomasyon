package testCases;

import Listener.Listener;
import Utils.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testCaseFunction.GirisFormuFunction;
import testCaseFunction.LoginTestFunction;
import testCaseFunction.SearchTestFunction;

@Listeners({Listener.class})
public class TumTestCase extends BaseTest {
    @Test
    public void FormTest(){
        GirisFormuFunction girisFormuFunction=new GirisFormuFunction(driver);
        girisFormuFunction.Form();
    }
    @Test
    public void SearchTest(){
        SearchTestFunction searchTestFunction = new SearchTestFunction(driver);
        searchTestFunction.Arama();
    }
}

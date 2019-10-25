package testCases;

import Listener.Listener;
import Utils.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testCaseFunction.GirisFormuFunction;

@Listeners({Listener.class})
public class FormTestCase extends BaseTest {
    @Test
    public void FormTest(){
        GirisFormuFunction girisFormuFunction=new GirisFormuFunction(driver);
        girisFormuFunction.Form();
    }
}
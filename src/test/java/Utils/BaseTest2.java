package Utils;

import Listener.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testCaseFunction.GirisFormuFunction;

@Listeners({Listener.class})
public class BaseTest2 extends BaseTest {
    @Test
    public void FormTest(){
        GirisFormuFunction girisFormuFunction=new GirisFormuFunction(driver);
        girisFormuFunction.Form();
    }


}

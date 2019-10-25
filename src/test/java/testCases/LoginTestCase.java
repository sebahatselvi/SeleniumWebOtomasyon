package testCases;

import Listener.Listener;
import Utils.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testCaseFunction.LoginTestFunction;

@Listeners({Listener.class})
public class LoginTestCase extends BaseTest {
    @Test
    public void LoginTest(){
       LoginTestFunction login = new LoginTestFunction(driver);
       login.LoginTest();
    }

}

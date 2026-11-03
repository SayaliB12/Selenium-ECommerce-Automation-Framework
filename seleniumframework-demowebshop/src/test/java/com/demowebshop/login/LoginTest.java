
package com.demowebshop.login;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.DemoWebShop.generic_utilities.BaseClass;
import com.DemoWebShop.generic_utilities.ListernsImplemention;
import com.dws.object_repository.WelcomePage;
import com.dws.object_repository.loginpage;

@Listeners(ListernsImplemention.class)
public class LoginTest extends BaseClass {

    @Test(groups = {"Smoke", "Regression"})
    public void loginAsValidUser() throws IOException {

        // Create object of WelcomePage
        WelcomePage wp = new WelcomePage(driver);

        // Create object of loginpage
        loginpage lp = new loginpage(driver);

        // Click on Login
        wp.clickOnLogin();

        // Login with valid credentials
        lp.LoginAsValidUser(email, password);

        // Verify registered email
        Assert.assertEquals(
                wp.getRegisteredEmailText().getText(),
                email,
                "Login verification failed!"
        );
    }
}

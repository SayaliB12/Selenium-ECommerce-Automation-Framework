
package com.demowebshop.registere;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.DemoWebShop.generic_utilities.BaseClass;
import com.DemoWebShop.generic_utilities.JavaUtility;
import com.DemoWebShop.generic_utilities.ListernsImplemention;
import com.DemoWebShop.generic_utilities.excel_utility;
import com.dws.object_repository.RegisterPage;
import com.dws.object_repository.RegisterResultPage;
import com.dws.object_repository.WelcomePage;

@Listeners(ListernsImplemention.class)
public class RegisterTest extends BaseClass {

    @Test(groups = "Regression",dataProvider = "RegisterDetails",dataProviderClass = excel_utility.class)
    public void registerAsNewUser(String firstname,String lastname,String gender,String emailA,String emailB,String password) throws IOException {

        // Read registration data from Excel
      //  excel_utility eu = new excel_utility();

      //  String firstname = eu.readDataFromSpecificCell("Sheet1", 1, 1);
       // String lastname = eu.readDataFromSpecificCell("Sheet1", 1, 2);
       // String gender = eu.readDataFromSpecificCell("Sheet1", 1, 3);
       // String emailA = eu.readDataFromSpecificCell("Sheet1", 1, 4);
      //  String emailB = eu.readDataFromSpecificCell("Sheet1", 1, 5);
        //String password = eu.readDataFromSpecificCell("Sheet1", 1, 6);

        // Create objects
        WelcomePage wp = new WelcomePage(driver);
        RegisterPage rp = new RegisterPage(driver);
        JavaUtility ju = new JavaUtility();
        RegisterResultPage rrp = new RegisterResultPage(driver);

        // Click on Register link
        wp.clickOnRegister();

        // Register a new user
        rp.RegisterAsNewUser(
                gender,
                firstname,
                lastname,
                emailA,
                ju.getRandomNumber(),
                emailB,
                password,
                password
        );

        // Verify successful registration
        Assert.assertTrue(
                rrp.getSuceessMessage().isDisplayed(),
                "Registration success message is not displayed!"
        );
    }
}

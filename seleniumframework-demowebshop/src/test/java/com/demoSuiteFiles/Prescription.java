
package com.demoSuiteFiles;

import org.testng.annotations.Test;

public class Prescription {

    @Test(groups = {"Smoke", "Regression"})
    public void prescriptionTest() {
        System.out.println("Patient is prescribed medication");
    }
}

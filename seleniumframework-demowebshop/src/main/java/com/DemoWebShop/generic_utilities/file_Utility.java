
package com.DemoWebShop.generic_utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class file_Utility {

    final String propertyFilkePath =
        "./src/test/resources/com/Demowebshop/testdata/common data/login.Properties";

    public String readkeyValueFromPropertyfile(String key)
            throws FileNotFoundException, IOException {

        Properties property = new Properties();

        property.load(new FileInputStream(propertyFilkePath));

        return property.getProperty(key);
    }
}

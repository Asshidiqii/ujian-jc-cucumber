package com.juaracoding.hooks;

import com.juaracoding.drivers.DriverSingleton;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp() {
        DriverSingleton.getDriver(Constants.CHROME);
    }

    @After
    public void tearDown() {
        DriverSingleton.closeDriver();
    }
}

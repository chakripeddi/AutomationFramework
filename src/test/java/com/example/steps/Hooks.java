package com.example.steps;

import com.example.base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

    @Before
    public void setUp() {
        // Call base class method to initialize browser
        initializeBroweser();
    }

    @After
    public void tearDown() {
        // Call base class method to quit driver
        quitDriver();
    }
}

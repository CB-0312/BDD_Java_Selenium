package org.chandAI.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.chandAI.base.BaseTest;

public class Hooks extends BaseTest {

    @Before
    public void beforeScenario() {
        setUp("grid"); // change to "local" if needed
    }

    @After
    public void afterScenario() {
        tearDown();
    }
}
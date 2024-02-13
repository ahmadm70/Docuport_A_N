package io.loop.step_definitions;

import io.cucumber.java.*;
import io.loop.utilities.BrowserUtilities;
import io.loop.utilities.Driver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void setUp(Scenario scenario) {
        Driver.getDriver();
        BrowserUtilities.myScenario = scenario;
    }
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshots = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshots, "image/png", scenario.getName());
        }
        Driver.closeDriver();
    }
}
package io.loop.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/html_reports/cucumber_report.html", "json:target/json_reports/cucumber_report.json"},
        features = "@target/rerun.txt",
        glue = "io/loop/step_definitions",
        monochrome = true,
        publish = false
)
public class FailedRunner {
}
package com.ztrk.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",
        glue = "com/ztrk/step_definitions"
)
public class FailedTestRunner {
}

// This runner class will be running only failed scenarios
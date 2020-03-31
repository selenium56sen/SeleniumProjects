package com.cts.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"D:\\3. Course Contents\\Selenium\\Selenium Programs\\BDDwithDataDriven\\src\\main\\resources\\features"},
		glue = {"com.cts.stepdefinitions"},
		plugin = {"html:reports/","pretty"},
		dryRun = false,
		monochrome = true
		)
public class TestRunner {

}

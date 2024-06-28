package com.flc.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Proounce Project\\prj23001_FiveYearPlan\\src\\test\\resources\\features",

		glue = { "com.flc.stepDefinition" }, monochrome = true,

		plugin = { "pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm", "html:target/htmlReport/report.html" }

)

public class TestRunner {

}

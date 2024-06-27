package com.flc.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\proou\\eclipse-workspace\\prj23001_cucumber-master\\prj23001_cucumber-master\\src\\test\\resources\\features",

		glue = { "com.flc.stepDefinition" }, monochrome = true,

		plugin = { "pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm", "html:target/htmlReport/report.html" }

)

public class TestRunner {

}

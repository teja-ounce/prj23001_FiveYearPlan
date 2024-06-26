package com.flc.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Teja-OUNCE\\OneDrive - proounce.com\\Documents\\GitHub\\prj231001CucumberBDD\\src\\test\\resources\\features\\",

		glue = { "com.flc.stepDefinition" }, monochrome = true,

		plugin = { "pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm", "html:target/htmlReport/report.html" }

)

public class TestRunner {

}

package com.example.restservice;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "com.example.stepdefinitions",
    plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber-reports.json"})


public class CucumberTest {

	public CucumberTest() {
		// TODO Auto-generated constructor stub
	}

}

package com.pb.cucumberdemo.stepdefinitions;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features"},
		glue={"com.pb.cucumberdemo.stepdefinitions"},
		monochrome = true,
		tags = "@LoginTC",
		plugin ={"html:target/cucumber-reports"},
		dryRun = false)
 
public class CucumberRunner 
{
	
}

package com.tide.runner;


import org.junit.runner.RunWith;

//import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//import io.cucumber.testng.CucumberOptions;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
//import cucumber.api.testng.AbstractTestNGCucumberTests;
//extends AbstractTestNGCucumberTests

//@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features",
		glue="stepDefination")
public class TestRunner extends AbstractTestNGCucumberTests{

}
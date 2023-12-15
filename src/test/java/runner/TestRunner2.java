package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
glue= {"stepdefination","hooks" },
monochrome=false,
plugin= {"pretty","html:target/HtmlReports/reports.html",
		"json:target/cucumber.json",
		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
		
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"timeline:test-output-thread/"},
publish=true

	
)

public class TestRunner2 {

}

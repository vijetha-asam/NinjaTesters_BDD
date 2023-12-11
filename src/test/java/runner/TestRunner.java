package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
glue= {"stepdefination","hooks" },
monochrome=true,
plugin= {"pretty",

	
})


public class TestRunner {

}


//"html:target/HtmlReports/reports.html",
//"json:target/cucumber.json",
//"junit:target/cucumber-reports/cucumber.xml"})
//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"	

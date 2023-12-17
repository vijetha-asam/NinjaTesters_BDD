//package runner;
//
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import io.cucumber.testng.CucumberOptions;
//import io.cucumber.testng.TestNGCucumberRunner;
//
////import org.junit.runner.RunWith;
//
//
////import io.cucumber.junit.Cucumber;
////import io.cucumber.junit.CucumberOptions;
//
//
////@RunWith(Cucumber.class)
//@CucumberOptions(features="src/test/resources/Features",
//glue= {"stepdefination","hooks" },
//tags= {"-@Ignore"},
//monochrome=false,
//plugin= {"pretty","html:target/cucumber-reports/cucumber-pretty",
//		"json:target/cucumber-reports/CucumberTestReports.json",
//		"return:target/cucumber-reports/return.txt"})
//		//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
////		"timeline:test-output-thread/"},
////publish=true
////
////	
////)
////
////
//public class TestRunner {
//		private TestNGCucumberRunner testNGCucumberRunner;
//		@BeforeClass(alwaysRun=ture)
//		
//		public void setUpClass() {
//		
//	testNGCucumberRunner= new TestNGCucumberRunner(this.getClass());
//}
//		@Test(groupd="cucumber" description="Runs Cucumber Feature",dataProvider="features")
//		public void feature(CucumberFeatureWrapper cucumberFeature) {
//			testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
//		}
////	@Override
//	@DataProvider(parallel=true)
//	public Object[][]features(){
//	return testNGCucumberRunner.providFeaturen();
//	}
//@AfterClass(alwaysRun=true)
//public void tearDownClass() {
//	testNGCucumberRunner.finish();
//}
//}
////"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
//
////"html:target/HtmlReports/reports.html",
////"json:target/cucumber.json",
////"junit:target/cucumber-reports/cucumber.xml"})
////"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"	

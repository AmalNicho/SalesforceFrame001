package salesforceframe.testcases;

import org.testng.annotations.BeforeTest;

import io.cucumber.testng.CucumberOptions;
import salesforceframe.base.ProjectSpecificMethods;

@CucumberOptions(features="src/main/java/salesforceframe/feature/Login.feature",
glue="salesforceframe.pages",
monochrome = true)
public class CucumberRunner extends ProjectSpecificMethods{

@BeforeTest
public void setValues() {
testcaseName = "Login Test using Cucumber";
testDescription = "Login testCase using cucumber";
authors = "Amal";
category = "Smoke";

}



}
package salesforceframe.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import salesforceframe.pages.LoginPage;
import salesforceframe.base.ProjectSpecificMethods;

public class TC000_LoginPage extends ProjectSpecificMethods {

	@BeforeTest
	public void Pre_Information() {
		testcaseName="LoginPage Test";
		testDescription="LoginPage is working or not";
		authors="Amal";
		category="Smoke";
		
	}
	
	@Test
	public void loginpage_test() throws IOException, Exception {
		new LoginPage()
		.typeusername(prop.getProperty("Username"))
		.typepassword(prop.getProperty("Password"))
		.clicksubmit()
		.homepage_visible();
	}
	
}

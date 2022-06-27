package salesforceframe.pages;

import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import salesforceframe.base.ProjectSpecificMethods;

public class HomePage  extends ProjectSpecificMethods {

	@Then("Homepage should be displayed")
	public HomePage homepage_visible() throws Exception {
		getWait().until(ExpectedConditions.titleIs("Lightning Experience"));
		verifyTitle("Lightning Experience");
	
		return this;
}
}

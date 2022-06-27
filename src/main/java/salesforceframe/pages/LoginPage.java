package salesforceframe.pages;
import java.io.IOException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import salesforceframe.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
	@Given("Enter the username as {string}")
	public LoginPage typeusername(String Username) throws IOException {
		
		clearAndType(locateElement("id","username"),Username);
		
		return this;
	}
	
	@Given("Enter the Password as {string}")
	public LoginPage typepassword(String Password) throws IOException {
		
		clearAndType(locateElement("id","password"),Password);
		
		return this;
	}

	@When("Click on the Login")
	public HomePage clicksubmit() throws IOException {
		click(locateElement("id","Login"));
	
		return new HomePage();
	}
}

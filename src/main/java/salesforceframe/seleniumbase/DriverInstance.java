package salesforceframe.seleniumbase;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class DriverInstance extends AbstractTestNGCucumberTests {

	private static final ThreadLocal<RemoteWebDriver> remoteWebdriver = new ThreadLocal<RemoteWebDriver>();
	private static final ThreadLocal<WebDriverWait> wait = new  ThreadLocal<WebDriverWait>();
	
		public void setDriver(String browser) {		
		switch (browser) {
		case "chrome":
//			ChromeOptions options = new ChromeOptions();
//			options.addArguments("--start-maximized"); 
//			options.addArguments("--disable-notifications"); 
//			options.addArguments("--incognito");
			remoteWebdriver.set(new ChromeDriver());
			break;
		case "firefox":
			remoteWebdriver.set(new FirefoxDriver());
			break;
		case "ie":
			remoteWebdriver.set(new InternetExplorerDriver());
		default:
			break;
		}
	}
	public RemoteWebDriver getDriver() {
		return remoteWebdriver.get();
	}
	
	public void setWait() {
		wait.set(new WebDriverWait(getDriver(),Duration.ofSeconds(30)));
	}

	public WebDriverWait getWait() {
		return wait.get();
	}
	

	

	
	
}

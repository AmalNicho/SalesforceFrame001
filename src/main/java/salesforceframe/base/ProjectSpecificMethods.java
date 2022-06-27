package salesforceframe.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import salesforceframe.seleniumbase.SeleniumBase;
import salesforceframe.utils.DataLibrary;

public class ProjectSpecificMethods  extends SeleniumBase{


	public String SheetName;	
	public static Properties prop;

	@DataProvider(name = "fetchData")
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(SheetName);
	}	

	@BeforeMethod
	public void beforeMethod() throws IOException {
		FileInputStream file = new FileInputStream("./Properties/Property.file");
		prop = new Properties();
		prop.load(file);
		
		startApp("chrome",prop.getProperty("URL"));
		setNode();
			}

	@AfterMethod
	public void afterMethod() {
		close();
	}


}
